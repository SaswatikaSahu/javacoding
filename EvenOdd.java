/*
 * JAVA PROGRAM TO CHECK WHETHER NUMBER IS EVEN OR ODD
 */
package checkevenodd;
import java.util.Scanner;

public class Checkevenodd {
    public static void EvenOdd()
    {
        int n;
        System.out.println("Enter an number :");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        if ( n % 2 == 0 )
        System.out.println( n + " "+"is even");
        else
        System.out.println( n + " "+"is odd");
    }
    
    public static void main(String[] args) {
        EvenOdd();
        
    }
    
}
