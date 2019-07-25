package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetElementsTest {


    SortedSetElements sortedSetElements;

    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() {
        sortedSetElements = new SortedSetElements();
    }

    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() {
        sortedSetElements = null;
    }

    @Test
    public void givenStringInputShouldReturnSortedString() {
        String expected = "[Alice, Bluto, Eugene, Harry, Olive]";
        String actual = sortedSetElements.sortingElement("Harry Olive Alice Bluto Eugene");
        assertEquals(expected, actual);
    }

    @Test
    public void givenStringInputShouldReturnUnSortedString() {
        String expected = "[Harry, Olive, Eugene, Harry, Olive]";
        String actual = sortedSetElements.sortingElement("Harry Olive Alice Bluto Eugene");
        assertNotEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullInputShouldReturnException() {

        String actual = sortedSetElements.sortingElement(null);
        assertNull(actual);
    }


}