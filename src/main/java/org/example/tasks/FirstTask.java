package org.example.tasks;

public class FirstTask {

    private final int a;
    private final int b;

    public FirstTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void compare() {
        if(a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b ) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }
    }
    public void addition() {
        System.out.println("Сумма =" + (a + b));
    }
    public void subtraction () {
        System.out.println("Вычитание =" + (a-b));
    }
    public void multiplication() {
        System.out.println("Умножение =" + (a*b));
    }
}
