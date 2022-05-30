import java.util.HashMap;

public class Berechnung extends Einheitenumrechner {


	//Werte aus Einheitenrechner
	String einheite ="null";
	String einheita ="null";
	double Ee = 0;
	double Ea = 0;

	//Get- und Set-Methoden zur Übergabe der Ein- und Ausgabeeinheiten aus der Klasse Einheitenumrechner
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

	// Get- und Set-Methode für den Eingabewert, wird = 0 gesetzt
	double eingwert = 0;

	public double getEingwert() {
		return eingwert;
	}
	public void setEingwert(double eingwert) {
		this.eingwert = eingwert;
	}

	//HashMap zum Speichern der Umrechnungsfaktoren der Groessen
	public static HashMap<String, Double> Rechnung = new HashMap<>();

	public static void init()
	{
		//Faktoren Laenge
		//Umrechnungsfaktoren NUR bei Ausgabeeinheit "m"!!!
		Rechnung.put("mm", 0.001);
		Rechnung.put("cm", 0.01);
		Rechnung.put("dm", 0.1);
		Rechnung.put("m", 1.0);
		Rechnung.put("km", 1000.0);
		Rechnung.put("zoll", 39.37);
		Rechnung.put("fuss", 3.281);
		Rechnung.put("yard", 1.094);
		Rechnung.put("mile", 0.00062150403);

		//Faktoren Flaeche
		//Umrechnungsfaktoren NUR bei Ausgabeeinheit "m^2"!!!
		Rechnung.put("mm^2", 0.00001);
		Rechnung.put("cm^2", 0.0001);
		Rechnung.put("dm^2", 0.01);
		Rechnung.put("m^2", 1.0);
		Rechnung.put("km^2", 10000000.0);
		Rechnung.put("zoll^2", 1550.0);
		Rechnung.put("fuss^2", 10.764);
		Rechnung.put("yard^2", 1.196);
		Rechnung.put("mile^2", 0.00000259);

		//Faktoren Volumen !!!!
		
		//Faktoren Gewicht
		//Umrechnungsfaktoren NUR bei Ausgabeeinheit "kg"!!!
		Rechnung.put("mg", 0.000001);
		Rechnung.put("g", 0.001);
		Rechnung.put("kg", 1.0);
		Rechnung.put("t", 1000.0);
		Rechnung.put("stone", 0.15748031496);
		Rechnung.put("pfund", 2.205);
		Rechnung.put("unze", 35.274);
	}



	// Methode zum Umrechnen der Groessen
	
	
				// Formel zur Erkennung ob Ausgabeinheit größer oder kleiner als Eingabeeinheit
				// und davon abhängig mal oder geteilt durch den Faktor!!!???
	
	
	public static double Umrechner(double eingwert, String einheite, String einheita) {
		
		// allgemeine Variabel für die Eingabeeinheiten
		double Ee = 0;
		// allgemeine Variabel für die Ausgabeeinheiten
		double Ea = 0;
		
		//Längeneinheiten 
		//Eingabe Ee
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
		else if (einheita.equals("Zoll [in]")){
			Ee = Rechnung.get("zoll");
		}
		else if (einheita.equals("Fuss [ft]")){
			Ee = Rechnung.get("fuss");
		}
		else if (einheita.equals("Yard [yd]")){
			Ee = Rechnung.get("yard");
		}
		else if (einheita.equals("Meilen [mi]")){
			Ee = Rechnung.get("mile");
		}

		//Ausgabe Ea
		if (einheita.equals("Millimeter [mm]")){
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
		else if (einheita.equals("Zoll [in]")){
			Ea = Rechnung.get("zoll");
		}
		else if (einheita.equals("Fuss [ft]")){
			Ea = Rechnung.get("fuss");
		}
		else if (einheita.equals("Yard [yd]")){
			Ea = Rechnung.get("yard");
		}
		else if (einheita.equals("Meilen [mi]")){
			Ea = Rechnung.get("mile");
		}
		
		//Flaecheneinheiten
		//Eingabe Ee
		if (einheite.equals("Quadratmillimeter [mm^2]")){
			Ee = Rechnung.get("mm^2");
		}
		else if (einheite.equals("Quadratzentimeter [cm^2]")){
			Ee = Rechnung.get("cm^2");
		}
		else if (einheite.equals("Quadratdezimeter [dm^2]")){
			Ee = Rechnung.get("dm^2");
		}
		else if (einheite.equals("Quadratmeter [m^2]")){
			Ee = Rechnung.get("m^2");
		}
		else if (einheite.equals("Quadratkilometer [km^2]")){
			Ee = Rechnung.get("km^2");
		}
		else if (einheita.equals("Quadratzoll [in^2]")){
			Ee = Rechnung.get("zoll^2");
		}
		else if (einheita.equals("Quadratfuss [ft^2]")){
			Ee = Rechnung.get("fuss^2");
		}
		else if (einheita.equals("Quadratyard [yd^2]")){
			Ee = Rechnung.get("yard^2");
		}
		else if (einheita.equals("Quadratmeilen [mi^2]")){
			Ee = Rechnung.get("mile^2");
		}
		//Ausgabe Ea
		if (einheite.equals("Quadratmillimeter [mm^2]")){
			Ea = Rechnung.get("mm^2");
		}
		else if (einheite.equals("Quadratzentimeter [cm^2]")){
			Ea = Rechnung.get("cm^2");
		}
		else if (einheite.equals("Quadratdezimeter [dm^2]")){
			Ea = Rechnung.get("dm^2");
		}
		else if (einheite.equals("Quadratmeter [m^2]")){
			Ea = Rechnung.get("m^2");
		}
		else if (einheite.equals("Quadratkilometer [km^2]")){
			Ea = Rechnung.get("km^2");
		}
		else if (einheita.equals("Quadratzoll [in^2]")){
			Ea = Rechnung.get("zoll^2");
		}
		else if (einheita.equals("Quadratfuss [ft^2]")){
			Ea = Rechnung.get("fuss^2");
		}
		else if (einheita.equals("Quadratyard [yd^2]")){
			Ea = Rechnung.get("yard^2");
		}
		else if (einheita.equals("Quadratmeilen [mi^2]")){
			Ea = Rechnung.get("mile^2");
		}


		else if (einheita.equals("Kilometer [km]")){// test
			Ea = Rechnung.get("km");
		}
		
		//Volumeneinheiten
		//Eingabe Ee
		if (einheite.equals("Kubikmillimeter [mm^3]")){
			Ee = Rechnung.get("mm^3");
		}
		else if (einheite.equals("Kubikzentimeter [cm^3]")){
			Ee = Rechnung.get("cm^3");
		}
		else if (einheite.equals("Kubikdezimeter [dm^3]")){
			Ee = Rechnung.get("dm^3");
		}
		else if (einheite.equals("Kubikmeter [m^3]")){
			Ee = Rechnung.get("m^3");
		}
		else if (einheite.equals("Kubikkilometer [km^3]")){
			Ee = Rechnung.get("km^3");
		}
					
		//Ausgabe Ea
		if (einheite.equals("Kubikmillimeter [mm^3]")){
			Ea = Rechnung.get("mm^3");
		}
		else if (einheite.equals("Kubikzentimeter [cm^3]")){
			Ea = Rechnung.get("cm^3");
		}
		else if (einheite.equals("Kubikdezimeter [dm^3]")){
			Ea = Rechnung.get("dm^3");
		}
		else if (einheite.equals("Kubikmeter [m^3]")){
			Ea = Rechnung.get("m^3");
		}
		else if (einheite.equals("Kubikkilometer [km^3]")){
			Ea = Rechnung.get("km^3");
		}
		
		//Gewichtseinheiten
		//Eingabe Ee
		if (einheite.equals("Milligramm [mg]")){
			Ee = Rechnung.get("mg");
		}
		else if (einheite.equals("Gramm [g]")){
			Ee = Rechnung.get("g");
		}
		else if (einheite.equals("Kilogramm [kg]")){
			Ee = Rechnung.get("kg");
		}
		else if (einheite.equals("Tonnen [t]")){
			Ee = Rechnung.get("t");
		}
		else if (einheite.equals("Stone [st]")){
			Ee = Rechnung.get("stone");
		}
		else if (einheite.equals("Pfund [lb]")){
			Ee = Rechnung.get("pfund");
		}
		else if (einheite.equals("Unze [oz]")){
			Ee = Rechnung.get("unze");
		}
					
		//Ausgabe Ea
		if (einheite.equals("Milligramm [mg]")){
			Ea = Rechnung.get("mg");
		}
		else if (einheite.equals("Gramm [g]")){
			Ea = Rechnung.get("g");
		}
		else if (einheite.equals("Kilogramm [kg]")){
			Ea = Rechnung.get("kg");
		}
		else if (einheite.equals("Tonnen [t]")){
			Ea = Rechnung.get("t");
		}
		else if (einheite.equals("Stone [st]")){
			Ea = Rechnung.get("stone");
		}
		else if (einheite.equals("Pfund [lb]")){
			Ea = Rechnung.get("pfund");
		}
		else if (einheite.equals("Unze [oz]")){
			Ea = Rechnung.get("unze");
		}
					
		
		double ausgwert = (eingwert * Ee) * Ea;

		return ausgwert;
		}
	}
		
	

