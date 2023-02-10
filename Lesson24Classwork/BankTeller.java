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
   private int tellerID, bal, depBal, withBal;
   
   //constructor (??)
   public BankTeller() {
    tellerName = "";
    tellerID = 0;
    bal = 0;
    
   }
   

   public void setTellerName (String name) {
      tellerName = name;
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
   
   public String toString() {
      String result = "";
      result = "Teller: " + tellerName + "\n";
      result += "Teller ID: " + tellerID + "\n";
      return result;
   }
   
} //public class end
