public class Volumen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r; //radius
		double l; //laenge
		double h; //hoehe
		
		
		
		
		
			
	}
	public static double pyramidVolume(double l, double h) //Pyramide
	{
		return ((1.0/3.0) * Math.pow(l, 2) * h);
	}

	public static double cubeVolume(double l) //Wuerfel
	{
		return l*l*l;
	}
		
	public static double sphereVolume(double r) //Kugel
	{
		return ((4.0/3.0) * Math.PI * Math.pow(r,  3));
	}
	
	public static double cylinderVolume(double r, double h) //Zylinder
	{
		return (Math.PI * Math.pow(r,  2)*h);
	}
	
	public static double coneVolume(double r, double h) //Kegel
	{
		return (h * Math.pow(r, 2) * Math.PI/3);
	}


}


