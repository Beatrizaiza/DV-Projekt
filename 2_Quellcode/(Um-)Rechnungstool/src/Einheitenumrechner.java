import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author Luca Wieland, Leon Welker
 * @version 1.2
 * Die Klasse "Einheitenumrechner" erzeugt die GUI fuer den Einheitenumrechner
 * 
 */

public class Einheitenumrechner extends JFrame {

	//Objekt Variablen werden deklariert
	private double eingwert, ausgwert;
	private String einheite,einheita;

	private JPanel contentPane = new JPanel();

	private JTextField textField_eing=new JTextField();
	private JTextField textField_ausg=new JTextField();

	private JComboBox drop_groessen = new JComboBox();
	private JComboBox drop_ausgeinheit = new JComboBox();
	private JComboBox drop_eingeinheit = new JComboBox();

	private JLabel titel = new JLabel("Einheitenumrechner");
	private JLabel tit_eing = new JLabel("Eingabe:");
	private JLabel tit_ausg = new JLabel("Ausgabe:");

	private JButton startButton = new JButton("START");
	private JButton menubutton = new JButton("Hauptmenue");

	/**
	 * Im Klassenkonstruktor wird die GUI fuer den Einheitenumrechner erstellt.
	 * Es werden die Buttons, Bilder und Drop-Down-Elemente formatiert und der "Hauptmenue"-Button
	 * zur Rueckkehr zum Startfenster implementiert.
	 */

	public Einheitenumrechner() {

		//Startup und Layout
		setTitle("Einheitenumrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 850, 600);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Berechnung.init();

		//Ueberschrift
		titel.setForeground(new Color(0, 128, 0));
		titel.setHorizontalAlignment(SwingConstants.CENTER);
		titel.setBounds(300, 29, 240, 23);
		titel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titel);

		//Auswahl Laenge, Flaeche, Volumen, Gewicht
		drop_groessen.setFont(new Font("Tahoma", Font.BOLD, 14));
		drop_groessen.setModel(new DefaultComboBoxModel(new String[] {"Waehlen...", "Laenge", "Flaeche", "Volumen", "Gewicht"}));
		drop_groessen.setBounds(299, 125, 240, 31);
		contentPane.add(drop_groessen);

		//Auswahl Ausgabe
		drop_ausgeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_ausgeinheit.setModel(new DefaultComboBoxModel(new String[] {"Waehle Ausgabeeinheit..."}));
		drop_ausgeinheit.setBounds(498, 260, 232, 29);
		contentPane.add(drop_ausgeinheit);

		//Auswahl Eingabe
		drop_eingeinheit.setModel(new DefaultComboBoxModel(new String[] {"Waehle Eingabeeinheit..."}));
		drop_eingeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_eingeinheit.setBounds(128, 258, 232, 31);
		contentPane.add(drop_eingeinheit);

		//Eingabe TextFeld
		textField_eing.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_eing.setBounds(128, 218, 232, 31);
		textField_eing.setColumns(10);
		contentPane.add(textField_eing);

		//Ausgabe TextFeld
		textField_ausg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_ausg.setBounds(498, 218, 232, 31);
		textField_ausg.setColumns(10);
		textField_ausg.setEditable(false);
		contentPane.add(textField_ausg);

		//Label zu Eingabe
		tit_eing.setFont(new Font("Tahoma", Font.BOLD, 14));
		tit_eing.setBounds(128, 187, 232, 21);
		contentPane.add(tit_eing);

		//Label zu Ausgabe
		tit_ausg.setFont(new Font("Tahoma", Font.BOLD, 14));
		tit_ausg.setBounds(498, 187, 232, 21);
		contentPane.add(tit_ausg);

		//Designe StartButton
		startButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		startButton.setBounds(370, 233, 118, 44);
		contentPane.add(startButton);

		//Designe MenueButton
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(644, 26, 150, 31);
		contentPane.add(menubutton);

		//Verbinde MenueButton mit ActionListener
		menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startfenster b=new Startfenster();
				setVisible(false);
			}
		});

		//Verbinde drop_groessen mit ActionListener
		drop_groessen.addActionListener(new ActionListener() {

			/**
			 * Die Funktion "actionPerformed" ruft basierend auf 
			 * dem gewaehlten Objekt und der gewaehlten Einheit die passenden Dropdown-Menus
			 * zur Wahl der entsprechenden Einheit auf und hohlt den an die entsprechende Einheit
			 * gebundenen Wert aus der HashMap aus der Klasse "Berechnung" fuer die darauf folgende Berechnung.
			 * 
			 * @param e fuehrt das Event aus
			 */
			public void actionPerformed(ActionEvent e) {

				//Laenge
				if(drop_groessen.getSelectedItem().equals("Laenge"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kilometer [km]");
					drop_eingeinheit.addItem("Meter [m]");
					drop_eingeinheit.addItem("Dezimeter [dm]");
					drop_eingeinheit.addItem("Zentimeter [cm]");
					drop_eingeinheit.addItem("Millimeter [mm]");
					drop_eingeinheit.addItem("Zoll [in]");
					drop_eingeinheit.addItem("Fuss [ft]");
					drop_eingeinheit.addItem("Yard [yd]");
					drop_eingeinheit.addItem("Meilen [mi]");

					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Kilometer [km]");
					drop_ausgeinheit.addItem("Meter [m]");
					drop_ausgeinheit.addItem("Dezimeter [dm]");
					drop_ausgeinheit.addItem("Zentimeter [cm]");
					drop_ausgeinheit.addItem("Millimeter [mm]");
					drop_ausgeinheit.addItem("Zoll [in]");
					drop_ausgeinheit.addItem("Fuss [ft]");
					drop_ausgeinheit.addItem("Yard [yd]");
					drop_ausgeinheit.addItem("Meilen [mi]");
				}

				//Flaeche 
				else if(drop_groessen.getSelectedItem().equals("Flaeche"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Quadratkilometer [km^2]");
					drop_eingeinheit.addItem("Hektar [ha]");
					drop_eingeinheit.addItem("Ar [a]");
					drop_eingeinheit.addItem("Quadratmeter [m^2]");
					drop_eingeinheit.addItem("Quadratdezimeter [dm^2]");
					drop_eingeinheit.addItem("Quadratzentimeter [cm^2]");
					drop_eingeinheit.addItem("Quadratmillimeter [mm^2]");
					drop_eingeinheit.addItem("Quadratzoll [in^2]");
					drop_eingeinheit.addItem("Quadratfuss [ft^2]");
					drop_eingeinheit.addItem("Quadratyard [yd^2]");
					drop_eingeinheit.addItem("Quadratmeilen [mi^2]");

					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Quadratkilometer [km^2]");
					drop_ausgeinheit.addItem("Hektar [ha]");
					drop_ausgeinheit.addItem("Ar [a]");
					drop_ausgeinheit.addItem("Quadratmeter [m^2]");
					drop_ausgeinheit.addItem("Quadratdezimeter [dm^2]");
					drop_ausgeinheit.addItem("Quadratzentimeter [cm^2]");
					drop_ausgeinheit.addItem("Quadratmillimeter [mm^2]");
					drop_ausgeinheit.addItem("Quadratzoll [in^2]");
					drop_ausgeinheit.addItem("Quadratfuss [ft^2]");
					drop_ausgeinheit.addItem("Quadratyard [yd^2]");
					drop_ausgeinheit.addItem("Quadratmeilen [mi^2]");
				}

				//Volumen
				else if(drop_groessen.getSelectedItem().equals("Volumen"))
				{

					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kubikkilometer [km^3]");
					drop_eingeinheit.addItem("Kubikmeter [m^3]");
					drop_eingeinheit.addItem("Kubikdezimeter/Liter [dm^3/l]");
					drop_eingeinheit.addItem("Kubikzentimeter/Milliliter [cm^3/ml]");
					drop_eingeinheit.addItem("Kubikmillimeter [mm^3]");
					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Kubikkilometer [km^3]");
					drop_ausgeinheit.addItem("Kubikmeter [m^3]");
					drop_ausgeinheit.addItem("Kubikdezimeter/Liter [dm^3/l]");
					drop_ausgeinheit.addItem("Kubikzentimeter/Milliliter [cm^3/ml]");
					drop_ausgeinheit.addItem("Kubikmillimeter [mm^3]");
				}

				//Gewicht
				else if(drop_groessen.getSelectedItem().equals("Gewicht"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Tonnen [t]");
					drop_eingeinheit.addItem("Kilogramm [kg]");
					drop_eingeinheit.addItem("Gramm [g]");
					drop_eingeinheit.addItem("Milligramm [mg]");
					drop_eingeinheit.addItem("Stone [st]");
					drop_eingeinheit.addItem("Pfund [lb]");
					drop_eingeinheit.addItem("Unze [oz]");
					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Tonnen [t]");
					drop_ausgeinheit.addItem("Kilogramm [kg]");
					drop_ausgeinheit.addItem("Gramm [g]");
					drop_ausgeinheit.addItem("Milligramm [mg]");
					drop_ausgeinheit.addItem("Stone [st]");
					drop_ausgeinheit.addItem("Pfund [lb]");
					drop_ausgeinheit.addItem("Unze [oz]");
				}

				startButton.addActionListener(new ActionListener() {
					/**
					 * Die Funktion "actionPerformed" ermittelt die Eingabe des Nutzers und berechnet
					 * mit Hilfe der Funktionen aus der Klasse "Berechnung" den Ausgabewert in der 
					 * gewaehlten Einheit. Außerdem erscheint eine Fehlermeldung, wenn der Nutzer ein Komma "," anstatt eines Punktes "." verwendet um Dezimahlzahlen darzustellen.
					 * 
					 * @param e fuehrt das Event aus
					 */
					public void actionPerformed(ActionEvent e) {

						double eingwert, ausgwert;
						eingwert = 0;
						ausgwert = 0;
						if(textField_eing.getText().indexOf(",")>0) {
							JOptionPane.showMessageDialog(null,"Formatierungs Fehler \'.\' statt \',\' verwenden", "Error", JOptionPane.ERROR_MESSAGE);
						}else {
							try {
								eingwert = Double.parseDouble(textField_eing.getText());
							} catch (Exception e2 ) {
								JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
							} 
						}

						System.out.println("Eingabewert: "+eingwert);

						String einheite,einheita;

						einheite = (String) drop_eingeinheit.getSelectedItem();
						einheita = (String) drop_ausgeinheit.getSelectedItem();
						System.out.println("Eingabeeinheit: "+einheite);
						System.out.println("Ausgabeeinheit: "+einheita);

						//Ausgabe im Textfeld
						ausgwert = Berechnung.Umrechner(eingwert, einheite, einheita);
						System.out.println("Ergebnis: "+ausgwert);
						textField_ausg.setText(String.valueOf(ausgwert));
					}

				});



			}
		});

		// Window Closer
		addWindowListener(new WindowClosingListener());
		setVisible(true);
	}
}
