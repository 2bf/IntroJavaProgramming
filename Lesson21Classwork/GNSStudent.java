/***
Chiming Wang
01/17/2023
Java Period 8
Lesson 21 Classwork
***/

public class GNSStudent{
   public String studentName, studentAddress;
   public int studentID, gradeAverage;
   
   public GNSStudent(){
     studentName = "";
     studentAddress = "";
     studentID = 0;
     gradeAverage = 0;

   }
 
   public void setStudentName( String name ){
     studentName = name;
   }
   public void setStudentAddress( String address ){
     studentAddress = address;
   }
   public void setStudentID( int ID ){
     studentID = ID;
   }
   public String getStudentName(){
     return studentName;
   }
   public String getStudentAddress(){
    return studentAddress;
   }
   public int getStudentID(){
     return studentID;
   }
   
   public double getAverageMethod1(double g1, double g2, double g3, double g4, double g5, double p1){
      double averageTests= 0.8*((g1 + g2 + g3 + g4 + g5 * 2)/6);
      double finalAverage = averageTests + 0.2*p1;
     
      return finalAverage;
   }
   
   public double getAverageMethod2(double g1, double g2, double g3, double g4, double programming, double p1){
      double averageTests= 0.8*((g1 + g2 + g3 + g4 * 2)/6);
      double finalAverage = averageTests + 0.2*p1;
     
      return finalAverage;
   }



   public String toString(){
      String result = "";
      result += "Name: " + studentName + ".\n";
      result += "Address " + studentAddress + ".\n";
      result += "ID: " + studentID + ".\n";
      //result += "Average: " + finalAverage + ".\n";
      return result;
   }
}
