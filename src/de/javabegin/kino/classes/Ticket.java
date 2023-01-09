/**
 * Ticket.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:59
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.ITicket;

import java.util.UUID;

public class Ticket implements ITicket {
    private int price;
    private String QRCode = UUID.randomUUID().toString();
    private IMovie movie;

    public Ticket() {

    }

    public Ticket(IMovie movie) {
        this.movie = movie;
    }

    @Override
    public String getQRCode() {
        return QRCode;
    }

    @Override
    public IMovie getMovie() {
        return movie;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
