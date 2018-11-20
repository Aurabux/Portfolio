import java.util.*;
public class bmi{
   public static void main(String[] args){
      //intro
      System.out.println("Welcome to the Body Mass Index");
      //call in
      Scanner in = new Scanner(System.in);
      Random r = new Random();

       //User inputs
       double w = 0.0;
       double h = 0.0;
       boolean error = false;
       System.out.println("Enter weight please!");
       do
       {
         
         
         try
         {
            
            error = false;
            w = in.nextDouble();
            if(w<=0)
            {
              System.out.println("Um, postive. You can't have negative weight. Weight Watcher couldn't even acheive that.");
              error = true;
            
            }//if
            
               
         }//end try
          catch(InputMismatchException e)
         {
          error = true;
          System.out.println("Sorry, I thought you knew weight was in decimal numbers......");
          //flush buffer
          in.nextLine();
          //retry
          System.out.println("Try again. Enter your weight");
          
   
          
         } //catch  
      }while(error);   
      //user height
      System.out.println("Enter Height IN inches!!!");
       do
       {
         
         
         try
         {
            
            error = false;
            h = in.nextDouble();
            if(h<=12)
            {
              System.out.println("No one is that short. So that is a lie like the cake. Type a vaild height that MAKES Sense");
              error = true;
            
            }//if
            
               
         }//end try
          catch(InputMismatchException e)
         {
          error = true;
          System.out.println("Sorry, I thought you knew height was in decimal numbers......");
          //flush buffer
          in.nextLine();
          //retry
          System.out.println("Try again. Enter your height");
          
   
          
         } //catch  
      }while(error);   
         
        
         
      //math variables
      double wTotal = (w*704);
      double hTotal = (h*h);
      double bmi = (wTotal/hTotal);
      double bTotal = (Math.round(bmi*10));
      double bRound = (bTotal/10);
      //results
      System.out.println("Your Weight: "+ w);
      System.out.println("Your Height: "+ h);
      System.out.println("Your BMI IS ..... " + bRound);
      
      System.out.println(bRound + " translates to you're perfect<3 ");
      
      
      
  
   
   
   }//end of main
}//end of bmi