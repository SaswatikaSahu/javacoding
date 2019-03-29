/*
 * JAVA PROGRAM TO PERFORM BINARY SEARCH......
 */
package binarysearch;
import java.util.Scanner;

public class Binarysearch {
    public static void binSearch()
    {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");//Declaration of array size
        int num = sc.nextInt();
        arr = new int[num]; 
        
        System.out.println("Enter numbers :");//storing values... ned to store values in ascendind order or else first sorting require
        for(int i=0;i<num;i++)
            arr[i]=sc.nextInt();
        
        System.out.println("Enter the number for binary search:");
        int srh= sc.nextInt();
        
        int fi=0;
        int la=num-1;
        int mi=(fi+la)/2;
        
        while(fi<=la)
        {
            if(arr[mi]<srh)
            {
                fi=mi+1;
            }
            else if(arr[mi]==srh)
            {
                System.out.println("searched number\t"+srh+" found at:"+" "+(mi+1));
                break;
            }  
            else
                la=mi-1;
            mi=(fi+la)/2;
        }
        if(fi>la)
            System.out.println("number not found");
        
    }
    
    public static void main(String[] args) {
        binSearch();
    }
    
}
