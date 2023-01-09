/**
 * TicketManager.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 20:09
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.ITicketManager;
import de.javabegin.kino.interfaces.IUser;

public class TicketManager implements ITicketManager {

   @Override
   public void buyTicket(IUser user, IMovie movie) {
      if (user.getMoney() > movie.getPrice()) {
         user.getTicketList().add(new Ticket(movie));
         user.setMoney(user.getMoney() - movie.getPrice());
      }
      else{
         System.out.println("Не хватает денег на билет");
      }

   }
}
