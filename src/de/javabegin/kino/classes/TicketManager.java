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

/** Класс отвечает за сущность Контроллер - менеджер билетов
 * @author Kozhushko Sergii
 * @version 1.0
 * Класс реализует интерфейс ITicketManger -> разделение абстракция-реализация
 * Соответствует принципам SOLID:
 * 1. Single Responsibility Principle: класс имеет лишь один метод - покупка билета
 *
 * GRASP-шаблоны:
 * Pure-Fabrication - не имеет аналога в реальном мире
 * Controller - обработчик событий
 * High cohession - аналог SRP в SOLID
 * Indirection - ссылки на интерфейсы
 * Polymorphism - параметры метода имеют тип общего интерефейса
 *
 */
public class TicketManager implements ITicketManager {

   @Override
   public void buyTicket(IUser user, IMovie movie) {
      if (user.getMoney() > movie.getPrice()) {
         user.getTicketList().add(new Ticket(movie));
         user.setMoney(user.getMoney() - movie.getPrice());
      }
      else{
         System.out.println("Не хватат денег на билет");
      }

   }
}
