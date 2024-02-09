package org.example.tasks;

public class SecondTask {

    private  final String a;
    private final String b;

    public SecondTask(String a, String b) {
        this.a = a;
        this.b = b;
    }
    public void compareString () {
        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
