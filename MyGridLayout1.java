import java.awt.*;    
import javax.swing.*;    
public class MyGridLayout1{    
Frame f;    
MyGridLayout1(){    
    f=new Frame();    
    Button b1=new Button("1");    
Button b2=new Button("2");    
    Button b3=new Button("3");    
    Button b4=new Button("4");    
    Button b5=new Button("5");    
    Button b6=new Button("6");    
    Button b7=new Button("7");    
    Button b8=new Button("8");    
Button b9=new Button("9"); 
Button b10=new Button("10");
Button b11=new Button("11");
Button b12=new Button("12");
Button b13=new Button("13");
Button b14=new Button("14");
Button b15=new Button("15");
Button b16=new Button("16");
Button b17=new Button("17");
Button b18=new Button("18");
Button b19=new Button("19");   
Button b20=new Button("20");
Button b21=new Button("21");
Button b22=new Button("22");
Button b23=new Button("23");
Button b24=new Button("24");
Button b25=new Button("25");
     // adding buttons to the frame       
f.add(b1); f.add(b2); f.add(b3);  
f.add(b4); f.add(b5); f.add(b6);  
f.add(b7); f.add(b8); f.add(b9);    
f.add(b10);f.add(b11); f.add(b12); f.add(b13);  
f.add(b14); f.add(b15); f.add(b16);  
f.add(b17); f.add(b18); f.add(b19); f.add(b20); 
f.add(b21);   f.add(b22);   f.add(b23);   f.add(b24);   f.add(b25);     
    // setting grid layout of 3 rows and 3 columns    
f.setLayout(new GridLayout(5,5));    
f.setSize(300,300);    
f.setVisible(true);    
}    
public static void main(String[] args) {    
new MyGridLayout1();    
}    
}    

