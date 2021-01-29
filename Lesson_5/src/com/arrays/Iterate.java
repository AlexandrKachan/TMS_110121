package com.arrays;

public class Iterate {
    // сортировка масива методом перебора (Iterate ) чисел

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 1, 4, 6, 8, 7, 9, 10, 12, 11, 13, 15, 14};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Неотсортированный масив");

        for (int min = 0; min < arr.length - 1; min++) {
            int last = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[last]) {
                    last = j;

                }
            }
            int tmp = arr[min];
            arr[min] = arr[last];
            arr[last] = tmp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" Отсортированный масив");


    }


}


