
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
	 * Berechnet die Flaeche eines Kreises mit einem gew�hlten Radius
	 * @param r 
	 * r Radius 
	 * @return
	 */
	public static double circArea(double r)
	{
		return Math.PI*r*r;
		
	}
	
	/**
	 * Berechnet einen Kreissektor f�r den gew�hlten Radius und den Mittelpunktswinkel 
	 * @param r
	 * r Radius
	 * @param alpha
	 * alpha ist der Mittelpunktswinkel
	 * @return
	 */
	public static double sectorCircArea(double r, double alpha) // Circular sector = Kreissektor =  Kreisausschnitt
	{
		double alphaRad = Math.toRadians(alpha);
		return 0.5*Math.pow(r, 2)*alphaRad;
	}
	
	/**
	 * Berechnet den Fl�cheninhalt des Quadrats f�r eine bestimmte L�nge 
	 * @param l
	 * Seitenl�nge l
	 * @return
	 */
	public static double squareArea(double l)
	{
		return l*l;
	}
	
	/**
	 * Berechnet den Flaecheninhalt des Dreiecks f�r die gewaehlte Basis und Hoehe
	 * @param b
	 * Basisl�nge b 
	 * @param h
	 * Hoehe h 
	 * @return
	 */
	public static double triangleArea(double b, double h) 
	{
		return (b*h)/2;
	}
	/**
	 * Berechnet den Flaecheninhalt eines gleichseitigen Dreiecks
	 *d. h. ein Dreieck, bei dem alle drei Seiten gleich lang sind
	 * @param b
	 * Seitenl�nge b
	 * @return
	 */
	public static double equilatTriaArea(double b)  // Equilateral triangle = gleichseitiges Dreieck
	{
		return (Math.sqrt(3)/4)*Math.pow(b,2);
	}
	
}





	
