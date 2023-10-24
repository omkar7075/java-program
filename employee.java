import java.util.Scanner;
class employee{
	int empid,basic_salary;
	String name;
	float total,da,hra;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee id:");
	empid=sc.nextInt();
	System.out.println("enter name:");
    name=sc.next();
	System.out.println("enter basic salary:");
	basic_salary=sc.nextInt();
	}

	void display(){
	da=(10*basic_salary)/100;
	hra=(20*basic_salary)/100;
	total=basic_salary+da+hra;
	System.out.println("Id:"+empid+"\t Name:"+name+"\t Basic salary:"+basic_salary+"\t Total Salary:"+total);
	}
	public static void main(String args[]){
    employee emp1=new employee();
    emp1.getdata();
    emp1.display();
    employee emp2=new employee();
    emp2.getdata();
    emp2.display();
	}
}