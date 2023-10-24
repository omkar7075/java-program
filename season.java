import java.awt.*;
import java.applet.*;
/* <applet code="season" width=500 height=500 > </applet>  */
public class season extends Applet{
public void init(){
List l1=new List(10,true);
l1.setBounds(50,60,100,120);
l1.add("summer");
l1.add("winter");
l1.add("rainy");

add(l1);

setLayout(null);

}
}

