
class MyException extends Exception

{

MyException(String msg)

{

super(msg);

}

}

class Demo

{

public static void main(String args[])

{

String password=“abc”;

String user_pass;

user_pass=args[0];

try

{

if(password.equals(user_pass))

{

Sytem.out.println(“correct password”);

}

else

{

MyException obj=new 

MyException(“authentication failure”);

throw obj;

}

}

catch (MyException m)

{

Sytem.out.println(m);

}

}


