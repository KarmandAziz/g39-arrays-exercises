package org.example;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{





    @Test
    public void arrayToStringReturnExpectedResult(){
        //Arrange - setting up the test
        String[] testData ={"1", "2"};
        String expected = "[1, 2]";

        //Act - performing the test
        String actual = App.arrayToString(testData);

        //Assert - evaluating the result
        assertEquals(actual, expected);

    }
    @Test
    public void testAddToStringArray() {
        String[] testArrayData = {};
        String string = "Say hello to my little friend";
        String[] expected = {"Say hello to my little friend"};

        String[] actual = App.addToStringArray(testArrayData, string);
        assertArrayEquals(actual, expected);
    }
}
