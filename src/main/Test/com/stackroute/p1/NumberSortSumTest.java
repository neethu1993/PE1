package com.stackroute.p1;

import com.stackroute.p1.NumberSortSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberSortSumTest {
    NumberSortSum object;

    @Before
    public void setUp() {
        object = new NumberSortSum();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void sortSum() throws Exception {

        int expectedValue = 10;
        //Act
        int actualValue = object.sort(234534);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
