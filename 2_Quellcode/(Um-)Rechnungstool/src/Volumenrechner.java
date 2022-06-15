import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.text.JTextComponent;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
/**
 * 
 * @author leonwelker
 * In der Klasse "Volumenrechner" wird sowohl die GUI erstellt und formatiert, sondern auch die nötigen eingabe Parameter vom Nutzer erfragt und 
 * an die Klasse "Volumen" weitergegeben. Nach der Berechnung wird das Ergebniis dem Nutzer über das Ausgabefeld zurückgegeben.
 * 
 */
public class Volumenrechner extends JFrame  {

	private JTextField result;
	private JPanel contentPane;
	static JComboBox volumeMenu;
	static JComboBox einhMenu;
	static JLabel L1, L2 , L3;
	String volEinheit;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton menubutton;


	/**
	 * Start der Anwendung
	 */
	public static void main(String[] args) {
		String volPar[] = {"Radius", "Durchmesser", "Breite", "Laenge", "Hoehe"};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volumenrechner frame = new Volumenrechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Die GUI wird erstellt und das Dropdown-Menu implementiert.
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

		JLabel lblNewLabel = new JLabel("Volumenrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(293, 27, 240, 21);
		contentPane.add(lblNewLabel);


		String volumeList[] = { "Kugel", "Pyramide", "Wuerfel", "Zylinder", "Kegel" };
		JComboBox volumeMenu = new JComboBox(volumeList);
		volumeMenu.setModel(new DefaultComboBoxModel(new String[] {"Form waehlen...", "Kugel", "Pyramide", "Wuerfel", "Zylinder", "Kegel", "Quader"}));
		volumeMenu.setForeground(new Color(0, 0, 0));
		volumeMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		volumeMenu.setBounds(180, 144, 472, 38);
		contentPane.add(volumeMenu);
		JLabel bild = new JLabel("");

		// Adapts GUI to the right function input
		volumeMenu.addActionListener(new ActionListener() {
			
			/**
			 * Die Funktion "actionPerformed" ruft basierend auf dem gewählten Objekt die passende Benutzeroberfläche aus.(Was soll wo angezeigt werden) 
			 * @param e (Eingabe Wert)
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				String Form = (String) volumeMenu.getSelectedItem();
				if (Form.equals("Formen Waehlen")) {
					L1.setText("");
					L2.setText("");
					L3.setText("");
					result.setText(null);
					bild.setIcon(new ImageIcon());
				}
				else if (Form.equals("Kugel")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(false);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Kugel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
				else if (Form.equals("Pyramide")) {
					L1.setText("Laenge");
					L2.setText("");
					L3.setText("Hoehe");
					tf1.setVisible(true);
					tf2.setVisible(false);
					tf3.setVisible(true);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Pyramide.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
				else if (Form.equals("Wuerfel")) {
					L1.setText("");
					L2.setText("Laenge");
					L3.setText("");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(false);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Wuerfel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
				else if (Form.equals("Zylinder")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("Hoehe");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(true);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Zylinder.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
				else if (Form.equals("Kegel")) {
					L1.setText("");
					L2.setText("Radius");
					L3.setText("Hoehe");
					tf1.setVisible(false);
					tf2.setVisible(true);
					tf3.setVisible(true);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Kegel.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
				else if (Form.equals("Quader")) {
					L1.setText("Laenge");
					L2.setText("Breite");
					L3.setText("Hoehe");
					tf1.setVisible(true);
					tf2.setVisible(true);
					tf3.setVisible(true);
					result.setText(null);
					bild.setIcon(new ImageIcon());
					bild.setIcon(new ImageIcon("Quader.PNG"));
					bild.setBounds(61, 375, 165, 152);
				}
			}
		});
		/**
		 * Selects the length unit and converts to volume unit
		 */
		volEinheit =(null);
		einhMenu = new JComboBox();
		einhMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		einhMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheit waehlen...", "mm", "cm", "m"}));
		einhMenu.setBounds(325, 215, 181, 38);
		contentPane.add(einhMenu);
		einhMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Einheit = (String) einhMenu.getSelectedItem();
				if (Einheit.equals("m")) {
					volEinheit = ("m^3");
				}
				else if (Einheit.equals("mm")) {
					volEinheit = ("mm^3");
				}
				else if (Einheit.equals("cm")) {
					volEinheit = ("cm^3");
				}
			}
		});

		JButton rechnen = new JButton("Rechnen");
		rechnen.addActionListener(new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Form = (String) volumeMenu.getSelectedItem();
				if (Form.equals("Kugel")) {
					double r = Double.parseDouble(tf2.getText());
					double answer = Volumen.sphereVolume (r); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					result.setText(answer + " VE");

				}
				if (Form.equals("Pyramide")) {
					double l = Double.parseDouble(tf1.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.pyramidVolume (l, h); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					result.setText(answer + " VE");
				}
				if (Form.equals("Wuerfel")) {
					double l = Double.parseDouble(tf2.getText());
					double answer = Volumen.cubeVolume (l); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					result.setText(answer + " VE");
				}
				if (Form.equals("Zylinder")) {
					double r = Double.parseDouble(tf2.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.cylinderVolume(r,h); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					result.setText(answer + " VE");
				}
				if (Form.equals("Kegel")) {
					double r = Double.parseDouble(tf2.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.coneVolume (r, h); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					result.setText(answer + " VE");
				}
				if (Form.equals("Quader")) {
					double l = Double.parseDouble(tf1.getText());
					double b = Double.parseDouble(tf2.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.squareVolume (l,b,h);
					result.setText(answer+ volEinheit );
				}
			}
		});
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


		//		einhMenu = new JComboBox();
		//		einhMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		//		einhMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten W\u00E4hlen", "mm", "cm", "m"}));
		//		einhMenu.setBounds(325, 215, 181, 38);
		//		contentPane.add(einhMenu);
		//		einhMenu.addActionListener(new ActionListener() {
		////			String Einheit = (String) einhMenu.getSelectedItem();
		//			public void actionPerformed(ActionEvent e) {
		//				String Einheit = (String) einhMenu.getSelectedItem();
		//				if (Einheit.equals("m")) {
		//				 volEinheit = ("m^3");
		//				}
		//				else if (Einheit.equals("mm")) {
		//					volEinheit = ("mm�");
		//					}
		//				else if (Einheit.equals("cm")) {
		//					volEinheit = ("cm�");
		//					}
		//			}
		//		});

		JLabel Volume = new JLabel("Volumen:");
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

		menubutton = new JButton("Hauptmenue");
		menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				//
				//new Startfenster().setVisible(true);
			}
		});
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(643, 26, 150, 31);
		contentPane.add(menubutton);




	}
}
