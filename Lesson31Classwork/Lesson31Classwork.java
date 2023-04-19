/*********
Chiming Wang
04/17/2023
Java Period 8
Lesson 31 Classwork 


answer to the question about nestedpanels.java:
nestedpanels uses 2 panels inside a bigger main panel.
this breaks the big main panel into 2 smaller sections.
nestedpanels.java uses "subpanels" to do this.

*********/


//imports packages
import java.awt.*;
import javax.swing.*;

public class Lesson31Classwork {

   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Lesson31Classwork");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      ImageIcon icon = new ImageIcon ("agerars.jpg");

      JLabel label;

      label = new JLabel ("Koenigsegg Agera RS", icon, SwingConstants.CENTER);
      label.setHorizontalTextPosition (SwingConstants.CENTER);
      label.setVerticalTextPosition (SwingConstants.BOTTOM);

      JPanel panel = new JPanel();
      panel.setBackground (Color.pink);
      panel.setPreferredSize (new Dimension (350,240));
      panel.add (label);

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }

}
