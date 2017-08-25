/*
 * Benjamin Lee Period 5 
 */

import java.util.Scanner;
public class TimeInterval
{
    public static void main(String[] args)
    {
        boolean stay = true;    // allows for continue option
        while (stay)            // reruns if user press continues      
        {
            System.out.println("Please enter the first time: ");    // ask for first time
            
            Scanner input = new Scanner(System.in);
            int time1 = input.nextInt();                          //stores first time
            
            System.out.println("Please enter the second time: ");    // asks second time
            int time2 = input.nextInt();                 //stores second time 
            
            if (time2 >= time1)              // case when second time is later than first time 
            {
                int hour = time2/100 - time1/100;     // calculate difference in hour

                int minute = time2 % 100 - time1 % 100;      // calculate difference in minute 
             
                
                if (minute < 0)            // Fixes problem when minutes is less than 0
                {
                    minute = 60 + minute;
                    hour = hour -1;
                }
                
                if (hour == 0 && minute == 0)    // two times are then same --> 24 hours between 
                {
                    hour = 24;
                 
                }

                System.out.println(hour + " hours and " + minute + " minutes");    // print answer 

            }
            else       // for cases when second time is earlier than first time 
            {
                // calculate the number of hours between time1 and midnight and add the number of hours between midnight and time2, but subtract one hour at the end
                int hour = 23 - time1/100 + time2/100;    
                
                // calculate the number of minutes between time1 and midnight and add the number of minutes between midnight and time2
                int minute = 60 - time1 % 100 + time2 % 100;
                
                // fixes saturated minutes by taking away 60 minutes and adding back one hour
                if (minute >= 60) 
                {
                    hour = hour + 1;
                    minute = minute - 60;
                }
                
                // if two times are equal --> 24 hours 
                if (hour == 0 && minute == 0) 
                {
                    hour = 24; 
                }
                
                System.out.println(hour + " hours and " + minute + " minutes");   // print answer

            }
            
            // user option to continue or stop 
            System.out.println("Enter 1 to continue, Enter 2 to stop");
            int user = input.nextInt();
            if (user == 2) 
            {
                stay = false;
            }
        }
    }
}

