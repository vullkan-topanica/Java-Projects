import javax.swing.*;
import java.awt.*;
public class MakeChange
{ 
   public static void main(String[] args)
   { 
      int dollars = new Integer(JOptionPane.showInputDialog("Enter value of dollars:")).intValue();
      int cents = new Integer(JOptionPane.showInputDialog("Enter value of cents:")).intValue();
      int money = (dollars * 100) + cents;
      int quarters =(money / 25);
      money = money % 25;
      int dimes = (money / 10);
      money = money % 10;
      int nickels =  (money / 5);
      money = money % 5;
      int pennies = money; 
      int s = 2;
      
      Writer writer = new Writer();
      writer.setAxes(20,20,"Total",500);
      writer.setBar1("Quarters = "+quarters,quarters*s,Color.black);
      writer.setBar2("Dimes = "+dimes,dimes*s,Color.blue);
      writer.setBar3("Nickels = "+nickels,nickels*s,Color.orange);
      writer.setBar4("Pennies = "+pennies,pennies*s,Color.green);
      writer.setBar5(" ",0,Color.white);
      writer.setBar6(" ",0,Color.white);
   }
}