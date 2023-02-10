/***
Chiming Wang
01/23/2022
Java Period 8
Lesson 23 Classwork
***/

//imports packages
import javax.swing.*;
import java.text.DecimalFormat;

public class BankDriver{

   public static void main( String[] args ){
      
         
      int newBal = 0;
      //teller
      String tellerName = "";
      int tellerID = 0;
      int depBal = 0;
      //bank
      String bankName = "";
      //branch
      String brAddress = "";
      int phoneNum = 0;
      //customeraccount
      String custName = "";
      int accNum = 0;
      int custID = 0;
      int custBal = 0;
      String accType = "";
      
      //bank
      Bank bank1 = new Bank();
      //sets up object properties using class set methods
      bank1.setBankName("Bank 01");
      //declare/initialize variables to store results of get classes
      bankName = bank1.getBankName();
      
      //branch
      Branch ny = new Branch();
      ny.setBrAddress("1 Fake St, New York City, New York");
      ny.setPhoneNum(1234567890);
      brAddress = ny.getBrAddress();
      phoneNum = ny.getPhoneNum();
      
      //customeraccount
      CustomerAccount colin = new CustomerAccount();
      colin.setCustName("Colin");
      colin.setCustID(69);
      colin.setAccNum(1418);
      colin.setCustBal(3843718);
      colin.setAccType("Checking Account");
      custName = colin.getCustName();
      accNum = colin.getAccNum();
      custID = colin.getCustID();
      custBal = colin.getCustBal();
      accType = colin.getAccType();
      
      //bankteller
      BankTeller john = new BankTeller();
      john.setTellerName("John");
      john.setTellerID(19);
      john.setWithdraw(13);
      tellerName = john.getTellerName();
      tellerID = john.getTellerID();
      depBal = john.getWithdraw();
         
      newBal = custBal + depBal;
      DecimalFormat money=new DecimalFormat("#,###.00");
      String depBalCommas = money.format(depBal);
      String newBalCommas = money.format(newBal);
      
      System.out.println(bank1);
      System.out.println(ny);
      System.out.println(john);
      System.out.println(colin);
      System.out.println(custName + " (Account number " + accNum + ")'s balance after a " + deporwith(depBal) + " of $" + depBalCommas + " is $" + newBalCommas);

   }
   
      public static String deporwith(int depBal) {
         String result = "";
         if (depBal > 0) {
            result = "deposit";
         } else {
            result = "withdrawal";
         }
         return result;
      }
}
