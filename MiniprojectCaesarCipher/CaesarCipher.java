/***
Chiming Wang
11/03/2022
Java Period 8
Miniproject: CaesarCipher
***/

import java.lang.Math;
import java.util.Scanner;

public class CaesarCipher {  
   public static void main (String[] args){
   
      Scanner strscan = new Scanner (System.in);
      Scanner intscan = new Scanner (System.in);
      
      String input;
      int shift;
      int operation;
      char a = 'A';
      
      //System.out.println(a);
      //System.out.println((char)(a+5));
      //System.out.println(input.length());
      
      //menu for user input
      System.out.println("Whie operation do you wish to use? (Type in operation number)"); 
      System.out.println("1. Encode string");
      System.out.println("2. Decode string");
      System.out.println("Please type your desired operation: ");
      operation = intscan.nextInt();
      
      //output after user inputs their selected operation
      //lets user input a string, then lets the user input a number to determine how many letters to shift the string by
      if (operation == 1) {
         System.out.println("You chose to encode a string.");
         System.out.println("Please type the string you want to decode:");
         input = strscan.nextLine();
         System.out.println("Please type the shift length");
         shift = intscan.nextInt();
         System.out.println(encode(input,shift));
      }
      if (operation == 2) {
         System.out.println("You chose to decode a string.");
         System.out.println("Please type the string you want to decode:");
         input = strscan.nextLine();
         System.out.println("Please type the shift length");
         shift = intscan.nextInt();
         System.out.println(decode(input,shift));
      }
      //notifies user if they selected a nonexistent operation
      if (operation > 2 || operation < 1) {
         System.out.println("The operation you selected does not exist.");
      }
      
   }   //main end
      
      
      
      
   //encode
   public static String encode (String str, int shift){
      char e;
      String endstr = ""; //creates variable that will be the output (encoded answer)
        
      for (int i = 0; i < str.length(); ++i) { //if i is lower than the inputted string, keeps looping
         e = str.charAt(i); //moves e along the string and sets it as every individual character
         if (e >= 'a' && e <= 'z') { //if e (current selected letter) is lowercase
            e = (char)(e + shift%26); //shifts e by converting it to an int, adding shift to it, and converting the int back to char using ASCII
            
            //when shifted, if e is greater than z (last lowercase letter), goes to the start of alphabet and starts from a again
            if (e > 'z') { 
               e = (char)(e - 'z' + 'a' - 1);
            }
            
            //adds e to the output (answer) string 
            endstr += e;
         }
         
         //does same thing with uppercase letters
         else if (e >= 'A' && e <= 'Z') {
            e = (char)(e + shift&26);
               
            if(e > 'Z'){
               e = (char)(e - 'Z' + 'A' - 1);
            }
               
            endstr += e;
         }
         
         //if the selected character is not a letter (space) - doesn't shift it 
         else {
            endstr += e;
         }
      }
         
      //output
      return endstr;
   } //encode end
      
      
      
      
      

   //decode
   //pretty much the same exact code as encode, except instead of adding the shift value it subtracts it
   public static String decode (String str, int shift){
      char e;
      String endstr = "";
      
      for (int i = 0; i < str.length(); ++i) {
         e = str.charAt(i);
         if (e >= 'a' && e <= 'z') {
            e = (char)(e - shift);
            if (e < 'a') {
                e = (char)(e + 'z' - 'a' + 1);
            }        
            endstr += e;
        }
        else if (e >= 'A' && e <= 'Z') {
            e = (char)(e - shift);
            if (e < 'A') {
                e = (char)(e + 'Z' - 'A' + 1);
            }
            endstr += e;
        }
        else {
            endstr += e;
        }
      } // for loop end
   return endstr;
         
   } //decode end

}   //class end
