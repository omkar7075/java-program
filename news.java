

import java.awt.*;
import java.applet.*;
/* <applet code="news" width=500 height=500 > </applet>  */
public class news extends Applet{
public void init(){
List l1=new List(10,true);
l1.setBounds(50,60,100,120);
l1.add("times of india");
l1.add("sakal");
l1.add("lokamt");
l1.add("gadgets 360");
add(l1);

setLayout(null);

}
}

