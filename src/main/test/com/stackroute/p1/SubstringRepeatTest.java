package com.stackroute.p1;

import com.stackroute.p1.SubstringRepeat;
import org.junit.*;
import static org.junit.Assert.*;

public class SubstringRepeatTest {
    SubstringRepeat object;

    @Before
    public void setUp() {
        object = new SubstringRepeat();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void repeatSub() throws Exception {

        String expectedValue = "stackrouterouterouterouterouteroute";
        //Act
        String actualValue=object.repeatsub("stackroute",5);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
