/**
 * 
 * @author Sophi
 * @version 1.1
 *
 */
public class Flaechen {
	
	public Flaechen () {

		Flaechen.rectArea(4.4, 2.1);
		Flaechen.squareArea(4.1);
		Flaechen.circArea(3.2);
		Flaechen.triangleArea(2, 1.4);

}


	// Areas user might need to compute:
	/**
	 * Berechnet den Flaecheninhalt des Rechtecks fuer die 
	 * gewaehlte Basis und Hoehe
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
	 * @param r Radius 
	 * @return Flaechen Inhalt Kreis
	 */
	public static double circArea(double r)
	{
		return Math.PI*r*r;
		
	}
	
	/**
	 * Berechnet einen Kreissektor fuer den gewaehlten Radius und den Mittelpunktswinkel 
	 * @param r Radius
	 * @param alpha ist der Mittelpunktswinkel
	 * @return Kreissektor fuer den gewaehlten Radius und den Mittelpunktswinkel
	 */
	public static double sectorCircArea(double r, double alpha) // Circular sector = Kreissektor =  Kreisausschnitt
	{
		double alphaRad = Math.toRadians(alpha);
		return 0.5*Math.pow(r, 2)*alphaRad;
	}
	
	/**
	 * Berechnet den Flaecheninhalt des Quadrats fuer eine bestimmte Laenge 
	 * @param l Seitenlaenge
	 * @return Flaeche Quadrat
	 */
	public static double squareArea(double l)
	{
		return l*l;
	}
	
	/**
	 * Berechnet den Flaecheninhalt des Dreiecks für die gewaehlte Basis und Hoehe
	 * @param b Basislaenge
	 * @param h Hoehe
	 * @return Flaecheninhalt Dreieck
	 */
	public static double triangleArea(double b, double h) 
	{
		return (b*h)/2;
	}
	/**
	 * Berechnet den Flaecheninhalt eines gleichseitigen Dreiecks
	 *d. h. ein Dreieck, bei dem alle drei Seiten gleich lang sind
	 * @param b Seitenlaenge
	 * @return Flaecheninhalt gleichseitigen Dreieck
	 */
	public static double equilatTriaArea(double b)  // Equilateral triangle = gleichseitiges Dreieck
	{
		return (Math.sqrt(3)/4)*Math.pow(b,2);
	}
	
}
