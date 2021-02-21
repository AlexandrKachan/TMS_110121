package leson_1.tms.Shildt.Example;

//Вычислить растояние проходимое светом используя Long
//страница 78

public class TipeLong {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
// приблизительная скорость света миль в секнду
        lightspeed = 186000;
        days = 1000; // указать количество дней
        seconds = days * 24 * 60 * 60; // преобразовали в секунды
        distance = lightspeed * seconds; // вычислили растояние
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль");

    }


}
