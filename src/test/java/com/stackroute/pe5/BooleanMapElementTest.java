package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BooleanMapElementTest {
    BooleanMapElement booleanMapElement;

    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() {
        this.booleanMapElement = new BooleanMapElement();
    }

    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() {
        this.booleanMapElement = null;
    }

    @Test
    public void givenStringArrayShouldReturnBooleanResult() {
        String[] input = {"a", "b", "c", "d", "a", "c", "c"};
        Map actualResult = booleanMapElement.checkBoolean(input);
        Map expectedResult = new HashMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenStringArrayShouldReturnCharacterResult() {
        String input[] = {"a", "b", "c", "d", "a", "c", "c", "a", "c", "b", "d"};
        Map actualResult = booleanMapElement.checkBoolean(input);
        Map expectedResult = new HashMap();

        expectedResult.put("a", true);
        expectedResult.put("b", true);
        expectedResult.put("c", true);
        expectedResult.put("d", true);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenEmptyArrayShouldReturnNullResult() {
        String input[] = {};
        Map actualResult = booleanMapElement.checkBoolean(input);
        Map expectedResult = new HashMap();
        expectedResult = null;

        //expectedResult.put("",);
        assertEquals(expectedResult, actualResult);
    }

}