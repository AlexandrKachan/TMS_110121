package leson_1.tms.Shildt.SuperPoliAbstract;

// ключевое слово super. Иерархии и уровни наследования
class Box {

    private double width;
    private double height;
    private double depth;

    //Сконструировать клон  объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // это конструктор класса Box применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый в отсутствии размеров
    Box() {
        width = -1;    //значение - 1 служит для обозначения
        height = -1;  // неинициализированного
        depth = -1;  // паралепипеда

    }

    // конструктор применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //расчитать и возвратить объем - меотд
    double volume() {
        return width * height * depth;
    }
}
// ****** теперь в классе BoxWeight  полностью реализованы все конструкторы

// расширить класс Box , включив в него поле веса
class BoxWeight extends Box {
    double weight; // вес коробки

    //сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    //конструктор BoxWeight/ указаны все параметры
    BoxWeight(double w, double h, double d, double m) {
//        width = w;    // эти данные дублируются из суперкласса Box
//        height = h;
//        depth = d;
        super(w, h, d); // заменили лишнее дублирование кода . вызов  конструктора суперкласса
        weight = m;
    }

    //конструктор применяемый по умолчанию
    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;

    }


}
// Этот клас расширяет класс Бокс, включая в него свойства цвета
//class ColorBox extends Box {
//    int color; // цвет коробки
//
//    ColorBox(double w, double h, double d, int c) {
//        width = w;
//        height = h;
//        depth = d;
//        color = c;
//
//    }
//}
//добавляем поле стоимость доставки*****************************************************************************
class Shipment extends BoxWeight{
    double cost;
    //сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //конструктор BoxWeight/ указаны все параметры
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); //  вызов  конструктора суперкласса
        cost = c;
    }

    //конструктор применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    Shipment(double len,double m, double c) {
        super(len, m);
        cost = c;
    }

}




class DemoSuper {

    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);


        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone  равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);

        System.out.println("************************************************************************************");
        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1  равен " + shipment1.weight);
        System.out.println("Стоимость доставки shipment1  равен " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2  равен " + shipment2.weight);
        System.out.println("Стоимость доставки shipment1  равен " + shipment2.cost);
        System.out.println();


    }
}
