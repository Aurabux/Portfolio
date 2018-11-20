import java.util.Scanner;

public class pigLatinTrans
{
   public static void  main(String[] args)
   {
   //intro
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to Pig Latin Translator!");
      System.out.println("Please type in a word please!");
   
   //user's translation
      String eWord = " ";
      eWord = in.nextLine();
   
                  //First Postion vowel
                  //System.out.println("You entered " + eWord);
      int firstP = 0;
      char ch = ' ';
      
                   
               
                  // System.out.println(firstP);
                  // System.out.println(ch);
                   
                                    
    do{
      ch = eWord.charAt(firstP);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o'  || ch == 'u'  || ch == 'y')
      {
         
         System.out.println((eWord.substring(firstP)) + (eWord.substring(0,firstP)) + "way");
         eWord = " ";
         
         System.out.println("Type in another or press Q to quit.");
         eWord = in.nextLine();
       
      }else{
      for (int i = 0; i < eWord.length(); i++)
      {
      ch = eWord.charAt(i);
        
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch ==  'o'  || ch == 'u'  || ch == 'y')
         
         {
            System.out.println((eWord.substring(i)) + (eWord.substring(0,i)) + "ay");
            eWord = " ";
         
            System.out.println("Type in another or press Q to quit.");
            eWord = in.nextLine();
            
            break;
         
         }
         }//end of else
      
      
      
      }//end of for
      
    //   System.out.println("Type in another or press Q to quit.");
   //       eWord = in.nextLine();
   //       
      
      }//end of do
      
     while (!eWord.equalsIgnoreCase("Q"));
      
     System.out.println("Goodbye!");
      
        
   
   
   
   
   
   }//end of main




}//end of pig class