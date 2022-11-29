/***
Chiming Wang
11/28/2022
Java Period 8
Project 1: Palindrome
***/

import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;

public class Palindrome{

	public static void main(String[] args){
      String input, result, palindrome;
      int again;

      do {
         input = JOptionPane.showInputDialog ("Enter your string:");
         result = "That string reverse is: ''" + (reverseString(input) + "''");
         JOptionPane.showMessageDialog (null, result);
         if (isPalindrome(input) == true) {
            palindrome = ("The string ''" + input + "'' is a palindrome.");
         } else {
            palindrome = ("The string ''" + input + "'' is not a palindrome.");
         }
         JOptionPane.showMessageDialog (null, palindrome);
         again = JOptionPane.showConfirmDialog (null, "Would you like to check another string?");
      } // do end
      while (again == JOptionPane.YES_OPTION);
	} //public static void main end
   
   public static String reverseString(String str){
      String reverse = "";
      char scan;
      for (int i=0; i<str.length(); i++){
         scan = str.charAt(i);
         reverse = scan + reverse;
      } //for loop end
      return reverse;
   } //public static string reversestring end
   

   public static boolean isPalindrome(String str){
      String reverse = "";
      char scan;
      for (int i=0; i<str.length(); i++){
         scan = str.charAt(i);
         reverse = scan + reverse;
      } //for loop end
      return str.equals(reverse); //checks if the original string is equivalent to the reversed version
   } //public static boolean ispalindrime end
} //public class end 
