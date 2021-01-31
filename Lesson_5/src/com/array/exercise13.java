package com.array;

import java.util.Random;


public class exercise13 {
    // создать последовательность случайных чисел, найти и вывести найбольшее (найменьшее) из них.

    public static void main(String[] args) {

        Random rand = new Random();
        int [] marks = new int[10]; // создали  масив на 10 переменных

        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(10) + 1; //заполнили его рандомными числами
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " "); //Вывели его на печать
        }
             System.out.println("length of array: " + marks.length); // Вывели длинну масива

        int max = marks[0];
        int min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]){
                max = marks[i]; // нашли максимальное число
            }
            if (min > marks[i]){
                min = marks[i]; // нашли минимальное число
            }
        }
        System.out.println("Максимальное число в масиве: " + max);
        System.out.println("Минимальное  число в масиве: " + min);


}
}

