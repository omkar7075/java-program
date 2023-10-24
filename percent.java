
import java.util.Scanner;
class percent{
public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of 5 subject:");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	int m4=sc.nextInt();
	int m5=sc.nextInt();
	int total=m1+m2+m3+m4+m5;
	float per=(total*100)/500;
	System.out.println("Percentage is"+per);
	
	}

}