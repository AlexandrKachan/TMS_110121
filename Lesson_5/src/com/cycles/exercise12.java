package com.cycles;

public class exercise12 {
    public static void main(String[] args) {

        // найти сумму первых Н целых чисел которые делятся на 3


        int num = 4, count = 1;
        int i = 1, sum = 0;
        System.out.println("число " + num);


        while (count <=num) {
            if (i % 3 == 0) {
                count++;
                sum += i;}

            i++;


        }

        System.out.println(num + " Заданое чмсло Н.");
        System.out.println(sum + " Сумма первых н чисел которые делятся на 3");
    }


}


