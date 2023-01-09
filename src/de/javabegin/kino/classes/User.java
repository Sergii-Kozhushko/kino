/**
 * User.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 20:06
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.ITicket;
import de.javabegin.kino.interfaces.IUser;

import java.util.ArrayList;

//  уровень реализации
public class User implements IUser {
   private String name;
   private int money = 0;
   private ArrayList<ITicket> ticketList = new ArrayList<>();

   public User(String name) {
      this.name = name;
   }

   public User() {
   }

   public User(String name, int money) {
      this.name = name;
      this.money = money;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public int getMoney() {
      return money;
   }
   @Override
   public void setMoney(int money) {
      this.money = money;
   }

   @Override
   public ArrayList<ITicket> getTicketList() {
      return ticketList;
   }

   @Override
   public void printTickets() {
      System.out.println("Покупатель <" + name + ">");
      System.out.println("Билеты:");
      int i = 1;
      for (ITicket ticket: ticketList){
         if (ticket.getMovie() != null)
            System.out.println(i + ". " + ticket.getMovie().getName() + " : " + ticket.getMovie().getDate().getTime() + " : " + ticket.getQRCode());
         i++;
      }

   }
}
