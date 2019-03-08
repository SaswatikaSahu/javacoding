/*
 * Write a merge sort sorting program to sort a list of numbers in java
 */
package mergesort;
import java.util.*;

public class MergeSort {
    void merge(int arr[],int l,int m, int n)
        {
        int n1= m - l + 1;
        int n2= n-m;
        
        int tmp1[]=new int [n1];
        int tmp2[]=new int [n2];
       
        for(int i=0; i<n1; ++i)
        {
            tmp1[i] = arr[l + i];
        }
        for(int j=0;j<n2; ++j)
        {
            tmp2[j]= arr[m + 1+ j];
        }
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (tmp1[i] <= tmp2[j]) 
            { 
                arr[k] = tmp1[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = tmp2[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = tmp1[i]; 
            i++; 
            k++; 
        } 
 
        while (j < n2) 
        { 
            arr[k] = tmp2[j]; 
            j++; 
            k++; 
        } 
    } 
      void sort(int arr[], int l, int n) 
    { 
        if (l < n) 
        { 
           int m = (l+n)/2; 
	   sort(arr, l, m); 
	   sort(arr , m+1, n); 
           merge(arr, l, m, n); 
  
        } 
    }   
       static void printArray(int arr[]) 
       {
         int x= arr.length; 
         for (int i=0; i<x; ++i)
                 System.out.print(arr[i] + " "); 
         
         System.out.println(); 
       
    }
   
    public static void main(String[] args) {
        /*int arr[] = {50, 90, 70, 500, 60, 10}; 
        System.out.println("Given Array"); 
        printArray(arr); */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter numbers:");
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
        arr[i]=scan.nextInt();
        }
        System.out.println("Given array is:");
        for(int i=0;i<5;++i)
        {
            System.out.print(arr[i]+ " ");
        }
        
  
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length-1); 
        System.out.println("\nSorted array"); 
        printArray(arr); 
        
    }
    
}
