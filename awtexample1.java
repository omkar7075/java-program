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