package com.stackroute.p1;

import com.stackroute.p1.PalilndromeNumber;
import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeNumberTest {
    PalilndromeNumber object;

    @Before
    public void setUp() {
        object = new PalilndromeNumber();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void numberPalindrome() throws Exception {

        long expectedValue = 1234321;
        //Act
        long actualValue = object.palindrome(1234321);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void totalTest() throws Exception {
        long expectedValue = 8;
        //Act
        long actual = object.palindrome(1234321);
        long actualValue = object.total(actual);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
