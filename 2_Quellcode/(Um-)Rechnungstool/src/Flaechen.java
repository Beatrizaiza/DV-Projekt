
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
	/**
	 * calculates the area of a circle to a chosen radius
	 * @param r 
	 * r radius 
	 * @return
	 */
	public static double circArea(double r)
	{
		return Math.PI*r*r;
		
	}
	
	/**
	 * calculates a circle sector for chosen radius and central angle 
	 * @param r
	 * r radius
	 * @param alpha
	 * alpha is the central angle
	 * @return
	 */
	public static double sectorCircArea(double r, double alpha) // Circular sector = Kreissektor =  Kreisausschnitt
	{
		double alphaRad = Math.toRadians(alpha);
		return 0.5*Math.pow(r, 2)*alphaRad;
	}
	
	/**
	 * 
	 * @param h
	 * @return
	 */
	public static double squareArea(double h) // yes I'm calling it h...it doesn't matter
	{
		return h*h;
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





	
