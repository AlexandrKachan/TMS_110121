package leson_1.tms.Shildt.Class;

import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {




    public void getNames (String s){
        GregorianCalendar myC = new GregorianCalendar();
        System.out.println(s);
        System.out.println(myC.get(myC.YEAR)+ ":" + myC.MONTH + ":" + myC.get(myC.DAY_OF_MONTH));



    }
}

//import leleson_1.tms.Shildt.Class.Test1;

class  PrintName {

    public static void main (String args[]){
        String name = "GeeksforGeeks";
        Test1 obj = new Test1();
        obj.getNames(name);

    }
}