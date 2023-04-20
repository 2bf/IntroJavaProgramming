/***
Chiming Wang
04/20/2023
Java Period 8
Lesson 32 Classwork 
***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lesson32ClassworkPanel extends JPanel
{
   private JButton push;
   private JLabel label;

   //constructor sets up gui
   public Lesson32ClassworkPanel ()
   {
      //creates button
      push = new JButton ("Push Me!");
      push.addActionListener (new ButtonListener());
      
      //text
      label = new JLabel ("<- button makes text red");

      add (push);
      add (label);

      setPreferredSize (new Dimension(300, 40));
      setBackground (Color.lightGray);
   }

   //listener for action events like button pushes
   private class ButtonListener implements ActionListener
   {
      //when button is pushed, changes foreground (text) to red
      public void actionPerformed (ActionEvent event)
      {
         label.setForeground(Color.red);
      }
   }
}
