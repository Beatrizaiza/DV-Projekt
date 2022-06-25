import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * @author Betriz Aiza Rocha
 * @version 1.3
 * In der Klasse "TemperaturrechnerGUI2" wird sowohl die GUI erstellt
 * und formatiert, sondern auch die nötigen eingabe Parameter vom 
 * Nutzer erfragt und 
 * an die Klasse "Temperatur" weitergegeben.
 * Nach der Berechnung wird das Ergebniis dem Nutzer über das 
 * Ausgabefeld zurückgegeben.
 */
public class TemperaturechnerGUI2 extends JFrame {
	//Objektvariablen
	private JPanel contentPane;
	private JComboBox tempMenu;
	private JLabel L1, L2,L3,lblNewLabel;
	private JTextField tf1,tf2,tf3;
	private JButton menubutton,rechnen;

	/**
	 * Die Nutzeroberfläche wird erstellt.
	 */
	public TemperaturechnerGUI2() {
		setTitle("Temperaturumrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Temperaturumrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(275, 27, 279, 38);
		contentPane.add(lblNewLabel);

		/**
		 * Das Dropdown-Menu mit  den drei Optionen Celsius°, Fahrenheit° und Kelvin wird erstellt.
		 */
		String tempList[] = {"Einheiten Waehlen", "Celsius zu Kelvin", "Celsius zu Fahrenheit", "Fahrenheit zu Celsius", "Fahrenheit zu Kelvin", "Kelvin zu Celsius", "Kelvin zu Fahrenheit"};
		JComboBox tempMenu = new JComboBox(tempList);
		tempMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten Waehlen", "Celsius", "Fahrenheit", "Kelvin"}));
		tempMenu.setForeground(new Color(0, 0, 0));
		tempMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		tempMenu.setBounds(180, 144, 472, 38);
		contentPane.add(tempMenu);

		rechnen = new JButton("Rechnen");
		rechnen.setForeground(new Color(0, 128, 0));
		rechnen.setFont(new Font("Tahoma", Font.BOLD, 15));
		rechnen.setBounds(364, 358, 107, 38);
		contentPane.add(rechnen);

		L1 = new JLabel("");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setFont(new Font("Tahoma", Font.BOLD, 15));
		L1.setBounds(180, 207, 144, 38);
		contentPane.add(L1);

		L2 = new JLabel("");
		L2.setHorizontalAlignment(SwingConstants.CENTER);
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setBounds(346, 207, 144, 38);
		contentPane.add(L2);

		tf2 = new JTextField();
		tf2.setEditable(false);
		tf2.setBounds(346, 256, 144, 38);
		tf2.setColumns(10);
		tf2.setVisible(true);
		contentPane.add(tf2);

		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(508, 256, 144, 38);
		tf3.setVisible(true);
		contentPane.add(tf3);

		tf1 = new JTextField();
		tf1.setBounds(180, 256, 144, 38);
		contentPane.add(tf1);
		tf1.setColumns(10);

		L3 = new JLabel("");
		L3.setHorizontalAlignment(SwingConstants.CENTER);
		L3.setFont(new Font("Tahoma", Font.BOLD, 15));
		L3.setBounds(508, 207, 144, 38);
		contentPane.add(L3);

		menubutton = new JButton("Hauptmenue");
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(652, 35, 150, 31);
		contentPane.add(menubutton);

		//ActionListener
		/**
		 * Die eingegebenen Werte werden mittels der Methoden aus Klasse "Temperatur" berechnet und auf dem Bildschirm in den übrigen beiden Ausgabefeldern ausgegeben.
		 */
		tempMenu.addActionListener(new ActionListener() {
			/**
			 * Die Funktion "actionPerformed" ruft basierend auf der gewählten Einheit die passende Benutzeroberfläche aus.Also welches der Eingabe Felder aktiv ist.
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				String Temp = (String) tempMenu.getSelectedItem();
				if (Temp.equals("Formen Wählen")) {
					L1.setText("");
					L2.setText("");
					tf1.setText(null);
					tf2.setText(null);
					tf3.setText(null);
				}
				else if (Temp.equals("Celsius")) {
					L1.setText("Celsius");
					L2.setText("Kelvin");
					L3.setText("Fahrenheit");
					tf1.setText(null);
					tf2.setText(null);
					tf3.setText(null);
				}
				else if (Temp.equals("Fahrenheit")) {
					L1.setText("Fahrenheit");
					L2.setText("Celsius");
					L3.setText("Kelvin");
					tf1.setText(null);
					tf2.setText(null);
					tf3.setText(null);
				}
				else if (Temp.equals("Kelvin")) {
					L1.setText("Kelvin");
					L2.setText("Celsius");
					L3.setText("Fahrenheit");
					tf1.setText(null);
					tf2.setText(null);
					tf3.setText(null);
				}
			}
		});

		rechnen.addActionListener(new  ActionListener() {
			@Override
			/**
			 * Die Funktion "actionPerformed" gibt dem Nutzer bei einer falschen Eingabe eine Fehlermeldung als Pop Up Fenster aus. 
			 * Eine Fehleremeldung kommt dann, wenn kein Zahlenwert eingegeben wurde oder wenn Dezimalstellen nicht mit einem Komma sondern mit einem Punkt abgetrennt wurden.
			 * @param e
			 */
			public void actionPerformed(ActionEvent e) {
				String Temp = (String) tempMenu.getSelectedItem();

				if (tf1.getText().indexOf(",")>0 || tf2.getText().indexOf(",")>0 || tf3.getText().indexOf(",")>0)
					JOptionPane.showMessageDialog(null,"Formatierungs Fehler \'.\' statt \',\' verwenden", "Error", JOptionPane.ERROR_MESSAGE);


				else if (Temp.equals("Celsius")) {
					try {
						double c = Double.parseDouble(tf1.getText());
						double answer2 = Temperatur.C2k (c);
						double answer = Temperatur.C2f (c);					
						tf2.setText(answer2 + "");
						tf3.setText(answer + "");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}

				}
				else if (Temp.equals("Fahrenheit")) {
					try {
						double f = Double.parseDouble(tf1.getText());
						double answer = Temperatur.F2c (f);
						double answer2 = Temperatur.F2k (f);
						tf2.setText(answer + "");
						tf3.setText(answer2 + "");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (Temp.equals("Kelvin")) {
					try {
						double k = Double.parseDouble(tf1.getText());
						double answer = Temperatur.K2c (k);
						double answer2 = Temperatur.K2f (k);
						tf2.setText(answer + "");
						tf3.setText(answer2 + "");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Startfenster b=new Startfenster();
				setVisible(false);
			}
		});




		addWindowListener(new WindowClosingListener());

		setVisible(true);
	}


}