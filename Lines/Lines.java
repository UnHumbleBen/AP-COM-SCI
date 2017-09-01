/* Benjamin Lee Period 5 
 * A line in the plane can be specified in various ways:

(1) by giving a point (x,y) and a slope m.
(2) by giving two points (x1, y1) and (x2, y2).
(3) as an equation in slope-intercept form y = mx + b.
(4) as an equation x = a if the line is vertical.

Implement a class Lines that allows the user to choose any of the four ways to input two lines. 
The class then determines if the lines (1) intersect, (2) equals, or (3) parallel to each other.
 */
import java.util.Scanner;
public class Lines
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.println("Choose one of the following methods to enter line 1");
            System.out.println("(1) by giving a point (x,y) and a slope m.");
            System.out.println("(2) by giving two points (x1, y1) and (x2, y2)");
            System.out.println("(3) as an equation in slope-intercept form y = mx + b");
            System.out.println("(4) as an equation x = a if the line is vertical");
            System.out.println("Enter 1, 2, 3, or 4");
            Scanner input = new Scanner(System.in);
            int method1 = input.nextInt(); // get desired method
            boolean isVertical1, isVertical2; // initiate vertical line boolean
            isVertical1 = isVertical2 = false;
            double xVertical1, xVertical2, m1, m2, b1, b2;
            xVertical1 = xVertical2 = m1= m2= b1= b2 = 0; // for locating vertical lines 

            if (method1 == 1) 
            {
                System.out.println("Enter x coordinate: ");
                double x = input.nextDouble();
                System.out.println("Enter y coordinate: ");
                double y = input.nextDouble();
                System.out.println("Enter slope: ");
                m1 = input.nextDouble();
                b1 = y - m1*x;

            }
            else if (method1 == 2)
            {
                System.out.println("Enter x coordinate of point 1: ");
                double x1 = input.nextDouble();
                System.out.println("Enter y coordinate of point 1: ");
                double y1 = input.nextDouble();
                System.out.println("Enter x coordinate of point 2: ");
                double x2 = input.nextDouble();
                System.out.println("Enter y coordinate of point 2: ");
                double y2 = input.nextDouble();
                if (x2 != x1) // non vertical line case
                { 
                    m1 = (y2 - y1)/(x2-x1); 
                    b1 = y1 - m1*x1;
                }
                else // vertical line case
                {
                    isVertical1 = true;
                    xVertical1 = x1; //locate the vertical line
                }
            }
            else if (method1 == 3)
            {
                System.out.println("Enter slope of line 1: ");
                m1 = input.nextDouble();
                System.out.println("Enter the y-intercept of line 1: ");
                b1 = input.nextDouble();
            }
            else 
            {
                System.out.println("Enter the x value of the vertical line: ");

                xVertical1 = input.nextDouble(); 
                isVertical1 = true;

            }

            // repeat same thing for line 2
            System.out.println("Choose one of the following methods to enter line 2");
            System.out.println("(1) by giving a point (x,y) and a slope m.");
            System.out.println("(2) by giving two points (x1, y1) and (x2, y2)");
            System.out.println("(3) as an equation in slope-intercept form y = mx + b");
            System.out.println("(4) as an equation x = a if the line is vertical");
            System.out.println("Enter 1, 2, 3, or 4");
            int method2 = input.nextInt(); 
            if (method2 == 1) 
            {
                System.out.println("Enter x coordinate: ");
                double x = input.nextDouble();
                System.out.println("Enter y coordinate: ");
                double y = input.nextDouble();
                System.out.println("Enter slope: ");
                m2 = input.nextDouble();
                b2 = y - m2*x;

            }
            else if (method2 == 2)
            {
                System.out.println("Enter x coordinate of point 1: ");
                double x1 = input.nextDouble();
                System.out.println("Enter y coordinate of point 1: ");
                double y1 = input.nextDouble();
                System.out.println("Enter x coordinate of point 2: ");
                double x2 = input.nextDouble();
                System.out.println("Enter y coordinate of point 2: ");
                double y2 = input.nextDouble();
                if (x2 != x1) 
                { 
                    m2 = (y2 - y1)/(x2-x1); 
                    b2 = y2 - m2*x2;
                }
                else 
                {
                    isVertical2 = true;
                    xVertical2 = x2;
                }
            }
            else if (method2 == 3)
            {
                System.out.println("Enter slope of line 2: ");
                m2 = input.nextDouble();
                System.out.println("Enter the y-intercept of line 2: ");
                b2 = input.nextDouble();
            }
            else 
            {
                System.out.println("Enter the x value of the vertical line: ");

                xVertical2 = input.nextDouble(); 
                isVertical2 = true;

            }

            // Compares the two lines 
            if (isVertical1 && isVertical2 && xVertical1 == xVertical2) // true for equal vertical lines
            {
                System.out.println("Lines are equal");
            }
            else if (isVertical1 && isVertical2) // true for parallel equal lines
            {
                System.out.println("Lines are parallel"); 
            }
            else if (m1 != m2) 
            {
                System.out.println("Lines intersect");
            }
            else if (b1 != b2)
            {
                System.out.println("Lines are parallel");
            }
            else 
            {
                System.out.println("Lines are equal");
            }
            
            System.out.println("Press 1 to rerun, press 2 to stop");
            int user = input.nextInt();
            if (user == 2) 
            {
                break; 
            }
        }
    }
}

