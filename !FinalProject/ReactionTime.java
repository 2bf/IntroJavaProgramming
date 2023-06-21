/***
Chiming Wang
05/15/2023
Java Period 8
Final Project
***/

import javax.swing.*;

public class ReactionTime {
   public static void main(String[] args) {
   
      //to prevent cross-platform formatting issues
      try {
         UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      JFrame frame = new JFrame("Reaction Time Game");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program stops running when jpanel window is closed
      ReactionTimePanel panel = new ReactionTimePanel(); //adds ReactionTimePanel as the content of the frame
      //frame.getContentPane().add(panel); //adds panel to the content of frame
      frame.pack(); //frame adjusts size to fit preferred size of panelG
      frame.setVisible(true); //makes window visible on screen
   }
}  
