/*
 *JAVA PROGRAM USING Random() ..........
 */
package rannum;
import java.util.*;

public class Rannum {

    public static void ShowRandomNum()
    {
       
        Random r= new Random();
        System.out.println("Random numbers are:");
        for(int i=0;i<=10;i++)
        {
            System.out.println(r.nextInt(1000));
        }
    }
    public static void main(String[] args) {
        ShowRandomNum();
    }
    
}
