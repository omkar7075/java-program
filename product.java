
class product{
	int id,price;
	String name;
	void getdata(int i,String n,int p){
	id=i;
	name=n;
	price=p;
	System.out.println("Details of object:");
	System.out.println("Id="+id +"\tName="+name +
		"\t Price="+price);
	}
	void display(int a,int b){
    int total=a+b;
    System.out.println("Total price is" +total);
	}

	public static void  main(String args[]){
	product p1=new product();
	p1.getdata(65,"Books",300);
	product p2=new product();
	p2.getdata(25,"Pencil",100);
	p1.display(p1.price,p2.price);

	}

}