package leson_3.tms;

public class namber_x {
    public static void main(String[] args) {


        int xyzt = 3224;
        System.out.println(xyzt);
        int x = xyzt/1000;
        int y = (xyzt/100)-10*x;
        int z = (xyzt/10)-100*x-10*y;
        int t= xyzt - 1000*x-100*y-10*z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);
        System.out.println(x==y);
        System.out.println(x==z);
        System.out.println(x==t);
        System.out.println(y==z);
        System.out.println(y==t);
        System.out.println(z==t);


    }



}
