import java.util.Random;

public class exercise_8 {
//Имеется целое число  Random rand = new Random(); int x = rand.nextInt(); Это число - количество денег в рублях.
// Вывести это число, добавив к нему слово "рублей" в правильном падеже.

    public static void main(String[] args) {

        Random rand = new Random();
        //int x = rand.nextInt();
        int x = rand.nextInt();
        int xPlus = 0;
        if (x < 0) {
            xPlus = x * -1;
        } else xPlus=x;
        int lastX;
        int lastY;

        lastX = (xPlus % 10);
        lastY = (xPlus % 100);

        System.out.println(x);
        System.out.println(xPlus);
        System.out.println(lastX);
        System.out.println(lastY);

        if (lastY >=11 & lastY <= 20) {
            System.out.println( x + " рублей");
        }else if ((lastX == 1)) {
            System.out.println(x + " рубль");
        } else if ((lastX >= 2) & (lastX <= 4)) {
            System.out.println(x + " рубля");
        } else if (lastX == 0) {
            System.out.println(x + " рублей");
        } else if (lastX >= 5) {
            System.out.println(x + " рублей");

        }



    }


}
