// Benjamin Lee Period 5
import java.util.Scanner;
public class IntersectingCircles {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter x coordinate of the center of circle 1: ");
            int xCoor1 = input.nextInt(); 
            System.out.println("Enter y coordinate of the center of circle 1: ");
            int yCoor1 = input.nextInt(); 
            System.out.println("Enter the radius of circle 1: ");
            int radius1 = input.nextInt();
            System.out.println("Enter x coordinate of the center of circle 2: ");
            int xCoor2 = input.nextInt();
            System.out.println("Enter y coordinate of the center of circle 2: ");
            int yCoor2 = input.nextInt();
            System.out.println("Enter the radius of circle 2");
            int radius2 = input.nextInt();
            double xDiffSqu = Math.pow(xCoor1 - xCoor2, 2);
            double yDiffSqu = Math.pow(yCoor1 - yCoor2, 2);
            double distance = Math.sqrt(xDiffSqu + yDiffSqu);

            if (radius1 + radius2 == distance || Math.abs(radius1 - radius2) == distance) System.out.println("Intersect at one point");       
            else if (radius1 == radius2 && distance == 0) System.out.println("Intersect at infinitely many points (same circle)");
            else if (radius1 + radius2 >= distance && Math.abs(radius1 - radius2) <= distance) System.out.println("Intersect at two points");
            else System.out.println("Do Not Intersect");

            System.out.println("Press 1 to continue, Press 2 to stop");
            int user = input.nextInt();
            if (user == 2) break;
        }
    }
}
