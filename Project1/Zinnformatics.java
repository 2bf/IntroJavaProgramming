/***
Chiming Wang
11/28/2022
Java Period 8
Project 1: Zinnformatics
***/

import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;
import java.text.DecimalFormat;

public class Zinnformatics{

	public static void main(String[] args){
      String company, packagesstr, result;
      int again;
      DecimalFormat fmt = new DecimalFormat ("0.00");

      do {
         company = JOptionPane.showInputDialog ("Enter your company name:");
         packagesstr = JOptionPane.showInputDialog ("How many packages do you want to order? (Please type a number.)");
         int quantity = Integer.parseInt(packagesstr);
         result = "Thank you for your order, " + company + ". You have placed an order for " + quantity + " packages, at a " + 100 * discount(quantity) + "% discount. Your final cost will be $" + fmt.format(zinnformatics(quantity)) + ".";
         JOptionPane.showMessageDialog (null, result);
         again = JOptionPane.showConfirmDialog (null, "Would you like to make another order?");
      } // do end
      while (again == JOptionPane.YES_OPTION);
	} //public static void main end
   
   public static double zinnformatics(int quantity) {//returns cost
      int q = quantity; //makes typing faster
      double cost = (quantity * 99) * (1 - discount(quantity));
      
      return cost;
   }
   
   public static double discount (int quantity) {
      int q = quantity; //just to make typing faster
      
      if (q<10) {
         return 0;
      } else if (q >= 10 && q <= 19) {
         return 0.2;
      } else if (q >= 20 && q <= 49) {
         return 0.3;
      } else if (q >= 50 && q <= 99) {
         return 0.4;
      } else {
         return 0.5;
      }
   }
   
   } //public class end 
