package de.javabegin.kino.interfaces;

import java.util.ArrayList;

// интерфейс - список сеансов одного фильма
public interface IMovieList {
    ArrayList<IMovie> getMovieList();
    void addMovie(IMovie movie);
}
