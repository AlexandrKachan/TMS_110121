package leson_1.tms.Shildt.Class;

public class Box {
    double width;
    double height;
    double depth;
    // это конструктор класса Box
    Box (double width, double h, double d){
        System.out.println(" Конструирование объета Box");
        this.width = width;
        height = h;
        depth = d;

    }
    // метод ситающий  объем коробки
    double volume() {
                return width * height * depth;
    }

//    void razmer(double w, double h, double d) {
//        // метод устанавливающий размер коробки
//        width = w;
//        height = h;
//        depth = d;
//
//    }
}
/*
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box hisbox = new Box();
        Box shisbox = mybox;

        double vol1 = 0, vol2 = 0;
        // присвоить значения переменной экземпляра mybox
        mybox.width = 20;
        mybox.depth = 15;
        mybox.height = 10;

        hisbox.width = 5;
        hisbox.depth = 10;
        hisbox.height = 15;

        // вывести объем первой коробки
        mybox.volume();
        // вывести объем второй коробки
        hisbox.volume();
        // вывести объем третьей коробки
        shisbox.volume();
        System.out.println("Объем третьей коробки равен: " + shisbox.volume());


//        vol1 = mybox.width * mybox.height * mybox.depth;
//        vol2 = hisbox.width * hisbox.height * hisbox.depth;
//        System.out.println("Объем первой коробки равен: " + vol1);
//        System.out.println("Объем второй коробки равен: " + vol2);
//        System.out.println("Объем третьей коробки равен: " + shisbox.width * shisbox.height * shisbox.depth);


    }
}
*/
/*
class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box hisbox = new Box();
        Box shisbox = mybox;
        double vol;

        double vol1 = 0, vol2 = 0;
        // присвоить значения переменной экземпляра mybox
        mybox.width = 3;
        mybox.depth = 4;
        mybox.height = 5;

        hisbox.width = 5;
        hisbox.depth = 5;
        hisbox.height = 5;

        // вывести объем первой коробки
        // vol = mybox.volume();
        System.out.println("Объем первой коробки равен: " + mybox.volume());
        // вывести объем второй коробки
        vol = hisbox.volume();
        System.out.println("Объем первой коробки равен: " + vol);
        // вывести объем третьей коробки
        // vol =shisbox.volume();
        System.out.println("Объем первой коробки равен: " + shisbox.volume());


    }

}
/*
class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox = new Box();
        Box hisbox = new Box();
        Box shisbox = new Box();
        double vol;
        mybox.razmer(3, 3, 3); // аналог mybox.width = 3; mybox.depth = 3; mybox.height = 3;
        hisbox.razmer(5, 5, 5);
        shisbox.razmer(4, 4, 4);

//        mybox.width = 3;
//        mybox.depth = 4;
//        mybox.height = 5;
//
//        hisbox.width = 5;
//        hisbox.depth = 5;
//        hisbox.height = 5;

        // вывести объем первой коробки
        //vol = mybox.volume();
        System.out.println("Объем первой коробки равен: " + mybox.volume());

                vol = hisbox.volume();
        System.out.println("Объем первой коробки равен: " + vol);
           //    vol = shisbox.volume();
        System.out.println("Объем первой коробки равен: " + shisbox.volume());


    }

}*/

class BoxDemo6 {
    public static void main(String[] args) {

        Box mybox = new Box(10,20,15);
        Box hisbox = new Box(3,3,3);
        Box shisbox = new Box(5,5,5);

        double vol;
//        mybox.razmer(3, 3, 3);
//        hisbox.razmer(5, 5, 5);
//        shisbox.razmer(4, 4, 4);


        //vol = mybox.volume();
        System.out.println("Объем первой коробки равен: " + mybox.volume());
        vol = hisbox.volume();
        System.out.println("Объем первой коробки равен: " + vol);
        //    vol = shisbox.volume();
        System.out.println("Объем первой коробки равен: " + shisbox.volume());


    }

}

