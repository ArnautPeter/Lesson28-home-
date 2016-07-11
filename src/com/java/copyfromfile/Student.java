package com.java.copyfromfile;

public class Student {

    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        if (lastName == null) return "";
        return lastName;
    }

    public String getFirstName() {
        if (firstName == null) return "";
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
