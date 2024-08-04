package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс работника
 */
public class Worker {

    private static int salary;
    private int number;
    private static int count;

    public Worker() {
        count = count + 1;
        this.number = count;
        this.salary = 100000;
    }

    /**
     * Метод компаратора
     * @param firstDateString
     * @param secondDateString
     * @return
     */
    public static boolean dateComparator (String firstDateString, String secondDateString) {
        Date firstDate = null;
        Date secondDate = null;
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        firstDateString = firstDateString.length() == 0 ? "2024-07-27" : firstDateString;
        secondDateString = secondDateString.length() == 0 ? "2024-07-27" : secondDateString;
        try {
            firstDate = ft.parse(firstDateString);
            secondDate = ft.parse(secondDateString);
            System.out.println(firstDateString);
            System.out.println(secondDateString);;
        }catch (ParseException e) {
            System.out.println("Дата не распознана");
            e.printStackTrace();
        }
        return firstDateString.equals(secondDateString);
    }

    public static int getSalary() {
        return salary;
    }


    public static void addSalary (int value) {
        salary = salary + value;
//        System.out.println("Текущая зарплата:" + getSalary());
    }

    public int getNumber() {
        return number;
    }
}
