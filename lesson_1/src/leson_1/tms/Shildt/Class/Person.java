package leson_1.tms.Shildt.Class;
 class Program {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.displayInfo();

        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();

    }

    


}
public class Person {

    String name;
    int age;

    void displayInfo() {

        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}

