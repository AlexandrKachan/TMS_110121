package leson_1.tms.Shildt.Arrays;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result =0;
        int i;
     for (i=0; i<nums.length; i++) { // .length - длина масива
         System.out.println(result);
         result = result + nums[i];
     }

        System.out.println("Среднее значение равно " + result/5);
    }



}
