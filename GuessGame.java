import java.util.Scanner;
import java.util.Random;

public class GuessGame 
{
    public static void main (String[] args)
    {
     
      //Introduction of the game
      System.out.println("Welcome to the guessing game. Please guess a number between 1 & 100");
      Scanner in = new Scanner(System.in);

      // creating the random number
      Random r = new Random();
      int Number = r.nextInt(100);
      
      //Variable of the guess
      int Guess = 0;
      Guess = in.nextInt();
      //System.out.println(Guess);
      //^test 4 guess variable
      int times = 0;
      
    do
    {  
         if(Guess <= 0 || 101 <= Guess)
         {
      
              System.out.println("Excussse me princess? But I said between 1 and 100. Dont make me tell you again");
              Guess = in.nextInt();
              times++;
              
     
        }//end of if state
         if(Guess < Number && Guess > 0 )
         {
            System.out.println("Higher,but not higher than 100...Don't try me");
            Guess = in.nextInt();
            times++;
         } //end of if state
         if(Guess > Number && Guess < 101 )
         {
            System.out.println("Lower! Jezz Your bad at this.");
            Guess = in.nextInt();
            times++;
         }
         if(Guess == Number)
         {
          System.out.println("Finally, You got it! It was " + Number + " Good job! It took you " + times + " tries");
         }// end of if madness
 
      }//end of do   
      while (Guess != Number);
      
    }//end of public void 
}// end of public guess game class