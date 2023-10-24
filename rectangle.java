import java.util.Scanner;
class rectangle{
	int len,width,area;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length & witdh:");
    len=sc.nextInt();
    width=sc.nextInt();
	}
	void display(){
	area=len*width;
	System.out.println("area of rectangle is" +area);
	}
	public static void main(String args[]){
	rectangle r=new rectangle();
	r.getdata();
	r.display();
	}
}