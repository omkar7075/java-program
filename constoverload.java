


import java.lang.*;
import java.io.*;
class Room
{
int length,breadth,height;
Room(int l,int b,int h) //parameterized constructor
{
length=l;
breadth=b;
height=h;
}
Room(int len) //constructor overloading
{
length=breadth=height=len;
}
}
int volume( )
{
return length*breadth*height;
}
class OverloadConstructor
{
public static void main(String args[])
{
Room a=new Room(20,30,40);
Room b=new Room(10);
int vol;
vol=a.volume( );
System.out.println("Volume of room a is " + vol);
vol=b.volume( );
System.out.println("Volume of room b is " + vol);
}
}