/**
 * 
 * @author Leon Welker
 * In der Klassse "Volumen" wird basierend auf 
 * den eingegebenen Werten (r,l,h,b) das entsprechende Volumen berechnet (Darstellung in Volumenrechner).
 */
public class Volumen {


	double r; //radius
	double l; //laenge
	double h; //hoehe
	double b; //breite

/**
 * 
 * @param l (laenge)
 * @param h (hoehe)
 * @return Das errechnete Pyramiden-Volumen
 */
	public static double pyramidVolume(double l, double h) //Pyramide
	{
		return ((1.0/3.0) * Math.pow(l, 2) * h);
	}

	/**
	 * 
	 * @param l (laenge)
	 * @return Das errechnete Wuerfel-Volumen
	 */
	public static double cubeVolume(double l) //Wuerfel
	{
		return l*l*l;
	}
/**
 * 
 * @param r (radius)
 * @return Das errechnete Kugel-Volumen
 */
	public static double sphereVolume(double r) //Kugel
	{
		return ((4.0/3.0) * Math.PI * Math.pow(r,  3));
	}
/**
 * 
 * @param r (radius)
 * @param h (hoehe)
 * @return Das errechnete Zylinder-Volumen
 */
	public static double cylinderVolume(double r, double h) //Zylinder
	{
		return (Math.PI * Math.pow(r,  2)*h);
	}
/**
 * 
 * @param r (radius)
 * @param h (hoehe)
 * @return Das errechnete Kegel-Volumen
 */
	public static double coneVolume(double r, double h) //Kegel
	{
		return (h * Math.pow(r, 2) * Math.PI/3);
	}
/**
 * 
 * @param l (laenge)
 * @param b (breite)
 * @param h (hoehe)
 * @return Das errechnete Quader-Volumen
 */
	public static double squareVolume(double l, double b, double h) //Quader
	{
		return (l*b*h);
	}


}


