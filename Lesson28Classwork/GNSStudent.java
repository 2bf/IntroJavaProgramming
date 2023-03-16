/***
Chiming Wang
03/13/2023
Java Period 8
Lesson 28 Classwork
***/

public class GNSStudent{
   public String studentName, studentAddress;
   public int studentID;
   public double[] examGrades;
   
   public GNSStudent(){
      studentName = "";
      studentAddress = "";
      studentID = 0;
      examGrades = new double[5]; // set array size to 5
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
   public void setExamGrades(double[] grades){
      examGrades = grades;
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
   public double[] getExamGrades(){
      return examGrades;
   }
   
   public double getAverageMethod1(double[] grades, double programming){
      double sum = 0;
      for(int i = 0; i < grades.length; i++){
         sum += grades[i];
      }
      double averageTests = 0.8 * (sum / grades.length);
      double finalAverage = averageTests + 0.2 * programming;
      return finalAverage;
   }
   
   public double getAverageMethod2(double[] grades, double programming){
      double sum = 0;
      for(int i = 0; i < grades.length - 1; i++){
         sum += grades[i];
      }
      sum += grades[grades.length - 1] * 2;
      double averageTests = 0.8 * (sum / (grades.length + 1));
      double finalAverage = averageTests + 0.2 * programming;
      return finalAverage;
   }
   
   //quality points
   public double qualityPoints(double grade) {
      if (grade >= 90 && grade <= 100) {
         return 4;
      } else if (grade >= 80 && grade <= 89) {
         return 3;
      } else if (grade >= 70 && grade <= 79) {
         return 2;
      } else if (grade >= 65 && grade <= 69) {
         return 1;
      } else {
         return 0;
      }
   }


   public String toString(){
      String result = "";
      result += "Name: " + studentName + ".\n";
      result += "Address: " + studentAddress + ".\n";
      result += "ID: " + studentID + ".\n";
      return result;
   }
}
