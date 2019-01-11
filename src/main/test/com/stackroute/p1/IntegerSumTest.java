package com.stackroute.p1;

import com.stackroute.p1.IntegerSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerSumTest {
    IntegerSum object;

    @Before
    public void setUp() {
        object = new IntegerSum();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void sumTest() throws Exception {

        int expectedValue = 26;
        //Act
        int actualValue = object.total(12);
        actualValue = object.total(14);
        //Assort
        assertEquals(expectedValue,actualValue);
    }
}
