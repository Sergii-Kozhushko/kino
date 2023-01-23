package de.javabegin.kino.interfaces;

import java.util.ArrayList;

// уровень абстракции, описание функционала классво без конкретной реализации
public interface IUser {
    String getName();
    int getMoney();

    // TODO set не нужно добавлять в интерфейс (иначе становится избыточным)
    ArrayList<ITicket> getTicketList();
    void printTickets();

}
