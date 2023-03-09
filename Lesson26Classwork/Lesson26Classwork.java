/***
Chiming Wang
03/08/2022
Java Period 8
Lesson 26 Classwork
***/

//imports packages
import javax.swing.*;
import java.lang.Math.*;
import java.lang.Math;
import java.util.Scanner;

public class Lesson26Classwork {
      public static void main(String[] args) {
      
      Scanner scan = new Scanner (System.in); //creates scanner
      int size;
      //scanner for user to imput number
      System.out.println("Program will randomly generate the data contained in the arrays. Enter array size:"); 
      size = scan.nextInt();
      
      int[] array1 = new int[size];
      int[] array2 = new int[size];
      
      // fill array1 and array2 with random integer values
      for (int i = 0; i < size; i++) {
         array1[i] = (int) (Math.random() * 10); // random value between 0 and 9
         array2[i] = (int) (Math.random() * 10); // random value between 0 and 9
      }
            
      double termAdd = 0; 
      for(int i = 0; i < array1.length; i++) {
         double sum = (array2[i] - array1[i])*(array2[i] - array1[i]);
         termAdd = termAdd + sum;
      }
      termAdd = Math.sqrt(termAdd);
      
      
      //output
      System.out.println("Array size: " + size);
      
      System.out.print("Array1: {");
      for (int i = 0; i < size; i++) {
         if(i == size - 1){
            System.out.print(array1[i]);
         } if (i != size - 1) {
            System.out.print(array1[i] + ", ");
         }
      }
      System.out.println("}");
      
      System.out.print("Array2: {");
      for (int i = 0; i < size; i++) {
         if(i == size - 1){
            System.out.print(array2[i]);
         } if (i != size - 1) {
            System.out.print(array2[i] + ", ");
         }
      }
      System.out.println("}");
      System.out.println("Euclidian distance between Array1 and Array2: " + termAdd);
   
   }  
} //public class end
