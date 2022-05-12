import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Front {
	//
	// LEON
	//
 double l = 4; 
 
	public double getL() {
	return l;
}

public void setL(double l) {
	this.l = l;
}
//
//
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Drop-Down Versuch 1
		String[] convertingoptions = {"W�hlen...", "L�nge", "Fl�che", "Volumen", "Gewicht"};

		String getconvertingsize = (String) JOptionPane.showInputDialog(
				null,
				"Bitte w�hle die gew�nschte Gr��e:",
				"Einheitenumrechner",
				JOptionPane.QUESTION_MESSAGE,
				null,
				convertingoptions,
				convertingoptions[0]);

		System.out.println("Gew�hlte Gr��e:" + getconvertingsize);
		//Drop-Down Versuch 1

		//Drop-Down Versuch 2

		//		        JComboBox<String> box = new JComboBox<String>();
		//				box.addItem("lba");
		//				box.addItem("blup");
		//				//box.removeAllItems(); // zum entfernen aller Auswahlm�glichkeiten
		//				pane.add(box);
		//				box.setBounds(0,0, 200, 100);
		//				box.addActionListener(new ActionListener() {
		//					
		//					@Override
		//					public void actionPerformed(ActionEvent e) {
		//						String s = (String) box.getSelectedItem();
		//						System.out.println("selected: "+s);
		//						
		//					}
		//				});

		//Drop-Down Versuch 2

		//
		// LEONS PROBIER WERKSTATT
		// NO TRESPASSING!
		//

		Berechnung Berechnung = new Berechnung();
		
		//System.out.println(l+""+ Rechnung.get("cm")+ "sind " + Berechnung.length(l)+""+Rechnung.get("zoll"));



		//double g = 2;
		//System.out.println(l+" kg sind "+Weight.weight(g)+" pfund");

		//double f = 2;
		//System.out.println(f+" m^2 sind "+Flaeche.berechneflaeche(f)+" yard^2");

		//double v = 2;
		//System.out.println(v+" m^3 sind "+Volumen.berechnevolumen(v)+" yard^3");

		//
		//
		//



	}

}
