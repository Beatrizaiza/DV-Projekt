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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JComboBox drop_eingeinheit = new JComboBox();
		drop_eingeinheit.setModel(new DefaultComboBoxModel(new String[] {"Wähle Eingabeeinheit..."}));
		drop_eingeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_eingeinheit.setBounds(129, 210, 232, 31);
		contentPane.add(drop_eingeinheit);
		
		JComboBox drop_groessen = new JComboBox();
		
		drop_groessen.setFont(new Font("Tahoma", Font.BOLD, 14));
		drop_groessen.setModel(new DefaultComboBoxModel(new String[] {"Wählen...", "Länge", "Fläche", "Volumen", "Gewicht"}));
		drop_groessen.setBounds(300, 77, 240, 31);
		contentPane.add(drop_groessen);
		
		drop_groessen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(drop_groessen.getSelectedItem().equals("Länge"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kilometer [km]");
					drop_eingeinheit.addItem("Meter [m]");
					drop_eingeinheit.addItem("Dezimeter [dm]");
					drop_eingeinheit.addItem("Zentimeter [cm]");
					drop_eingeinheit.addItem("Millimeter [mm]");
					drop_eingeinheit.addItem("Mikrometer [µm]");
					drop_eingeinheit.addItem("Nanometer [nm]");
				}
				
				else if(drop_groessen.getSelectedItem().equals("Fläche"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kubikkilometer [km^3]");
					drop_eingeinheit.addItem("Hektar [ha]");
					drop_eingeinheit.addItem("Ar [a]");
					drop_eingeinheit.addItem("Quadratmeter [m^2]");
					drop_eingeinheit.addItem("Quadratdezimeter [dm^2]");
					drop_eingeinheit.addItem("Quadratzentimeter [cm^2]");
					drop_eingeinheit.addItem("Quadratmillimeter [mm^2]");
					drop_eingeinheit.addItem("Quadratmikrometer [µm^2]");
					drop_eingeinheit.addItem("Quadratnanometer [nm^2]");
				}
				
				else if(drop_groessen.getSelectedItem().equals("Volumen"))
				{
					
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Quadratkilometer [km^2]");
					drop_eingeinheit.addItem("Kubikmeter [m^3]");
					drop_eingeinheit.addItem("Kubikdezimeter/Liter [dm^3/l]");
					drop_eingeinheit.addItem("Kubikzentimeter/Milliliter [cm^3/ml]");
					drop_eingeinheit.addItem("Kubikmillimeter [mm^3]");
					drop_eingeinheit.addItem("Kubikmikrometer [µm^3]");
					drop_eingeinheit.addItem("Kubiknanometer [nm^3]");
				}
				
				else if(drop_groessen.getSelectedItem().equals("Gewicht"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Tonnen [t]");
					drop_eingeinheit.addItem("Kilogramm [kg]");
					drop_eingeinheit.addItem("Gramm [g]");
					drop_eingeinheit.addItem("Milligramm [mg]");
					drop_eingeinheit.addItem("Mikrogramm [µm]");
					drop_eingeinheit.addItem("Nanogramm [ng]");
				}
			}
		});
		
		
		JComboBox drop_ausgeinheit = new JComboBox();
		drop_ausgeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_ausgeinheit.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hle Ausgabeeinheit...", "", "Kilometer [km]", "Meter [m]", "Dezimeter [dm]", "Zentimeter [cm]", "Millimeter [mm]", "Mikrometer [\u00B5m]", "Nanometer [nm]", "", "Quadratkilometer [km^2]", "Hektar [ha]", "Ar [a]", "Quadratmeter [m^2]", "Quadratdezimeter [dm^2]", "Quadratzentimeter [cm^2]", "Quadratmillimeter [mm^2]", "Quadratmikrometer [\u00B5m^2]", "Quadratnanometer [nm^2]", "", "Kubikkilometer [km^3]", "Kubikmeter [m^3]", "Kubikdezimeter/Liter [dm^3/l]", "Kubikzentimeter/Milliliter [cm^3/ml]", "Kubikmillimeter [mm^3]", "Kubikmikrometer [\u00B5m^3]", "Kubiknanometer [nm^3]", "", "Tonnen [t]", "Kilogramm [kg]", "Gramm [g]", "Milligramm [mg]"}));
		drop_ausgeinheit.setBounds(499, 212, 232, 29);
		contentPane.add(drop_ausgeinheit);
		
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
