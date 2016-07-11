package com.java.copyfromfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile { //read from txt file

    public static ArrayList<Student> readFromFile(File file) {

        List<Student> students = new ArrayList<>();

        String line;
        String lastName = null;
        String firstName = null;
        int age = 0;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader reader = new BufferedReader(fileReader)) {
            while ((line = reader.readLine()) != null) {
                if (line.equals("")) continue;
                String[] arr = line.split(":");
                if (arr[0].equals("Lastname")) {
                    if (arr.length == 1) lastName = null;
                    else
                        lastName = arr[1].trim();
                    continue;
                }
                if (arr[0].equals("Firstname")) {
                    if (arr.length == 1) firstName = null;
                    else
                        firstName = arr[1].trim();
                    continue;
                }
                if (arr[0].equals("Age")) {
                    if (arr.length == 1) age = 0;
                    else
                        age = Integer.parseInt(arr[1].trim());
                }
                Student student = new Student(lastName, firstName, age);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (ArrayList<Student>) students;
    }
}
