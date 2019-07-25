package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UpdateMapElementsTest {
    UpdateMapElements updateMapElements;

    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() {
        this.updateMapElements = new UpdateMapElements();
    }

    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() {
        this.updateMapElements = null;
    }

    @Test
    public void givenStringInputShouldReplaceTheElements() {
        Map<String, String> map = new HashMap<>();
        map.put("var1", "Mars");
        map.put("var2", "Saturn");
        String actualResult = updateMapElements.replaceElement(map);
        String expectedResult = "{var2=Mars, var1= }";
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenEmptyInputShouldReturnNull() {
        Map<String, String> expectedResult = null;

        String actualResult = updateMapElements.replaceElement(expectedResult);
        //String expectedResult=null;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void givenAStringInputShouldReplaceTheElements() {
        Map<String, String> map = new HashMap<>();
        map.put("var1", "Java");
        map.put("var2", "C++");
        String actualResult = updateMapElements.replaceElement(map);
        String expectedResult = "{var2=Java, var1= }";
        assertEquals(expectedResult, actualResult);

    }

}