/***
Chiming Wang
04/22/2023
Java Period 8
AboutMe 
***/

import javax.swing.*;

public class AboutMe {
   public static void main(String[] args) {
      try {
         UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
      } catch (Exception e) {
         e.printStackTrace();
      }

      JFrame frame = new JFrame("About Me");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new AboutMePanel());
      frame.pack();
      frame.setVisible(true);
   }
}