
import java.util.Scanner;
class student{
	int rollno,m1,m2,total;
	String name;
	float per;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno:");
	rollno=sc.nextInt();
	System.out.println("enter name:");
	name=sc.next();
	System.out.println("enter marks of two subject:");
	m1=sc.nextInt();
	m2=sc.nextInt();
	}
	void display(){
	total=m1+m2;
	per=(total*100)/200;
	System.out.println("Roll no:"+rollno+"\tName:"+name+"\t Percent"+per);

	}
	public static void main(String args[]){
	student s=new student();
	s.getdata();
	s.display();
	}
}