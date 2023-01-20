/**
 * User.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 20:06
 */

package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.ITicket;
import de.javabegin.kino.interfaces.IUser;

import java.util.ArrayList;

/** Класс отвечает за сущность "покупатель билета в кино"
 * @author Kozhushko Sergii
 * @version 1.0
 * Класс реализует интерфейс IUser -> разделение абстракция-реализация
 * Соответствует принципам SOLID:
 * 1. Single Responsibility Principle: класс работает только с сущностиями, относящимися к покупателю: имя, деньги в кошельке, список билетов пользователя
 * 2. Open Closed Principle: соответствует не на 100%. Возможно лучший вариант: сделать класс User (name, money) и от него наследовать UserKino(+ticketlist)
 * 5. Dependency Inversion Principle (Принцип инверсии зависимостей): класс зависит от интрефейса ITicket, а не от реализации Ticket
 * GRASP:
 * Polymorphism - поля имеют общий интерфейсыный тип, список билетов
 */
//  уровень реализации
public class User implements IUser {
   /** поле имя покупателя*/
   private String name;
   /** поле сумма денег у покупателя */
   private int money;
   /** список билетов, которые купил покупатель */
   private ArrayList<ITicket> ticketList = new ArrayList<>();


   public User() {
   }

   /**
    * Конструктор с имененм и начальной суммой
    * @param name - имя покупателя
    * @param money - начальная сумма в кошельке
    */
      public User(String name, int money) {
      this.name = name;
      this.money = money;
   }

   @Override
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public int getMoney() {
      return money;
   }

   /**
    * Метод-сеттер для установки количества денег у покупателя
    * @param money - количество денег
    */
   @Override
   public void setMoney(int money) {
      this.money = money;
   }

   @Override
   public ArrayList<ITicket> getTicketList() {
      return ticketList;
   }

   public void setTicketList(ArrayList<ITicket> ticketList) {
      this.ticketList = ticketList;
   }

   /**
    * Метод распечатывает список билетов у покупателя
    */
   @Override
   public void printTickets() {
      System.out.println("Customer <" + name + ">");
      System.out.println("Tickets:");
      int i = 1; // нумерация билетов
      for (ITicket ticket: ticketList){
         if (ticket.getSeans() != null)
            System.out.println(i + ". Movie thather '" + ticket.getKinoTheatherName() + "', " + ticket.getSeans().getMovie().getName() + ", " + ticket.getSeans().getDateTime().getTime() + ", " + ticket.getQRCode());
         i++;
      }

   }
}
