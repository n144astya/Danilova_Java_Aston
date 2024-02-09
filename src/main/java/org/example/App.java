package org.example;

import org.example.helpers.InputReaderHelper;
import org.example.tasks.FirstTask;
import org.example.tasks.SecondTask;
import org.example.tasks.ThirdTask;

public class App {
    public static void main(String[] args) {
        InputReaderHelper reader = new InputReaderHelper();

        while (true){
            System.out.print("Enter task number (from 1 to 3. 0 for exit): ");
            int value = reader.readInt();
            switch (value) {
                case 0:
                    return;
                case 1:
                    System.out.print("First task.\n\rEnter number a: ");
                    int a = reader.readInt();
                    System.out.print("Enter number b: ");
                    int b = reader.readInt();
                    FirstTask firstTask = new FirstTask(a,b);
                    firstTask.compare();
                    firstTask.addition();
                    firstTask.subtraction();
                    firstTask.multiplication();
                    break;
                case 2:
                    System.out.print("Second task.\n\rEnter String a: ");
                    String str1 = reader.readString();
                    System.out.print("Enter String b: ");
                    String str2 = reader.readString();
                    SecondTask secondTask = new SecondTask(str1,str2);
                    secondTask.compareString();
                    break;
                case 3:
                    System.out.println("Third task.");
                    Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                    new ThirdTask().filterArray(arr);
                    break;
                default:
                    System.out.println("Task not exist");
            }
        }
    }
}
