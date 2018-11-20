import java.util.*;
public class Rainbow
{

   public Rainbow()
   {
      //call in
      Random r = new Random();
      //Array
      String[] colors = {"red","orange","yellow","green", "blue","purple","pink","white","gray","sliver","black"};
      String[] solution = new String[5];
   
      for (int i = 0; i < solution.length;i++)
      {
         solution[i]=colors[r.nextInt(10)];
      }
         
   }//end of rainbow method
}//end of rainbow class