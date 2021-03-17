package com.cycles;

public class exercise11 {
    public static void main(String[] args) {
        // имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и на себя,
        //Последовательность простых чисел
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
        // 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167


        int number = 167,d = 2;
        boolean prost = true;
        System.out.println("число " + number);

        while (d < number) {
            if (number % d == 0) {
                prost=false;
                break;
            }
            d++;
        }
        if (prost) {
            System.out.println(number + " Число простое.");
        } else {
            System.out.println(number + " Число не простое.");
        }


    }


}




