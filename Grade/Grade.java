
/**
 * Convert GPA to letter grade
 *
 * Benjamin Lee Period 5
 * August 22, 2017
 */
import java.util.Scanner;
public class Grade
{
    public static void main(String[] args) 
    {
        boolean stay = true;
        while (stay) 
        {
            System.out.println("Enter a GPA value: ");
            Scanner input = new Scanner(System.in);
            double GPA = input.nextDouble();
            if (GPA < 1) 
            {
                System.out.println("F"); 
            } 
            else if (GPA < 1.3)
            {
                System.out.println("D");
            }
            else if (GPA < 1.7)
            {
                System.out.println("D+");
            }
            else if (GPA < 2.0)
            {
                System.out.println("C-");
            }
            else if (GPA < 2.3)
            {
                System.out.println("C");
            }
            else if (GPA < 2.7)
            {
                System.out.println("C+");
            }
            else if (GPA < 3.0)
            {
                System.out.println("B-");
            }
            else if (GPA < 3.3)
            {
                System.out.println("B");
            }
            else if (GPA < 3.7)
            {
                System.out.println("B+");
            }
            else if (GPA < 4.0)
            {
                System.out.println("A-");
            }
            else 
            {
                System.out.println("A");
            } 

            System.out.println("Press 1 to continue, Press 2 to stop");
            int user = input.nextInt();
            if (user == 2) 
            {
                stay = false;
            }
	}
    }
}
