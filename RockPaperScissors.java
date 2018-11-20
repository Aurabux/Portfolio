import java.util.*;
public class RockPaperScissors
{
   //scope stuff
   String cpuChoice = " ";
   String userChoice = " ";
   public String getUserChoice ()
   {
   
      Scanner in = new Scanner (System.in);
      
      boolean error = false;
      System.out.println("Type in Rock, Paper, or Scissors");
      userChoice = in.nextLine();
      if(userChoice.equalsIgnoreCase("Rock")||userChoice.equalsIgnoreCase("Paper")|| userChoice.equalsIgnoreCase("Scissors"))
      {
      
         error = false;
      }
      else
      {
         error= true;
         System.out.println("Sorry, Invaild answer");
         userChoice = in.nextLine();
      
      }
      while(error);
      
      return userChoice;   
   
   
   }//end of get user
   public String getCPUChoice ()
   {
   
      Random r = new Random();
      
      //randomizing the answer
      int cpu = r.nextInt(3 );
      
      if(cpu == 0)
      {
         cpuChoice = "Rock";
      
      }
      if(cpu == 1)
      {
         cpuChoice = "Scissors";
      
      }
      if(cpu == 2)
      {
         cpuChoice = "Paper";
      
      }
   
      return cpuChoice;
   
   
   }//end of Cup choice
   public String pickWinner(String userChoice, String cpuChoice)
   {
      String winner = " ";
      if(userChoice.equalsIgnoreCase("Rock") && cpuChoice.equalsIgnoreCase("Paper"))
      {
         winner = "Computer";
      
      }
      else if(userChoice.equalsIgnoreCase("Paper") && cpuChoice.equalsIgnoreCase("Scissors"))
      {
         winner = "Computer";
      
      }
      else if(userChoice.equalsIgnoreCase("Scissors") && cpuChoice.equalsIgnoreCase("Rock"))
      {
         winner = "Computer";
      
      }
      else if(userChoice.equalsIgnoreCase(cpuChoice))
      {
         winner = "Tie";
      
      }
      else
      {     
         winner = "User";
      
      }
      

   
   
   
   
      return winner;
   
   }//end of winner pick

}//end of RPS class