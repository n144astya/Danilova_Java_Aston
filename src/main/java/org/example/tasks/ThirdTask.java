package org.example.tasks;

import java.util.ArrayList;

public class ThirdTask {

   // int[] myArray; // объявление массива
    // myArray = new int[10];

    public void filterArray(Integer[] array) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for(Integer integer: array) {
            if (integer % 2 == 0) {
                resultArray.add(integer);
            }
        }
        System.out.println(resultArray);
    }
}
