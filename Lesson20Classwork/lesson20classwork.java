/***
Chiming Wang
01/11/2023
Java Period 8
Lesson 20 Classwork
***/

public class lesson20classwork {

   public static double sumRange (double start, double end) {
      if (end < start) {
         System.out.println("Error: Second value is larger than first");
         return 0;
      }
      double sum = 0;
         for (double i = start; i<= end; i++) {
            sum +=i;
         }
      return sum;
   }
      
   
   public static void main(String[] args) {
      System.out.println(sumRange(5, 10));
      System.out.println(sumRange(11, 10));
      System.out.println(sumRange(1.5, 3.5));
   }

}
