# Mini-Project: CaesarCipher

Complete the following methods with the given signatures. All user input and output must occur in your main
method. You are permitted to create other methods if you feel they would help you complete the task. Call your
java file CaesarCipher. This is to be submitted to Classroom by the date posted on Classroom.

A Caesar Cipher is a method of encoding a message by shifting each character by the same number of letters.
For example, with a shift of 5, ‘A’ would encode to ‘F’. In your main method, display a menu to ask the user if
they want to encode or decode a phrase. Then ask the user for their shift value. The shift does not need to be
less than 26 but does need to be nonnegative. Assume that all messages will be uppercase only.

Your program must begin with a menu asking the user if they want to encode or decode a String.

It will be easier for you if you have two separate Scanner objects, one that deals with String input and the
other that deals with int input.

- public static String encode(String str, int shift)
  - This method takes a String and an int as parameters and returns a String, where each of the characters in the original has been shifted shift number of characters.
- public static String decode(String str, int shift)
  - This method takes a String and an int as parameters and returns a String, where each of the characters in the original has been shifted -shift number of characters.

- This project will be graded on:
  - Documentation (4 points): Your code must be fully commented and employ standard Java-style
conventions.
  - User-Friendliness (4 points): All interactions with the user must be clear and unambiguous.
  - Methods (8 points): Each method has the proper signature and works as expected.
TOTAL: 16 points
