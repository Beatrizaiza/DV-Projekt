
public class Flaechen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Flaechen.rectArea(4.4, 2.1);
        Flaechen.squareArea(4.1);
        Flaechen.circArea(3.2);
        Flaechen.triangleArea(2, 1.4);
       
	}
	
	// Areas user might need to compute:
	public static double rectArea(double w, double h)
	{
		return w*h;
	}
	
	public static double circArea(double r)
	{
		return Math.PI*r*r;
	}
	
	public static double sectorCircArea(double r, double alpha) // Circular sector = Kreissektor =  Kreisausschnitt
	{
		double alphaRad = Math.toRadians(alpha);
		return 0.5*Math.pow(r, 2)*alphaRad;
	}
	
	public static double squareArea(double h) // yes I'm calling it h...it doesn't matter
	{
		return h*h;
	}
	
	public static double parallelogArea(double a, double b, double alpha) // Parallelogram Area - put a diagram so user knows what is 
	{																		// meant with the a, b and alpha 
		double inRadians = Math.toRadians(alpha); // transform degree to radiant Java's uses radiant for sine calculation 
		return a*b*Math.sin(inRadians);
	}
		
	public static double triangleArea(double b, double h) 
	{
		return (b*h)/2;
	}
	
	public static double equilatTriaArea(double b)  // Equilateral triangle = gleichseitiges Dreieck
	{
		return (Math.sqrt(3)/4)*Math.pow(b,2);
	}
	
}





	
