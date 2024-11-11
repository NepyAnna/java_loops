package com.sheoanna;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        System.out.println("Put your number: ");
        Scanner inputObj = new Scanner(System.in);
        int inputNumber = inputObj.nextInt();
        inputObj.close();

        table.makeMulpiple(inputNumber);
    }
}
