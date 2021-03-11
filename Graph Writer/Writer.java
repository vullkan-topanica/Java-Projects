import javax.swing.*;
import java.awt.*;
public class Writer extends JPanel
{ 
   private int x_axis,y_axis,y1,y2,y3,y4,y5,y6;
   private int value1,value2,value3,value4,value5,value6;
   private int distance1,distance2,distance3,distance4,distance5,distance6,finalDistance;
   private int wFrm = 800;
   private int hFrm = 600;  
   private String top_label = "";
   private String name1 = "";
   private String name2 = "";
   private String name3 = "";
   private String name4 = "";
   private String name5 = "";
   private String name6 = "";
   private Color  color1,color2,color3,color4,color5, color6;
   private String title;
   
   public Writer()
   {
      JFrame frm = new JFrame();
      frm.getContentPane().add(this);
      frm.setTitle(JOptionPane.showInputDialog("Enter the title of your graph:"));
      frm.setVisible(true);
      frm.setSize(wFrm,hFrm);
   }
   public void setAxes(int x_axis,int y_axis,String top_label,int finalDistance)
   { 
      this.x_axis = x_axis;
      this.y_axis = y_axis;
      this.top_label = top_label;
      this.finalDistance = finalDistance; 
   }
   public void setBar1(String name,int height,Color c)
   { 
      name1 = name;
      y1 = y_axis + finalDistance - height;
      distance1 = x_axis + 40;
      value1 = height;
      color1 = c;
   }  
   public void setBar2(String name,int height,Color c)
   { 
      name2 = name;
      y2 = y_axis + finalDistance - height;
      distance2 = distance1 + 120;
      value2 = height;
      color2 = c;
   }    
   public void setBar3(String name,int height,Color c)
   {
      name3 = name;
      y3 = y_axis + finalDistance - height;
      distance3 = distance2 + 120;
      value3 = height;
      color3 = c;
   }    
   public void setBar4(String name,int height,Color c)
   { 
      name4 = name;
      y4 = y_axis + finalDistance - height;
      distance4 = distance3 + 120;
      value4 = height;
      color4 = c;
   }  
   public void setBar5(String name,int height,Color c)
   {
      name5 = name;
      y5 = y_axis + finalDistance - height;
      distance5 = distance4 + 120;
      value5 = height;
      color5 = c;
   } 
   public void setBar6(String name,int height,Color c)
   { 
      name6 = name;
      y6 = y_axis + finalDistance - height;
      distance6 = distance5 + 120;
      value6 = height;
      color6 = c;
   }  
   public void paintComponent(Graphics g)
   { 
      g.setColor(Color.white);
      g.fillRect(0,0,wFrm,hFrm);
      g.setColor(Color.red);
      g.drawLine(10,y_axis-10,10,520);
      g.drawLine(12,y_axis+finalDistance,760,y_axis+finalDistance);
      g.drawString("50",12,y_axis+finalDistance-100);
      g.drawString("100",12,y_axis+finalDistance-200);
      g.drawString("150",12,y_axis+finalDistance-300);
      g.drawString("200",12,y_axis+finalDistance-400);
      g.drawString("250",12,y_axis+finalDistance-500);
      g.drawString(top_label,0,y_axis+finalDistance+15);
      g.setColor(color1);
      g.fillRect(distance1,y1,80,value1);
      g.drawString(name1,distance1-5,y_axis+finalDistance+15); 
      g.setColor(color2);
      g.fillRect(distance2,y2,80,value2);
      g.drawString(name2,distance2-5,y_axis+finalDistance+15);
      g.setColor(color3);
      g.fillRect(distance3,y3,80, value3);
      g.drawString(name3,distance3-5,y_axis+finalDistance+15);
      g.setColor(color4);
      g.fillRect(distance4,y4,80,value4);
      g.drawString(name4,distance4-5,y_axis+finalDistance+15);
      g.setColor(color5);
      g.fillRect(distance5,y5,80,value5);
      g.drawString(name5,distance5-5,y_axis+finalDistance+15);
      g.setColor(color6);
      g.fillRect(distance6,y6,80,value6);
      g.drawString(name6,distance6-5,y_axis+finalDistance+15);
   } 
}