package com.stackroute.p1;

import com.stackroute.p1.WordCheck;
import org.junit.*;
import static org.junit.Assert.*;

public class WordCheckTest {
    WordCheck word;

    @Before
    public void setUp() {
        word = new WordCheck();
    }

    @After
    public void tearDown() {
        word = null;
    }

    @Test
    public void ChecksForWord() throws Exception {

        String expectedValue = "Vowel";
        String expectedValue1 = "Consonent";
        String expectedValue2 = "Not Alphabet";
        //Act
        String actualValue = word.checkWord("a");
        String actualValue1 = word.checkWord("r");
        String actualValue2 = word.checkWord("4");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedValue1, actualValue1);
        assertEquals(expectedValue2, actualValue2);
    }
}
