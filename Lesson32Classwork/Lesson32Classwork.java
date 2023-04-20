/***
Chiming Wang
04/20/2023
Java Period 8
Lesson 32 Classwork 
***/

import javax.swing.*;

public class Lesson32Classwork
{
   public static void main (String[] args)
   {
      //main program jframe
      JFrame frame = new JFrame ("Push Counter");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new Lesson32ClassworkPanel());

      frame.pack();
      frame.setVisible(true);
   }
}
