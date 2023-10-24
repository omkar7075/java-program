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