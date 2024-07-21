package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {-4,-5,3,4,0,8,4,7};
//        int[] array = {};
//        int[] array = {4,5,0,7};
        int[] array3 = {1,2,34,6,8,0,0,3,5,3,3,0,6,0};
        System.out.println(countAdd(array));
        System.out.println(difference(array));
        System.out.println(nextToZero(array3));
    }

    /**
     * Задание 1
     * @param array
     * @return
     */
    public static int countAdd(int[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("В массиве отсутствуют элементы");
        int cont = 0;
        for (int value: array) {
            if (value % 2 == 0)
                cont++;
        }
        return cont;
    }

    /**
     * Задание 2
     * @param array
     * @return
     */
    public static int difference(int[] array) {
        if (array.length == 0)
            throw new IllegalArgumentException("В массиве отсутствуют элементы");
        return Arrays.stream(array).max().getAsInt() - Arrays.stream(array).min().getAsInt();
    }

    /**
     * Задание 3
     * @param array
     * @return
     */
    public static boolean nextToZero(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 0 && array[i] == array[i - 1])
                return true;
        }
        return  false;
    }
}

