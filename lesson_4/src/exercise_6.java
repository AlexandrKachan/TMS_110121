public class exercise_6 {
    //создайте число.
    // Опре делите, является ли число трехзначным.
            // Исходное число сравнивается  со 100 и с 1000. Если оно больше 100, но меньше 1000, то число трехзначное
    // является ли его последняя цифра семеркой.
            //число 7, которое делится на 10 без остатка равно 7
    // определите, является ли число чентным.
            //Чётное число — целое число, которое делится на 2 без остатка
    public static void main(String[] args) {

        int number = 12345;
        System.out.println("Дано число " + number);
        if ((number >= 100) & (number < 1000)) {
            System.out.println("Число " + number + " трехначное");
        } else {
            System.out.println("Число " + number + " не трехначное");
        }
        if ((number % 10 == 7)) {
            System.out.println("последняя цифра числа " + number + " является семеркой");
        } else {
            System.out.println("последняя цифра числа " + number + " не является семеркой");
        }
        if ((number % 2 == 0)) {
            System.out.println("Число " + number + " четное");
        } else {
            System.out.println("Число " + number + " не четное");
        }


    }


}
