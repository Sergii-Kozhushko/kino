package de.javabegin.kino.interfaces;

import java.util.UUID;

public interface ITicket {
    int getPrice();
    String getQRCode();

    IMovie getMovie();
}
