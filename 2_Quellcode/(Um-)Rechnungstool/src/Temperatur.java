
public class Temperatur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c; //Celcius
		double f; //Fahrenheit
		double k; //Kelvin
	}

	public static double C2f(double c) 
	{
		return c*1.8+32;
	}
	public static double F2c(double f) 
	{
		return (f-32)/1.8;
	}
	public static double K2c(double k) 
	{
		return k-273.15;
	}
	public static double C2k(double c) 
	{
		return c+273.15;
	}
	public static double K2f(double k) 
	{
		return (k*1.8)-459.67;
	}
	public static double F2k(double f) 
	{
		return (f+459.67)/1.8;
	}
}
