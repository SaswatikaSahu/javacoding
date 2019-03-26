package javaapplication1;
import java.util.*;
//import java.lang.Math;

public class JavaApplication1 
{
    public static void Fibbo()
    {
        int t1=0,t2=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a= s.nextInt();
        for(int i =1;i<=a; ++i)
        {
            System.out.print(t1 +" ");
            int sum= t1+t2;
            t1=t2;
            t2=sum;
        }
        
    }
    public static void Prime()
    {
        int tmp;
        boolean isPrime=true;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a= s.nextInt();
        for(int i=2;i<= a/2;i++)
        {
            tmp=a%i;
            if(tmp==0)
            {
                isPrime= false;
            }
                
        }
        if(isPrime)
	   System.out.println(a + " is a Prime Number");
	else
	   System.out.println(a + " is not a Prime Number");
    }
    public static void HcfLcm()
    {
        int tmp,hcf,lcm;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a= s.nextInt();
        int b= s.nextInt();
        int i=a; int j=b;
        while(b != 0)
        {
            tmp = b;
            b = a%b;
            a = tmp;
        }
		
        hcf = a;
        lcm= (i*j)/hcf;
        System.out.println("HCF = " +hcf);
        System.out.println("LCM = "+lcm );
       
    }
    
    public static void Calc()
    {
        double a,b,res;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number :");
        a= s.nextDouble();
        b= s.nextDouble();
        System.out.println("Enter the operation + ,- , * , / ,log");
        char operator = s.next().charAt(0);
        switch(operator)
        {
            case '+':
                res= a+b; break;
            case '-':
                res= a-b; break;
            case '*':
                res= a*b; break;
            case '/':
                res=a/b; break;
           /* case 'log':
                res= Math.log(a);break;*/ 
            default:
               System.out.println("You have entered Incorrect operator");return;
                
        }
        System.out.println("The"+ operator +"of "+ a +"and "+ b+"is :"+ res);
        
    }        
    
  

public static void main(String[] args) {
        Fibbo();
        System.out.println(" ");
        Prime();
        System.out.println(" ");
        HcfLcm();
        System.out.println(" ");
        Calc();
        
        
    }
    
}
