package com.array;

import java.util.Random;

public class exersice17 {


    public static void main(String[] args) {


        int [][] arr = new int [11][11];



        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length-i; j++) {
                    arr[i][j] = 1;

                //System.out.print(arr[i][j] + " ");
            }
            //System.out.println(" ");

        }
        int ns = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j >= ns; j--) {
                arr[i][j] = 1;
            }
            ns++;
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        }

    }


