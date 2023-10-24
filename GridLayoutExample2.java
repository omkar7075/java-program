

import java.awt.*;
import javax.swing.*;
public class GridLayoutExample2 extends JFrame{
public static void main (strings args[]){
GridBagLayoutExample2 a=new GridBagLayoutExample2();
}

public GridBagLayoutExample2(){
GridBagLayout grid=new GridBagLayout();
GridBagConstraints gbc=new GridBagConstrainst();
setLayout(grid);
setTitle("GridBagLayoutExample2 ");
GridBagLayout layout=new GridBagLayout();

This.setLayout(layout);

gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;

This.add (new Button("Button One"),gbc);
gbc.gridx=1;
gbc.gridy=0;

This.add (new Button("Button Two"),gbc);
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.ipady=20;
gbc.gridx=0;
gbc.gridy=1;

This.add (new Button("Button Three"),gbc);
gbc.gridx=1;
gbc.gridy=1;

This.add (new Button("Button Four"),gbc);
gbc.gridx=0;
gbc.gridy=2;
gbc.fill=GridBagConstraints.HORIZONTAL;
gbc.gridwiedth=2

This.add (new Button("Button Five"),gbc);
setsize(300,200);
setPreferredsize(getsize());
setvisible(true);
setDefault(lose operation(EXIT_ON_CLOSE);
}


} 