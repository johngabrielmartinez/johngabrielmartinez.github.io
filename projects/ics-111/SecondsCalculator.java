/**
   SecondsCalculator.java
   
   Runs a program which receives three inputs from the user: hours, minutes, and seconds.It then finds the total number of seconds based on the inputs provided.
   
   @Author. John Gabriel Martinez
   
   @Version. 1/22/2025
**/

import java.util.Scanner;

public class SecondsCalculator
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter hours: ");
      int hours = scan.nextInt();
     
      System.out.print("\nEnter minutes: ");
      int minutes = scan.nextInt();
      
      System.out.print("\nEnter seconds: ");
      int seconds = scan.nextInt();
      
      int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
      
      System.out.println();
      System.out.println();
      
      System.out.println("Total seconds: " + totalSeconds);
    }
}