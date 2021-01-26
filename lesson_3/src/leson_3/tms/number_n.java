package leson_3.tms;

public class number_n {
    public static void main(String[] args) {

       int xyzt = 1234;
        int a = xyzt%1000;
        int b = a%100;
        int t = b%10;
        int z= (b-t)/10;
        int y= (a-b)/100;
        int x= (xyzt-a)/1000;

        System.out.println( "Введенное число xyzt= " + xyzt);
        System.out.println( "a= "+ a);
        System.out.println( "b = " + b);
        System.out.println("t=" + t);
        System.out.println("z= "  + z);
        System.out.println("y= " + y);
        System.out.println("x= "+  x);
        System.out.println("Перевернутое число tzyx = "+  t+""+z+""+y+""+x);




    }






}
