class Box
{
int h,w,d;
Box()
{
h=w=d=10;
}
}

class BoxDefault
{
public static void main(String args[])
{
Box myBox1 = new Box();
System.out.println(" h : "+myBox1.h);
System.out.println(" w : "+myBox1.w);
System.out.println(" d : "+myBox1.d);
}
}