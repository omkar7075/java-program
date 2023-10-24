
//prg1



import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;

import java.awt.*;
class lan{
lan(){
Frame f=new Frame();
Label l1=new Label("select known language");
l1.setBounds(100,50,250,50);
f.add(l1);

Checkbox c1=new Checkbox("marathi");
c1.setBounds(100,100,150,50);
f.add(c1);

Checkbox c2=new Checkbox("hindi");
c2.setBounds(100,150,50,50);
f.add(c2);

Checkbox c3=new Checkbox("english");
c3.setBounds(100,200,80,50);
f.add(c3);

Checkbox c4=new Checkbox("sanskrit");
c4.setBounds(100,250,80,50);
f.add(c4);

f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[]){
new lan();
}
}

/*
//prg2



import java.awt.*;
class button{
	
button()
{
Frame f=new Frame();

Button b1=new Button("ok");
b1.setBounds(100,100,80,50);
f.add(b1);

Button b2=new Button("cancel");
b2.setBounds(100,150,80,50);
f.add(b2);

Button b3=new Button("reset");
b3.setBounds(100,200,80,50);
f.add(b3);


f.setSize(500,500);
f.setLayout(null);
f.setVisible(true);

}

public static void main(String args[])
{
new button();
}
}

//prg3


import java.awt.*;
public class awtexample1 extends Frame{
awtexample1(){
Button b=new Button("click me");
 b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main (String args[])
{
awtexample1 f=new awtexample1();
}
}


*/
