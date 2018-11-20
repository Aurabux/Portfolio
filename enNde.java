import java.util.*;
import java.io.*;

public class enNde
{
   public static void  main(String[] args)
   {
   //into
      System.out.println("Welcome to the Encrypt and Decrypt program!");
      System.out.println("With your host the mummy!");
      System.out.println("since the mummy doesn't trust your spelling, E for Encrypt and D for Decrypt.or q QUIT");
   //call in
      Scanner in = new Scanner(System.in);
      String fileName = "";
      Scanner fileIn;
   
   
      String path = " ";
      path = in.nextLine();
   
      //file varaibles
      
     
      //where we store stuff
      ArrayList<String> words = new ArrayList<String>();
      //paths
      if(path.equalsIgnoreCase("E"))
      {
         System.out.println("What file do you want to Ecnrypt");
         fileName = in.nextLine();
         //Encrypt
         try
         {
            
           
               //where it is going
// //             System.out.println("Where do you want the encrpt file to be?");
// //             String outfName = " ";
// //             outfName=in.nextLine();
// //             PrintWriter fileOut = new PrintWriter(outfName);
               
               //where its comming from
            File f = new File (fileName);
            fileIn = new Scanner (f);
            
            PrintWriter fileOut = new PrintWriter("Encrypted.txt");
            

            //adding it to the array
            while(fileIn.hasNextLine())
            {
               words.add(fileIn.nextLine());
              //isolating the word
               for(int i = 0; i < words.size(); i++)
               {
                  //isolating the charater
                  String isoW = " ";
                  isoW = words.get(i);
                  String enW = " "; 
                  for(int j = 0; j < isoW.length(); j++)
                  {
                     char c = ' ';
                     c = isoW.charAt(j);
                     
                     if (c == '.' || c == ' ' || c == ',' || c == '!' || c == '?')
                     {
                        enW += ' ';
                     }
                     else
                     {
                        c++;
                        enW += c;   
                     }//end of if else statement
                  }//end of nested for 
                  fileOut.println(enW); 
               }//end of for one           
            }//while        
            fileOut.close();
            
            System.out.println();
            System.out.println("File has been encrypted to Encrypted.txt");

         }//try
         catch(FileNotFoundException e)
         {
            System.out.println("Sorry, bad file name");
         
         }//end of catch
      }//end of encrypt
      if(path.equalsIgnoreCase("D"))
      {
         System.out.println("What file do you want to Decrypt");
         fileName = in.nextLine();
         //dECRYPT
         try
         {
            File f = new File (fileName);
            fileIn = new Scanner (f);
            PrintWriter fileOut = new PrintWriter("Decrypted.txt");
            //where it is going
// //             System.out.println("Where do you want the DECRYPT file to be?");
// //             String outfName = " ";
// //             outfName=in.nextLine();
// //             PrintWriter fileOut = new PrintWriter(outfName);
               
            //where its comming from

            //adding it to the array
            while(fileIn.hasNextLine())
            {
               words.add(fileIn.nextLine());
              //isolating the word
               for(int i = 0; i < words.size(); i++)
               {
                  //isolating the charater
                  String isoW = " ";
                  isoW = words.get(i);
                  String enW = " "; 
                  for(int j = 0; j < isoW.length(); j++)
                  {
                     char c = ' ';
                     c = isoW.charAt(j);
                     
                     if (c == '.' || c == ' ' || c == ',' || c == '!' || c == '?')
                     {
                        enW += ' ';
                     }
                     else
                     {
                        c--;
                        enW += c;   
                     }//end of if else statement
                  }//end of nested for 
                  fileOut.println(enW); 
               }//end of for one           
            }//while        
            fileOut.close();
         }//try
         catch(FileNotFoundException e)
         {
            System.out.println("Sorry, bad file name");
         
         }//end of catch
      
      
      
      }//end of de if
      else
      {
         System.out.println("Did you do what mummy asked?");
      
      }//end of else
      System.out.println("bYE Bye! Happy Halloween!");
       
   }//end of main
}//end of enNde