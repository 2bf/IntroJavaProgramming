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

public class NHLTeam {

   //declaring instance variables
   private String teamName, teamConf, teamDiv;
   private int teamAge;
   
   //constructor (??)
   public NHLTeam() {
    teamName = "";
    teamAge = 0;
    teamConf = "";
    teamDiv = "";
    
   }
   

   public void setTeamName (String name) {
      teamName = name;
   }
   public void setTeamAge (int age) {
      teamAge = age;
   }
   public void setTeamConf (String conf) {
      teamConf = conf;
   }
   public void setTeamDiv (String div) {
      teamDiv = div;
   }
   

   public String getTeamName() {
      return teamName;
   }
   public int getTeamAge() {
      return teamAge;
   }
   public String getTeamConf() {
      return teamConf;
   }
   public String getTeamDiv() {
      return teamDiv;
   }

   
   
   
   public String speak (String speech) {
      String a = (teamName + " " + teamName);
      return a;
   }  
   
   
   
   public String toString() {
      String result = "";
    
      result = "Team: " + teamName + "\n";
      result += "Team age: " + teamAge +"\n";
      result += "Team conference: " + teamConf +"\n";
      result += "Team division: " + teamDiv +"\n";


    
      return result;
   }
   
} //public class end
