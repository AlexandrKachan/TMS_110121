public class Time {
    int sek, min, hour, h, m, s;

    Time(int hour, int min, int sek) { //Конструктор
        this.hour = hour;
        this.min = min;
        this.sek = sek;
        h = hour * 360;
        m = min * 60;
    }

    int sekund() {
        return h + m + sek;
    }


}

class TimeRuner {
    public static void main(String[] args) {
        Time obTime1 = new Time(1, 1, 20);
        Time obTime2 = new Time(1, 1, 10);


        System.out.println(obTime1.sekund());
        System.out.println(obTime2.sekund());
    }


}