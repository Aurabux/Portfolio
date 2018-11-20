//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MemoryGame
{
   //call in
   public JFrame main;
   public JLabel lblInstruc = new JLabel();
   public JTextField txtIn;
   public int num = 1; 
   
   //call in
      Random r = new Random();
      //Array
      String[] colors = {"red","orange","yellow","green", "blue","purple","pink","white","gray","sliver","black"};
      String[] solution = new String[5];
   

   public MemoryGame()
   {
       for (int i = 0; i < solution.length;i++)
         {
            solution[i]=colors[r.nextInt(10)];
         }
         
         JOptionPane.showMessageDialog(null,"How Good is your Memory? \n MEMORIZE THIS!! \n" + Arrays.toString(solution));
      //JButton bntOK = new JButton ("OK");
   
      main = new JFrame ();
      main.setSize (400,300);
      main.setTitle("Memory Game");
      main.setDefaultCloseOperation(main.EXIT_ON_CLOSE);
      main.setLayout(new FlowLayout());
   
      createLayout();
      main.setVisible(true);
   }//end of Mem method
   
   public void createLayout ()
   {
      //set up
     
      txtIn = new JTextField(null,15);
      
      
      lblInstruc.setText("Enter color Numer " + num + ": ");
      
      //action add
      txtIn.addActionListener(new GameListener());
      //add to main frame
      main.add(lblInstruc);
      main.add(txtIn);
      //paint frame
      main.setVisible(true);
      
      
   }//end of create layout

   private class GameListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
         String guess = " ";
         guess = txtIn.getText();
         
         if(solution[num-1].equalsIgnoreCase(guess))
         {
            num++;
            lblInstruc.setText("Enter Color Number " + num + ":");
            txtIn.setText("");
            
            if(num == 6)
            {
               lblInstruc.setText("Congraulations You win!");
               txtIn.setVisible(false);
            }
                     
         
         }//end of if
         else
         {
            lblInstruc.setText("Sorry, you lose");
            txtIn.setVisible(false);
            
         }//else
      
         
      }//end of action perform
   
   }//end of game lis
}//end of memclass