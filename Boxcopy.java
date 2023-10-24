class Box
{
double h,w,d;
public Box(double a)
{
h=w=d=a;
}

public Box(Box obj)
{
h=obj.h;
w=obj.w;
d=obj.d;
}
void volume()
{
double v=h*w*d;
System.out.println(" h : "+h);
System.out.println(" w : "+w);
System.out.println(" d : "+d);
System.out.println(" Volume : "+v);
}
}

class BoxCopy
{
public static void main(String args[])
{
Box myBox1 = new Box(5);
Box myBox2 = new Box(myBox1);
System.out.println(" Volume of myBox1 : ");
myBox1.volume();
System.out.println(" Volume of myBox2 : ");
myBox2.volume();
}
}