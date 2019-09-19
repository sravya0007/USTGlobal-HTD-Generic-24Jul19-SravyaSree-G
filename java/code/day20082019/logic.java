class logic 
{
	public static void main(String[] args) 
	{
		boolean b=true;
		boolean a=false;
		boolean c=!b;
		System.out.println("!b "+c);
		boolean d=b&&b;
		System.out.println("b&&b "+ d);
		boolean e=b||b;
		System.out.println("b||b "+ e);
		boolean f=a&&b;
		System.out.println("a&&b "+ f);
		boolean g=a||b;
		System.out.println("a||b "+ g);


	}
}
