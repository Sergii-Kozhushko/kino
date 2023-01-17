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

/** ����� �������� �� �������� "���������� ������ � ����"
 * @author Kozhushko Sergii
 * @version 1.0
 * ����� ��������� ��������� IUser -> ���������� ����������-����������
 * ������������� ��������� SOLID:
 * 1. Single Responsibility Principle: ����� �������� ������ � �����������, ������������ � ����������: ���, ������ � ��������, ������ ������� ������������
 * 2. Open Closed Principle: ������������� �� �� 100%. �������� ������ �������: ������� ����� User (name, money) � �� ���� ����������� UserKino(+ticketlist)
 * 5. Dependency Inversion Principle (������� �������� ������������): ����� ������� �� ���������� ITicket, � �� �� ���������� Ticket
 * GRASP:
 * Polymorphism - ���� ����� ����� ������������� ���, ������ �������
 */
//  ������� ����������
public class User implements IUser {
   /** ���� ��� ����������*/
   private String name;
   /** ���� ����� ����� � ���������� */
   private int money;
   /** ������ �������, ������� ����� ���������� */
   private ArrayList<ITicket> ticketList = new ArrayList<>();


   /**
    * ����������� � ������� � ��������� ������
    * @param name - ��� ����������
    * @param money - ��������� ����� � ��������
    */
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

   /**
    * �����-������ ��� ��������� ���������� ����� � ����������
    * @param money - ���������� �����
    */
   @Override
   public void setMoney(int money) {
      this.money = money;
   }

   @Override
   public ArrayList<ITicket> getTicketList() {
      return ticketList;
   }

   /**
    * ����� ������������� ������ ������� � ����������
    */
   @Override
   public void printTickets() {
      System.out.println("���������� <" + name + ">");
      System.out.println("������:");
      int i = 1; // ��������� �������
      for (ITicket ticket: ticketList){
         if (ticket.getSeans() != null)
            System.out.println(i + ". " + ticket.getSeans().getMovie().getName() + ", " + ticket.getSeans().getDateTime().getTime() + ", " + ticket.getQRCode());
         i++;
      }

   }
}
