/***
Chiming Wang
03/27/2023
Java Period 8
Lesson 30 Classwork 
***/

//imports packages
import javax.swing.*;

public class Lesson30Classwork1 {
   
   public static void main (String[] args) 
   { 
      int[][] table = new int[10][10]; 

      // Load the table with values 
      for (int row = 1; row < table.length; row++) 
         for (int col=1; col < table[row].length; col++) 
            table[row][col] = row * col; 

      // Print the table 
      for (int row=1; row < table.length; row++) 
      { 
         for (int col=1; col < table[row].length; col++) 
            System.out.print (table[row][col] + "\t"); 
         System.out.println(); 
      } 
   } 
      
} //public class end
