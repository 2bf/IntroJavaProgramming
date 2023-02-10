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

public class NHLPlayers {

   //declaring instance variables
   private String playerName, playerPos, playerCity;
   private int playerNum;
   
   //constructor (??)
   public NHLPlayers() {
    playerName = "";
    playerNum = 0;
    playerPos = "";
    playerCity = "";
    
   }
   

   public void setPlayerName (String name) {
      playerName = name;
   }
   public void setPlayerNum (int num) {
      playerNum = num;
   }
   public void setPlayerPos (String pos) {
      playerPos = pos;
   }
   public void setPlayerCity (String city) {
      playerCity = city;
   }
   

   public String getPlayerName() {
      return playerName;
   }
   public int getPlayerNum() {
      return playerNum;
   }
   public String getPlayerPos() {
      return playerPos;
   }
   public String getPlayerCity() {
      return playerCity;
   }

   
   
   
   public String speak (String speech) {
      String a = (playerName + " " + playerName);
      return a;
   }  
   
   
   
   public String toString() {
      String result = "";
    
      result = "Player: " + playerName + "\n";
      result += "Player number: " + playerNum +"\n";
      result += "Player Position: " + playerPos +"\n";
      result += "City of Birth: " + playerCity +"\n";

    
      return result;
   }
   
} //public class end
