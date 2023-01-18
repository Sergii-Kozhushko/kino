/**
 * Movie.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:53
 */

package de.javabegin.kino.impl;

import de.javabegin.kino.interfaces.IMovie;

public class Movie implements IMovie  {
   //private int price;
   private String name;
   //private Calendar date;


   public Movie(String name) {
      this.name = name;
   }

   @Override
   public String getName() {
      return name;
   }

}