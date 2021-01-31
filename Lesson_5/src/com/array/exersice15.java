package com.array;

import java.util.Random;
//Создать масив и перевернуть его

public class exersice15 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[6]; // создали  масив на 10 переменных
        //int arr[] = {1,2,3,4,5};// создали  масив на 10 переменных

       for (int i = 0; i < arr.length; i++) {
         arr[i] = rand.nextInt(10) + 1; //заполнили его рандомными числами
       }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //Вывели его на печать
        }
        System.out.println();
        System.out.println("исходный массив");





        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length/2) break;        // пока длинна масива не больше его половины
            int b=arr[i];                      //число и забирает значение I массива
            arr[i]=arr [arr.length - i - 1];   // первому элементу присваивается значение последнего
            arr [arr.length - i - 1] =b;       // последнему элементу примваивается значение из числа б



        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //Вывели новый массив на печать
        }
        System.out.println();
        System.out.print("перевернутый массив");

    }
}
