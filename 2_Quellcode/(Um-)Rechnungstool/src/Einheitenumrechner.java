import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Einheitenumrechner extends JFrame {

	private JPanel contentPane;
	private JTextField textField_eing;
	private JTextField textField_ausg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einheitenumrechner frame = new Einheitenumrechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Einheitenumrechner() {
		setTitle("Einheitenumrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titel = new JLabel("Einheitenumrechner");
		titel.setHorizontalAlignment(SwingConstants.CENTER);
		titel.setBounds(300, 34, 240, 23);
		titel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titel);
		
		JComboBox Dropdown_Größen = new JComboBox();
		Dropdown_Größen.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dropdown_Größen.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hlen...", "L\u00E4nge", "Fl\u00E4che", "Volumen", "Gewicht"}));
		Dropdown_Größen.setBounds(300, 87, 240, 21);
		contentPane.add(Dropdown_Größen);
		
		JComboBox dropdown_eingabeeinheit = new JComboBox();
		dropdown_eingabeeinheit.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hle Eingabeeinheit...", "", "Kilometer [km]", "Meter [m]", "Dezimeter [dm]", "Zentimeter [cm]", "Millimeter [mm]", "Mikrometer [\u00B5m]", "Nanometer [nm]", "", "Quadratkilometer [km^2]", "Hektar [ha]", "Ar [a]", "Quadratmeter [m^2]", "Quadratdezimeter [dm^2]", "Quadratzentimeter [cm^2]", "Quadratmillimeter [mm^2]", "Quadratmikrometer [\u00B5m^2]", "Quadratnanometer [nm^2]", "", "Kubikkilometer [km^3]", "Kubikmeter [m^3]", "Kubikdezimeter/Liter [dm^3/l]", "Kubikzentimeter/Milliliter [cm^3/ml]", "Kubikmillimeter [mm^3]", "Kubikmikrometer [\u00B5m^3]", "Kubiknanometer [nm^3]", "", "Tonnen [t]", "Kilogramm [kg]", "Gramm [g]", "Milligramm [mg]"}));
		dropdown_eingabeeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dropdown_eingabeeinheit.setBounds(129, 210, 232, 31);
		contentPane.add(dropdown_eingabeeinheit);
		
		JComboBox dropdown_ausgabeeinheit = new JComboBox();
		dropdown_ausgabeeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dropdown_ausgabeeinheit.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hle Eingabeeinheit...", "", "Kilometer [km]", "Meter [m]", "Dezimeter [dm]", "Zentimeter [cm]", "Millimeter [mm]", "Mikrometer [\u00B5m]", "Nanometer [nm]", "", "Quadratkilometer [km^2]", "Hektar [ha]", "Ar [a]", "Quadratmeter [m^2]", "Quadratdezimeter [dm^2]", "Quadratzentimeter [cm^2]", "Quadratmillimeter [mm^2]", "Quadratmikrometer [\u00B5m^2]", "Quadratnanometer [nm^2]", "", "Kubikkilometer [km^3]", "Kubikmeter [m^3]", "Kubikdezimeter/Liter [dm^3/l]", "Kubikzentimeter/Milliliter [cm^3/ml]", "Kubikmillimeter [mm^3]", "Kubikmikrometer [\u00B5m^3]", "Kubiknanometer [nm^3]", "", "Tonnen [t]", "Kilogramm [kg]", "Gramm [g]", "Milligramm [mg]"}));
		dropdown_ausgabeeinheit.setBounds(499, 212, 232, 29);
		contentPane.add(dropdown_ausgabeeinheit);
		
		textField_eing = new JTextField();
		textField_eing.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_eing.setBounds(129, 170, 232, 31);
		contentPane.add(textField_eing);
		textField_eing.setColumns(10);
		
		textField_ausg = new JTextField();
		textField_ausg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_ausg.setColumns(10);
		textField_ausg.setBounds(499, 170, 232, 31);
		contentPane.add(textField_ausg);
		
		JLabel tit_eing = new JLabel("Eingabe:");
		tit_eing.setFont(new Font("Tahoma", Font.BOLD, 14));
		tit_eing.setBounds(129, 139, 232, 21);
		contentPane.add(tit_eing);
		
		JLabel tit_ausg = new JLabel("Ausgabe:");
		tit_ausg.setFont(new Font("Tahoma", Font.BOLD, 14));
		tit_ausg.setBounds(499, 139, 232, 21);
		contentPane.add(tit_ausg);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(371, 185, 118, 44);
		contentPane.add(btnNewButton);
	}
}
