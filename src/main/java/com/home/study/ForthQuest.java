package com.home.study;

public class ForthQuest {
    public static void main(String[] args) {
        int sum = 0;
        int multiply = 1;
        for (String arg: args) {
            sum += Integer.parseInt(arg);
        }
        for (String arg:args) {
            multiply *= Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiply = " + multiply);
    }
}
