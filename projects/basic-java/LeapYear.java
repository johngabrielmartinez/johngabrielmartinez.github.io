/**
   LeapYear.java
   
   This program displays whether the year entered by the user is a leap year, not a leap year, or before the Gregorian Calendar which implemented leap years was created in 1582.
   
   @Author. John Gabriel Martinez
   
   @Version. 1/28/2025
**/

import java.util.Scanner;

public class LeapYear
{
   public static void main (String[] args)
   {
      Scanner user = new Scanner (System.in);
      
      System.out.print("Enter a year: ");
      
      int year = user.nextInt();
      
      if (year < 1582) {
         System.out.println(year + " is before the Gregorian Calendar.");
      }
      
      else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println(year + " is a leap year!");
      }
      
      else {
         System.out.println(year + " is not a leap year.");
      }
   }
}
      