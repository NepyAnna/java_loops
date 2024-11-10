package com.sheoanna;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTable {

    public MultiplicationTable() {}

    public void makeMulpiple(int number) { 
        List<String> results = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
        int result = number * i;
        results.add(number + " x " + i + " = " + result);
    }
        results.forEach(System.out::println);
}
}
