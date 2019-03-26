C:\Users\lenovo\Documents\NetBeansProjects\FileHandling\src\filehandling\FileHandling.java/*
 *Write a programme to read the text from a text file and print the output.
 */
package filehandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling 
{
 public static void main(String[] args) 
 { 
     BufferedReader br=null;
     try
     {
      FileReader fr = new FileReader("myfile.txt");
      br=new BufferedReader(fr);
      String line;
     while((line=br.readLine())!= null)
     {
         System.out.println(line);
         }
     }catch(IOException ex)
      {
          System.out.println("Error reading the file");
          ex.printStackTrace();
      } finally{
         try{
             br.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
     }
    }
    
}
