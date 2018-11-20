import java.util.*;
public class BetOnce
{
      
      int input = 0;
      
      public BetOnce(int number, Scanner in)
      {
            //intro
         System.out.println("Welcome to the Betting Game.");
         
      
         System.out.println("Guess Low: 1-18 or High: 19-37");
         System.out.println("Press (1) for Lower, Press (2) for Higher");
         input = in.nextInt();
         System.out.println("The Number was ...: " + number);
         if(number >=1 && number <= 18 && input==1)
         {
            System.out.println("You Win! Choice 1 was a good one");
          
         }//end if
         else if(number >=19 && number <= 37 && input==2)
         {
            System.out.println("You Win! Choice 2 was right fot you!");
      
          
         }//end else if
         else
         {
            System.out.println("You lose. :( maybe a rabbits foot will bring you luck?");
          
         }//end else
         
        
      }//end of bet method
}//end of bet class