package com.cycles;

public class exercise9 {
// надо получить ряд случайных чисел и посчитать среднее арифметическое от них.
// вывод чисел прекращается, если очередным числом будет ноль


    public static void main(String[] args) {
//        double averageSum = 0;
//        double sum = 0;
//        int n = 0;
//        int x = (int) (Math.random() * 10); // генерирует рандомное число x
//        System.out.println("X = " +x);
//        while (x != 0) { // цикл пока х не равно нулю
//            sum += x; // в сумму прибавляет х
//            n++;      // в счетчик операция добавляет 1
//            x = (int) (Math.random() * 10); // снова генерирует рандомное число x
//
//            System.out.println("X = " +x);
//            System.out.println("N = " +n);
//            System.out.println("Sum = " +sum);
//        }
//        if (n != 0) {                   // проверка чтобы не поделить на ноль
//            averageSum = sum / n;
//        } else {
//            averageSum = 0;
//        }
//        System.out.println("среднее: " + averageSum);
//        System.out.println("sum : " + sum);
//        System.out.println("n : " + n);
//        System.out.println("***********************************************");
//

        double averageProd = 0;
        double prod = 1;
        int n = 0;
        int x = (int) (Math.random() * 10); // генерирует рандомное число x

        while (x != 0) { // цикл пока х не равно нулю
            prod *= x; // произведение числа
            n++;      // в счетчик операция добавляет 1
            x = (int) (Math.random() * 10); // снова генерирует рандомное число x

//            System.out.println("произведение= " + prod);
//            System.out.println("рандомное число " + n + " = " + x);
        }
        if (n != 0) {                   // проверка чтобы не поделить на ноль
            averageProd = prod / n;
        } else {
            averageProd = 0;
        }
        System.out.println("произведение : " + prod);
        System.out.println("количество итераций: " + n);
        System.out.println("среднее: " + averageProd);

    }


}

