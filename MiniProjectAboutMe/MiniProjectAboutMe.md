# AboutMe Project: Implementing a Basic GUI

I know that it is already fourth quarter, but I would like to get to know you better! Your next project is to create a sort-of About Me program, titled AboutMe.
Write a program AboutMe that represents you! Your program MUST contain a GUI (graphical user interface), complete with JButtons (and JTextFields if you can figure out a good way to incorporate them). Each button must have a prompt, such as “My name is...”, where the user is given the answer when the button is clicked (via a single JLabel in the window that is updated with the button presses). Your program must contain a minimum of 5 different buttons, and:
- A class extending JPanel
- Exactly one JLabel
- Appropriate ActionListeners
- Exactly one button must display an image when clicked in addition to a text answer. When another button is clicked, the image must disappear.
- Each button must have a different background color, and the text on the buttons must be
different colors as well.

In order to have your code display properly on different operating systems, you MUST include
the following lines of code in your driver class. Literally just copy and paste.
```
try {
  UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
} catch (Exception e) {
  e.printStackTrace();
}
```

Your program must contain at least 2 files (one driver class and one panel class), and you must upload all required images as well.

THIS ASSIGNMENT IS TO BE SUBMITTED VIA CLASSROOM
BY THE DATE ON CLASSROOM. YOU MUST SUBMIT THIS ENTIRE PROGRAM (driver and panel classes, as well as all images).
THIS ASSIGNMENT IS WORTH 15 points.
