import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileIOExampleFun
{

   public static void main (String[] args)
   {
      Scanner in = new Scanner (System.in);
      File f;
      Scanner fileIn;
      
      String fileName = "";
      
      ArrayList<String> words = new ArrayList<String>();
      
      
      
      try
      {
         PrintWriter fileOut = new PrintWriter ("backwards.txt");
         
         //Get file name form theuser to builf the File object
         System.out.println("Please enter the name of the file " +
            "you want to print out backwards: ");
         fileName = in.nextLine();
         
         //build the file and attach a scanner to it
         f = new File (fileName);
         fileIn =  new Scanner (f);
         
         
         //Loop through the file, and add one word at a time to the array
         while(fileIn.hasNext())
         {
            words.add(fileIn.next());
         }
         
         //Print thewords backwards to the output file
         
         for (int i = words.size() - 1; i >= 0 ; i--)
         {
            fileOut.print(words.get(i) + " ");
         }
         
         fileOut.close();
      }
      catch(FileNotFoundException e)
      {
         System.out.println("Sorry invalid file");
      }
      
      
      
   
   }

}