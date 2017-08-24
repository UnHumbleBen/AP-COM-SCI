/*
 * Benjamin Lee Period 5 
 */

import java.util.Scanner;
public class TimeInterval
{
    public static void main(String[] args)
    {
        boolean stay = true; 
        while (stay) 
        {
            System.out.println("Please enter the first time: ");

            Scanner input = new Scanner(System.in);
            int time1 = input.nextInt();
            
            System.out.println("Please enter the second time: ");
            int time2 = input.nextInt();
            
            if (time2 >= time1) 
            {
                int hour = time2/100 - time1/100;

                int minute = time2 % 100 - time1 % 100;
             
                
                if (minute < 0) 
                {
                    minute = 60 + minute;
                    hour = hour -1;
                }
                
                if (hour == 0 && minute == 0) 
                {
                    hour = 24;
                 
                }

                System.out.println(hour + " hours and " + minute + " minutes");

            }
            else 
            {
                int hour = 23 - time1/100 + time2/100;    
                
                int minute = 60 - time1 % 100 + time2 % 100;
                if (minute >= 60) 
                {
                    hour = hour + 1;
                    minute = minute - 60;
                }
                
                if (hour == 0 && minute == 0) 
                {
                    hour = 24; 
                }
                
                System.out.println(hour + " hours and " + minute + " minutes");

            }
            
            System.out.println("Enter 1 to continue, Enter 2 to stop");
            int user = input.nextInt();
            if (user == 2) 
            {
                stay = false;
            }
        }
    }
}
