package leson_1.tms.Shildt.Class;

import java.util.Scanner;

class Calculator {
    double number1, number2;

    Calculator(double number1, double number2) { // конструктор
        System.out.println("Считаю!");
        this.number1 = number1;
        this.number2 = number2;
    }

    double sl() {
        return number1 + number2; // метод
    }

    double vch() {
        return number1 - number2;
    }

    double um() {
        return number1 * number2;
    }

    double del() {
        return number1 / number2;
    }

    void num(double a, double b) {
        number1 = a;
        number2 = b;
    }

}

class Calc {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
////        while (true) {
//            System.out.println("Выберите опперацию: 1 - сложение; 2- вычитание; 3 - умножение; 4 - деление");
//            int input_number = scanner.nextInt();
//            if (input_number == 1) {
//                System.out.println("Вы угадали");
//                break;
//            } else if (input_number > 4) {
//                System.out.println("Введите правильное число");
//
//            }


        double x = 6;
        double y = 3;


        Calculator operation = new Calculator(x, y);
        //operation.num(x, y);


        System.out.println(operation.number1 + " плюс  " + operation.number2 + " равно " + operation.sl());
        System.out.println(operation.number1 + " минус " + operation.number2 + " равно " + operation.vch());
        System.out.println(operation.number1 + " умноженное на " + operation.number2 + " равно " + operation.um());
        System.out.println(operation.number1 + " деленное  на " + operation.number2 + " равно " + operation.del());

//            scanner.close();
    }
}


