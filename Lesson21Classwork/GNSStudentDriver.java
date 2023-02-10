/***
Chiming Wang
01/17/2023
Java Period 8
Lesson 21 Classwork
***/

import javax.swing.*;

public class GNSStudentDriver{
  public static void main( String[] args ){
 
    String studentName = "";
    String studentAddress = "";
    int studentID = 0;
    double average = 0;
    double g1 = 97;
    double g2 = 98;
    double g3 = 100;
    double g4 = 96;
    double g5 = 94;
    double p1 = 91;
    double programming = 94;
   
    GNSStudent colin = new GNSStudent();
   
    colin.setStudentName("Colin");
    colin.setStudentAddress("69 Road Rd, Great Neck NY 11021");
    colin.setStudentID(300003248);
   
    studentName = colin.getStudentName();
    studentAddress = colin.getStudentAddress();
    studentID = colin.getStudentID();
    average = colin.getAverageMethod1(g1, g2, g3, g4, g5, p1);
   
    System.out.println(colin);
    System.out.println(average);
  }
}
