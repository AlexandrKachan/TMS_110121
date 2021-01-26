package com.cycles;

public class cyclesRunner {


    public static void main(String[] args) throws InterruptedException {

        String minsk = "Minsk";
        String moscow = "Moscow";
        int distance = 25;


        boolean isArrived = false;

        for (int km=0; km <= distance; km ++){
            System.out.println("Спрашиваю в " + km + " раз");
            System.out.println( "Мы уже приехали в Борисов? ");
                       Thread.sleep(150);
        }
        System.out.println( "Мы уже приехали !");
    }

}
