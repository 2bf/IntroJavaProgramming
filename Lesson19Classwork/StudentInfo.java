/***
Chiming Wang
01/09/2023
Java Period 8
Lesson 19 Classwork
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class StudentInfo
{

   //declaring instance variables
   private String studentName;
   private int studentAge, studentID;
   
   //constructor (??)
   public StudentInfo() {
    studentID = 0;
    studentAge = 0;
    studentName = "";
   }
   

   public void setStudentName (String name) {
      studentName = name;
   }
   public void setStudentAge (int age) {
      studentAge = age;
   }
   public void setStudentID (int id) {
      studentID = id;
   }
   

   public String getStudentName() {
      return studentName;
   }
   public int getStudentAge() {
      return studentAge;
   }
   public int getStudentID() {
      return studentID;
   }

   
   
   
   public String speak (String speech) {
      String a = (studentName + " " + studentName);
      return a;
   }  
   
   
   
   public String toString() {
      String result = "";
    
      result = "Student: " + studentName + "\n";
      result += "Student Age: " + studentAge +"\n";
      result += "Student ID: " + studentID +"\n";

    
      return result;
   }
   
} //public class end
