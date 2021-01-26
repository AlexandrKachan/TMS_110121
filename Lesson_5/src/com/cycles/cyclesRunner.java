package com.cycles;

public class cyclesRunner {
    public static void main(String[] args) throws InterruptedException {

        String minsk = "Minsk";
        String borisov = "Borisov";
        int distance = 300;
        boolean isArrived = false;
        //int km = 0;
// **************************************************for - цикл со счетчиком

        // 1 - начальная точка
        // 2 - конечная точка
        // 3 - счетчик (как часто нужно спрашивать)
        // for (начальная точка; условие конечная точка; изменяется счетчик)


//        for (;;){
//
//            System.out.print("Спрашиваю в " + km + " раз. ");
//            System.out.println( "Мы уже приехали в " + borisov + "?");
//            Thread.sleep(150);
//            km ++;
//            if(km==distance) break;
//
//        }
//        System.out.println( "Мы уже приехали !");
//
//        int counter = 5;
//        System.out.println(counter);     //5
//        System.out.println(counter++);   //5 ->6
//        System.out.println(++counter);   //7
//        System.out.println(counter);     //7
//        System.out.println(--counter);   //6 ->6
//        System.out.println(counter--);   //6 ->5
//        System.out.println(counter--);   //5


//        for (int km=0; km <= distance; km ++){
//
//            System.out.print("Спрашиваю в " + km + " раз. ");
//            System.out.println( "Мы уже приехали в " + borisov + "?");
//                       Thread.sleep(150);
//        }
//        System.out.println( "Мы уже приехали !");


        int anchorDistance = 50;

        for (int km = 0; km <= distance; km += anchorDistance) {

            System.out.print("Спрашиваю в " + km + " раз. ");
            System.out.println("Мы уже приехали в " + borisov + "?");
//            for (int pipCounter = 0; pipCounter < anchorDistance; pipCounter += 10) {
//                System.out.println("Хочу в туалет!!!");
//                Thread.sleep(150);
//                for (int eatCounter = 0; eatCounter < 10; eatCounter++) {
//                    System.out.println("Хочу есть!!!");
//                    Thread.sleep(10);
//                }
//            }
 //           System.out.println("Мы уже приехали !");
        }


        System.out.println("****************************");
        // *****************************************************  wile - Цикл с предусловием.

        int km = 0;
        while (km<=distance){
            System.out.print("Спрашиваю в " + km + " раз. ");
            System.out.println("Мы уже приехали в " + borisov + "?");
            Thread.sleep(150);
            km+= anchorDistance;


        }








    }
}