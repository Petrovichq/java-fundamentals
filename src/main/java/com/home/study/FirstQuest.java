package com.home.study;

import java.util.Scanner;

public class FirstQuest
{
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Insert your name:" );
        String input = scanner.nextLine();
        System.out.println("Welcome, " + input);
    }
}
