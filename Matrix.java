import java.util.Scanner;

public class Matrix 
{

    public static void main(String[] args) 
    {
    int arr1[][] = new int[3][3];
    int arr2[][] = new int[3][3];
    int arr3[][] = new int[9][9];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int cols = sc.nextInt();
    System.out.println("Enter elements of the first matrix:");
     for (int i = 0; i < rows; i++) 
     {
     for (int j = 0; j < cols; j++) 
     {
     arr1[i][j] = sc.nextInt();
     }
     }
     System.out.println("Enter elements of the second matrix:");
     for (int i = 0; i < rows; i++) 
     {
     for (int j = 0; j < cols; j++) {

     arr2[i][j] = sc.nextInt();
     }
     }
     for (int i = 0; i < rows; i++) 
     {
     for (int j = 0; j < cols; j++) 
     {
    arr3[i][j] = arr1[i][j] + arr2[i][j];
    }
    }
    
    System.out.println("Sum of the two matrices:");
    

     for (int i = 0; i < rows; i++)
     {
     
     for (int j = 0; j < cols; j++) 
     {
     System.out.print(arr3[i][j] + " ");
     }
     System.out.println();
     }
     
     }
     }

        


