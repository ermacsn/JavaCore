package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int a = 24;
        final int b = 8;
        Addition add_obiject = new Addition();
        Subtraction sub_object = new Subtraction();
        Multiplication mul_object = new Multiplication();
        Division div_object = new Division();

        System.out.println(add_obiject.add(a,b));
        System.out.println(sub_object.sub(a,b));
        System.out.println(mul_object.mul(a,b));
        System.out.println(div_object.div(a,b));
    }
}