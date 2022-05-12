import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Front {
	//
	// LEON's Werkstatt
	// Bitte stehen lassen 
	//
	double l = 4; 

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}
	double f = 3;

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	double g = 5;

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
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




	}

}
