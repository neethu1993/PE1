package com.stackroute.p1;

import com.stackroute.p1.NumberPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberPatternTest {
    NumberPattern object;

    @Before
    public void setUp() {
        object = new NumberPattern();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void numPattern() throws Exception {

        String expectedValue = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";
        //Act
        String actualvalue = object.pattern(5);
        //Assort
        assertEquals(expectedValue,actualvalue);
    }
}
