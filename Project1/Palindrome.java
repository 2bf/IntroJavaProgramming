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
      String input, result, palindrome; //declare variables in which values will be stored in
      int again;

      do {
         input = JOptionPane.showInputDialog ("Enter your string:");
         result = "That string reverse is: ''" + (reverseString(input) + "''"); //calls reverseString method and puts everything into a string
         JOptionPane.showMessageDialog (null, result); //window that shows the result and displays value
         if (isPalindrome(input) == true) { //tells user if the string is a palindrome or not
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
      for (int i=0; i<str.length(); i++){ //takes each character in input string and reverses it by putting each character in front of the character that was previously in front of it   
         scan = str.charAt(i);
         reverse = scan + reverse;
      } //for loop end
      return reverse;
   } //public static string reversestring end
   

   public static boolean isPalindrome(String str){
      String reverse = reverseString(str);
      char scan;
      return str.equals(reverse); //checks if the original string is equivalent to the reversed version
   } //public static boolean ispalindrime end
} //public class end 
