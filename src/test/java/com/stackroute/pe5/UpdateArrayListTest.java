package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class UpdateArrayListTest {
    UpdateArrayList updateArray;

    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() {
        this.updateArray = new UpdateArrayList();
    }

    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() {
        this.updateArray = null;
    }

    @Test
    public void givenInputStringShouldReturnUpdatedArray() {

        String input = "Kiwi, Grape, Mango, Berry";
        String[] splittedString = input.split(", ");
        List<String> expectedResult = new ArrayList<String>();
        for (int i = 0; i < splittedString.length; i++) {
            expectedResult.add(splittedString[i]);

        }
        List<String> actualResult = updateArray.replaceElement("Apple, Grape, Melon, Berry", 0, "Kiwi", 2, "Mango");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenAnotherInputStringShouldReturnUpdatedArray() {

        String input = "Kiwi, Banana, Mango, Watermelon";
        String[] splittedString = input.split(", ");
        List<String> expectedResult = new ArrayList<String>();
        for (int i = 0; i < splittedString.length; i++) {
            expectedResult.add(splittedString[i]);

        }
        List<String> actualResult = updateArray.replaceElement("Apple, Banana, Melon, Watermelon", 0, "Kiwi", 2, "Mango");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyStringShouldNullResult() {

        String expectedResult = null;
        List<String> actualResult = updateArray.replaceElement("", 0, "Kiwi", 2, "Mango");
        assertEquals(expectedResult, actualResult);
    }

}
