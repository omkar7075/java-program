
import java.awt.*;
class GridLayoutExample3() extends Frame{

GridLayoutExample3(){
label lb1Name=new label("Name");
TextField txtNames=new TextField(10);
label lb1Comments=new label("Comment");
TextArea TAreaComments=new TextArea(6,15);
Button btnSubmit=new Button("Submit");
setLayout(new GridBagLayout());

GridBagConstraints gc=new GridBagConstraints();
add(lb1Name,gc,0,0,1,1,0,0);
add(txtComments,gc,1,0,1,1,0,20);
add(lb1Comments,gc,0,1,1,1,1,0,0);
add(TAreaComments,gc,1,1,1,1,0,60);
add(btnSubmit,gc,0,2,2,1,0,20);
}
void add(component comp,GridBagConstraints gc,int x,int y,int w,int h,int wx,int wy){
gc.gridx=x;
gc.gridy=y;
gc.gridwidth=w;
gc.gridheight=h;
gc.weightx=wx;
gc.weighty=wx;
add(comp.gc);
}
}