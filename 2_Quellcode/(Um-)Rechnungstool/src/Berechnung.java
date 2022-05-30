import java.util.HashMap;

public class Berechnung extends Einheitenumrechner {


	//Werte aus Einheitenrechner
	String einheite ="null";
	String einheita ="null";
	double Ee = 0;
	double Ea = 0;

	//Get- und Set-Methoden zur �bergabe der Ein- und Ausgabeeinheiten aus der Klasse Einheitenumrechner
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

	// Get- und Set-Methode f�r den Eingabewert, wird = 0 gesetzt
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
		Rechnung.put("Millimeter [mm]", 0.001);
		Rechnung.put("Zentimeter [cm]", 0.01);
		Rechnung.put("Dezimeter [dm]", 0.1);
		Rechnung.put("Meter [m]", 1.0);
		Rechnung.put("Kilometer [km]", 1000.0);
		Rechnung.put("Zoll [in]", 0.0254);
		Rechnung.put("Fuss [ft]", 0.305);
		Rechnung.put("Yard [yd]", 0.914);
		Rechnung.put("Meilen [mi]", 1609.34);

		//Faktoren Flaeche
		Rechnung.put("Quadratmillimeter [mm^2]", 0.000001);
		Rechnung.put("Quadratzentimeter [cm^2]", 0.0001);
		Rechnung.put("Quadratdezimeter [dm^2]", 0.01);
		Rechnung.put("Quadratmeter [m^2]", 1.0);
		Rechnung.put("Ar [a]", 100.0);
		Rechnung.put("Hektar [ha]", 10000.0);
		Rechnung.put("Quadratkilometer [km^2]", 1000000.0);
		Rechnung.put("Quadratzoll [in^2]", 0.000645);
		Rechnung.put("Quadratfuss [ft^2]", 0.0929);
		Rechnung.put("Quadratyard [yd^2]", 0.836);
		Rechnung.put("Quadratmeilen [mi^2]", 2589988.1);

		//Faktoren Volumen
		Rechnung.put("Kubikmillimeter [mm^3]", 0.000000001);
		Rechnung.put("Kubikzentimeter/Milliliter [cm^3/ml]", 0.000001);
		Rechnung.put("Kubikdezimeter/Liter [dm^3/l]", 0.001);
		Rechnung.put("Kubikmeter [m^3]", 1.0);
		Rechnung.put("Kubikkilometer [km^3]", 1000000000.0);
		
		//Faktoren Gewicht
		Rechnung.put("Milligramm [mg]", 0.000001);
		Rechnung.put("Gramm [g]", 0.001);
		Rechnung.put("Kilogramm [kg]", 1.0);
		Rechnung.put("Tonnen [t]", 1000.0);
		Rechnung.put("Stone [st]", 6.350);
		Rechnung.put("Pfund [lb]", 0.454);
		Rechnung.put("Unze [oz]", 0.0283);
		
	}



	// Methode zum Umrechnen der Groessen	
	
	public static double Umrechner(double eingwert, String einheite, String einheita) {
		
		
		// allgemeine Variabel für die Eingabeeinheiten wird Faktor uebergeben
		double Ee = Rechnung.get(einheite);
		// allgemeine Variabel für die Ausgabeeinheiten wird Faktor uebergeben
		double Ea = Rechnung.get(einheita);
		
					
		double ausgwert = (eingwert * Ee) / Ea;
		
		System.out.println("Faktor Eingabeeinheit: "+Ee);
		System.out.println("Faktor Ausgabeeinheit: "+Ea);

		return ausgwert;
		}
	}
		
	

