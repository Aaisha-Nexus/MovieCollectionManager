import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("****THIS IS A MOVIE COLLECTION MANAGER***");

        movieCollection movieInfo = new movieCollection(); //instance made of the collection class

        // Create movie instances and put data using the Movie constructor
        Movie movie1 = new Movie("Black Panther", 2022, "Action", "Ryan Coogler");
        Movie movie2 = new Movie("Avatar", 2009, "Fantasy", "James Cameron");
        Movie movie3 = new Movie("Jurassic World", 2022, "Sci-fi", "Colin Trevorrow");
        Movie movie4 = new Movie("Dune", 2021, "Action", "Denis Villeneuve");
        Movie movie5 = new Movie("Spider Man", 2021, "Fantasy", "Jon Watts");

        // Add initial movies to the collection
        movieInfo.addMovie(movie1);
        movieInfo.addMovie(movie2);
        movieInfo.addMovie(movie3);
        movieInfo.addMovie(movie4);
        movieInfo.addMovie(movie5);

        int option;
        do {
            System.out.println("CHOOSE ANY OPTION FROM BELOW");
            System.out.println(
                    "1) Add a Movie\n" +
                            "2) Remove a Movie\n" +
                            "3) Display All Movies\n" +
                            "4) Display Movies by Genre\n" +
                            "5) Display Movies by Director\n" +
                            "6) Exit"
            );
            option = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (option == 1) {
                System.out.println("Enter Movie Title:");
                String Movie_title = sc.nextLine();
                System.out.println("Enter Release Year:");
                int release_year = sc.nextInt();
                sc.nextLine();  // Consume newline
                System.out.println("Enter Genre:");
                String genre = sc.nextLine();
                System.out.println("Enter Director:");
                String director = sc.nextLine();

                Movie newMovie = new Movie(Movie_title, release_year, genre, director); //saving as newmovie
                movieInfo.addMovie(newMovie); //then adding to collection info

            } else if (option == 2) {
                System.out.println("Enter the Title of the Movie to Remove:");
                String removedetails = sc.nextLine();
                movieInfo.removeMovie(removedetails);

            } else if (option == 3) {
                movieInfo.displayMovie();

            } else if (option == 4) {
                System.out.println("Enter the genre of your choice:");
                String inputgenre = sc.nextLine();
                movieInfo.displayMoviesByGenre(inputgenre);

            } else if (option == 5) {
                System.out.println("Enter the director of your choice:");
                String inputdirector = sc.nextLine();
                movieInfo.displayMoviesByDirector(inputdirector);

            } else if (option == 6) {
                System.out.println("The program exits!");

            } else {
                System.out.println("Invalid option! Please choose again.");
            }

        } while (option != 6);
    }
}

class Movie { //for single movie

    // Instance variables which are private to ensure data encapsulation
    private String Movie_title;
    private int release_year;
    private String genre;
    private String director;

    // Constructor creation, it initialises the instance variable when an object "Movie" is created
    public Movie(String Movie_title, int release_year, String genre, String director) {
        this.Movie_title = Movie_title;
        this.release_year = release_year;
        this.genre = genre;
        this.director = director;
    }

    // Public getter methods to allow access from outside the class like getGenre method returns the genre later used in specific genre search
    public String getMovie_title() {
        return Movie_title;
    }

    public int getRelease_year() {
        return release_year;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    // Method to display the movie collection records
    public void displayInfo() {
        System.out.println("Title: " + Movie_title);
        System.out.println("Release Year: " + release_year);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
    }
}

class movieCollection { //manages the collection of movies
    private ArrayList<Movie> movies; //an arraylist to add all movies (similar to album or file of CD's)

    // Constructor to initialize the empty list
    public movieCollection() {
        movies = new ArrayList<>();
    }

    // Method to add a movie
    public void addMovie(Movie movie) {  //here first Movie is like data type and second movie is variable
        movies.add(movie); //add movie to the movies collection
    }

    // Method to remove a movie by title
    public void removeMovie(String title) {
        movies.removeIf(movie -> movie.getMovie_title().equalsIgnoreCase(title));
    }
    /*Explanation on -> : symbol here movie before symbol and acts as input and gives it to the expression written after it
     this way it checks for condition true and false and then performs operation which in this case is removing the 'movie'
      from movies collection */

    // Method to display all movies
    public void displayMovie() {
        for (Movie movie : movies) {
            movie.displayInfo();
            System.out.println();
        }
    }

    // Method to display movies by genre
    public void displayMoviesByGenre(String genre) {
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) { //using string method of equals() to check if the genre
                movie.displayInfo();                        //entered by user and the given are same behaves like ==
                System.out.println();                       //ignore case means it will accept both upper & lower case
            }
        }
    }

    // Method to display movies by director
    public void displayMoviesByDirector(String director) {
        for (Movie movie : movies) {
            if (movie.getDirector().equalsIgnoreCase(director)) {
                movie.displayInfo();
                System.out.println();
            }
        }
    }
}
