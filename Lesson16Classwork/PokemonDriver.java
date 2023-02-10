/***
Chiming Wang
1/4/2023
Java Period 8
Lesson 16 Classwork
***/

import javax.swing.*;

public class PokemonDriver{

   public static void main( String[] args ){
      int pokemonHealth = 0;
      int pokemonNumber = 0;
      int pokemonLevel = 0;
      String pokemonName = "";
      String pokemonType = "";
      String pokemonSpeech = "";
      
      Pokemon pikachu = new Pokemon();
      
      //sets up object properties using class set methods
      pikachu.setPokemonName("Pikachu");
      pikachu.setPokemonNumber(25);
      pikachu.setPokemonType("Electric");
      pikachu.setPokemonHealth(0);
      pikachu.setPokemonLevel(69);
      
      
      //declare/initialize variables to store results of get classes
      pokemonName = pikachu.getPokemonName();
      pokemonNumber = pikachu.getPokemonNumber();
      pokemonType = pikachu.getPokemonType();
      pokemonHealth = pikachu.getPokemonHealth();
      pokemonLevel = pikachu.getPokemonLevel();
      pokemonSpeech = pikachu.getSpeak();
      
      boolean fainted = pikachu.getHasFainted();
      
      
      
      System.out.println(pikachu);
      if (fainted = true) {
         System.out.println (pokemonName + " has no more health and has fainted!");
      }
      
      
   
   } 
}
