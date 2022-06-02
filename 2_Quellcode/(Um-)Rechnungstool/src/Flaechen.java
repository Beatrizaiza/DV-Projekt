
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
	 * calculates the area of the square for a chosen length l
	 * @param l
	 * side length l
	 * @return
	 */
	public static double squareArea(double l)
	{
		return l*l;
	}
	
	/**
	 * calculates the area of the triangle for chosen base and height
	 * @param b
	 * base length b 
	 * @param h
	 * height h 
	 * @return
	 */
	public static double triangleArea(double b, double h) 
	{
		return (b*h)/2;
	}
	/**
	 * calculates the area of an equilateral triangle
	 * i.e. triangle in which all three sides have the same length
	 * @param b
	 * side length b
	 * @return
	 */
	public static double equilatTriaArea(double b)  // Equilateral triangle = gleichseitiges Dreieck
	{
		return (Math.sqrt(3)/4)*Math.pow(b,2);
	}
	
}





	
