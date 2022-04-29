
public class Length extends Front {

	double um1;
	double l;
	static boolean cm;
	static boolean m;
	static boolean km;
	
//source und traget units
	
	public double getUm1() {
		return um1;
	}

	public void setUm1(double um1) {
		this.um1 = um1;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public boolean isCm() {
		return cm;
	}

	public void setCm(boolean cm) {
		this.cm = cm;

		// public boolean isM() {
		// return m;
	}

	public void setM(boolean m) {
		this.m = m;
	}

	public boolean isKm() {
		return km;
	}

	public void setKm(boolean km) {
		this.km = km;
	}

	public static double length(double l) {

		if (m) {
			double um1 = 1.094;
			double lu = l * um1;
			return lu;
		} else if (cm) {
			double um1 = 1.094;
			double lu = (100 * l) * um1;
			return lu;
		} else {
			double um1 = 1.094;
			double lu = (1000 / l) * um1;
			return lu;
		}
		//hash map
	}

}
//
