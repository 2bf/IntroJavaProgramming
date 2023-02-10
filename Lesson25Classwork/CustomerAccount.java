/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import javax.swing.*;
import java.text.DecimalFormat;

public class CustomerAccount {

   //declaring instance variables
   private String custName, accType;
   private int accNum, custID, custBal;
   
   //constructor (??)
   public CustomerAccount() {
    custName = "";
    accNum = 0;
    custID = 0;
    custBal = 0;
    accType = "";
    
   }
   

   public void setCustName (String name) {
      custName = name;
   }
   public void setCustID (int id) {
      custID = id;
   }
   public void setAccNum (int num) {
      accNum = num;
   }
   public void setCustBal (int bal) {
      custBal = bal;
   }
   public void setAccType (String type) {
      accType = type;
   }
   

   public String getCustName() {
      return custName;
   }
   public int getCustID() {
      return custID;
   }
   public int getAccNum() {
      return accNum;
   }
   public int getCustBal() {
      return custBal;
   }
   public String getAccType() {
      return accType;
   }
  
  DecimalFormat money=new DecimalFormat("#,###.00");
  String balancecommas = money.format(custBal);
   
   
   public String toString() {
      String result = "";
      result = "Customer Name: " + custName + "\n";
      result += "Account Number: " + accNum + "\n";
      result += "ID Number: " + custID + "\n";
      result += "Account Type: " + accType + "\n";
      result += "Balance: $" + custBal + "\n";
      return result;
   }
   
} //public class end
