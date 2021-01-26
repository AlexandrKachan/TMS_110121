package leson_2.tms;

import sun.rmi.server.Activation$ActivationSystemImpl_Stub;

public class Main {

    public static void main(String[] args) {
        String surname1 = "Ivanou";
        String surname2 = "Petrou";
        String surname3 = "Sidarou";
        String surname4 = "Rabinovich";

        System.out.println(surname1);
        System.out.println(surname1); // sout выводит сразу команду печати;
        System.out.println(surname2);
        System.out.println(surname2);
        System.out.println(surname3);
        System.out.println(surname3);
        System.out.println(surname4);
        System.out.println(surname4);
        String[] surnames = {"Ivanou", "Petrou", "Sidarau", "Rabinovich"};
        for (int i = 0; i < surnames.length; i++) {
            System.out.println(surnames[i]);
            System.out.println(surnames[i]);
// ctrl+alt+L форматирует код
        }

    }
}
