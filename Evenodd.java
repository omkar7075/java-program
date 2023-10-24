
class EvenOdd
{
public static void main(String args[])
{
java.util.Scanner sc = new java.util.Scanner(System.in);

System.out.println("Enter a: ");
int a= sc.nextInt();
if(a%2==0)
	System.out.println(a + " is even number..");
else
	System.out.println(a + " is odd number..");
}//main()
}//EvenOdd