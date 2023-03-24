/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import javax.swing.*;

public class BankTeller {

   //declaring instance variables
   private String tellerName;
   private int tellerID, bal, depBal, withBal, num;
   private static int count = 0;
   
   //constructor (??)
   public BankTeller(String name, int id, int balance, int num) {
      tellerName = name;
      tellerID = id;
      bal = balance;
      count = num;
    
   }
   

   public void setTellerName (String name) {
      tellerName = name;
      count++;
   }
   public void setTellerID (int id) {
      tellerID = id;
   }
   public void setAccountBalance (int balance){
      this.bal = bal;
   }
   

   public String getTellerName() {
      return tellerName;
   }
   public int getTellerID() {
      return tellerID;
   }
   public int getAccountBalance (){
      return bal;
   }
   
   public void setDeposit(int deposit){
      bal = bal + deposit;
   }
   public void setWithdraw(int withdraw){
      bal = bal - withdraw;
   }
   
   public int getDeposit() {
      return bal;
   }
   public int getWithdraw() {
      return bal;
   }
   
   public static int getCount (){
     return count;
   }
   
   public String toString() {
      String result = "";
      result = "Teller: " + tellerName + "\n";
      result += "Teller ID: " + tellerID + "\n";
      result += "Number of Tellers: " + count + "\n";
      return result;
   }
   
} //public class end