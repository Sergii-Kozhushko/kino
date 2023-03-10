/**
 * KinoTheather.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Jan-2023 22:44
 */

package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.IKinoTheather;
import de.javabegin.kino.interfaces.ISeans;
import de.javabegin.kino.interfaces.IUser;

import java.util.ArrayList;

public class KinoTheather implements IKinoTheather {
    private ArrayList<ISeans> seansList = new ArrayList<>();
    private String name;


    public KinoTheather() {
    }

    public KinoTheather(ArrayList<ISeans> seansList, String name) {
        this.seansList = seansList;
        this.name = name;
    }

    public KinoTheather(String name) {
        this.name = name;
    }

    // TODO если этот метод будет внутри кинотеатра, то логичней его назвать sell (продажа), а не покупка
    public void sellTicket(IUser user, ISeans seans) {
        if (user.getMoney() > seans.getPrice()) {
            Ticket t = new Ticket(seans);
            user.getTicketList().add(t);
            ((User)user).setMoney(user.getMoney() - seans.getPrice());
        }
        else{
            System.out.println("Не хватат денег на билет. Сеанс " + seans.getMovie().getName());
        }

    }
    @Override
    public ArrayList<ISeans> getSeansList() {
        return seansList;
    }

    public void setSeansList(ArrayList<ISeans> seansList) {
        this.seansList = seansList;
    }

    public void addSeans(ISeans seans){
        seansList.add(seans);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
