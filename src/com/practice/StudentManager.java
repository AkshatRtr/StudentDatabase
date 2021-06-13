package com.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    static  StudentParser studentParser = new StudentParser();
    public static void main(String [] args) throws Exception{

        File file = new File("src/Resources/StudentDataFile.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Student> studentData = new ArrayList<>(); // Coding to interfaces


        String st;
        while ((st = br.readLine())!= null){
            studentData.add(studentParser.getStudentFromText(st));
        }
    }
}
