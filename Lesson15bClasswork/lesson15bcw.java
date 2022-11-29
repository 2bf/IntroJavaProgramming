/***
Chiming Wang
10/20/2022
Java Period 8
Lesson 15
***/


public class lesson15bcw {  
   public static void main (String[] args){
      
      //ints for values - makes it easier to change values
      int firstbetween = 4;
      int secondbetween = 16;
      int primeorno = 13;
      int semiprime = 77;
      int twinprime = 107;
      int chenprime = 89;
      int cousinprime = 97;
      int primetrip = 37;
      int primequad = 101;

      
      
      //output for sum of values
      System.out.println("The sum of values between " + firstbetween + " and " + secondbetween + "is: " + sumOfValues(firstbetween, secondbetween));
      
      //output for prime or not
      if (isPrime(primeorno) == true) {
      System.out.println(primeorno + " is prime.");
      } else
      System.out.println(primeorno + " is not prime.");
      
      //output for semiprime or not
      if (isSemiPrime(semiprime) == true) {
      System.out.println(semiprime + " is semiprime.");
      } else
      System.out.println(semiprime + " is not semiprime.");
      
      //output for twin prime
      if (isTwinPrime(twinprime) == true) {
      System.out.println(twinprime + " is twinprime.");
      } else
      System.out.println(twinprime + " is not twinprime.");
      
      //output for chen prime
      if (isChenPrime(chenprime) == true) {
      System.out.println(chenprime + " is chenprime.");
      } else
      System.out.println(chenprime + " is not chenprime.");
      
      //output for cousin prime
      if (isCousinPrime(cousinprime) == true) {
      System.out.println(cousinprime + " is cousinprime.");
      } else
      System.out.println(cousinprime + " is not cousinprime.");
      
      //output for prime triplet
      if (isPrimeTrip(primetrip) == true) {
      System.out.println(primetrip + " is a prime triplet.");
      } else
      System.out.println(primetrip + " is not a prime triplet.");
      
      //output for prime quadruplet
      if (isPrimeQuad(primequad) == true) {
      System.out.println(primequad + " is a prime quadruplet.");
      } else
      System.out.println(primequad + " is not a prime quadruplet.");
    
   }

   //sum of all nums between 2 nums
   public static int sumOfValues (int i, int j){
      int result = 0;
      while (i <=j){
         result+=i;
         i++; 
      }
    
    return result;
   }
   
   //isprime
   public static boolean isPrime(int n){
       //negative or 0 numbers never prime  
       if(n<=1) {
            return false;
       }
       
       //no number can be divided by half of itself
       for(int i=2;i<=n/2;i++) {
           if((n%i)==0)
               return  false;
       }
       return true;
   }
   
   //semiprime
   public static boolean isSemiPrime(int o){
   
      for (int i = 2; i <= o; ++i){
         if(isPrime(o) == false && o%i == 0){
            return false;
         }
         else 
            return true;
         }
         return true;
      }
      
   //twinprime
   public static boolean isTwinPrime(int n) {
		boolean result = false;
		if(isPrime(n)){
			result = isPrime(n + 2) || isSemiPrime(n - 2);
		}
		return result;
	}
      
   //chenprime
   public static boolean isChenPrime(int n) {
		boolean result = false;
		if(isPrime(n)){
			result = isPrime(n + 2) || isSemiPrime(n + 2);
		}
		return result;
	}
   
   //cousinprime
   public static boolean isCousinPrime(int n) {
		boolean result = false;
		if(isPrime(n)){
			result = isPrime(n + 4) || isSemiPrime(n - 4);
		}
		return result;
	}
   
   //primetriplet
   public static boolean isPrimeTrip(int n) {
		boolean result = false;
		if(isPrime(n)){
			result = isPrime(n) || isPrime(n+2) || isPrime(n+6);
		} else if (isPrime(n)) {
         result = isPrime(n) || isPrime(n+4) || isPrime(n+6);
      }
		return result;
	}
	
   //primequad
   public static boolean isPrimeQuad(int n) {
		boolean result = false;
		if(isPrime(n)){
			result = isPrime(n) || isPrime(n+2) || isPrime(n+6) || isPrime(n+6);
		}
		return result;
	}
      
           
   }
   
   
   
   // && isPrime(n+2) && isPrime(n+6)
