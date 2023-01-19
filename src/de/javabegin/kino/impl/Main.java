package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.ISeans;
import de.javabegin.kino.interfaces.IUser;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        IUser user1 = new User("Ivan Kozhushko", 90);

        //TicketManager ticketManager = new TicketManager();
        KinoTheather zorya = new KinoTheather("Zorya");
        KinoTheather sputnik = new KinoTheather("Sputnik");
        IMovie movie1 = new Movie("Spiderman-12");
        IMovie movie2 = new Movie("Матрица");
        IMovie movie3 = new Movie("Титаник");

        ISeans seans1 = new Seans(zorya, movie1, new GregorianCalendar(2023, Calendar.JANUARY, 23, 18, 0),20);
        ISeans seans2 = new Seans(zorya,  movie1, new GregorianCalendar(2023, Calendar.JANUARY, 23, 16, 0),20);
        ISeans seans3 = new Seans(zorya, movie2, new GregorianCalendar(2023, Calendar.JANUARY, 23, 20, 0), 30);
        ISeans seans4 = new Seans(sputnik, movie2, new GregorianCalendar(2023, Calendar.JANUARY, 23, 10, 0), 25);
        ISeans seans5 = new Seans(sputnik, movie3, new GregorianCalendar(2023, Calendar.FEBRUARY, 1, 19, 30), 30);


        zorya.addSeans(seans1);
        zorya.addSeans(seans2);
        zorya.addSeans(seans3);
        zorya.addSeans(seans4);
        zorya.addSeans(seans5);

        zorya.buyTicket(user1, seans1);
        zorya.buyTicket(user1, seans3);
        sputnik.buyTicket(user1, seans5);
        user1.printTickets();


    }
}