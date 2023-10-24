





//menubar

import java.awt.*;
class MenuEx extends Frame {
MenuEx(){
MenuBar mr=new MenuBar();
setMenuBar(mr);
Menu m1=new Menu("colours");
MenuItem mn1=new MenuItem("red");
MenuItem mn2=new MenuItem("yellow");
MenuItem mn3=new MenuItem("black");
mn3.setEnabled(false);
MenuItem mn4=new MenuItem("blue");
MenuItem mn5=new MenuItem("green");
m1.add(mn1);
m1.add(mn2);
m1.add(mn3);
m1.add(mn4);
m1.add(mn5);
mr.add(m1);
}
}

class MenuBarEx{
public static void main(String []args){
MenuEx m=new MenuEx();
m.setTitle("Menu Bar");
m.setSize(500,500);
m.setVisible(true);
}
}