package org.example.helpers;

import java.util.ArrayList;

public class ArrayHelper {

    public boolean isArray(String arraySting) {
        return arraySting.matches("[0-9, ]+");
    }

    public Integer[] stringToArray(String arrayString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] stringArray = arrayString.split(",");
        for(String string: stringArray) {
            list.add(Integer.valueOf(string.trim()));
        }
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        return arr;
    }
}
