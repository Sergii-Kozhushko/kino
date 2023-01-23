/**
 * Movie.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:53
 */

package de.javabegin.kino.impl;


public class Movie {
   //private int price;
   private String name;
   //private Calendar date;


   public Movie() {
   }

   public Movie(String name) {
      this.name = name;
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
