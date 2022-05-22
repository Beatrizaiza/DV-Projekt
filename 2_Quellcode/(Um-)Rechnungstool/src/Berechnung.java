import java.util.HashMap;

public class Berechnung extends Einheitenumrechner {


	//Werte aus Einheitenrechner
	String einheite ="null";
	String einheita ="null";

	

	double eingwert = 0;

	public double getEingwert() {
		return eingwert;
	}
	public void setEingwert(double eingwert) {
		this.eingwert = eingwert;
	}

	
	
	// HashMap
	public void Umrechnung() {

		HashMap<String, Double> Rechnung = new HashMap<>();

		Rechnung.put("Millimeter [mm]", 0.001);
		Rechnung.put("cm", 0.01);
		Rechnung.put("dm", 0.1);
		Rechnung.put("m", 1.0);
		Rechnung.put("km", 1000.0);

		Rechnung.put("zoll", 39.37);
		Rechnung.put("fuß", 3.281);
		Rechnung.put("yard", 1.094);
		Rechnung.put("mile", 0.00062150403);

		Rechnung.put("mm^2", 0.00001);
		Rechnung.put("cm^2", 0.0001);
		Rechnung.put("dm^2", 0.01);
		Rechnung.put("m^2", 1.0);
		Rechnung.put("km^2", 10000000.0);

		Rechnung.put("zoll^2", 1550.0);
		Rechnung.put("fuß^2", 10.764);
		Rechnung.put("yard^2", 1.196);
		Rechnung.put("mile^2", 0.00000259);

		Rechnung.put("mg", 0.000001);
		Rechnung.put("g", 0.001);
		Rechnung.put("kg", 1.0);
		Rechnung.put("Tonne", 1000.0);

		Rechnung.put("Stone", 0.15748031496);
		Rechnung.put("Pfund", 2.205);
		Rechnung.put("Unze", 35.274);








		// if bedingung für Länge 
		//Einheitenumrechner.drop_eingeinheit

		//Versuch speichern der eingabeeinheit in variable Ee
		if (einheite.equals("Millimeter [mm]")){
			double Ee = 0;
			Ee = Rechnung.get("mm");
		}
		else if (einheite.equals("Zentimeter [cm]")){
			double Ee;
			Ee = Rechnung.get("cm");
		}
		else if (einheite.equals("Dezimeter [dm]")){
			double Ee;
			Ee = Rechnung.get("dm");
		}
		else if (einheite.equals("Meter [m]")){
			double Ee;
			Ee = Rechnung.get("m");
		}
		else if (einheite.equals("Kilometer [km]")){
			double Ee;
			Ee = Rechnung.get("km");
		}

		//Versuch speichern der ausgabeeinheit in variable Ea
		if (einheita.equals("zoll [in]")){
			double Ea;
			Ea = Rechnung.get("zoll");
		}
		else if (einheita.equals(Rechnung.get("fuß [ft]"))){
			double Ea;
			Ea = Rechnung.get("fuß");
		}
		else if (einheita.equals(Rechnung.get("yard [yd]"))){
			double Ea;
			Ea = Rechnung.get("yard");
		}
		else if (einheita.equals(Rechnung.get("mile [mi]"))){
			double Ea;
			Ea = Rechnung.get("mile");
		}}
		
		
	public double Umrechner(double eingwert, double Ee,double Ea) {
		double ausgwert = (eingwert * Ee) * Ea; // in die Klammern muss der vom User gewählte
		return ausgwert;

	}}
//eingwert = eingwert * Rechnung.get("km");


//if(drop_ausgeinheit.getSelectedItem().equals("mile [mi]"))
//{
//	ausgwert = eingwert* Rechnung.get("mile");
//	
//}

//if else(drop_ausgeinheit.getSelectedItem().equals("yard [yd]")) {
//	ausgwert = eingwert* Rechnung.get("yard");
//}



//	if (Rechnung.get == "mm" || Rechnung.get == "cm" || Rechnung.get == "dm" ||Rechnung.get == "m" || Rechnung.get == "km") { 
//	double lu = (l * Rechnung.get("??")) * Rechnung.get("??"); // in die Klammern muss der vom User gewählte
//	System.out.println(l + " " + Rechnung.keySet() + "sind " + lu + " " + Rechnung.get("value4"));
//	} 








