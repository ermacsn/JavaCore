package org.example;

/**
 * Класс с скрытыми методами и полями суперкласа (Worker)
 */
public class Manager extends Worker{
    private static int salary;

    public Manager() {
        salary = 200000;
    }

    public static void addSalary (int value) {

    }

    public static int getSalary() {
        return salary;
    }
}
