// Benjamin Lee Period 5

public class LeapYear
{
  public static void main(String[] args) 
  {
    int year = 2100;
    String tense = " was";
    if (year > 2017) 
    {
     	tense = " will be" ;
    }
    else if (year == 2017) 
    {
     	tense = " is" ;
    }
    if (year < 1582) 
    {
         if (year % 4 == 0) 
        {
             System.out.print(year + " was a leap year"); 
        }
          else 
        {
             System.out.print(year + " was not a leap year"); 
        }
    }
    else
    {
         if (year % 400 == 0) 
        {
             System.out.print(year + tense + " a leap year"); 
        }
          else if (year % 100 == 0)
        {
            if (year > 2017) 
            {
             	System.out.print(year + " will not be a leap year"); 
            }
            else 
            {
             	System.out.print(year + tense + " not a leap year"); 
            }
        }
        else if (year % 4 == 0)
        {
             System.out.print(year + tense + " a leap year"); 
        }
        else if (year < 2018)
        {
             System.out.print(year + tense + " not a leap year"); 
        }
		else 
        {
         	System.out.print(year + " will not be a leap year"); 
        }
    }

  }
}
