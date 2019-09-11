package com.home.study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondQuest {

    public static void main(String[] args) {
        String[] result = new String[args.length];
        int counter = args.length;
        for (int i = 0; i < args.length; i++) {
            result[i] = args[counter - i - 1];
        }
        System.out.println(Arrays.toString(result));
    }
}
