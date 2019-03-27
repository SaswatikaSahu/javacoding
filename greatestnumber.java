/*
 * JAVA PROGRAM TO FIND GREATEST OF 3 NUMBERS.........
 */
package greaternumber;
import java.util.Scanner;


public class Greaternumber {
    public static void grtNum(){
        System.out.println("Enter 3 numbers:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>=b &&a>=c)
        {
            System.out.println("The greatest number is:"+ a);
        }
        else if(b>=a&&b>=c)
        {
            System.out.println("The greatest number is:"+ b);
        }
        else
            System.out.println("The greatest number is:"+ c);
    } 
   
    public static void main(String[] args) {
       grtNum();
    }
    
}
