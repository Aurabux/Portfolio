import java.util.*;
public class Roulette
{
      
           
      public double betOnce(Scanner console, double bet)
      {
         //intro
         
             
         int userIn = 0;
         Random r = new Random();
         int number = r.nextInt(37);
         double result =0.0;
   
                     
      
         System.out.println("Guess Low: 1-18 or High: 19-37");
         System.out.println("Press (1) for Lower, Press (2) for Higher, Press(3) to enter your guess");
         userIn = console.nextInt();
        
    
         if(number >=1 && number <= 18 && userIn==1)
         {
            System.out.println("You Win! Choice 1 was a good one");
            result = bet*2;
          
         }//end if
         else if(number >=19 && number <= 36 && userIn==2)
         {
            System.out.println("You Win! Choice 2 was right fot you!");
            result = bet*=2;
            
      
          
         }//end else if
         else if (userIn == 3)
         {
            System.out.println("What number would you like to guess?");
            userIn = console.nextInt();
            if(userIn >=1 && userIn <= 18 && number >=1 && number <= 18)
            {
            System.out.println("You Win!");
            result = bet *34.0;
          
            }//end if
            else if(userIn >=19 && userIn <= 36 && number >=19 && number <= 37)
            {
            System.out.println("You Win!");
            result = bet * 34.0;
            }//end else if
            else
            {
               System.out.println("Say byebye money becuase you guess wrong");
               result = bet - bet;
            }
         }//end of 3
         else
         {
            System.out.println("You lose");
            result = bet - bet;
          
         }//end else
         
         return result;
      }//end of bet method
}//end of bet class