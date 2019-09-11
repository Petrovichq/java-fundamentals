package com.home.study;

import java.util.Scanner;

public class FifthQuest {
    public static void main(String[] args) {
        String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July",
                                 "August", "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number from 1 to 12");
            int input = scanner.nextInt();
            if (input > 0 && input < 13) {
                System.out.println(MONTHS[input - 1]);
                break;
            }
            else {
                System.out.println("Wrong number");
            }
        }
    }
}
