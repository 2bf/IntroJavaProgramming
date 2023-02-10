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

public class CustomerAccount {

   //declaring instance variables
   private String customerName, accType;
   private int accountNum, customerID, customerBal;
   
   //constructor (??)
   public CustomerAccount() {
    customerName = "";
    accountNum = 0;
    customerID = 0;
    customerBal = 0;
    accType = "";
    
   }
   

   public void setCustomerName (String name) {
      customerName = name;
   }
   public void setCustomerID (int id) {
      customerID = id;
   }
   public void setAccountNum (int num) {
      accountNum = num;
   }
   public void setCustomerBal (int bal) {
      customerBal = bal;
   }
   public void setAccType (String type) {
      accType = type;
   }
   

   public String getCustomerName() {
      return customerName;
   }
   public int getCustomerID() {
      return customerID;
   }
   public int getAccountNum() {
      return accountNum;
   }
   public int getCustomerBal() {
      return customerBal;
   }
   public String getAccType() {
      return accType;
   }
  
   
   
   public String toString() {
      String result = "";
    
      result = "Customer Name: " + customerName + "\n";
      result += "Account Number: " + accountNum + "\n";
      result += "ID Number: " + customerID + "\n";
      result += "Balance: " + customerBal + "\n";
      result += "Account Type: " + accType + "\n";


    
      return result;
   }
   
} //public class end
