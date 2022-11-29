# INTRO TO JAVA LAB PROJECT LIST 1
(106 total points available)

- Guidelines:
  - For this, and all other Project Lists, you are required to complete at least one of the programming problems listed below. Each project
is assigned a specific point value, based upon the amount of work required. If you complete more than one project, you will receive
the total amount of points that are indicated for those problems (for instance, if you complete the first and second problems below, you
would be graded out of 52 points).
- Requirements:
  - Pseudocode: You must produce the pseudocode for your program BEFORE actually writing the code. This pseudocode is due IN CLASS on Monday, November 28, and a typed (or scanned) version must be uploaded to your Project List #1 assignment on Classroom.
  - User Input: All user input must be taken through input boxes and, unless otherwise specified, all output must be displayed via a message box. All input and output MUST occur in your main method, not in any of the other required methods.
  - Documentation: All programs must have the following:
    - Class header comments
    - Block commenting (comments explaining the function of major portions of your code)
  - Readability: All programs must exhibit a high level of readability.
  - User friendliness: Programs must have descriptive input prompts and output statements. For example: “Enter the string to be processed:”
  - User-controlled exit: User is asked if they want to continue or exit the program, using an appropriate dialog box.
  - Program Requirements: All programs must meet the problem requirements, as stated in the problem descriptions below.
  - Filenames: The required filename for each of the project options is listed in parentheses
  - Permitted classes: You are NOT permitted to use the StringBuilder, StringBuffer or StringTokenizer classes.

PROJECTS MUST BE UPLOADED TO CLASSROOM BY FRIDAY, DECEMBER 23 by 11:59PM.

POINTS WILL BE DEDUCTED PER DAY FOR LATENESS!!!

- This project will be graded on:
  - Pseudocode (4 points): Your pseudocode must accurately describe the steps of the program.
  - Documentation (4 points): Your code must be fully commented and employ standard Java-style conventions.
  - User-Friendliness / User-Input (8 points): GUI present and prompts are easy to understand.
  - User-Controlled Exit (2 points): The user is asked if they want to continue or exit the program.
  - Palindrome (8 points): User is asked for the string to be processed, the reverse is correctly determined, and the answer is correct as to palindrome or not.
  - MailingLabel (8 points): User is asked for the delimiter and delimited string, and then the correctly formatted mailing label is displayed.
  - Zinnformatics (10 points): User is asked for the company name and number of packages. The correct discount is determined. The correct final price is determined.
  - CozaLozaWoza (8 points): User is asked to enter an integer and the output is correct for all integer values.

TOTALS:
- Palindrome: 26 points
- MailingLabel: 26 points
- Zinnformatics: 28 points
- CozaLozaWoza: 26 points
- You will be graded on everything that you submit.

## The options:

### (Palindrome.java) 26 POINTS
- Write a program called Palindrome, which prompts user for a String, and determines whether or not it is a palindrome.
  - Have the user input a string into an input box
  - Output the result through a message box.
- Your program must contain methods with the following signatures:
  - ```public static String reverseString(String str)```
  - ```public static boolean isPalindrome(String str)```
- For Palindrome, the reverseString method must return the reverse of the String that the user entered. The isPalindrome method must return true if the user entered a palindrome (like racecar) or false if they didn&#39;t. Please display the reverse of the string as well as whether or not it is a palindrome.

### (MailingLabel.java) 26 POINTS
- A delimited string is a string literal that contains special characters (“delimiters”) to signify a separation between different elements of information. An example of this is a Microsoft Excel CSV (Comma Separated Values) file.
- Write a Java program that performs the following tasks:
  - Asks the user to input their chosen delimiter. The delimiter does NOT need to be a single character (it can be a word).
  - Asks the user to input the delimited string, which holds a person’s name and address, as input
  - Prints a mailing label as output.
- CHALLENGE:
  - Have the delimited string be read from a text file, where the first line of text from the file is the delimiter.

### (Zinnformatics.java) 28 POINTS
- Zinnformatics Products, Inc. is selling a web-design software package that retails for $99.00. Quantity discounts are given
according to the following table:


| Quantity | Discount |
| --- | --- |
| 10-19 | 20% |
| 20-49 | 30% |
| 50-99 | 40% |
| 100 or more | 50% |

- Write a Java program that performs the following tasks:
  - Have the user input the company name.
  - Have the user input the number of packages that they would like to order.
  - Output a final “invoice” through a message box, using the format indicated in the sample below:
    - ```Thank you for your order Great Neck South High School! You have ordered 40 packages, at a 30% discount. Your final cost will be $2772.00.```
  - Note: Keep in mind that the dollar value should be formatted, according to the above example.
- Your program must contain methods with the following signatures:
  - public static double zinnformatics(int quantity) //returns cost
  - public static double discount(int quantity) //return decimal value, not percent
- For Zinnformatics, the discount method returns the discount as a decimal value based upon the quantity (in other words, 0.2 instead of 20%). The zinnformatics method returns the total cost (based upon quantity and discount). Neither method returns a String.

### (CozaLozaWoza.java) 26 POINTS
- Write a program that prints the numbers 1 to n, 11 numbers per line. The program shall print &quot;Coza&quot; in place of the numbers
which are multiples of 3, &quot;Loza&quot; for multiples of 5, &quot;Woza&quot; for multiples of 7, &quot;CozaLoza&quot; for multiples of 3 and 5, and so
on. Get the value of n from the user via an input box. The output is through a message box. Numbers (and words) must be
separated by only a single space. There are no other words, commas, or other punctuation in the output.
- Your program must contain a method with the following signature: ```public static String cozaLozaWoza(int n)```

- For CozaLozaWoza, the cozaLozaWoza method is not printing anything. It is simply returning a String.
