/**
 * MovieList.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 10-Jan-2023 15:10
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.IMovieList;

import java.util.ArrayList;

public class MovieList implements IMovieList {
   private ArrayList<IMovie> movieList = new ArrayList<>();
   @Override
   public ArrayList<IMovie> getMovieList() {
      return movieList;
   }

   @Override
   public void addMovie(IMovie movie) {
      movieList.add(movie);
   }
}
