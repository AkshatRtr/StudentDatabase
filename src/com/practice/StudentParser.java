package com.practice;

public class StudentParser {

    public Student getStudentFromText(String line){

        String[] array = line.split(",");
        Student stu = new Student(array[0], array[1],
                Integer.parseInt(array[2].trim()),Integer.parseInt(array[3].trim()),array[4],array[5]);
        return stu;

    }
}
