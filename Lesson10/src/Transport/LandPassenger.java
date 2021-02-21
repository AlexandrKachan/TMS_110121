package Transport;

public class LandPassenger extends LandTransport {
    String type = "Седан"; //тип кузова
    int passengers = 5;

    public String getBrand() {
        return "Renault";
    }
    public double getPower() {
        return 1.6;
    }
    public double getSpeed() {
        return 200;
    }
    public double getWeight() {
        return 1900;
    }
    public int getWheels() {
        return 4;
    }
    public double getFuel() {
        return 8;
    }
    public void print() {
        System.out.println("Брэнд - " + getBrand() + " ,вес машины - " + getWeight()
                + "килограмм , мощность - " + getPower() +"л/с  и киловат - " /*+ powerCalculation()+ */);
        System.out.println("максимальная скорость - "+ getSpeed() + ", количество колес- " + getWheels() + ", потребление топлива - "
                + getFuel());
        System.out.println(", грузоподъемность - " + " , тип кузова  - " + type +
                ", количество пасажиров - "+ passengers);
    }
}
