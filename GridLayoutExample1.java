import java.awt.*;    
import javax.swing.*;    

public class GridLayoutExample1  
{    

Frame frameObj;    

GridLayoutExample1()
{    
frameObj = new Frame();    

Button btn1 = new Button("1");    
Button btn2 = new Button("2");    
Button btn3 = new Button("3");    
Button btn4 = new Button("4");    
Button btn5 = new Button("5");    

frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);  
frameObj.add(btn4); frameObj.add(btn5);    

// a 3 * 2 grid is created with the horizontal gap 20   
// and vertical gap 25  
frameObj.setLayout(new GridLayout(3, 2, 20, 25));    
frameObj.setSize(300, 300);    
frameObj.setVisible(true);    
}  


public static void main(String argvs[])   
{    
new GridLayoutExample1();    
}    
}    
