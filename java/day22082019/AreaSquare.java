public class AreaSquare{
	public static int calcArea(int side){
		int area=side*side;
		return area;
	}

	public static void main(String []args)
	{
		int a=calcArea(85);
		System.out.println("Area of square:" +a);
		double c=circle(18);
		System.out.println("Area of circle:" +c);
		double b=tri(7,9);
		
		System.out.println("Area of Triangle:" +b);
		int d=avg(10,21,41);
		
		System.out.println("Average :" +d);
		
		
	}
	public static double circle(double rad)
	{	//float pi=3.14;
		double area=3.14*rad*rad;
		return area;
	}
	public static double tri(int s,int t)
	{	//float c=0.5;
		double area=0.5*t*s;
		return area;
	}
	public static int avg(int p,int q,int u)
	{
		int av= (p+q+u)/3;
		return av;
	}
}