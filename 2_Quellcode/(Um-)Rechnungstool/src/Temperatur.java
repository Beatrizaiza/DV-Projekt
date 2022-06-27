/**
 * 
 * @author Leon Welker
 * @version 1.0
 * In der Klasse "Temperatur" werden aus den eingegebenen Temperaturwerten (c,f,k) die jeweils anderen Werte der anderen
 * Temperatureinheiten ausgerechnet 
 *
 */
public class Temperatur {

		double c; //Celcius
		double f; //Fahrenheit
		double k; //Kelvin
	
	/**
	 * C2f rechnet den eingegeben Wert in Celsius in Fahrenheit um 
	 * 
	 * @param c (Wert in Celsius)
	 * @return Der erechneten Wert in Fahrenheit
	 */
	public static double C2f(double c) 
	{
		return c*1.8+32;
	}

	/**
	 * F2c rechnet den eingegeben Wert in Fahrenheit in Celsius um  
	 * 
	 * @param f (Wert in Fahrenheit)
	 * @return Der erechneten Wert in Celsius
	 * 
	 */
	public static double F2c(double f) 
	{
		return (f-32)/1.8;
	}
	
	/**
	 * K2c rechnet den eingegeben Wert in Kelvin in Celsius um 
	 * 
	 * @param k (Wert in Kelvin)
	 * @return Der erechneten Wert in Celsius
	 */
	public static double K2c(double k) 
	{
		return k-273.15;
	}
	
	/**
	 * K2c rechnet den eingegeben Wert in Celsius in Kelvin um 
	 * 
	 * @param c (Wert in Celsius)
	 * @return Der erechneten Wert in Kelvin
	 */
	public static double C2k(double c) 
	{
		return c+273.15;
	}
	
	/**
	 * K2f rechnet den eingegeben Wert in Kelvin in Fahrenheit um 
	 * 
	 * @param k (Wert in Kelvin)
	 * @return Der erechneten Wert in Fahrenheit
	 */
	public static double K2f(double k) 
	{
		return (k*1.8)-459.67;
	}
	
	/**
	 * F2k rechnet den eingegeben Wert in Fahrenheit in Kelvin um 
	 * 
	 * @param f (Wert in Fahrenheit)
	 * @return Der erechneten Wert in Kelvin
	 */
	public static double F2k(double f) 
	{
		return (f+459.67)/1.8;
	}
}
