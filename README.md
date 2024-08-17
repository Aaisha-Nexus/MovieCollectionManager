# MovieCollectionManager

## Overview

**MovieCollectionManager** is a Java-based program to manage a collection of movies. It allows users to add, remove, and display movies by various attributes such as genre and director. This project demonstrates the use of object-oriented programming concepts **OOPS** like encapsulation, ArrayList manipulation, and method usage in Java.

## Features

- **Add a Movie**: Users can input a movie's title, release year, genre, and director to add it to their collection.
- **Remove a Movie**: Users can remove a movie from their collection by entering its title.
- **Display All Movies**: The program lists all movies currently in the collection.
- **Display Movies by Genre**: Users can filter and display movies based on their genre.
- **Display Movies by Director**: Users can filter and display movies based on the director's name.
- **Exit**: The program provides a simple exit option to end the session.

## Class Structure

### Movie Class

- **Purpose**: Represents a single movie, holding details like title, release year, genre, and director.
- **Encapsulation**: All attributes are private, accessed via getter methods.
- **Methods**: 
  - `getMovie_title()`
  - `getRelease_year()`
  - `getGenre()`
  - `getDirector()`
  - `displayInfo()`: Prints the movie's details.

### movieCollection Class

- **Purpose**: Manages a collection of `Movie` objects, storing them in an `ArrayList`.
- **Methods**:
  - `addMovie(Movie movie)`: Adds a movie to the collection.
  - `removeMovie(String title)`: Removes a movie by its title.
  - `displayMovie()`: Displays all movies in the collection.
  - `displayMoviesByGenre(String genre)`: Displays movies filtered by genre.
  - `displayMoviesByDirector(String director)`: Displays movies filtered by director.
 
   ## Contributing

Contributions are welcome! Feel free to fork this repository, make your changes, and submit a pull request.

