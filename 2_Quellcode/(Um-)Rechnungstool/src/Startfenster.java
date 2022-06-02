
import java.awt.Color;
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
import javax.swing.SwingConstants;
import java.awt.Font;


//Extends JFrame nötig damit andere Startfenster aufrufen können! Alternative?
/**
 * Klasse Startfenster erzeugt die GUI fuer das Startfenster des Umrechnungstools
 * class Startfenster creates a GUI for the main window of the conversion tool
 * @author Luca Wieland
 *
 */
public class Startfenster extends JFrame {
	public Startfenster() {
	}

	public static void main(String[] args) {

		// Erzeugt Hauptfenster//
		JFrame hauptfenster = new JFrame("Umrechnungstool");
		hauptfenster.setBounds(350, 100, 850, 600); // legt Groesse und Position fest//

		hauptfenster.setVisible(true); // macht Fenster sichtbar//
		hauptfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Befehl beim Schliessen des Fensters//

		hauptfenster.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
				System.exit(0);
			}
		});

		JLabel labelMassband = new JLabel(new ImageIcon("Bild-Massband.png"));
		JLabel labelDreieck = new JLabel(new ImageIcon("Bild-Dreieck.png"));
		JLabel labelKugel = new JLabel(new ImageIcon("Bild-Kugel.png"));
		JLabel labelThermometer = new JLabel(new ImageIcon("Bild-Thermometer.png"));

		// --- create a label, a text field, a fly button and a custom drawing canvas
		// ---//
		JLabel lblWhlenSieZwischen = new JLabel("Waehlen Sie zwischen folgenden Rechnern:");
		lblWhlenSieZwischen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWhlenSieZwischen.setHorizontalAlignment(SwingConstants.CENTER);
		JButton einheitenumrechner = new JButton("Einheitenumrechner");
		einheitenumrechner.setForeground(new Color(0, 128, 0));
		einheitenumrechner.setFont(new Font("Tahoma", Font.BOLD, 15));
		JButton flaechenrechner = new JButton("Flaechenrechner");
		flaechenrechner.setForeground(new Color(0, 128, 0));
		flaechenrechner.setFont(new Font("Tahoma", Font.BOLD, 15));
		JButton volumenrechner = new JButton("Volumenrechner");
		volumenrechner.setForeground(new Color(0, 128, 0));
		volumenrechner.setFont(new Font("Tahoma", Font.BOLD, 15));
		JButton temperaturumrechner = new JButton("Temperaturumrechner");
		temperaturumrechner.setForeground(new Color(0, 128, 0));
		temperaturumrechner.setFont(new Font("Tahoma", Font.BOLD, 15));

		// Befehl zum Oeffnen des Einheitenumrechners//
		einheitenumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Einheitenumrechner");
				
				new Einheitenumrechner().setVisible(true);
				hauptfenster.setVisible(false);
			}
		});

		// Befehl zum Oeffnen des Flaechenrechners//
		flaechenrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Flaechenrechner");
				
				new AreaGUI().setVisible(true);
				hauptfenster.setVisible(false);
			}
		});

		// Befehl zum Oeffnen des Volumenrechners//
		volumenrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Volumenrechner");
				
				new Volumenrechner().setVisible(true);
				hauptfenster.setVisible(false);
			}
		});

		// Befehl zum Oeffnen des Temperaturumrechners//
		temperaturumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Weiterleitung zum Temperaturumrechner");
				
				new TemperaturechnerGUI2().setVisible(true);
				hauptfenster.setVisible(false);
			}
		});

		// add components to the main window
		Container pane = hauptfenster.getContentPane();
		pane.setLayout(null);
		
		pane.add(lblWhlenSieZwischen);
		pane.add(einheitenumrechner);
		pane.add(flaechenrechner);
		pane.add(volumenrechner);
		pane.add(temperaturumrechner);

		pane.add(labelMassband);
		pane.add(labelDreieck);
		pane.add(labelKugel);
		pane.add(labelThermometer);
		
		pane.setBackground(Color.WHITE);
		
		//Festlegen der Positionen
		lblWhlenSieZwischen.setBounds(205, 30, 432, 50);
		einheitenumrechner.setBounds(216,102, 404, 61);
		flaechenrechner.setBounds(216,174, 404, 66);
		volumenrechner.setBounds(216,251, 404, 66);
		temperaturumrechner.setBounds(216,323, 404, 66);
		labelMassband.setBounds(84, 399, 164, 113);
		labelDreieck.setBounds(308, 399, 89, 138);
		labelKugel.setBounds(462, 399, 135, 123);
		labelThermometer.setBounds(678, 399, 56, 131);
		hauptfenster.setBounds(350, 100, 850, 600); // legt Groesse und Position fest//
		hauptfenster.setResizable(false);

	}

}