/*
 * JAVA PROGRAM TO DO LINEAR SEARCH ..........
 */
package linearsearch;
import java.util.Scanner;

public class Linearsearch {
    public static void linearSearch(){
        
        int arr[];
        System.out.println("Enter size of an array:");//Declaration of array size
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        
        System.out.println("Enter numbers :");//Stroing values from keyboard
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        System.out.println("Enter the number for linear search:");//required number
        int val=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val)
            {
                System.out.println(val+" "+"is found at "+(i+1)); break;
            }
            else if(i==n)
            {
                System.out.println("Not found");
            }
        
        }
        
        
    }
   
    public static void main(String[] args) {
        linearSearch();
    }
    
}
