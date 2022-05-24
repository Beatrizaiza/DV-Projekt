import java.util.HashMap;

public class Berechnung extends Einheitenumrechner {


	//Werte aus Einheitenrechner
	
	String einheite ="null";
	String einheita ="null";

	
	
	public String getEinheite() {
		return einheite;
	}
	public void setEinheite(String einheite) {
		this.einheite = einheite;
	}
	public String getEinheita() {
		return einheita;
	}
	public void setEinheita(String einheita) {
		this.einheita = einheita;
	}


	double eingwert = 0;

	public double getEingwert() {
		return eingwert;
	}
	public void setEingwert(double eingwert) {
		this.eingwert = eingwert;
	}

	public static HashMap<String, Double> Rechnung = new HashMap<>();

	public static void init()
	{
		Rechnung.put("mm", 0.001);
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
	}
		

	
	// HashMap
	public static double Umrechner(double eingwert, String einheite, String einheita) {
		
					
		
		// if bedingung für Länge 
		//Einheitenumrechner.drop_eingeinheit

		//Versuch speichern der eingabeeinheit in variable Ee
		
		double Ee = 0;
		double Ea = 0;
		if (einheite.equals("Millimeter [mm]")){
			
			Ee = Rechnung.get("mm");
		}
		else if (einheite.equals("Zentimeter [cm]")){
			Ee = Rechnung.get("cm");
		}
		else if (einheite.equals("Dezimeter [dm]")){
			Ee = Rechnung.get("dm");
		}
		else if (einheite.equals("Meter [m]")){
			Ee = Rechnung.get("m");
		}
		else if (einheite.equals("Kilometer [km]")){
			Ee = Rechnung.get("km");
		}

		//Versuch speichern der ausgabeeinheit in variable Ea
		if (einheita.equals("zoll [in]")){
			Ea = Rechnung.get("zoll");
		}
		else if (einheita.equals(("fuß [ft]"))){
			Ea = Rechnung.get("fuß");
		}
		else if (einheita.equals(("yard [yd]"))){
			Ea = Rechnung.get("yard");
		}
		else if (einheita.equals("mile [mi]")){
			Ea = Rechnung.get("mile");
		}
		else if (einheita.equals("Millimeter [mm]")){
			
			Ea = Rechnung.get("mm");
		}
		else if (einheita.equals("Zentimeter [cm]")){
			Ea = Rechnung.get("cm");
		}
		else if (einheita.equals("Dezimeter [dm]")){
			Ea = Rechnung.get("dm");
		}
		else if (einheita.equals("Meter [m]")){
			Ea = Rechnung.get("m");
		}
		else if (einheita.equals("Kilometer [km]")){
			Ea = Rechnung.get("km");
		}
	
		
		double ausgwert = (eingwert * Ee) * Ea; 
		
		return ausgwert;
	}
	
}








