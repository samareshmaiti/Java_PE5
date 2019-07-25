package com.stackroute.pe5;

import java.util.Comparator;

class StudentDetails {
    private int id;
    private String name;
    private int age;
    //Declaring constructer
    public StudentDetails(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //Declaring getter-setter method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Declare toString method
    @Override
    public String toString() {
        return "StudentDetails{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
    //Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//      for students having same name and age, sort them according to their ID.
class SortedStudent implements Comparator<StudentDetails>
{
    @Override
    public int compare(StudentDetails student, StudentDetails studentDetails) {
        if (student.getAge() == studentDetails.getAge()) {
            if (student.getName().equals(studentDetails.getName()))
                return studentDetails.getId() - student.getId();
            else
                return studentDetails.getName().compareTo(student.getName());
        } else {
            return studentDetails.getAge() - student.getAge();
        }
    }
}
