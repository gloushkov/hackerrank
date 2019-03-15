package search;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Ognian Gloushkov on 2019-03-15.
 */
@TestInstance(Lifecycle.PER_CLASS)
class IceCreamParlorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void cleanStreams() {
        outContent.reset();
        errContent.reset();
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void test1() {
        int[] input = {1, 4, 5, 3, 2};
        IceCreamParlor.whatFlavors(input, 4);
        assertEquals("1 4", outContent.toString());
    }

    @Test
    public void test2() {
        int[] input = {2, 2, 4, 3};
        IceCreamParlor.whatFlavors(input, 4);
        assertEquals("1 2", outContent.toString());
    }

}