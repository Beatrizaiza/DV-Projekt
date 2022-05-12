import java.util.HashMap;
public class Berechnung extends Front {

	//HashMap
	public void Umrechnung (){

		HashMap<String,Double> Rechnung = new HashMap<>();

		Rechnung.put("mm",1000.0);
		Rechnung.put("cm",100.0);
		Rechnung.put("m",1.0);
		Rechnung.put("km",0.001);

		Rechnung.put("zoll",39.37);
		Rechnung.put("fuß",3.281);
		Rechnung.put("yard",1.094);
		Rechnung.put("mile",1.609);
	}

	//Wertübergabe und Berechnung
	double l;

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public static double length(double l) {
		double lu = l * Rechnung.get() * l*Rechnung.get(); 		//in die Klammern muss der  vom User gewählte key 

	}
}
