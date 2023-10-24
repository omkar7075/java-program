class mobile{
	String company_name;
	int screen_size;
	void getdata(String n,int s){
	company_name=n;
	screen_size=s;
	}
	void display(){
	System.out.println("Details of mobile");
	System.out.println("company name:"+company_name+ 
		"\t screen size:"+screen_size);
	}
	public static void main(String args[]){
	mobile m=new mobile();
	m.getdata("redmi note",7);
	m.display();
	}
}