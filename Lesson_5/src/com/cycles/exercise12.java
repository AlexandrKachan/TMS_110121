package com.cycles;

public class exercise12 {
    public static void main(String[] args) {

        // найти сумму первых Н целых чисел которые делятся на 3


        int number = 12;
        int b = 1, c = 0;
        int count = 1;
        System.out.println("число " + number);

        while (count <= number) {
            b = count % 3;
            if (b == 0) {
                c = count + c;
            }
            System.out.println(" счетчик = " + count);
            System.out.println(" Делние без остатка = " + b);
            System.out.println(" число c = " + c);
            count++;
            System.out.println(" *******************");
        }

        System.out.println(number + " Заданое чмсло Н.");
        System.out.println(c + " Сумма первых н чисел которые делятся на 3");
    }


}


