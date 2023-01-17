package de.javabegin.kino.interfaces;

import java.util.Calendar;

public interface ISeans {
    IMovie getMovie();
    Calendar getDateTime(); //дата и время сеанса
    int getPrice();
}
