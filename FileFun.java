import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File; 

public class FileFun
{

   public static void main (String[] args)
   {
      try
      {
         File f = new File ("blah.txt");//you can also do file path C:\\Users\\Art\\OneDrive\\Documents\\Weber\\CS1400\\Module 4\\4-6\\text.txt
         
         System.out.println(f.exists());
         System.out.println(f.length());
         
         Scanner fileIn = new Scanner (f);         
         
         String line = "";
         String word = "";
         int count = 0;
         
         while (fileIn.hasNext())
         {
         word = fileIn.next();
         count++;
         }
         
         System.out.println("# Words: " + count);
       
      }
      catch (FileNotFoundException e)
      {
         System.out.println("Sorry. Bad file name.");
      }
   
   }

}