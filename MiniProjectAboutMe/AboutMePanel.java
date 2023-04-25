/***
Chiming Wang
04/22/2023
Java Period 8
AboutMe 
***/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutMePanel extends JPanel implements ActionListener {

   private JButton nameButton;
   private JButton ageButton;
   private JButton hobbyButton;
   private JButton schoolButton;
   private JButton pictureButton;

   private JLabel infoLabel;
   private JLabel pictureLabel;

   private ImageIcon pictureIcon;

   public AboutMePanel() {
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

      nameButton = new JButton("My name is...");
      nameButton.setBackground(Color.BLUE);
      nameButton.setForeground(Color.YELLOW);
      nameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      nameButton.addActionListener(this);
      add(nameButton);

      ageButton = new JButton("My age is...");
      ageButton.setBackground(Color.GREEN);
      ageButton.setForeground(Color.BLUE);
      ageButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      ageButton.addActionListener(this);
      add(ageButton);

      hobbyButton = new JButton("My hobby is...");
      hobbyButton.setBackground(Color.RED);
      hobbyButton.setForeground(Color.WHITE);
      hobbyButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      hobbyButton.addActionListener(this);
      add(hobbyButton);

      schoolButton = new JButton("The school I attend is...");
      schoolButton.setBackground(Color.YELLOW);
      schoolButton.setForeground(Color.RED);
      schoolButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      schoolButton.addActionListener(this);
      add(schoolButton);

      pictureButton = new JButton("My favorite sport is:");
      pictureButton.setBackground(Color.ORANGE);
      pictureButton.setForeground(Color.BLACK);
      pictureButton.setAlignmentX(Component.CENTER_ALIGNMENT);
      pictureButton.addActionListener(this);
      add(pictureButton);

      infoLabel = new JLabel();
      infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
      add(infoLabel);

      pictureLabel = new JLabel();
      pictureLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
      add(pictureLabel);

      pictureIcon = new ImageIcon("Max_Verstappen_2022.jpg");
      
      setPreferredSize (new Dimension(300, 400));
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == nameButton) {
         infoLabel.setText("Chiming Wang");
         pictureLabel.setIcon(null);
      } else if (e.getSource() == ageButton) {
         infoLabel.setText("16 years old");
         pictureLabel.setIcon(null);
      } else if (e.getSource() == hobbyButton) {
         infoLabel.setText("Photography");
         pictureLabel.setIcon(null);
      } else if (e.getSource() == schoolButton) {
         infoLabel.setText("Great Neck South High School");
         pictureLabel.setIcon(null);
      } else if (e.getSource() == pictureButton) {
         infoLabel.setText("Formula 1\n\n\n");
         pictureLabel.setIcon(pictureIcon);
      }
   }
}
