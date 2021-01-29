package com.arrays;

public class ArraysExampel2 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.println("Значение  " + i + "й ячейки масива : " + array[i]);

        }
        System.out.println(array.length);
        System.out.println("********************************************");
    }

    }


