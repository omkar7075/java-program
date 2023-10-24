




import java.awt.Frame;
import java.awt.GridLayout;

import java.awt.*;
public class mygridlayout extends Frame
{
public static void main(String args[])
{
Frame f=new Frame();
for(int i=0;i<=4;i++)
{
for( int j=0;j<=4;j++)
{
	
f.add(  new Button(" "));
}
}



f.setLayout(new GridLayout(5,5));
f.setSize(300,300);
f.setVisible(true);
}
}