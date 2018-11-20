import java.util.Random;
import java.util.Scanner;
public class rps{
   public static void main(String[] args){
   //inro
      System.out.println("Welcome to Rock, Paper, Scissors!");
   //call in
      Scanner in = new Scanner(System.in);
      Random r = new Random();
   //#of rounds
   String redo = "y";
   
      while (redo.equalsIgnoreCase("y"))
      { 
      System.out.println("Pick an odd # of rounds.");
      int round = 0;
      round = in.nextInt();
      int t = 2;
      
      //check if rounds are odd
         while(round % t == 0 ){
            System.out.println("I said odd. Do you know what that means?...");
            round = in.nextInt();
         }
      
         //flush buffer
         in.nextLine();
         System.out.println("thank you for vaild answer");
         System.out.println("You are playing " + round + " rounds ");
        
         System.out.println("Enter Rock, Paper, or scissors");
         String userC =" ";
         userC = in.nextLine();
                  //int compC = r.nextInt(12);
         //System.out.println(compC);
         //wins
         int userW = 0;
         int compW = 0;
        
         for(int i = 0; i <= round;i++)
         { 
            int compC = r.nextInt(12);
               //System.out.println(compC);
              
         
            if(compC<=4 && compC >= 0)
            {//rock comp choice
               System.out.println("Computer choose Rock and you choose " + userC);
               if( userC.equalsIgnoreCase("rock"))
               {
                  System.out.println("you are tied!");
                  i++;
                  userC = in.nextLine();
               }//end of sub if 1A 
               else if(userC.equalsIgnoreCase("paper"))
               {
                  System.out.println("You won this round!");
                  userW++;
                  i++;
                  userC = in.nextLine();
               }//end of sub if 1b
               else if(userC.equalsIgnoreCase("Scissor"))
               {
                  System.out.println("Maybe Computers are smarter...you lost");
                  compW++;
                  i++;
                  userC = in.nextLine();
               }//end of sub if 1c                              }
            }//end of main if 1
            else if(compC<=9 && compC >= 5)
            {//paper comp choice
               System.out.println("Computer choose paper and you choose " + userC);
               if( userC.equalsIgnoreCase("paper")){
                  System.out.println("you are tied!");
                  i++;
                  userC = in.nextLine();
               }//end of sub if 2A
               else if(userC.equalsIgnoreCase("scissor")){
                  System.out.println("You won this round!");
                  userW++;
                  i++;;
                  userC = in.nextLine();
               }//end of sub if 2b
               else if(userC.equalsIgnoreCase("rock")){
                  System.out.println("Maybe Computers are smarter...you lost");
                  compW++;
                  i++;
                  userC = in.nextLine();
               }//end of sub if 2c                              }
            }//end of main if 2
            else if(compC<=12 && compC >= 10)
            {//scissor comp choice
               System.out.println("Computer choose scissor and you choose " + userC);
               if( userC.equalsIgnoreCase("scissor")){
                  System.out.println("you are tied!");
                  i++;
                  userC = in.nextLine();
               }//end of sub if 3A
               else if(userC.equalsIgnoreCase("rock")){
                  System.out.println("You won this round!");
                  userW++;
                  i++;
                  userC = in.nextLine();
               }//end of sub if 3b
               else if(userC.equalsIgnoreCase("paper")){
                  System.out.println("Maybe Computers are smarter...you lost");
                  compW++;
                  i++;
                  userC = in.nextLine();
               }//end of sub if 3c                              }
            }//end of main if 3
            else if(!userC.equalsIgnoreCase("paper") && !userC.equalsIgnoreCase("rock") && !userC.equalsIgnoreCase("scissors") && !userC.equalsIgnoreCase("q"))
            {
               System.out.println("You entered an invailded answer try again. Make sure it is spelled right also..Check Title!");
               userC = in.nextLine();
            }
         
         }//end of for   
                  
         System.out.println("You won: " + userW + " Comp Won: " + compW + " You played " + round + " rounds. Hope you had fun. bye bye!");
                  
         System.out.println("Want to play again type 'y'? if not type 'q'");
         //play again code
         //String exLn ="  ";
         redo = in.nextLine();
         
         /*
         if(exLn.equalsIgnoreCase("y"))
         {
            System.out.print("yay! now type how many rounds you want to play!");
            round = in.nextInt();
            System.out.println("You will now play " + round + " rounds of RPS.");
         }//end of if*/
      
         //end of do
      }//while(!exLn.equalsIgnoreCase("Q"));
      System.out.println("Okay. Goodbye!");
         
                                
                
      
               
      
   
    
   
   
   
   
   }//end of main class


}//end of rps