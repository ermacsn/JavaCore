package org.example;

import lombok.Getter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Содержит перечень праздников с датой типа  Calendar
 */
@Getter
public enum Holyday {
    New_Year("Новый год", Calendar.DECEMBER,31),
    March_8("8 марта", Calendar.MARCH,8),
    Februar_23("23 февраля", Calendar.FEBRUARY,23);

    private final String russianTitle;
    private final Calendar calendar;

    Holyday(String russianTitle, int month, int day) {
        this.russianTitle = russianTitle;
        calendar = new GregorianCalendar(2000, month, day);
    }
}
