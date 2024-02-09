package org.example.helpers;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderHelper {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Integer readInt() {
        try {
            while(true) {
                String value = reader.readLine();
                if (StringUtils.isNumeric(value)) {
                    return Integer.valueOf(value);
                } else {
                    System.out.println("It is not a number! Please try again");
                    System.out.print( "Enter number: " );
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readString(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer[] readArray() {
        try {
            ArrayHelper helper = new ArrayHelper();
            while(true) {
                String arrayString = reader.readLine();
                if (helper.isArray(arrayString)) {
                    return helper.stringToArray(arrayString);
                } else {
                    System.out.print("This is not array. Please try again:");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
