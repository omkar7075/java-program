


Class getChars
{
public static void main(String args[])
{
String str="helloworld";
Char buf[];
buf=new char[10];
str.getChars(0,5,buf,0);
System.out.println(buf);
}
}