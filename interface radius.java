interface newshape{
	void draw( );
}

interface circle extends newshape
{
	void getradius( );
	int radius=10;
}

class newcircle implements circle 
{
	public void getradius( )
	{
		system.out.println("radius");
	}
}

class extends interface extends newcircle
{
	public static void main (strings args[])
	{
		circle nc=new newcircle( );
		nc.getradius( );
	}
}