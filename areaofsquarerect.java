/*
 *JAVA PROGRAM TO FIND AREA OF A SQUARE, RECTANGLE...
 */
package squarearea;
import java.util.Scanner;


public class Squarearea {

    public static void sqArea(){
        System.out.println("Enter side of a square :");
        Scanner sc=new Scanner(System.in);
        double s = sc.nextDouble();
        double area= s*s;
        System.out.println("The area of a square is :"+" "+area);
        
    }
    public static void rectArea(){
        System.out.println("Enter length:");
        Scanner sc=new Scanner(System.in);
        double len = sc.nextDouble();
        System.out.println("Enter width :");
        double wid = sc.nextDouble();
        double area= len *wid;
        System.out.println("The area of a Rectangle is :"+" "+area);
    }
    public static void main(String[] args) {
       sqArea();
       rectArea();
    }
    
}
