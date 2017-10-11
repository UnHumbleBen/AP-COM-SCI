import java.util.Scanner;
public class Alignment
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int row = in.nextInt();
        int column = in.nextInt();
        
        int[][] matrix = new int[row][column];
        
        for (int i = 0; i < row; i++)
        {
            System.out.println("Enter " + column + " values for row " + i);
            for (int j = 0; j < column; j++) 
            {
                matrix[i][j] = in.nextInt();
            }
        }
        // alignment code
        int[] columnLength = new int[column];
        
        for (int i = 0; i < column; i++)
        {
            String firstEntry = matrix[0][i] + "";
            int maxLength = firstEntry.length();
            for (int j = 0; j < row; j++) 
            {
                String compare = matrix[j][i] + "";
                maxLength = Math.max(maxLength, compare.length());
            }
            columnLength[i] = maxLength;
        }   
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(matrix[i][j]);
                String placeHolder = matrix[i][j] + "";
                int k = 0;
                while(placeHolder.length() + k <= columnLength[j])
                {
                    System.out.print(" ");
                    k++;
                }
            }
            System.out.println();
        }
       
    }    
}
