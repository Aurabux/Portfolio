import java.util.*;
import java.io.*;

public class EncryptDecrypt
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner (System.in);
      
      String encryptDecrypt = "";
      String fileName = "";
      String words = "";
      String encrypted = "";
      boolean doAgain = true;
      char character;
      
      System.out.print("Would you like to Encrypt or Decrypt?: ");
     
      do
      {
         encryptDecrypt = in.nextLine();
      
         if(encryptDecrypt.equalsIgnoreCase("Encrypt"))
         {
         System.out.println("Please enter the name of the file: ");
         fileName = in.nextLine();
         
            try
            {
               File f = new File (fileName);
               Scanner fileIn = new Scanner (f);
               
               PrintWriter fileOut = new PrintWriter("Encrypted.txt");
               
               while (fileIn.hasNextLine())
               {
                  words = fileIn.nextLine();
                  String encipher = ""; 

                  for (int i = 0; i < words.length(); i++)
                  {
                        character = words.charAt(i);
                        character++;
                        encipher = encipher + character;                  
                  }
                  fileOut.println(encipher); 
               }
               
               fileOut.close();
               
               
               System.out.println();
               System.out.println("File has been encrypted to Encrypted.txt");
               
              
            }
            catch (FileNotFoundException e)
            {
               System.out.println("Sorry, invalid file. Please start over.");
               System.out.print("Encrypt or Decrypt?: "); 
            }
         }
         else if(encryptDecrypt.equalsIgnoreCase("Decrypt"))
         {
         System.out.println("Please enter the name of the file: ");
         fileName = in.nextLine();
            try
            {  
               File f = new File (fileName);
               Scanner fileIn = new Scanner (f);
               
               PrintWriter fileOut = new PrintWriter("Decrypted.txt");
               
               while (fileIn.hasNextLine())
               {
                  words = fileIn.nextLine();
                  String decipher = "";
                  
                  for (int i = 0; i < words.length(); i++)
                  {
                        character = words.charAt(i);
                        character--;
                        decipher = decipher + character;                 
                  }
                   fileOut.println(decipher);
               }
               
               fileOut.close();
               
               
               System.out.println();
               System.out.println("File has been decrypted to Decrypted.txt");

              }
            catch (FileNotFoundException e)
            {
               System.out.println("Sorry, invalid file. Please start over.");
               System.out.print("Encrypt or Decrypt?: ");
            }
         }
         else
         {
            System.out.println("Please enter in Encrypt or Decrypt.");
         }
         
           
      }while(doAgain);
   }
}