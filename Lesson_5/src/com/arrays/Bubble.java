package com.arrays;
// сортировка масива методом пузырька

public class Bubble {
    public static void main(String[] args) {
        int array[] = {2, 5, 3, 1, 4, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14};
        System.out.println(array.length + "длинна масива");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" Неотсортированный масив");

        for (int start = 0; start < array.length - 1; start++) {
            for (int index = 0; index < array.length - 1 - start; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[(index + 1)];
                    array[index + 1] = tmp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println(" вывести отсортированный масив"); //вывести отсортированный масив

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > 3 && array[i] < 12) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" вывести числа больше 3 и меньше 12"); //вывести числа больше 3 и меньше 12

    }


}
