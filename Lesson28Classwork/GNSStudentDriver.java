/***
Chiming Wang
03/13/2023
Java Period 8
Lesson 28 Classwork
***/

import javax.swing.*;

public class GNSStudentDriver{
   public static void main( String[] args ){
      String studentName = "";
      String studentAddress = "";
      int studentID = 0;
      double average = 0;
      double[] grades = {97, 98, 100, 96, 94}; // exam grades array
      double programming = 91;
      double qualityPts = 0;
   
      GNSStudent colin = new GNSStudent();
      
      colin.setStudentName("Colin");
      colin.setStudentAddress("69 Road Rd, Great Neck NY 11021");
      colin.setStudentID(300003248);
      colin.setExamGrades(grades);
      
      studentName = colin.getStudentName();
      studentAddress = colin.getStudentAddress();
      studentID = colin.getStudentID();
      average = colin.getAverageMethod1(grades, programming);
      qualityPts = colin.qualityPoints(average);
      
      System.out.println(colin);
      System.out.println("Grade average: " + average);
      System.out.println("Quality points: " + qualityPts);
   
   }
}
