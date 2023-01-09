package de.javabegin.kino.interfaces;

import java.util.ArrayList;

// уровень абстракции, описание функционала классво без конкретной реализации
public interface IUser {
    String getName();
    int getMoney();
    void setMoney(int money);
    ArrayList<ITicket> getTicketList();
    void printTickets();

}
