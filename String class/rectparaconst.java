


class Rectangle
{ 
int length; int breadth;
Rectangle(int l,int b)
{ 
length = l; breadth= b;
}
int area()
{
return (length * breadth);
} }
class ParameterizedConstructor
{
public static void main(String[] args)
{ Rectangle firstRect = new Rectangle(5,6);
Rectangle secondRect = new Rectangle(7,8);
System.out.println("Area of First Rectangle : " +firstRect.area());
System.out.println("Area of Second Rectangle : "+secondRect.area());
}
}
