
public class Weight extends Front {

	double um2;
	double g;
	
	
	public double getUm2() {
		return um2;
	}
	public void setUm2(double um2) {
		this.um2 = um2;
	}
	public double getG() {
		return g;
	}
	public void setG(double g) {
		this.g = g;
	}

	
	public static double weight (double g) {
		double um2 = 2.205;
		double gu = g*um2;
		return gu;

	}
}
