import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 * 
 * @author sophi
 * In der Klasse "AreaGUI" wird sowohl die GUI erstellt und formatiert, sondern auch die noetigen Eingabeparameter vom Nutzer erfragt und 
 * an die Klasse "Flaechen" weitergegeben. Nach der Berechnung wird das Ergebniis dem Nutzer ueber das Ausgabefeld zurueckgegeben.
 */
public class AreaGUI extends JFrame  {

	private JTextField result;
	private JPanel contentPane;
	static JComboBox FlaechenMenu;
	static JComboBox einhMenu;
	static JLabel L1, L2 , L3 , volEinheit, bild1, bild; 
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;


	/**
	 * Start der Anwendung
	 */
	public static void main(String[] args) {
		String volPar[] = {"Winkel", "Radius", "Breite", "Laenge", "Hoehe"}; 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaGUI frame = new AreaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 *  Die GUI wird erstellt und das Dropdown-Menu wird implementiert.
	 */
	public AreaGUI() {
		setTitle("Flaechenrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Flaechenrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(294, 29, 240, 21);
		contentPane.add(lblNewLabel);


		String FlaechenList[] = { "Rechteck", "Dreieck", "gleichseitiges Dreieck", "Kreis", "Kreissektor", "Quadrat"};
		JComboBox FlaechenMenu = new JComboBox(FlaechenList);
		FlaechenMenu.setModel(new DefaultComboBoxModel(new String[] {"Form waehlen...", "Rechteck", "Dreieck", "gleichseitiges Dreieck", "Kreis", "Kreissektor", "Quadrat"}));
		FlaechenMenu.setForeground(new Color(0, 0, 0));
		FlaechenMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		FlaechenMenu.setBounds(180, 144, 472, 38);
		contentPane.add(FlaechenMenu);
		// Adapts GUI to the right function input
		FlaechenMenu.addActionListener(new ActionListener() {
			// picture is shown so user knows what is meant // is implemented 
			/**
			 * Die Funktion "actionPerformed" ruft basierend auf dem gewaehlten Objekt die passende Benutzeroberflaeche aus.
			 * Sie zeigt, welche Werte fuer jede Formel benoetigt werden, sowie ein erklaerendes Bild.
			 * @param e 
			 */
		public void actionPerformed(ActionEvent e) {
			String Form = (String) FlaechenMenu.getSelectedItem();
						
			if (Form.equals("Formen Waehlen")) {
				L1.setText("");
				L2.setText("");
				L3.setText("");
				bild.setIcon(new ImageIcon("AreaOptions.png"));
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);

			}
			else if (Form.equals("Rechteck")) {
				L1.setText("Laenge");
				L2.setText("Breite");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("Rechteck.png")); // rectangle image
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);
			}
			else if (Form.equals("Dreieck")) {
				L1.setText("Laenge");
				L2.setText("Hoehe");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("Dreieck.png")); //  triangle image
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);
				
			}
			else if (Form.equals("gleichseitiges Dreieck")) {
				L1.setText("");
				L2.setText("Laenge");
				L3.setText("");
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("gleichseitiges Dreieck.png")); //  equilateral triangle image
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);
			}
			else if (Form.equals("Kreis")) {
				L1.setText("");
				L2.setText("Radius");
				L3.setText("");
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("Kreis.png"));
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 209, 202);
				bild.setVisible(true);

			}
			else if (Form.equals("Kreissektor")) {
				L1.setText("Radius");
				L2.setText("Winkel");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("Kreissektor.png")); //  circular sector image
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);
			}
			else if (Form.equals("Quadrat")) {
				L1.setText("");
				L2.setText("Laenge");
				L3.setText("");
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(false);
				bild.setIcon(new ImageIcon("Quadrat.png")); //  square image
				bild.setVisible(true);
				contentPane.add(bild);
				bild.setBounds(60, 350, 121, 148);

			}


		}
		});
		/**
		 * 
		 */
		JButton rechnen = new JButton("Rechnen"); // when user pushes button "Rechnen" it will calculate using the formulas from Flaechen
		rechnen.addActionListener(new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Form = (String) FlaechenMenu.getSelectedItem();
				if (Form.equals("Rechteck")) {
					double l = Double.parseDouble(tf1.getText());
					double b = Double.parseDouble(tf2.getText());
					double answer = Flaechen.rectArea(l, b);
					result.setText(answer + " FE");

				}
				if (Form.equals("Dreieck")) {
					double l = Double.parseDouble(tf1.getText());
					double h = Double.parseDouble(tf2.getText());
					double answer = Flaechen.triangleArea (l, h);
					result.setText(answer + " FE");
				}
				if (Form.equals("gleichseitiges Dreieck")) {
					double l = Double.parseDouble(tf2.getText());
					double answer = Flaechen.equilatTriaArea (l);
					result.setText(answer + " FE");
				}


				if (Form.equals("Kreis")) {
					double r = Double.parseDouble(tf2.getText());
					double answer =  Flaechen.circArea (r);
					result.setText(answer + " FE");
					
				}


				if (Form.equals("Kreissektor")) {
					double r = Double.parseDouble(tf1.getText());
					double w = Double.parseDouble(tf2.getText());
					double answer = Flaechen.sectorCircArea (r, w);
					result.setText(answer + " FE");
				}

				if (Form.equals("Quadrat")) {
					double b = Double.parseDouble(tf2.getText());
					double answer =  Flaechen.squareArea (b);
					result.setText(answer + " FE");
				}

			}
		});
		rechnen.setForeground(new Color(0, 128, 0));
		rechnen.setFont(new Font("Tahoma", Font.BOLD, 15));
		rechnen.setBounds(643, 294, 107, 38);
		contentPane.add(rechnen);

		result = new JTextField();
		result.setEditable(false);
		result.setBounds(357, 432, 240, 38);
		contentPane.add(result);
		// L1, L2, L3 are the Labels that later will show for example "Laenge" and "Breite" when Rechteck is chosen.
		L1 = new JLabel("");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setFont(new Font("Tahoma", Font.BOLD, 15));
		L1.setBounds(180, 342, 144, 38);
		contentPane.add(L1); // first position right under tf1

		L2 = new JLabel("");
		L2.setHorizontalAlignment(SwingConstants.CENTER);
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setBounds(334, 342, 144, 38);
		contentPane.add(L2); // middle position right under tf2

		L3 = new JLabel("");
		L3.setHorizontalAlignment(SwingConstants.CENTER);
		L3.setFont(new Font("Tahoma", Font.BOLD, 15));
		L3.setBounds(488, 342, 144, 38);
		contentPane.add(L3); // last position right under tf3


		JLabel Flaeche = new JLabel("Flaeche:");
		Flaeche.setFont(new Font("Tahoma", Font.BOLD, 18));
		Flaeche.setBounds(256, 432, 91, 38);
		contentPane.add(Flaeche);

		volEinheit = new JLabel(""); // maybe delete
		volEinheit.setFont(new Font("Tahoma", Font.BOLD, 18));
		volEinheit.setBounds(531, 432, 91, 38);
		contentPane.add(volEinheit);
		//tf1, tf2, tf3 are the JTextFields that allow the user to give input values for the chose area shape.
		tf1 = new JTextField(); 
		tf1.setBounds(180, 294, 144, 38);
		tf1.setColumns(10);
		tf1.setVisible(false);
		contentPane.add(tf1); // place components you want to display

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
		
		JButton menubutton = new JButton("Hauptmenue"); //should direct the user back to main menu
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(643, 28, 150, 31);
		contentPane.add(menubutton);
		
		menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Startfenster().setVisible(true);
			}
		});

		bild = new JLabel("");

	}
}
