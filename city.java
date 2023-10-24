

 import java.awt.*;
import java.applet.*;
/* <applet code=city.class width=500 height=500 > </applet>*/
public class city extends Applet
{
public void init()
{
List city=new List(10);
city.add("pune");
city.add("mumbai");
city.add("nagpur");
city.add("aurangabad");
city.add("nashik");
city.add("solapur");
city.add("amarvati");
city.add("thane");
city.add("kolhapur");
add(city);

}

}