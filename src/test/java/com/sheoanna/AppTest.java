package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class AppTest {
    
    @Test
    void testApp() {
        String simulatedInput = "5\n";

        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(new String[]{});

        String expectedOutput = "Put your number: \n" + 
                                "5 x 1 = 5\n" +
                                "5 x 2 = 10\n" +
                                "5 x 3 = 15\n" +
                                "5 x 4 = 20\n" +
                                "5 x 5 = 25\n" +
                                "5 x 6 = 30\n" +
                                "5 x 7 = 35\n" +
                                "5 x 8 = 40\n" +
                                "5 x 9 = 45\n" +
                                "5 x 10 = 50\n";

        assertEquals(expectedOutput, outContent.toString());

        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
