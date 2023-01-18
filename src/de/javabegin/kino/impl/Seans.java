/**
 * Seans.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Jan-2023 22:24
 */

package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.IKinoTheather;
import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.ISeans;

import java.util.Calendar;

/** Класс отвечает за сущность "сеанс фильма"
 * @author Kozhushko Sergii
 * @version 1.0
 */
public class Seans implements ISeans {
   /**
    * Кинотеатр
    */
   private IKinoTheather kinoTheather;
   /**
    * Фильм сеанса
    */
   private IMovie movie;

   /**
    * Дата и время сеанса
    */
   private Calendar dateTime;

   /**
    * Цена билета на сеанс
    */
   private int price;


   public Seans(IKinoTheather kinoTheather, IMovie movie, Calendar dateTime, int price) {
      this.kinoTheather = kinoTheather;
      this.movie = movie;
      this.dateTime = dateTime;
      this.price = price;
      kinoTheather.addSeans(this);
   }

   @Override
   public IKinoTheather getKinoTheather() {
      return kinoTheather;
   }

   @Override
   public IMovie getMovie() {
      return movie;
   }

   @Override
   public Calendar getDateTime() {
      return dateTime;
   }

   @Override
   public int getPrice() {
      return price;
   }
}