import java.util.Scanner;
public class Addition
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int row = in.nextInt();
        int column = in.nextInt();

        int[][] matrix1 = new int[row][column];

        for (int i = 0; i < row; i++)
        {
            System.out.print("Matrix 1: " + "Enter " + column + " values for row " + i);
            for (int j = 0; j < column; j++) 
            {
                matrix1[i][j] = in.nextInt();
            }
        }

        int[][] matrix2 = new int[row][column];

        for (int i = 0; i < row; i++)
        {
            System.out.print("Matrix 2: " + "Enter " + column + " values for row " + i);
            for (int j = 0; j < column; j++) 
            {
                matrix2[i][j] = in.nextInt();
            }
        }

        System.out.println("This is the sum");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < column; j++) 
            {
                matrix1[i][j] += matrix2[i][j];
            }
        }
        
        // alignment code
        int[] columnLength = new int[column];
        
        for (int i = 0; i < column; i++)
        {
            String firstEntry = matrix1[0][i] + "";
            int maxLength = firstEntry.length();
            for (int j = 0; j < row; j++) 
            {
                String compare = matrix1[j][i] + "";
                maxLength = Math.max(maxLength, compare.length());
            }
            columnLength[i] = maxLength;
        }   
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(matrix1[i][j]);
                String placeHolder = matrix1[i][j] + "";
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
