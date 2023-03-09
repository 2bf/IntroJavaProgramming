/***
Chiming Wang
03/09/2022
Java Period 8
Lesson 27 Classwork
***/

//imports packages
import javax.swing.*;
import java.lang.Math.*;
import java.lang.Math;
import java.util.Scanner;

public class Lesson27Classwork {
      public static void main(String[] args) {
      
      Scanner scan = new Scanner (System.in); //creates scanner
      int num;
      //scanner for user to imput number
      System.out.println("Enter the number of grades you would like to input:"); 
      num = scan.nextInt();
      
      int[] array1 = new int[num + 1];
      
      // fill array1 and array2 with random integer values
      for (int i = 0; i < num; i++) {
         if (i == 0) {System.out.println("Please enter the 1st grade:");}
         if (i == 1) {System.out.println("Please enter the 2nd grade:");}
         if (i == 2) {System.out.println("Please enter the 3rd grade:");}
         int e = i+1;
         if (i > 2) {System.out.println("Please enter the " + e + "th grade:");}
         int grade;
         Scanner input = new Scanner (System.in);
         grade = input.nextInt();
         array1[i] = (int) (grade); // random value between 0 and 9
      }
       
      //output
      System.out.println("Number of grades: " + num);
      
      System.out.print("Grades: {");
      for (int i = 0; i < num; i++) {
         if(i == num - 1){
            System.out.print(array1[i]);
         } if (i != num - 1) {
            System.out.print(array1[i] + ", ");
         }
      }
      System.out.println("}");
      
      double total = 0;
      System.out.print("Grade average: ");
      for (int i = 0; i < num; i++) {
         total = total + array1[i];
      }
      double avg = total/num;
      System.out.print(avg);
   }  
} //public class end
