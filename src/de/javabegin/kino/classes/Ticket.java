/**
 * Ticket.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:59
 */

package de.javabegin.kino.classes;

import de.javabegin.kino.interfaces.IMovie;
import de.javabegin.kino.interfaces.ITicket;

import java.util.UUID;

/** Класс отвечает за сущность "билет в кино"
 * @author Kozhushko Sergii
 * @version 1.0
 * Класс реализует интерфейс ITicket -> разделение абстракция-реализация
 * Соответствует принципам SOLID:
 * 1. Single Responsibility Principle: класс не имеет бизнес-методов и реализует функции работы с ью-ар кодом и ценой. Ничего не связанного с билетом или пограничного
 * 2. Open Closed Principle: соответствует не на 100%. Возможно лучший вариант: сделать класс Ticket и от него наследовать QRTicket
 * 5. Dependency Inversion Principle (Принцип инверсии зависимостей): класс зависит от интрефейса IMovie, а не от реализации Movie
*/
public class Ticket implements ITicket {
    /** Поле цена */
    private int price;
    /** поле QR-код, генерируется при создании каждого объекта-билета */

    private String QRCode = UUID.randomUUID().toString();
    /** поле фильм*/
    private IMovie movie;

    /**
     * Дефолтный конструктор
     *
     */
    public Ticket() {

    }

    /**
     *
     * @param movie - на какой фильм этот билет
     */
    public Ticket(IMovie movie) {
        this.movie = movie;
    }

    /**
     * Метод получения кью-ар кода билета
     * @return возвращает кь-ар код строкой
     */
    @Override
    public String getQRCode() {
        return QRCode;
    }

    /**
     * Метод получения фильм билета
     * @return
     */
    @Override
    public IMovie getMovie() {
        return movie;
    }

    /**
     * Геттер цены билета
     * @return возвращает цену билета в $ без центов
     */
    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
