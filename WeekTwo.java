import java.util.Scanner;

public class WeekTwo 
{
   public static void main (String[] args)
   {
   
   Scanner in = new Scanner(System.in);
   //variables
   int rAge = 67;
   String Month = "";
   int Day = 0;
   int Year = 0;
   
   System.out.println("Hey,want to find out when you retire?");
   System.out.println("What Month where you born? Type Below");
   Month = in.nextLine();
   
   System.out.println("What day were you born on?");
   Day = in.nextInt();
   
   System.out.println("What year were you born?");
   Year = in.nextInt();
   
   //equation print out
   int CountdownYear = Year + rAge;
   System.out.println("You will Retire on " + Month + " " + Day+ ", " + CountdownYear); 
   
   //How long till then equation stuff
   System.out.println("You have " + (CountdownYear - 2015)  + " years left till you can retire");




   }//main class ending

}//class WeekTwo ending