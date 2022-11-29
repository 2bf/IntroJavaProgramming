/***
Chiming Wang
9/16/2022
Java Period 8
Lesson 10 Classwork

lesson10cw.java
***/



public class lesson10cw 
{
   
   public static void main (String[] args)
   {
      
      String str1 = ("This is a string"); //declaring string
      int length = str1.length(); //using length method and dot operator to find length of string
      
      System.out.println(str1); //prints out string
      System.out.println(length); //print out string length
      
      //stores first three letters of string in chars, then prints them
      char g = str1.charAt(0);
      char h = str1.charAt(1);
      char i = str1.charAt(2);
      System.out.print(g);
      System.out.print(h);
      System.out.println(i);
      
      for (int z = 0; z < 3; z++) {
    // your code goes here
}
      
      String upperStr1 = str1.toUpperCase(); //converts all letters in string to uppercase and strores it in a new string
      System.out.println(upperStr1); //prints out uppercase string
      
      String lowerStr1 = upperStr1.toLowerCase(); //converts all letters in a string to lowercase, stroes it in a new string
      System.out.println(lowerStr1); //prints out lowercase string
      
      String method2Str1 = str1.replace('i', '6'); //replaces all i's in the string with 6
      System.out.println(method2Str1); //prints out modified string
      
      
      //char 
      
       
      
   }
}
