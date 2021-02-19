package com.array;

import java.util.Random;

public class exercise16 {


    // Определить сумму элементов масива, рассположенных между минимальным и максимальным значениями.

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10]; // создали  масив на 10 переменных

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1; //заполнили его рандомными числами
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " "); //Вывели длинну масива  на печать
            }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //Вывели его на печать
        }
        System.out.println("length of array: " + array.length); // Вывели длинну масива

        int max = array[0], maxNum = 0;
        int min = array[0], minNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxNum = i;  // нашли максимальное число
            }
            if (min > array[i]) {
                min = array[i];
                minNum = i;// нашли минимальное число
            }
        }
        System.out.println("Минимальное  число   в масиве: " + min + " ee номер: " + minNum);
        System.out.println("Максимальное число  в масиве: " + max + " ee номер: " + maxNum);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > minNum && i < maxNum) {    // если минимальный номер больше максимального
                sum = sum + array[i];
            } else if (i < minNum && i > maxNum) { // наоборот, если максимальный  номер больше минимального
                sum = sum + array[i];
            }

            }
            System.out.println("Сумма  элементов масива: " + sum);
        }


    }
