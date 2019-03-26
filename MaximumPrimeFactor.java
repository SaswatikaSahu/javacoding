/*
 * Write a java program to find the largest prime factor of a given number
 */
package primefactor;
import java.io.*;
import java.util.*;

public class PrimeFactor {
    
    static long maxPrimeFact(long n)
    {
        long maxPrime = -1;
        while(n%2==0)
        {
            maxPrime=2;
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            while(n%i==0)
            {
                maxPrime=i;
                n=n/i;
                
            }
        }
        if(n>2)
            maxPrime=n;
        
        return maxPrime;
        
 
    }

    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number :");
        long a= s.nextLong();
        System.out.println("The maximum prime factor of given number is:"+ 
                maxPrimeFact(a));
        
    }
    
}
