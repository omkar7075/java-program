






import java.awt.*;
public class choiceexample1{
choiceexample1(){
Frame f =new Frame();
Choice c=new Choice();
c.setBounds(100,100,75,75);

c.add( "maths");
c.add("physics" );
c.add("chemistry" );
c.add("c++" );
c.add("java");

f.add(c);

f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}






public static void main(String args[]){
new choiceexample1();

}
}

