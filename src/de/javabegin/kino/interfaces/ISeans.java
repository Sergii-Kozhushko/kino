package de.javabegin.kino.interfaces;

import de.javabegin.kino.impl.Movie;

import java.util.Calendar;

public interface ISeans {
    IKinoTheather getKinoTheather();
    Movie getMovie();
    Calendar getDateTime(); //дата и время сеанса
    int getPrice();
}
