package com.java.copyfromfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToFile { // wtite to xml

    public static void wtiteToFile(ArrayList<Student> students) {

        try (FileWriter fileWriter = new FileWriter("F:\\java\\Lesson28\\students.xml");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write("<students>\r\n");
            for (Student student : students) {
                writer.write("<student>\r\n");
                writer.write("<lastname>");
                writer.write(student.getLastName());
                writer.write("</lastname>\r\n");
                writer.write("<firstname>");
                writer.write(student.getFirstName());
                writer.write("</firstname>\r\n");
                writer.write("<age>");
                writer.write(Integer.toString(student.getAge()));
                writer.write("</age>\r\n");
                writer.write("</student>\r\n");
            }
            writer.write("</students>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
