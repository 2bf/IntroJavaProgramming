/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import javax.swing.*;

public class Bank {

   //declaring instance variables
   private String bankName;
   private int tellerID;
   private Branch branch;
   private BankTeller bankteller;
   private CustomerAccount customeraccount;
   
   //constructor (??)
   public Bank() {
      bankName = "";
      tellerID = 0;
   }
   

   public void setBankName (String name) {
      bankName = name;
   }
   public String getBankName() {
      return bankName;
   }

   
   public String toString() {
      String result = "";
      result = "Bank: " + bankName + "\n";
      return result;
   }
   
} //public class end
