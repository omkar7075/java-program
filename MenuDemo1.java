




import java.awt.*;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
public class MenuDemo1 extends Frame{
MenuBar mb;
MenuItem m1,m2,m3,m4;
Menu mn,mn1,mn2,mn3;
MenuShortcut ms;

MenuDemo1(){
ms=new MenuShortcut(ABORT);
mn=new Menu("file");
mb=new MenuBar();
setMenuBar(mb);

m1=new MenuItem("new...");

m2=new MenuItem("open...");

m3=new MenuItem("save as...");

m4=new MenuItem("exit",ms);
mn.add(m1);
mn.add(m2);
mn.add(m3);
mn.addSeparator();
mn.add(m4);
mb.add(mn);

mn1=new Menu("edit");

mn2=new Menu("view");

mn3=new Menu("create");

mb.add(mn1);

mb.add(mn2);

mb.add(mn3);
}

private void Event() {
	// TODO Auto-generated method stub
	
}

public static void main (String args[]){
MenuDemo1 md=new MenuDemo1();
md.setTitle("MenuBar Demo");
md.setSize(500,500);
md.setVisible(true);
}
}