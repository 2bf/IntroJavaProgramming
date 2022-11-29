/***
Chiming Wang
11/28/2022
Java Period 8
Project 1: CozaLozaWoza
***/

import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;
import java.text.DecimalFormat;


public class CozaLozaWoza {
    
    public static void main(String[] args) {
      String numbers;
      int again;
      do {
         numbers = JOptionPane.showInputDialog ("Enter a positive number.");
         int quantity = Integer.parseInt(numbers);
         String result = cozaLozaWoza(quantity);
         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Would you like to run this program again?");
      } // do end
      while (again == JOptionPane.YES_OPTION);
    
    }
    
    public static String cozaLozaWoza (int n) {
      String out = "";
      boolean divisible = false;
      for (int i = 1; i <= n; i++) { //checks if number is divisible and replaces it with coza/loza/woza in the string
         divisible = false;
         if (i % 3 == 0) {
                out = out + "Coza";
                divisible = true;
         } if (i % 5 == 0) {
                out = out + "Loza";
                divisible = true;
         } if (i % 7 == 0) {
                out = out + "Woza";
                divisible = true;
         } if (! divisible) {
                out = out + i;
         }
         out = out + " ";
         if (i % 11 == 0) {
                out = out + "\n";
         } 
      } //for loop end
      return out; 
    } //public static string cozalozawoza end
    
}
