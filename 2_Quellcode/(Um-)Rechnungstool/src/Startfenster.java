
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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

		// Positionieren der Buttons, Labels und Bilder
		label.setBounds(175, 20, 100, 20);
		einheitenumrechner.setLocation(175, 30); // funktioniert beides nicht???

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

		// --- add components to the main window ---//
		Container pane = hauptfenster.getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(label);
		pane.add(einheitenumrechner);
		pane.add(flaechenrechner);
		pane.add(volumenrechner);
		pane.add(temperaturumrechner);

		pane.add(labelMassband);
		pane.add(labelDreieck);
		pane.add(labelKugel);
		pane.add(labelThermometer);
		hauptfenster.pack();
		hauptfenster.setBounds(350, 100, 850, 600); // legt Größe und Position fest//

	}
}