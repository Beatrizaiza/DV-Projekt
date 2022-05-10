
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Startfenster {

	public static void main(String[] args) {

		// Erzeugt Hauptfenster//
		JFrame hauptfenster = new JFrame("Umrechnungstool");
		hauptfenster.setBounds(350, 100, 850, 600); // legt Größe und Position fest//

		hauptfenster.setVisible(true); // macht Fenster sichtbar//
		hauptfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Befehl beim Schleißen des Fensters//

		hauptfenster.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
				System.exit(0);
			}
		});

		JLabel labelMassband = new JLabel(new ImageIcon("Bild-Maßband.png"));
		JLabel labelDreieck = new JLabel(new ImageIcon("Bild-Dreieck.png"));
		JLabel labelKugel = new JLabel(new ImageIcon("Bild-Kugel.png"));
		JLabel labelThermometer = new JLabel(new ImageIcon("Bild-Thermometer.png"));

		// --- create a label, a text field, a fly button and a custom drawing canvas
		// ---//
		JLabel label = new JLabel("Wählen Sie zwischen folgenden Rechnern:");
		JButton einheitenumrechner = new JButton("Einheitenumrechner");
		JButton flaechenrechner = new JButton("Flächenrechner");
		JButton volumenrechner = new JButton("Volumenrechner");
		JButton temperaturumrechner = new JButton("Temperaturumrechner");

		// Befehl zum Öffnen des Einheitenumrechners//
		einheitenumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Einheitenumrechner");

			}
		});

		// Befehl zum Öffnen des Flächenrechners//
		flaechenrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Flächenrechner");

			}
		});

		// Befehl zum Öffnen des Volumenrechners//
		volumenrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Volumenrechner");

			}
		});

		// Befehl zum Öffnen des Temperaturumrechners//
		temperaturumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Temperaturumrechner");
			}
		});

		// add components to the main window
		Container pane = hauptfenster.getContentPane();
		pane.setLayout(null);
		
		pane.add(label);
		pane.add(einheitenumrechner);
		pane.add(flaechenrechner);
		pane.add(volumenrechner);
		pane.add(temperaturumrechner);

		pane.add(labelMassband);
		pane.add(labelDreieck);
		pane.add(labelKugel);
		pane.add(labelThermometer);
		
		//Festlegen der Positionen
		label.setBounds(300, 10, 300, 50);
		einheitenumrechner.setBounds(275,70, 300, 30);
		flaechenrechner.setBounds(275,110, 300, 30);
		volumenrechner.setBounds(275,150, 300, 30);
		temperaturumrechner.setBounds(275,190, 300, 30);
		labelMassband.setBounds(170, 240, 164, 113);
		labelDreieck.setBounds(350, 240, 89, 138);
		labelKugel.setBounds(450, 240, 135, 123);
		labelThermometer.setBounds(605, 240, 56, 131);
		hauptfenster.setBounds(350, 100, 850, 600); // legt Größe und Position fest//
		hauptfenster.setResizable(false);

	}
}