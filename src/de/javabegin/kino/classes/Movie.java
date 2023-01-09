/**
 * Movie.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:53
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;

import java.util.Calendar;
import java.util.Date;

public class Movie implements IMovie  {
   private int price;
   private String name;
   private Calendar date;

   public Movie() {
   }

   public Movie(String name, Calendar date, int price) {
      this.name = name;
      this.date = date;
      this.price = price;
   }

   @Override
   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public Calendar getDate() {
      return date;
   }


}
