
package system;

	interface pet
	{
		public void test( );
	}
		class dog implements pet
		{
		public void test( )
		{
			system.out.println("interface method implemented");
		}
	public static void main(String[] args) 
	{
		pet p=new dog( );
		p.test( );
	}
}
	