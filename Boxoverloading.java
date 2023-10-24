
class Box
{
double h,w,d;
public Box(double a)
{
h=w=d=a;
}

public Box(double a, double b, double c)
{
h=a;
w=b;
d=c;
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

class BoxOverloading
{
public static void main(String args[])
{
Box myBox1 = new Box(2,3,4);
Box myBox2 = new Box(5);
System.out.println(" Volume of myBox1 : ");
myBox1.volume();
System.out.println(" Volume of myBox2 : ");
myBox2.volume();
}
}