package com.cycles;

public class exercise11 {
    public static void main(String[] args) {
        // имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и на себя,
        //Последовательность простых чисел
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
        // 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167


        int number = 71;
        int b = 2, c = 1, d = 2;
        System.out.println("число " + number);

        while (d < number) {
            b = number % d;
            if (b == 0)
                c = c + 1;
            System.out.println(" число b = " + b);
            System.out.println(" число d = " + d);
            System.out.println(" число c = " + c);
            d++;
            System.out.println(" *******************");
        }
        if (c == 1) {
            System.out.println(number + " Число простое.");
        } else {
            System.out.println(number + " Число не простое.");
        }


    }


}




