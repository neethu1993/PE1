package com.stackroute.p1;

import com.stackroute.p1.NumberGuess;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberGuessTest {
    NumberGuess object;

    @Before
    public void setUp() {
        object = new NumberGuess();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void guessTest() throws Exception {

        String expectedValue = "Number guessed is less than original number. Guess another number between 1 and 50!!";
        //Act
        String actualValue = object.guess(12,22);
        //Assort
        assertEquals(expectedValue,actualValue);

        String expectedValue1 = "Number guessed is greater than original number. Guess another number between 1 and 50!!";
        //Act
        String actualValue1 = object.guess(33,22);
        //Assort
        assertEquals(expectedValue,actualValue);

        String expectedValue2 = "Number guessed matches the original number";
        //Act
        String actualValue2 = object.guess(22,22);
        //Assort
        assertEquals(expectedValue,actualValue);
    }
}
