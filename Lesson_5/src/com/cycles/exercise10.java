package com.cycles;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class exercise10 {

    public static void main(String[] args) {


        // Посчитать факториал числа в границах от 10 до 15

        int a = 10;
        int b = a;
        int c = 15;
        System.out.print("число произведения" + b);

        while (b <= c) {
            a = a * b;
            b++;
            System.out.println(" произведение = " + a);
            System.out.print(" число произведения" + b);
        }


    }
}





