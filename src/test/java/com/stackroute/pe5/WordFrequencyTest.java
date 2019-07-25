package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyTest {
    WordFrequency wordFrequency;


    //Method annotated with `@Before` will execute before each test method in this class is executed.
    @Before
    public void setUp() throws Exception {
        wordFrequency = new WordFrequency();
    }

    //Method annotated with `@After` will execute after each test method in this class is executed.
    @After
    public void tearDown() throws Exception {
        wordFrequency = null;
    }

    @Test
    public void GivenInputStringShouldReturnFrequencyOfWords() {
        String expected = "{one=5, two=2, three=2}";
        String actual = wordFrequency.checkFrequency("one one -one___two,,three,one @three*one?two");
        assertEquals(expected, actual);
    }

    @Test
    public void GivenAnotherInputStringShouldReturnFrequencyOfWords() {
        String expected = "{here=2, Hello=1, and=1, come=1, do=1, it=1}";
        String actual = wordFrequency.checkFrequency("Hello come here and here do it");
        assertEquals(expected, actual);
    }


    @Test
    public void givenNullInputShouldReturnNullPOinterException() {

        String actual = wordFrequency.checkFrequency(null);
        assertNull(actual);
    }


}