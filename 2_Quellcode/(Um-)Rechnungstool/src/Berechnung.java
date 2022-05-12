import java.util.HashMap;

public class Berechnung extends Front {

	// HashMap
	public void Umrechnung() {

		HashMap<String, Double> Rechnung = new HashMap<>();

		Rechnung.put("mm", 1000.0);
		Rechnung.put("cm", 100.0);
		Rechnung.put("m", 1.0);
		Rechnung.put("km", 0.001);

		Rechnung.put("zoll", 39.37);
		Rechnung.put("fuß", 3.281);
		Rechnung.put("yard", 1.094);
		Rechnung.put("mile", 1.609);

		double lu = (l * Rechnung.get("cm")) * Rechnung.get("zoll"); // in die Klammern muss der vom User gewählte key

		System.out.println(l + " " + Rechnung.keySet() + "sind " + lu + " " + Rechnung.get("value4")); //WIE KEYWERT AUFRUFEN? ALSO CM STATT 100

	

	
	if (Rechnung.get == "cm" || "" //IMMER IMMER MIT RECHNUNG GET 
	}

	public static void main(String[] args) {
		Berechnung Berechnung = new Berechnung();
		Berechnung.Umrechnung();
	}
}
