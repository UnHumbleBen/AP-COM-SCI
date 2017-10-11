import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Matrix 1: Enter number of rows and columns");
        int row1 = in.nextInt();
        int column1 = in.nextInt();

        int[][] matrix1 = new int[row1][column1];

        for (int i = 0; i < row1; i++)
        {
            System.out.print("Matrix 1: " + "Enter " + column1 + " values for row " + (i+1));
            for (int j = 0; j < column1; j++) 
            {
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix 2: Enter number of rows and columns");
        int row2 = in.nextInt();
        int column2 = in.nextInt();
        int[][] matrix2 = new int[row2][column2];

        for (int i = 0; i < row2; i++)
        {
            System.out.print("Matrix 2: " + "Enter " + column2 + " values for row " + (i + 1));
            for (int j = 0; j < column2; j++) 
            {
                matrix2[i][j] = in.nextInt();
            }
        }

        if (column1 == row2) 
        {
            int[][] product = new int[row1][column2]; 
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    int sum = 0;
                    for (int k = 0; k < column1; k++)
                    {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    product[i][j] = sum;
                }
            }

            // alignment code
            int[] columnLength = new int[column2];

            for (int i = 0; i < column2; i++)
            {
                String firstEntry = product[0][i] + "";
                int maxLength = firstEntry.length();
                for (int j = 0; j < row1; j++) 
                {
                    String compare = product[j][i] + "";
                    maxLength = Math.max(maxLength, compare.length());
                }
                columnLength[i] = maxLength;
            }   

            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    System.out.print(product[i][j]);
                    String placeHolder = product[i][j] + "";
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
        else
        {
            System.out.println("Cannot be multplied");
        }
    }
}
