package leson_1.tms.Shildt.Extend;


 class Box {

    double width;
    double height;
    double depth;

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
        System.out.println(width + " " + height + " " + depth);
        return width * height * depth;
    }
}


// расширить класс Box , включив в него поле веса
class BoxWeight extends Box {
    double weight; // вес паралепипеда

    //конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
//        width = w;    // эти данные дублируются из суперкласса Box
//        height = h;
//        depth = d;
        super(w, h, d); // заменили лишнее дублирование кода . вызов  конструктора суперкласса
        weight = m;
    }
}

// Этот клас расширяет класс Бокс, включая в него свойства цвета
class ColorBox extends Box {
    int color; // цвет коробки

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;

    }
}


class DemoBoxWeight {

    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        ColorBox mybox3 = new ColorBox(2, 3, 4, 3);

        BoxWeight weightBox = new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();

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
        System.out.println("Цвет mybox3 равен " + mybox3.color);
        System.out.println();

        vol = weightBox.volume();
        System.out.println("Объем weightBox равен " + vol);
        System.out.println("Вес mybox2 равен " + weightBox.weight);
        System.out.println();
// присвоить ссылке на объект BoxWeight ссылки на объект Box
        plainBox=weightBox;
        vol = plainBox.volume();
        System.out.println("Объем plainBox равен " + vol);

    }
}































