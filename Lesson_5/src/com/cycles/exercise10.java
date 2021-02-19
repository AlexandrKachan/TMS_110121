package com.cycles;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class exercise10 {

    public static void main(String[] args) {


        // Посчитать факториал числа в границах от 10 до 15

        int a = 1;
        int b = a;
        int c = 15;

        while (b <= c) {
            a = a * b;
            if (b>9) {
                System.out.println("Факториал числа " + b + " = " + a);
            }

            b++;
        }


    }
}





