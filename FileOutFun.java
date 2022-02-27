import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class FileOutFun
{

   public static void main(String[] args)
   {
      try
      {
      PrintWriter fileOut = new PrintWriter ("Output.txt");
      
      fileOut.println("Just printed some text to file.");
      fileOut.println("Oh, wait -- heres more!");
      
      fileOut.close();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Sorry,not a valid file.");
      }
   
   }

}