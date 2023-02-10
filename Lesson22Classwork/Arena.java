/***
Chiming Wang
01/18/2022
Java Period 8
lesson22classwork
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Arena {

   //declaring instance variables
   private String arenaCity, arenaName;
   private int teamAge;
   
   //constructor (??)
   public Arena() {
    arenaCity = ""; 
   }
   
   
   public void setArenaName (String name) {
      arenaName = name;
   }
   public void setArenaCity (String city) {
      arenaCity = city;
   }


   public String getArenaCity() {
      return arenaCity;
   }
   public String getArenaName() {
      return arenaName;   
   }
   
   
   public String toString() {
      String result = "";
      
      result = "Arena: " + arenaName + "\n";
      result += "Location: " + arenaCity + "\n";

    
      return result;
   }
   
} //public class end
