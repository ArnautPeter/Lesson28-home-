package com.java.copyfromfile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("F:" + File.separator + "java" + File.separator + "Lesson28" + File.separator + "students.txt");
        ArrayList<Student> students = ReadFile.readFromFile(file);
        WriteToFile.wtiteToFile(students);

    }
}
