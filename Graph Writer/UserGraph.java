import javax.swing.*;
import java.awt.*;
public class UserGraph
{ 
   public static void main(String[] args)
   { 
      int s = 2;
      String name1 = JOptionPane.showInputDialog("Enter the name of first field : ");
      int x1 = new Integer(JOptionPane.showInputDialog("Enter the first value : ")).intValue();
      String name2 = JOptionPane.showInputDialog("Enter the name of second field : ");
      int x2 = new Integer(JOptionPane.showInputDialog("Enter the second value : ")).intValue();
      String name3 = JOptionPane.showInputDialog("Enter the name of third field : ");
      int x3 = new Integer(JOptionPane.showInputDialog("Enter the third value : ")).intValue();
      String name4 = JOptionPane.showInputDialog("Enter the name of fourth field : ");
      int x4 = new Integer(JOptionPane.showInputDialog("Enter the fourth value : ")).intValue();
      String name5 = JOptionPane.showInputDialog("Enter the name of fifth field : ");
      int x5 = new Integer(JOptionPane.showInputDialog("Enter the fifth value : ")).intValue();
      String name6 = JOptionPane.showInputDialog("Enter the name of sixth field : ");
      int x6 = new Integer(JOptionPane.showInputDialog("Enter the sixth value : ")).intValue();
     
      Writer writer = new Writer();
      writer.setAxes(20, 20, "Total", 500);
      writer.setBar1(name1+ " = " + x1, x1 * s, Color.orange);
      writer.setBar2(name2+ " = " + x2, x2 * s, Color.black);
      writer.setBar3(name3+ " = " + x3, x3 * s, Color.yellow);
      writer.setBar4(name4+ " = " + x4, x4 * s, Color.green);
      writer.setBar5(name5+ " = " + x5, x5 * s, Color.blue);
      writer.setBar6(name6+ " = " + x6, x6 * s, Color.gray);
   }
}