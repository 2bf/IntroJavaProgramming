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
   private BankTeller[] tellers;
   private int count2;
   private String brAddress, accType;
   private int phoneNum, customerID, customerBal;
   private BankTeller bankteller;
   private static int num = 0;
   
   //constructor (??)
   public Branch() {
      brAddress = "";
      phoneNum = 0;
      tellers = new BankTeller[100];
      count2 = 0;
   }
   
   public void addTeller (String name, int id, int balance, int num) {
      if (num == tellers.length) increaseSize();
      tellers[count2] = new BankTeller (name, id, balance, num);
      count2++;
   }
   
   private void increaseSize() {
      BankTeller[] temp = new BankTeller[tellers.length * 2];
      for (int i = 0; i < tellers.length; i++)
         temp[i] = tellers[i];
         
      tellers = temp;
   }

   public void setBrAddress (String name) {
      brAddress = name;
      num++;
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
     return num;
   }


   public String toString() {
      String result = "";
      result = "Address: " + brAddress + "\n";
      result += "Phone Number: " + phoneNum + "\n";
      result += "Number of Branches: " + num + "\n";
      result += "\n\nTellers:\n\n";
      for (int e = 0; e < num; e++) {
         result += tellers[e].toString() + "\n";
      }
      return result;
   }
   
} //public class end