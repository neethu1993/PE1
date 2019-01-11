package com.stackroute.p1;

import com.stackroute.p1.ConditionalCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckTest {
    ConditionalCheck object;

    @Before
    public void setUp() {
        object = new ConditionalCheck();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void check() {

        String expectedValue = "Tom";
        //Act
        String actaulValue = object.check(23);
        //Assort
        assertEquals(expectedValue,actaulValue);

        String expectedValue1 = "Jerry";
        //Act
        String actaulValue1 = object.check(24);
        //Assort
        assertEquals(expectedValue,actaulValue);

        String expectedValue2 = "unknown";
        //Act
        String actaulValue2 = object.check(12);
        //Assort
        assertEquals(expectedValue,actaulValue);
    }
}