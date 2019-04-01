/*
 * JAVA PROGRAM TO ADD SUBSTRACT MATRICS
 */
package addmatrics;
import java.util.Scanner;

public class Addmatrics {
    public static void add()
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of the matrix:");
        x= sc.nextInt();
        y= sc.nextInt();
        
        int first[][] = new int[x][y];
        int second[][] = new int[x][y];
        int sum[][] = new int[x][y];
        
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                sum[i][j]= first[i][j] + second[i][j];
            }
        }
        System.out.println("The sum of two matrices is:");
         for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
             System.out.println();
        }
    }
    public static void sub()
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of the matrix:");
        x= sc.nextInt();
        y= sc.nextInt();
        
        int first[][] = new int[x][y];
        int second[][] = new int[x][y];
        int sum[][] = new int[x][y];
        
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                first[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                second[i][j]=sc.nextInt();
            }
        }
         for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                sum[i][j]= first[i][j] - second[i][j];
            }
        }
        System.out.println("The substraction of two matrices is:");
         for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        add();
        sub();
    }
    
}
