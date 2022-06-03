
public class Flaechen {
	
	public static void main(String[] args) {

		Flaechen.rectArea(4.4, 2.1);
		Flaechen.squareArea(4.1);
		Flaechen.circArea(3.2);
		Flaechen.triangleArea(2, 1.4);

}


	// Areas user might need to compute:
	/**
	 * Berechnet den Flaecheninhalt des Rechtecks für die gewaehlte Basis und Hoehe
	 * @param b
	 * Basislaenge b 
	 * @param h
	 * Hoehe h
	 * @return
	 */
	public static double rectArea(double b, double h)
	{
		return b*h;
	}
	/**
	 * Berechnet die Flaeche eines Kreises mit einem gewaehlten Radius
	 * @param r 
	 * r Radius 
	 * @return
	 */
	public static double circArea(double r)
	{
		return Math.PI*r*r;
		
	}
	
	/**
	 * Berechnet einen Kreissektor für den gewaehlten Radius und den Mittelpunktswinkel 
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
	 * Berechnet den Flaecheninhalt des Quadrats fuer eine bestimmte Laenge 
	 * @param l
	 * Seitenlaenge l
	 * @return
	 */
	public static double squareArea(double l)
	{
		return l*l;
	}
	
	/**
	 * Berechnet den Flaecheninhalt des Dreiecks für die gewaehlte Basis und Hoehe
	 * @param b
	 * Basislaenge b 
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
	 * Seitenlaenge b
	 * @return
	 */
	public static double equilatTriaArea(double b)  // Equilateral triangle = gleichseitiges Dreieck
	{
		return (Math.sqrt(3)/4)*Math.pow(b,2);
	}
	
}





	
