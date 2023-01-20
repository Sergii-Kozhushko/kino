/**
 * Ticket.java
 *
 * @author Sergii Kozhushko, sergiikozhushko@gmail.com
 * Date of creation: 09-Jan-2023 19:59
 */

package de.javabegin.kino.impl;


import de.javabegin.kino.interfaces.ISeans;
import de.javabegin.kino.interfaces.ITicket;

import java.util.UUID;

/** Класс отвечает за сущность "билет в кино"
 * @author Kozhushko Sergii
 * @version 1.1
 * Класс реализует интерфейс ITicket -> разделение абстракция-реализация
 * Соответствует принципам SOLID:
 * 1. Single Responsibility Principle: класс не имеет бизнес-методов и реализует функции работы с ью-ар кодом и ценой. Ничего не связанного с билетом или пограничного
 * 2. Open Closed Principle: соответствует не на 100%. Возможно лучший вариант: сделать класс Ticket и от него наследовать QRTicket
 * 5. Dependency Inversion Principle (Принцип инверсии зависимостей): класс зависит от интрефейса IMovie, а не от реализации Movie
*/
public class Ticket implements ITicket {

    /** поле QR-код, генерируется при создании каждого объекта-билета */
    private final String QRCode = UUID.randomUUID().toString();
    /** поле фильм*/
    private ISeans seans;

    public Ticket() {
    }

    /**
     * @param seans - на какой сеанс этот билет
     */
    public Ticket(ISeans seans) {
        this.seans = seans ;
    }

    /**
     * Метод получения кью-ар кода билета
     * @return возвращает кью-ар код строкой
     */
    @Override
    public String getQRCode() {
        return QRCode;
    }


    /**
     * Метод получения фильм билета
     * @return Сеанс
     */
    @Override
    public ISeans getSeans() {
        return seans;
    }

    public void setSeans(ISeans seans) {
        this.seans = seans;
    }

    /**
    *Добавил этот метод для укороченной формы записи
     * Это не чистый геттер
     */
    public String getKinoTheatherName(){
        return getSeans().getKinoTheather().getName();
    }



}
