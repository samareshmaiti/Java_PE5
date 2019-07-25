package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDetailsTest {
    SortedStudent sortedStudent;

    @Before
    public void setUp() {
        this.sortedStudent = new SortedStudent();
    }

    @After
    public void tearDown() {
        this.sortedStudent = null;
    }

    @Test
    public void testStudent() {
        List<StudentDetails> students = new ArrayList<>();
        StudentDetails obj1 = new StudentDetails(1, "gaurav", 27);
        StudentDetails obj2 = new StudentDetails(2, "hamzah", 23);
        StudentDetails obj3 = new StudentDetails(3, "sameer", 10);
//        for (int i = 0; i < 3; i++) {
//         students.add(obj1);
//        }
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        Collections.sort(students,new SortedStudent());
        String expected="[StudentDetails{id='1', name='gaurav', age=27}, StudentDetails{id='2', name='hamzah', age=23}, StudentDetails{id='3', name='sameer', age=10}]";
        assertEquals(expected,students.toString());

    }
}