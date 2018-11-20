import java.util.*;
public class Transactions
{
   public static void main (String[] args)
   {  
   //scope vriable
      boolean error = false;
     
   //important varaible
      String n = " ";
      int a = 0;
      a = 3423434;
      int choice = 0;
      double balance = 0.0;
      double amount = 0.0;
      
   //call in
      Scanner in = new Scanner(System.in);
      BankAccount bA = new BankAccount (n,a);
   //**your method :)
   
   //introduction
      System.out.println("Welcome to the Bank of hyrule");
      System.out.println();
      System.out.println("Please enter your name to creat an account: ");
      n=in.nextLine();
      
      //loopy loop
      do{
      
         //intrustions
         System.out.println();
         System.out.println("Press 1 to make a deposit");
         System.out.println("Press 2 to make a withdrawal");
         System.out.println("Press 3 to make a account information");
         System.out.println("Press 4 to quit");
         choice=in.nextInt();
      
         //paths
         if(choice == 1)
         {  
             //transaction
            System.out.println("How much would you like to deposit?");
            amount=in.nextDouble();
            System.out.println("thanks for the money bae!");
            //your method
            bA.deposit(amount);
            //error = false;
            
         
         }
         else if(choice == 2)
         {
            //transaction
            System.out.println("How much would you like to withdraw?");
            amount=in.nextDouble();
            System.out.println("Don't spend it all in one place!");
            //your method
            bA.withdraw(amount);
          
         }
         else if(choice == 3)
         {
            //your method
            bA.getBalance();
            //print info
            System.out.println("Name: " + n);
            System.out.println("Account #: " + a);
            System.out.println("Balance: " + bA.getBalance());
           
         
         
         }
         else if(choice <=0 || choice > 4)
         {
            System.out.println();
            System.out.println("Invaild answer");
            
         }
      }//end of do   
      while(choice != 4);
      
      System.out.println("Thanks for your money!";
   
   
   
   
   }//end of main

}//end of Traansactions class