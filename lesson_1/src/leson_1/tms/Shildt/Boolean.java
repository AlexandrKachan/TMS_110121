package leson_1.tms.Shildt;

public class Boolean {
    // логические значения
    // страница 81
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println(" b равно " + b);

        //значение типа boolean может управлять оператором if

        if (b) System.out.println("Этот код выполняется. ");
        b = false;
        if (b) System.out.println("Этот код не выполняется");

        // результат сравноеоия - значения типа boolean
        System.out.println(" 10>9 равно " + (10 > 9));


    }

}
