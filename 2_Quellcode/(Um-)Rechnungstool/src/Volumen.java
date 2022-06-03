/**
 * 
 * @author leonwelker
 * In der Klassse "Volumen" wird basierend auf den eingegeben Werten (r,l,h,b) das entsprechende Volumen berechnet.
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
 * @return Das erechnete Pyramiden Volumen
 */
	public static double pyramidVolume(double l, double h) //Pyramide
	{
		return ((1.0/3.0) * Math.pow(l, 2) * h);
	}

	/**
	 * 
	 * @param l (laenge)
	 * @return Das erechnete Würfel Volumen
	 */
	public static double cubeVolume(double l) //Wuerfel
	{
		return l*l*l;
	}
/**
 * 
 * @param r (radius)
 * @return Das erechnete Kugel Volumen
 */
	public static double sphereVolume(double r) //Kugel
	{
		return ((4.0/3.0) * Math.PI * Math.pow(r,  3));
	}
/**
 * 
 * @param r (radius)
 * @param h (hoehe)
 * @return Das erechnete Zylinder Volumen
 */
	public static double cylinderVolume(double r, double h) //Zylinder
	{
		return (Math.PI * Math.pow(r,  2)*h);
	}
/**
 * 
 * @param r (radius)
 * @param h (hoehe)
 * @return Das erechnete Kegel Volumen
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
 * @return Das erechnete Quader Volumen
 */
	public static double squareVolume(double l, double b, double h) //Quader
	{
		return (l*b*h);
	}


}


