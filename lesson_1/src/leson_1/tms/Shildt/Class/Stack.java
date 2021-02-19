package leson_1.tms.Shildt.Class;

public class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {

        if (tos == 9) System.out.println(" Стек заполнен.");
        else stack[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println(" Стек не загружен");
            return 0;
        } else return stack[tos--];

    }

}


