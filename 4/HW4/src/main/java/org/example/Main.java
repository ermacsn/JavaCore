package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Иван", Gender.MALE));
        customers.add(new Customer("Анна", Gender.FEMALE));
        customers.add(new Customer("Николай", Gender.MALE));
        customers.add(new Customer("Юлия", Gender.FEMALE));
        customers.add(new Customer("Александр", Gender.MALE));
        customers.add(new Customer("Александра", Gender.FEMALE));
        customers.add(new Customer("Михаил", Gender.MALE));
        customers.add(new Customer("Анастасия", Gender.FEMALE));
        customers.add(new Customer("Владимир", Gender.MALE));
        customers.add(new Customer("Ксения", Gender.FEMALE));

        Calendar New_Year_data = new GregorianCalendar(2000, Calendar.DECEMBER, 31);
        Calendar March_8_data = new GregorianCalendar(2000, Calendar.MARCH, 8);
        Calendar February_23_data = new GregorianCalendar(2000, Calendar.FEBRUARY, 23);

        congratulation(customers, New_Year_data);
        congratulation(customers, March_8_data);
        congratulation(customers, February_23_data);
    }

    /**
     * Поздравления
     * @param customers список покупателей
     * @param current дата в формате Calendar
     */
    public static void congratulation(ArrayList<Customer> customers,Calendar current) {
        for (Customer customer : customers) {
            if (current.equals(Holyday.New_Year.getCalendar())) {
                System.out.printf("%s, позравляем тебя с праздником: %s.%n",
                        customer.getName(), Holyday.New_Year.getRussianTitle());
            }
            if (current.equals(Holyday.March_8.getCalendar())) {
                if (customer.getGender().equals(Gender.FEMALE))
                    System.out.printf("%s, позравляем тебя с праздником: %s.%n",
                        customer.getName(), Holyday.March_8.getRussianTitle());
            }
            if (current.equals(Holyday.Februar_23.getCalendar())) {
                if (customer.getGender().equals(Gender.MALE))
                    System.out.printf("%s, позравляем тебя с праздником: %s.%n",
                            customer.getName(), Holyday.Februar_23.getRussianTitle());
            }
        }
    }
}