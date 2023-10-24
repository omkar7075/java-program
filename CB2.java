


import javax.swing.*;
public class CB2{
CB2(){
JFrame f= new JFrame();
String s[]={"maharashtra","punjab","gujrat","tamilnadu"};
JComboBox cb=new JComboBox(s);
cb.setBounds(50,50,90,20);
f.add(cb);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String args[]){
new  CB2();

}
}