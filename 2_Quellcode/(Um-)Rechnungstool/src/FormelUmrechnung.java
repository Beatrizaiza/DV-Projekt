import java.util.HashMap;

public class FormelUmrechnung extends Einheitenumrechner{

	//Werte aus Einheitenrechner
		String einheite ="null";
		String einheita ="null";

		//Get- und Set-Methoden zur Uebergabe der Ein- und Ausgabeeinheiten aus der Klasse Einheitenumrechner
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

		// Get- und Set-Methode fuer den Eingabewert, wird = 0 gesetzt
		double eingwert = 0;

		public double getEingwert() {
			return eingwert;
		}
		public void setEingwert(double eingwert) {
			this.eingwert = eingwert;
		}

		// Methode zum Umrechnen der Groessen
		// Quelle fuer Umrechungsfaktoren: https://www.metric-conversions.org/de/
		// immer auf 3 Nachkommastellen oder 3 massgebliche Ziffern eingestellt!
		public static double Umrechner(double eingwert, String einheite, String einheita) {
			
			//Laengenumrechnung
			
			//Umrechnung in Millimeter
			if (einheite.equals("Millimeter [mm]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert;
				return ausgwert;
			}
			
			else if (einheite.equals("Zentimeter [cm]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*10;
				return ausgwert;
			}
			
			else if (einheite.equals("Dezimeter [dm]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*100;
				return ausgwert;
			}
			
			else if (einheite.equals("Meter [m]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*1000;
				return ausgwert;
			}
			
			else if (einheite.equals("Kilometer [km]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*1000000;
				return ausgwert;
			}
			
			else if (einheite.equals("Zoll [in]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*25.4;
				return ausgwert;
			}
			
			else if (einheite.equals("Fuss [ft]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*304.8;
				return ausgwert;
			}
			
			else if (einheite.equals("Yard [yd]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*914.4;
				return ausgwert;
			}
			
			else if (einheite.equals("Meilen [mi]") && einheita.equals("Millimeter [mm]")) {
				double ausgwert = eingwert*1609344;
				return ausgwert;
			}
			
			//Wiederholung für Zentimeter bis Meilen!!!
			
			//Umrechnung in Meter
			else if (einheite.equals("Millimeter [mm]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*1000;
				return ausgwert;
			}
			
			else if (einheite.equals("Zentimeter [cm]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*100;
				return ausgwert;
			}
			
			else if (einheite.equals("Dezimeter [dm]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*10;
				return ausgwert;
			}
			
			else if (einheite.equals("Meter [m]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert;
				return ausgwert;
			}
			
			else if (einheite.equals("Kilometer [km]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*0.001;
				return ausgwert;
			}
			
			else if (einheite.equals("Zoll [in]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*39.370;
				return ausgwert;
			}
			
			else if (einheite.equals("Fuss [ft]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*3.281;
				return ausgwert;
			}
			
			else if (einheite.equals("Yard [yd]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*1.094;
				return ausgwert;
			}
			
			else if (einheite.equals("Meilen [mi]") && einheita.equals("Meter [m]")) {
				double ausgwert = eingwert*0.000621;
				return ausgwert;
			}
			
			// so richtig?
			return ausgwert;
				
		}
	}