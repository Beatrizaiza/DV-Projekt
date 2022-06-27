import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * In der Klasse "Volumenrechner" wird die passende GUI erstellt und formatiert. 
 * Ausserdem werden die noetigen Eingabeparameter vom
 * Anwender erfragt und an die Klasse "Volumen" uebergeben.
 * Nach der Berechnung des Volumens, wird das Ergebnis (in Volumeneinheiten) 
 * dem Anwender ueber das Ausgabefeld zurueckgegeben.
 * 
 * @author Jasmin Binkowski
 * 
 * @version 1.0
 * 
 */

public class Volumenrechner extends JFrame {

	//Objektvariablen
	private JTextField result;
	private JPanel contentPane;
	private JComboBox volumeMenu;
	private JComboBox einhMenu;
	private JLabel L1, L2, L3;
	private String volEinheit;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton menubutton = new JButton("Hauptmenue");;
	private JLabel lblNewLabel = new JLabel("Volumenrechner");
	private JButton rechnen = new JButton("Rechnen");
	private JLabel Volume = new JLabel("Volumen:");

	/**
	 * Im Klassenkonstruktor "Volumenrechner" wird die GUI erstellt und gestaltet.
	 */
	public Volumenrechner() {

		setTitle("Volumenrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(293, 27, 240, 21);
		contentPane.add(lblNewLabel);

		String volumeList[] = {"Kugel", "Pyramide", "Wuerfel", "Zylinder", "Kegel"};
		JComboBox volumeMenu = new JComboBox(volumeList);
		volumeMenu.setModel(new DefaultComboBoxModel(new String[] {"Formen Waehlen", "Kugel", "Pyramide", "Wuerfel", "Zylinder", "Kegel", "Quader"}));
		volumeMenu.setForeground(new Color(0, 0, 0));
		volumeMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		volumeMenu.setBounds(180, 144, 472, 38);
		contentPane.add(volumeMenu);
		JLabel bild = new JLabel("");


		rechnen.setForeground(new Color(0, 128, 0));
		rechnen.setFont(new Font("Tahoma", Font.BOLD, 15));
		rechnen.setBounds(643, 294, 107, 38);
		contentPane.add(rechnen);

		result = new JTextField();
		result.setEditable(false);
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setForeground(new Color(0, 128, 0));
		result.setFont(new Font("Tahoma", Font.PLAIN, 15));
		result.setBounds(367, 431, 245, 38);
		contentPane.add(result);

		L1 = new JLabel("");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setFont(new Font("Tahoma", Font.BOLD, 15));
		L1.setBounds(180, 342, 144, 38);
		contentPane.add(L1);

		L2 = new JLabel("");
		L2.setHorizontalAlignment(SwingConstants.CENTER);
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setBounds(334, 342, 144, 38);
		contentPane.add(L2);

		L3 = new JLabel("");
		L3.setHorizontalAlignment(SwingConstants.CENTER);
		L3.setFont(new Font("Tahoma", Font.BOLD, 15));
		L3.setBounds(488, 342, 144, 38);
		contentPane.add(L3);

		Volume.setFont(new Font("Tahoma", Font.BOLD, 18));
		Volume.setBounds(266, 431, 346, 38);
		contentPane.add(Volume);

		tf1 = new JTextField();
		tf1.setBounds(180, 294, 144, 38);
		tf1.setColumns(10);
		tf1.setVisible(false);
		contentPane.add(tf1);

		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(334, 294, 144, 38);
		tf2.setVisible(false);
		contentPane.add(tf2);

		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(489, 294, 144, 38);
		tf3.setVisible(false);
		contentPane.add(tf3);

		contentPane.add(bild);

		// ActionListener
		volumeMenu.addActionListener(new ActionListener() {

			/**
			 * Die Methode "actionPerformed" ruft passend zum gewaehlten Objekt,
			 * die dazugehoerige Benutzeroberflaeche auf.
			 *
			 * @param e ActionEvent enthaelt Informationen zum Ereignis und fuehrt es aus
			 */
			public void actionPerformed(ActionEvent e) {
				String Form = (String) volumeMenu.getSelectedItem();
				if (Form.equals("Formen Waehlen")) {
					L1.setText("");
					L2.setText("");
					L3.setText("");
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Volumen_waehlen.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Kugel")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(false);
					tf2.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Kugel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Pyramide")) {
					L1.setText("");
					L2.setText("Laenge");
					L3.setText("Hoehe");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf2.setText(null);
					tf3.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Pyramide.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Wuerfel")) {
					L1.setText("");
					L2.setText("Laenge");
					L3.setText("");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(false);
					tf2.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Wuerfel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Zylinder")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("Hoehe");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf2.setText(null);
					tf3.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Zylinder.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Kegel")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("Hoehe");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf2.setText(null);
					tf3.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Kegel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				} else if (Form.equals("Quader")) {
					L1.setText("Laenge");
					L2.setText("Breite");
					L3.setText("Hoehe");
					tf1.setVisible(true);
					tf2.setVisible(true);
					tf3.setVisible(true);
					tf1.setText(null);
					tf2.setText(null);
					tf3.setText(null);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Quader.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
			}
		});



		rechnen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Form = (String) volumeMenu.getSelectedItem();
				if (tf1.getText().indexOf(",")>0 || tf2.getText().indexOf(",")>0 || tf3.getText().indexOf(",")>0)
					JOptionPane.showMessageDialog(null,"Formatierungsfehler: \'.\' statt \',\' verwenden", "Error", JOptionPane.ERROR_MESSAGE);
				else if (Form.equals("Kugel")) {
					try {
						double r = Double.parseDouble(tf2.getText());
						double answer = Volumen.sphereVolume(r);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}

				}
				else if (Form.equals("Pyramide")) {
					try {
						double l = Double.parseDouble(tf2.getText());
						double h = Double.parseDouble(tf3.getText());
						double answer = Volumen.pyramidVolume(l, h);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (Form.equals("Wuerfel")) {
					try {
						double l = Double.parseDouble(tf2.getText());
						double answer = Volumen.cubeVolume(l);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (Form.equals("Zylinder")) {
					try {
						double r = Double.parseDouble(tf2.getText());
						double h = Double.parseDouble(tf3.getText());
						double answer = Volumen.cylinderVolume(r, h);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (Form.equals("Kegel")) {
					try {
						double r = Double.parseDouble(tf2.getText());
						double h = Double.parseDouble(tf3.getText());
						double answer = Volumen.coneVolume(r, h);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (Form.equals("Quader")) {
					try {
						double l = Double.parseDouble(tf1.getText());
						double b = Double.parseDouble(tf2.getText());
						double h = Double.parseDouble(tf3.getText());
						double answer = Volumen.squareVolume(l, b, h);
						result.setText(answer + " VE");
					}catch (Exception e2) {
						JOptionPane.showMessageDialog(null,"Bitte Zahlenwert eingeben", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});

		/**
		 * Der "menubutton" stellte eine Verknuepfung zur Startseite her,
		 * dadurch wird die Moeglichkeit gegeben, 
		 * nach jeder Auswahl wieder zum Startfenster zurueckzugelangen.
		 */
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(643, 28, 150, 31);
		contentPane.add(menubutton);

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