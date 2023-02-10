/***
Chiming Wang
01/09/2023
Java Period 8
Lesson 19 Classwork
***/

import javax.swing.*;

public class StudentInfoDriver{

   public static void main( String[] args ){
      int studentID = 0;
      int studentAge = 0;
      String studentName = "";
      
      StudentInfo colin = new StudentInfo();
      
      //sets up object properties using class set methods
      colin.setStudentName("Colin");
      colin.setStudentAge(644);
      colin.setStudentID(1);
      
      
      //declare/initialize variables to store results of get classes
      studentName = colin.getStudentName();
      studentAge = colin.getStudentAge();
      studentID = colin.getStudentID();
      
      System.out.println(colin);
      
   
   } 
}
