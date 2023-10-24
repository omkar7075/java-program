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
