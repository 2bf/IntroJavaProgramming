/***
Chiming Wang
1/4/2023
Java Period 8
Lesson 16 Classwork
***/

//imports packages
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Pokemon
{

   //declaring instance variables
   private String pokemonName, pokemonType, speech;
   private int pokemonNumber, pokemonHealth, pokemonLevel;
   private boolean hasFainted;
   
   //constructor (??)
   public Pokemon() {
    pokemonHealth = 0;
    pokemonNumber = 0;
    pokemonLevel = 0;
    pokemonName = "";
    pokemonType = "";
    hasFainted = false;
    speech = "";
   }
   
   //changes stats/info of pokemon
   public void setPokemonName (String name) {
      pokemonName = name;
   }
   public void setPokemonNumber (int number) {
      pokemonNumber = number;
   }
   public void setPokemonType (String type) {
      pokemonType = type;
   }  
   public void setPokemonHealth (int health) {
      pokemonHealth = health;
   }
   public void setPokemonLevel (int level) {
      pokemonLevel = level;
   }
   
   //gets stats of pokemon
   public String getPokemonName() {
      return pokemonName;
   }
   public int getPokemonNumber() {
      return pokemonNumber;
   }
   public String getPokemonType() {
      return pokemonType;
   }
   public int getPokemonHealth() {
      return pokemonHealth;
   }
   public int getPokemonLevel() {
      return pokemonLevel;
   }


   public boolean hasFainted() {
      if (pokemonHealth <= 0) {
         return true;
      } else {
         return false;
      }
   }
   
   public void setHasFainted (boolean fainted) {
      hasFainted = fainted;
   }
   
   public boolean getHasFainted() {
      return hasFainted;
   }
   
   
   public String speak (String speech) {
      String a = (pokemonName + " " + pokemonName);
      return a;
   }  
   
   public void setSpeech (String speak) {
      speech = speak;
   }  
   
   public String getSpeak() {
      return speech;
   }
   
   
   public String toString() {
      String result = "";
    
      result = "Pokemon: " + pokemonName + "\n";
      result += "Pokemon Number: " + pokemonNumber +"\n";
      result += "Pokemon Type: " + pokemonType +"\n";
      result += "Pokemon Health: " + pokemonHealth +"\n";
      result += "Pokemon Level: " + pokemonLevel +"\n";
      result += "Pikachu says: " + speech; 
    
      return result;
   }
   
} //public class end
