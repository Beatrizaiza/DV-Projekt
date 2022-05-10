import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class Front {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l =4;
		boolean cm = true;
		boolean m = false;
		boolean km = false;
		
		//Drop-Down Versuch 1
		String[] convertingoptions = {"Wählen...", "Länge", "Fläche", "Volumen", "Gewicht"};

		        String getconvertingsize = (String) JOptionPane.showInputDialog(
		                null,
		                "Bitte wähle die gewünschte Größe:",
		                "Einheitenumrechner",
		                JOptionPane.QUESTION_MESSAGE,
		                null,
		                convertingoptions,
		                convertingoptions[0]);

		        System.out.println("Gewählte Größe:" + getconvertingsize);
		//Drop-Down Versuch 1
		        
		//Drop-Down Versuch 2
		        
//		        JComboBox<String> box = new JComboBox<String>();
//				box.addItem("lba");
//				box.addItem("blup");
//				//box.removeAllItems(); // zum entfernen aller Auswahlmöglichkeiten
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
				
		System.out.println(Length.length(l));
		System.out.println(Length.length(l));
		
		
		double g = 2;
		System.out.println(l+" kg sind "+Weight.weight(g)+" pfund");

		//double f = 2;
		//System.out.println(f+" m^2 sind "+Flaeche.berechneflaeche(f)+" yard^2");

		//double v = 2;
		//System.out.println(v+" m^3 sind "+Volumen.berechnevolumen(v)+" yard^3");







	}

}
