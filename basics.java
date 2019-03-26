public class Main {
    public static void PrintTable(int a)
    {
    
        for(int i=1;i<=10; i++)
        {
            System.out.println(a +" "+"x"+" "+ i+ " "+"=" +" "+ a*i);
        }
       
    }
    public static boolean CheckPallidrom(String x)
    {             
        String result= "";

        for(int j= x.length() -1;j>=0;j--)
        {
            result = result + x.charAt(j);
        }
        System.out.println(result);
        if(x.equals(result))
            return true;
        
        return false;
    
    }
    //it will return an array of integer in ascending order
    public  static int[] BubbleSort( int[] arr) 
    {
        int tmp;
        for(int i=0; i< arr.length-1; i++  )
        {
            for(int j=0; j< arr.length-i-1; j++)
            {
                //now compare the 2 numbers
                if(arr[j]> arr[j+1])
                {
                    //swap the numbers
                    tmp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= tmp;
                }   
            }       
        }
        return arr;
    }
    
    public static void Pyramid(int x)
    {   
        int num=1;
        for (int i =0; i<x ;i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(num +" ");
                num= num+1;
            }
            System.out.println();
        }
    }
     public static void RevPyramid(int x)
    {   
        int num=1;
        for (int i =0; i<x ;i++)
        {
            for(int k=0;k<x-1-i; k++)
            {
                System.out.print(" "+ " ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print(num +" ");
                num= num+1;
            }
            System.out.println();
        }
    }
    public static void CentPyramid(int x)
    {   
        int num=1;
        for (int i =0; i<x ;i++)
        {
            for(int k=0;k<x-1-i; k++)
            {
                System.out.print(" "+ " ");
            }
            for(int j=0; j<= 2*i; j++)
            {
                System.out.print(num +" ");
                num= num+1;
            }
            System.out.println();
        }
    }
    public static void RevString(String x)
    {
        String[] split= x.split(" ");
        String result= " ";
        for(int i =split.length-1; i>=0; i--)
        {
            result+= (split[i]+" ");
        }
        System.out.println(result.trim());
    }
   public static void main(String args[]) 
    { 

     boolean result = CheckPallidrom("abcbad");
      if (result)
      {
          System.out.println("Pallidrum");
          
      }
       else
       {
           System.out.println("Not Pallidrum"); 
       }
    
    
         int[] arr= {22,11,4,80,444};
         int[] asc= BubbleSort( arr);
         for(int i= 0; i< asc.length; i++)
         {
            System.out.println(asc[i]);
         }
       
       Pyramid(3);
       RevPyramid(3);
       CentPyramid(3);
       RevString("I am a coder");
    } 
    
    
}

