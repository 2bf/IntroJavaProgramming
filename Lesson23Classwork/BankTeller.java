/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class BankTeller {

   //declaring instance variables
   private String tellerName;
   private int tellerID;
   
   //constructor (??)
   public BankTeller() {
    tellerName = "";
    tellerID = 0;
    
   }
   

   public void setTellerName (String name) {
      tellerName = name;
   }
   public void setTellerID (int id) {
      tellerID = id;
   }
   

   public String getTellerName() {
      return tellerName;
   }
   public int getTellerID() {
      return tellerID;
   }
  
   
   
   public String toString() {
      String result = "";
    
      result = "Teller: " + tellerName + "\n";
      result += "Teller ID: " + tellerID + "\n";


    
      return result;
   }
   
} //public class end
