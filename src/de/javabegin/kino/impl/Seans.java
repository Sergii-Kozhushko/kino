/**
 * Seans.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 16-Jan-2023 22:24
 */

package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.IKinoTheather;
import de.javabegin.kino.interfaces.ISeans;

import java.util.Calendar;

/** Класс отвечает за сущность "сеанс фильма"
 * @author Kozhushko Sergii
 * @version 1.0
 */
public class Seans implements ISeans {
   /**
    * Кинотеатр, в котором идет сеанс
    */
   private IKinoTheather kinoTheather;
   /**
    * Фильм сеанса
    */
   private Movie movie;

   /**
    * Дата и время сеанса
    */
   private Calendar dateTime;

   /**
    * Цена билета на сеанс
    */
   private int price;

   // TODO желательно также оставлять и пустой конструктор


   public Seans() {
   }

   public Seans(IKinoTheather kinoTheather, Movie movie, Calendar dateTime, int price) {
      this.kinoTheather = kinoTheather;
      this.movie = movie;
      this.dateTime = dateTime;
      this.price = price;

   }

   @Override
   public IKinoTheather getKinoTheather() {
      return kinoTheather;
   }

   public void setKinoTheather(IKinoTheather kinoTheather) {
      this.kinoTheather = kinoTheather;
   }

   @Override
   public Movie getMovie() {
      return movie;
   }

   public void setMovie(Movie movie) {
      this.movie = movie;
   }

   @Override
   public Calendar getDateTime() {
      return dateTime;
   }

   public void setDateTime(Calendar dateTime) {
      this.dateTime = dateTime;
   }

   @Override
   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   // TODO добавить сеттеры (в других классах тоже)
}
