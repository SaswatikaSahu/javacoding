/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;
public class JavaApplication7 
{
    public static void main(String[] args) 
    {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a character :");
       char ch = sc.next().charAt(0);
       try{
            if((ch >= 'a' && ch<='z')||(ch >= 'A' && ch<='Z')||(ch>='0'&& ch<='9'))
            {
                System.out.println(ch + "This is a Alphabet/Number");
            }
            else 
            {
                throw new MyException("NonAlpha Numeric");
            }
            
        }
       catch(MyException e)
       {
           System.out.println(e);
           //e.printStackTrace();
       }   
    
  }
}
    class MyException extends Exception
{
    String s;
   MyException(String b) {
     s=b;
   }
   public String toString(){
     return ("Exception Number =  "+s) ;
  }
}

    
    
