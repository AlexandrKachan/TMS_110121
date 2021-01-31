package com.array;

import java.util.Random;

public class exercise14 {

    // создать масив оценок произвольной длинны, вывести максимальную и минимальную оценку, ее (их) номера.

    public static void main(String[] args) {

        Random rand = new Random();
        int[] marks = new int[10]; // создали  масив на 10 переменных

        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(10) + 1; //заполнили его рандомными числами
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); //Вывели его на печать
        }
        System.out.println("length of array: " + marks.length); // Вывели длинну масива

        int max = marks[0], maxNum = 0;
        int min = marks[0], minNum = 0;

        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
                maxNum = i;  // нашли максимальное число
            }
            if (min > marks[i]) {
                min = marks[i];
                minNum = i;// нашли минимальное число
            }
        }
        System.out.println("Максимальное оценка в масиве: " + max + " ee номер: "+ maxNum);
        System.out.println("Минимальное  оценка  в масиве: " + min + " ee номер: "+ minNum);


    }
}

