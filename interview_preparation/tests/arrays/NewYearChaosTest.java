package arrays;

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
 * Created by Ognian Gloushkov on 2019-03-14.
 */
@TestInstance(Lifecycle.PER_CLASS)
class NewYearChaosTest {

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
    void test1(){
        NewYearChaos.minimumBribes(new int[] {2, 1, 5, 3, 4});
        assertEquals("3", outContent.toString().trim());
    }

    @Test
    void test2(){
        NewYearChaos.minimumBribes(new int[] {2, 5, 1, 3, 4});
        assertEquals("Too chaotic", outContent.toString().trim());
    }

    @Test
    void test3(){
        NewYearChaos.minimumBribes(new int[] {1, 2, 5, 3, 4, 7, 8, 6});
        assertEquals("4", outContent.toString().trim());
    }

}