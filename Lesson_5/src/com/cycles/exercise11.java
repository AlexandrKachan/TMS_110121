package com.cycles;

public class exercise11 {
    public static void main(String[] args) {


        // имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и на себя


        int number= 68;
        int b = 2, c=1;
        int d = 2;
        System.out.println("число " + number);

        while (d < number) {
            b = number % d;
            if ( b== 0)
                c=c+1;
            System.out.println(" число b = " + b);
            System.out.println(" число d = " + d);
            System.out.println(" число c = " + c);
            d++;
            System.out.println(" *******************");
        }
if (c==1) {
    System.out.println(number + " Число простое.");
}else {
    System.out.println(number + " Число не простое.");
}



    }


}




