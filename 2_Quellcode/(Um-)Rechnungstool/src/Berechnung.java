import java.util.HashMap;

public class Berechnung extends Front {

	// HashMap
	public void Umrechnung() {

		HashMap<String, Double> Rechnung = new HashMap<>();

		Rechnung.put("mm", 0.001);
		Rechnung.put("cm", 0.01);
		Rechnung.put("m", 1.0);
		Rechnung.put("km", 1000.0);

		Rechnung.put("inch", 39.37);
		Rechnung.put("fuß", 3.281);
		Rechnung.put("yard", 1.094);
		Rechnung.put("mile", 0.00062150403);

		Rechnung.put("mm^2", 0.00001);
		Rechnung.put("cm^2", 0.0001);
		Rechnung.put("m^2", 1.0);
		Rechnung.put("km^2", 10000000.0);

		Rechnung.put("inch^2", 1550.0);
		Rechnung.put("fuß^2", 10.764);
		Rechnung.put("yard^2", 1.196);
		Rechnung.put("mile^2", 0.00000259);

		Rechnung.put("mg", 0.000001);
		Rechnung.put("g", 0.001);
		Rechnung.put("kg", 1.0);

		Rechnung.put("Stone", 0.15748031496);
		Rechnung.put("Pfund", 2.205);
		Rechnung.put("Unze", 35.274);

// if bedingung für Länge 

	if (Rechnung.get == "mm" || Rechnung.get == "cm" || Rechnung.get == "m" || Rechnung.get == "km") { 
		double lu = (l * Rechnung.get("cm")) * Rechnung.get("yards"); // in die Klammern muss der vom User gewählte
		System.out.println(l + " " + Rechnung.keySet() + "sind " + lu + " " + Rechnung.get("value4"));
		} 
	
	else if (Rechnung.get == "mm^2" || Rechnung.get == "cm^2" || Rechnung.get == "m^2"|| Rechnung.get == "km^2") { 
		double fu = (f * Rechnung.get("cm^2")) * Rechnung.get("yards^2"); // in die Klammern muss der vom User
		System.out.println(f + " " + Rechnung.keySet() + "sind " + fu + " " + Rechnung.get("value4")); 
		} 
	
	else { 
		double gu = (g * Rechnung.get("kg")) * Rechnung.get("Pfund"); // in die Klammern muss der vom User
		System.out.println(g + " " + Rechnung.keySet() + "sind " + gu + " " + Rechnung.get("value4")); } }

public static void main(String[] args) {
	Berechnung Berechnung = new Berechnung();
	Berechnung.Umrechnung();

}
}

