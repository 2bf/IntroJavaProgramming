/***
Chiming Wang
11/16/2022
Java Period 8
Classwork 15C
***/

import java.util.Scanner;
import java.lang.Math;
import javax.swing.*;

public class NumGuess{

	public static void main(String[] args){

      //variables to set range
		int low = 1;
		int high = 1000;
      //int max = 100;
      //int min = 1;

		int tries = 0;
		boolean done = false;
      
      int start = JOptionPane.showConfirmDialog(null, "Do you want to play a game where I guess a number (between " + low + " and " + high +")?");
         
         if (start != 0) { //if the user clicks no or cancel, does nothing and program ends
            System.exit(0); //ends program faster 
         } else if (start == 0) { //if user clicks yes, starts guessing program
            String choose = "Choose a number between " + low + " and " + high +".";
            JOptionPane.showMessageDialog(null, choose, choose, JOptionPane.INFORMATION_MESSAGE);
      		
            while(!done){
               int guess = (high+low)/2; //sets range for guess to be in, and sets guess to be perfectly in the middle of this range (average)
      			tries++;
               
               String[] options = {"Perfect!", "Higher!", "Lower!"};
      			int input = JOptionPane.showOptionDialog(null, "Is your number " + guess + "?", "Number Guessing Game", 0, 3, null, options, options[0]);
      
      
      			if (input == 1){ //if higher - raises lowest possible value
      				low = guess + 1;
      			} else if (input == 2){ //if lower - lowers the highest possible value
      				high = guess - 1;
      			} else {
                     if (tries == 1) {
                        String finish = "I guessed your number in " + tries + " try.";
                        JOptionPane.showMessageDialog(null, finish, finish, JOptionPane.INFORMATION_MESSAGE);
      				      done = true;
                     } else {
                        String finish = "I guessed your number in " + tries + " tries.";
                        JOptionPane.showMessageDialog(null, finish, finish, JOptionPane.INFORMATION_MESSAGE);
            				done = true;
                     } //else (in else) end 
               } //else end
      		} //while loop end
         } //else if end
	} //public static void main end
} //public class end 
