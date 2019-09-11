package com.home.study;

import java.util.Scanner;

public class ThirdQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of random numbers:");
        int input = Integer.parseInt(scanner.nextLine());
        int[] arrayRandomNumbers = new int[input];
        for (int i = 0; i < input; i++) {
            arrayRandomNumbers[i] = (int)(Math.random()*1000);
        }
        for (int i: arrayRandomNumbers) {
            System.out.println(i);
        }
        for (int i:arrayRandomNumbers) {
            System.out.print(i + " ");
        }
    }
}
