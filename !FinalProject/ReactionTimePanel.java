/***
Chiming Wang
05/15/2023
Java Period 8
Final Project
***/

//import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ReactionTimePanel extends JFrame {
   private JButton button;
   private JLabel scoreLabel;
   private JLabel instructionLabel;
   private Timer timer;
   private double greenTime;

   public ReactionTimePanel() {
      setTitle("Reaction Time Game");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());

      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());

      instructionLabel = new JLabel("Press button to start program:");
      panel.add(instructionLabel, BorderLayout.NORTH);

      scoreLabel = new JLabel("Your reaction time: ");
      panel.add(scoreLabel, BorderLayout.CENTER);

      button = new JButton("Start");
      button.addActionListener(new ButtonClickListener());
      panel.add(button, BorderLayout.SOUTH);

      add(panel);

      setSize(400, 150);
      setVisible(true);
   }

   private class ButtonClickListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         if (event.getSource() == button) {
            if (timer != null && timer.isRunning()) { //if user presses button before panel turns green
               // User pressed the button before the panel turned green
               timer.stop();
               timer = null;
               instructionLabel.setText("You pressed too early! Try again.");
               button.setText("Start");
               return;
            }

            //button.setEnabled(false); // Disable the button temporarily

            //generate a random number between 3 and 5, inclusive 
            int r = (int) (Math.random() * 3) + 3; 

            timer = new Timer(r * 1000, new TimerActionListener());
            timer.setRepeats(false); //stops timer from starting again
            timer.start();

            instructionLabel.setText("Hold the mouse button, and release when panel turns green.");
         }
      }
   }

   private class TimerActionListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         //button.setEnabled(true); //reenable button

         greenTime = System.currentTimeMillis(); //record time when panel turns green
         JPanel panel = (JPanel) button.getParent();
         panel.setBackground(Color.GREEN); //change panel color to green

         button.setText("Press!"); //change button text
         button.addActionListener(new ButtonClickListener2());

         instructionLabel.setText("Press the button now!");
      }
   }

   private class ButtonClickListener2 implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         double buttonTime = System.currentTimeMillis(); //record time when button is hit
         JPanel panel = (JPanel) button.getParent();
         panel.setBackground(null); //reset panel color

         double score = buttonTime - greenTime; //calculate reaction time (in milliseconds)

         scoreLabel.setText("Your previous reaction time: " + String.format("%.0f", score) + " ms (" + String.format("%.3f", score / 1000) + " sec )" ); //displays user's reaction time in milliseconds and seconds
         button.setText("Start"); //changes button text back
         button.removeActionListener(this);
      }
   }
}
