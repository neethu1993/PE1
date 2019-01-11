package com.stackroute.p1;

import com.stackroute.p1.CharacterType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {
    CharacterType object;

    @Before
    public void setUp() {
        object = new CharacterType();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void typeChar() {

        String expectedValue = "Small case letter";
        //Act
        String actualValue = object.typeChar('a');
        //Assort
        assertEquals(expectedValue,actualValue);
        String expectedValue1 = "Capital letter";
        //Act
        String actualValue1 = object.typeChar('A');
        //Assort
        assertEquals(expectedValue,actualValue);

        String expectedValue2 = "A digit";
        //Act
        String actualValue2 = object.typeChar('9');
        //Assort
        assertEquals(expectedValue,actualValue);

        String expectedValue3 = "Special symbol";
        //Act
        String actualValue3 = object.typeChar('@');
        //Assort
        assertEquals(expectedValue,actualValue);
    }
}