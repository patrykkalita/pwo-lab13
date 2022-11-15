package pwo.lab13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static pwo.lab13.Text.countNums;
import static pwo.lab13.Text.noChars;
import static pwo.lab13.Text.noNums;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void countNumsTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(countNums(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void countNumsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(countNums(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xxxxx"})
    void noNumsTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(noNums(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xxxxx"})
    void noNumsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(noNums(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "12345"})
    void noCharsTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(noChars(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "`12345"})
    void noCharsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(noChars(str));
    }

}
