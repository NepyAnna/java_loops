package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {
    @Test
    void testMakeMulpiple() {
        MultiplicationTable table = new MultiplicationTable();
        int num = 5;
        
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        table.makeMulpiple(num);

        String outPut = outputStream.toString();

        assertTrue(outPut.contains("5 x 5 = 25"));

        System.setOut(originalOut);
    }
}
