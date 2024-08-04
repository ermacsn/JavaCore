package org.example;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstDataString = "2023-07-27";
        String secondDataString = "2023-07-27";
        Worker worker = new Worker();
        System.out.println(worker.dateComparator(firstDataString, secondDataString));

        //Задание 2
        ArrayList<Worker> workers = new ArrayList<Worker>(); // Лист с работниками

        for (int i = 0; i < 7; i++) {
            workers.add(new Worker());
        }
        workers.add(new Manager());
        workers.add(new Manager());

        worker.addSalary(20000);

        for (Worker w : workers) {
            if (w instanceof Manager)
                System.out.println(w.getClass().toString() + ": " + w.getNumber() + ", Salary: " + ((Manager)(w)).getSalary());
            else
                System.out.println(w.getClass().toString() + ": " + w.getNumber() + ", Salary: " + w.getSalary());
        }
    }
}