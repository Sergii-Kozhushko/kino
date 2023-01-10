package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.IUser;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        IUser user1 = new User("Ваня Кожушко", 40);

        TicketManager ticketManager = new TicketManager();
        IMovie movie1 = new Movie("Человек-Паук-12", new GregorianCalendar(2023, Calendar.JANUARY, 23, 18, 0), 20);
        IMovie movie2 = new Movie("Человек-Паук-12", new GregorianCalendar(2023, Calendar.JANUARY, 21, 16, 0), 20);
        IMovie movie3 = new Movie("Матрица", new GregorianCalendar(2023, Calendar.JANUARY, 23, 20, 0), 30);
        IMovie movie4 = new Movie("Матрица", new GregorianCalendar(2023, Calendar.JANUARY, 23, 10, 0), 25);

//        MovieList movieList = new MovieList();
//        movieList.addMovie(movie1);
//        movieList.addMovie(movie2);
//        movieList.addMovie(movie3);
//        movieList.addMovie(movie4);
        //System.out.println(movie1.getDate().getTime());

        ticketManager.buyTicket(user1, movie1);
        ticketManager.buyTicket(user1, movie2);
        ticketManager.buyTicket(user1, new Movie("Человек-Паук вдали от дома", new GregorianCalendar(2012, Calendar.JANUARY, 29, 6, 0), 10));
        user1.printTickets();

        IUser user2 = new User("Джим Бимм", 100);
        ticketManager.buyTicket(user2, movie2);
        user2.printTickets();

    }
}