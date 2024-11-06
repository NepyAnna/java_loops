package com.sheoanna;

import java.util.Scanner;

public class MultiplicationTable {

    public MultiplicationTable() {}

    public static void makeMulpiple() { 
    System.out.println("Put your number: ");
    Scanner inputObj = new Scanner(System.in);
    int inputNumber = inputObj.nextInt();
    inputObj.nextLine();

    for (int i = 1; i <= 107; i++) {
        int result = inputNumber * i;
        System.out.println(inputNumber + " x " + i + " = " + result);
    }
}
}
