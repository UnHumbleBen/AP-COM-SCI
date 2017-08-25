import java.util.Scanner;
public class JoeIsGod {
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial time");
        int time1 = input.nextInt();

        System.out.println("Enter the final time");
        int time2 = input.nextInt();

        int hour1 = time1 / 100;
        int total1 = (hour1 * 60) + (time1 % 100);

        int hour2 = time2 / 100;
        int total2 = (hour2 * 60) + (time2 % 100);

        int elapse = (1440 + (total2 - total1)) % 1440;

        int helapse = elapse / 60;
        int melapse = elapse % 60;

        System.out.println(helapse + " hours and " + melapse + " minutes.");
    }
}
