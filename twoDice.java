import java.util.Random;
import java.util.Scanner;

public class twoDice 
{
   public static void main (String[] args)
   {  
      System.out.println("Welcome to the Dice Throwing Simulator, it is way cooler than the goat one");
      //creating the array
      Random r = new Random();
      Scanner in = new Scanner(System.in);
      int[] twoDi = new int [11];
      
      //important varaibles
      int rolls = 0;
      int dice  = 0;
      int diceT = 0;
      int astricRep = 0;
      String redo = "y";
   
      while (redo.equalsIgnoreCase("y"))
      { 
      
         System.out.println("How many rolls would you like to simulate? Remeber I am useing 2 6sided dice");
         rolls = in.nextInt();
         System.out.println("DICE THROWING RESULTS.");
         System.out.println("Each '*'is equal to 1% of the total number of throws ");
         System.out.println("Total number of rolls = " + rolls);
        
        //  dice = r.nextInt((6)+1);
//          diceT = r.nextInt((6)+1);
// 
         //generating 2D6     
         for(int i = 0; i < rolls; i++)
         {  
            twoDi[r.nextInt(6)+ r.nextInt(6)]++;
            
            
         
         }//end of for loop
         
         //printing dice reulsts
         for(int i = 0; i < twoDi.length;i++)
         {
            astricRep = 100 * twoDi[i] / rolls;
            System.out.print((i+2) + ": " );
            //System.out.println(" ");
             //* printing
            for(int j = 0; j < astricRep; j++)
            {
               System.out.print("*");
               
            }//endof sub for loop
             
            System.out.println();
         }//end of print FOR loop
         //flush buffer
         in.nextLine();
         
         //redo
         System.out.println("Want to play again type 'y'? if not type 'q'");
         redo = in.nextLine();
      }    //if they quit
      System.out.println("Thanks for playing!");
      System.out.println("Bye bye!"); 
         
   
   
   
   
   
   
   }//end of main class


}//end of public classtwoDICE