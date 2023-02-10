/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import javax.swing.*;

public class Branch {

   //declaring instance variables
   private String brAddress, accType;
   private int phoneNum, customerID, customerBal;
   private BankTeller bankteller;
   private static int count = 0;
   
   //constructor (??)
   public Branch() {
    brAddress = "";
    phoneNum = 0;
    
   }
   

   public void setBrAddress (String name) {
      brAddress = name;
      count++;
   }
   public void setPhoneNum (int num) {
      phoneNum = num;
   }

   public String getBrAddress() {
      return brAddress;
   }
   public int getPhoneNum() {
      return phoneNum;
   }
   
   public static int getCount () {
     return count;
   }


   public String toString() {
      String result = "";
      result = "Address: " + brAddress + "\n";
      result += "Phone Number: " + phoneNum + "\n";
      result += "Number of Branches: " + count + "\n";
      return result;
   }
   
} //public class end
