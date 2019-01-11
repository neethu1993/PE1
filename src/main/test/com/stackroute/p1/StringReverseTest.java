package com.stackroute.p1;

import com.stackroute.p1.StringReverse;
import org.junit.*;
import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse object;

    @Before
    public void setUp() {
        object = new StringReverse();
    }

    @After
    public void tearDown() {
        object = null;
    }

    @Test
    public void repeatSub() throws Exception {

        String expectedValue = "etuorkcats";
        //Act
        String actualValue=object.reversal("stackroute");
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
