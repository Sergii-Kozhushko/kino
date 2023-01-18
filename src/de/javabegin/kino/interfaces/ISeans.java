package de.javabegin.kino.interfaces;

import java.util.Calendar;

public interface ISeans {
    IKinoTheather getKinoTheather();
    IMovie getMovie();
    Calendar getDateTime(); //дата и время сеанса
    int getPrice();
}
