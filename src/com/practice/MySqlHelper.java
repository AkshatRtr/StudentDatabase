package com.practice;
import java.sql.*;
import java.io.*;
public class MySqlHelper {

    static String filePath = "C:\\IntelliJ\\StudentDatabase\\src\\Resources\\StudentDataFile.txt";

    public static void insertStudentInDatabase(Student student) throws SQLException {
             Connection con = DriverManager.getConnection(
                     "jdbc:mysql://127.0.0.1:3306/sys","root","Akshat@27");

             String query = "INSERT INTO StudentData(Name, Stu_ID, Age, Grade, Father_Name, Mother_Name) VALUES (?, ?, ?, ?, ?, ?)";

             PreparedStatement pstmt = con.prepareStatement(query);
             pstmt.setString(1, student.getName());
             pstmt.setString(2, student.getId());
             pstmt.setInt(3, student.getAge());
             pstmt.setInt(4, student.getGrade());
             pstmt.setString(5, student.getFatherName());
             pstmt.setString(6, student.getMotherName());

             pstmt.execute();
             con.close();
         }
}


