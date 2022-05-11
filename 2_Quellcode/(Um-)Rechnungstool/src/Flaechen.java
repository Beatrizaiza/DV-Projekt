
public class Flaechen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Flaechen.rectArea(4.4, 2.1);
        Flaechen.squareArea(4.1);
        Flaechen.circArea(3.2);
        Flaechen.triangleArea(2, 1.4);
       
	}
	
	// gonna do this for each the areas the user needs to compute
	public static double rectArea(double w, double h)
	{
		return w*h;
	}
	
	public static double circArea(double r)
	{
		return Math.PI*r*r;
	}
	
	public static double squareArea(double h) // yes I'm calling it h...it doesn't matter
	{
		return h*h;
	}
	
	public static double triangleArea(double b, double h) 
	{
		return (b*h)/2;
	}
	
}





	
