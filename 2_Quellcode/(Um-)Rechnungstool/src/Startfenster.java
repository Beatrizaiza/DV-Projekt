import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Klasse Startfenster erzeugt die GUI fuer das Startfenster
 * des Umrechnungstools
 * class Startfenster creates a GUI for the main window of 
 * the conversion tool
 * @author Luca Wieland
 * @version 1.3
 *
 */
public class Startfenster {
	//Objektvariablen
	private JFrame hauptfenster = new JFrame("Umrechnungstool");
	private JLabel labelMassband = new JLabel(new ImageIcon("Massband.png"));
	private JLabel labelDreieck = new JLabel(new ImageIcon("Dreieck.png"));
	private JLabel labelKugel = new JLabel(new ImageIcon("Kugel.png"));
	private JLabel labelThermometer = new JLabel(new ImageIcon("Thermometer.png"));
	private JLabel lblWhlenSieZwischen = new JLabel("Waehlen Sie zwischen folgenden Rechnern:");
	private JButton einheitenumrechner = new JButton("Einheitenumrechner");
	private JButton flaechenrechner = new JButton("Flaechenrechner");
	private JButton volumenrechner = new JButton("Volumenrechner");
	private JButton temperaturumrechner = new JButton("Temperaturumrechner");
	private Panel pane = new Panel();

	/**
	 * Im KlassenKonstruktor wird die GUI Designet und 
	 * Die Ablaeufe werden erstellt
	 */
	public Startfenster() {
		hauptfenster.setBounds(350, 100, 850, 600);
		hauptfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblWhlenSieZwischen.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblWhlenSieZwischen.setHorizontalAlignment(SwingConstants.CENTER);

		einheitenumrechner.setForeground(new Color(0, 128, 0));
		einheitenumrechner.setFont(new Font("Tahoma", Font.BOLD, 15));

		flaechenrechner.setForeground(new Color(0, 128, 0));
		flaechenrechner.setFont(new Font("Tahoma", Font.BOLD, 15));

		volumenrechner.setForeground(new Color(0, 128, 0));
		volumenrechner.setFont(new Font("Tahoma", Font.BOLD, 15));

		temperaturumrechner.setForeground(new Color(0, 128, 0));
		temperaturumrechner.setFont(new Font("Tahoma", Font.BOLD, 15));

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
		hauptfenster.add(pane);

		// Festlegen der Positionen
		lblWhlenSieZwischen.setBounds(205, 30, 432, 50);
		einheitenumrechner.setBounds(216, 102, 404, 61);
		flaechenrechner.setBounds(216, 174, 404, 66);
		volumenrechner.setBounds(216, 251, 404, 66);
		temperaturumrechner.setBounds(216, 323, 404, 66);
		labelMassband.setBounds(84, 399, 164, 113);
		labelDreieck.setBounds(308, 399, 89, 138);
		labelKugel.setBounds(462, 399, 135, 123);
		labelThermometer.setBounds(678, 399, 56, 131);
		hauptfenster.setBounds(350, 100, 850, 600); // legt Groesse und Position fest//
		hauptfenster.setResizable(false);
		
		//ActionListener
		einheitenumrechner.addActionListener(new ActionListener() {
			/**
			 * Verlinkung zur einheiten Umrechungs GUI
			 * @param e  ist das Action Event damit die GUI sich oeffnet
			 */
			public void actionPerformed(ActionEvent e) {
				new Einheitenumrechner();
				hauptfenster.setVisible(false);
			}
		});
		
		flaechenrechner.addActionListener(new ActionListener() {
			/**
			 * Verlinkung zur Flaechen Rechung GUI
			 * @param e  ist das Action Event damit die GUI sich oeffnet
			 */
			public void actionPerformed(ActionEvent e) {
				new AreaGUI();
				hauptfenster.setVisible(false);
			}
		});
		
		volumenrechner.addActionListener(new ActionListener() {
			/**
			 * Verlinkung zur Volumen berechnungs GUI
			 * @param e  ist das Action Event damit die GUI sich oeffnet
			 */
			public void actionPerformed(ActionEvent e) {
				new Volumenrechner();
				hauptfenster.setVisible(false);
			}
		});
		
		temperaturumrechner.addActionListener(new ActionListener() {
			/**
			 * Verlinkung zur Tempreatur berechnungs GUI
			 * @param e  ist das Action Event damit die GUI sich oeffnet
			 */
			public void actionPerformed(ActionEvent e) {
				new TemperaturechnerGUI2();
				hauptfenster.setVisible(false);
			}
		});

		// Window Closer
		//
		hauptfenster.addWindowListener(new WindowClosingListener());
		hauptfenster.setVisible(true);
	}

	public static void main(String[] args) {
		new Startfenster();
	}

}
