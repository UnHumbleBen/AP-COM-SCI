import java.util.Scanner;
public class Mode
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        // Initalize an array to hold set
        System.out.println("Number of numbers: ");
        int length = in.nextInt();
        int[] set = new int[length];
        
        // Prompt user input all numbers in the set
        for (int i = 0; i < length; i++) 
        {
            System.out.println("Enter the " + (i + 1) + "th number: "); 
            set[i] = in.nextInt();
        }
        
        // Create a new array which counts the frequency of each set value
        int[] count = new int[length];
        for (int i = 0; i < length; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (set[j] == set[i]) // when a number is found again, increase frequency, move on to next number
                {
                    count[j]++; 
                    break;
                }
            }
        }

        // search for biggest count
        int max = count[0];
        for (int i = 0; i < length; i++)
        {
            max = Math.max(max,count[i]);
        }
        
        // print all numbers that has the highest count
        if (max == 0) System.out.println("There is no mode");
        else 
        {
            for (int i = 0; i < length; i++)
            {
                if (count[i] == max) 
                {
                    System.out.println(set[i]); 
                }
            }
        }
    }
}

