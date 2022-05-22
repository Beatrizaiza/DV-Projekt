import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	////
	////
	////
	double ausgwert = 0.0;

	public double getAusgwert() {
		return ausgwert;
	}

	public void setAusgwert(double ausgwert) {
		this.ausgwert = ausgwert;
	}

	String einheite ="null";
	String einheita ="null";

	public String getEinheite() {
		return einheite;
	}
	public void setEinheite(String einheite) {
		this.einheite = einheite;
	}
	public String getEinheita() {
		return einheita;
	}
	public void setEinheita(String einheita) {
		this.einheita = einheita;
	}

	double eingwert = 0;

	public double getEingwert() {
		return eingwert;
	}
	public void setEingwert(double eingwert) {
		this.eingwert = eingwert;
	}
	////
	////
	////
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


		JComboBox drop_groessen = new JComboBox();
		drop_groessen.setFont(new Font("Tahoma", Font.BOLD, 14));
		drop_groessen.setModel(new DefaultComboBoxModel(new String[] {"W�hlen...", "L�nge", "Fl�che", "Volumen", "Gewicht"}));
		drop_groessen.setBounds(300, 77, 240, 31);
		contentPane.add(drop_groessen);

		JComboBox drop_ausgeinheit = new JComboBox();
		drop_ausgeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_ausgeinheit.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hle Ausgabeeinheit..."}));
		drop_ausgeinheit.setBounds(499, 212, 232, 29);
		contentPane.add(drop_ausgeinheit);

		JComboBox drop_eingeinheit = new JComboBox();
		drop_eingeinheit.setModel(new DefaultComboBoxModel(new String[] {"W�hle Eingabeeinheit..."}));
		drop_eingeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_eingeinheit.setBounds(129, 210, 232, 31);
		contentPane.add(drop_eingeinheit);

		textField_eing = new JTextField();
		textField_eing.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_eing.setBounds(129, 170, 232, 31);
		textField_eing.setColumns(10);
		contentPane.add(textField_eing);

		textField_ausg = new JTextField();
		textField_ausg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_ausg.setBounds(499, 170, 232, 31);
		textField_ausg.setColumns(10);
		textField_ausg.setEditable(false);
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

		//Eingabe der Funtionen der Drop-Downs und Buttons

		drop_groessen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(drop_groessen.getSelectedItem().equals("L�nge"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kilometer [km]");
					drop_eingeinheit.addItem("Meter [m]");
					drop_eingeinheit.addItem("Dezimeter [dm]");
					drop_eingeinheit.addItem("Zentimeter [cm]");
					drop_eingeinheit.addItem("Millimeter [mm]");
					//drop_eingeinheit.addItem("Mikrometer [�m]");
					//drop_eingeinheit.addItem("Nanometer [nm]");
					drop_eingeinheit.addItem("zoll [in]");
					drop_eingeinheit.addItem("fuß [ft]");
					drop_eingeinheit.addItem("yard [yd]");
					drop_eingeinheit.addItem("mile [mi]");

					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Kilometer [km]");
					drop_ausgeinheit.addItem("Meter [m]");
					drop_ausgeinheit.addItem("Dezimeter [dm]");
					drop_ausgeinheit.addItem("Zentimeter [cm]");
					drop_ausgeinheit.addItem("Millimeter [mm]");
					//drop_ausgeinheit.addItem("Mikrometer [�m]");
					//drop_ausgeinheit.addItem("Nanometer [nm]");
					drop_ausgeinheit.addItem("zoll [in]");
					drop_ausgeinheit.addItem("fuß [ft]");
					drop_ausgeinheit.addItem("yard [yd]");
					drop_ausgeinheit.addItem("mile [mi]");
				}

				else if(drop_groessen.getSelectedItem().equals("Fl�che"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Quadratkilometer [km^2]");
					drop_eingeinheit.addItem("Quadratmeter [m^2]");
					drop_eingeinheit.addItem("Quadratdezimeter [dm^2]");
					drop_eingeinheit.addItem("Quadratzentimeter [cm^2]");
					drop_eingeinheit.addItem("Quadratmillimeter [mm^2]");
					//drop_eingeinheit.addItem("Quadratmikrometer [�m^2]");
					//drop_eingeinheit.addItem("Quadratnanometer [nm^2]");
					drop_eingeinheit.addItem("Quadratzoll [in^2]");
					drop_eingeinheit.addItem("Quadratfuß [ft^2]");
					drop_eingeinheit.addItem("Quadratyard [yd^2]");
					drop_eingeinheit.addItem("Quadratmeile [mi^2]");

					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Quadratkilometer [km^2]");
					drop_ausgeinheit.addItem("Quadratmeter [m^2]");
					drop_ausgeinheit.addItem("Quadratdezimeter [dm^2]");
					drop_ausgeinheit.addItem("Quadratzentimeter [cm^2]");
					drop_ausgeinheit.addItem("Quadratmillimeter [mm^2]");
					//drop_ausgeinheit.addItem("Quadratmikrometer [�m^2]");
					//drop_ausgeinheit.addItem("Quadratnanometer [nm^2]");
					drop_ausgeinheit.addItem("Quadratzoll [in^2]");
					drop_ausgeinheit.addItem("Quadratfuß [ft^2]");
					drop_ausgeinheit.addItem("Quadratyard [yd^2]");
					drop_ausgeinheit.addItem("Quadratmeile [mi^2]");
				}

				else if(drop_groessen.getSelectedItem().equals("Volumen"))
				{

					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Kubikkilometer [km^3]");
					//drop_eingeinheit.addItem("Hektar [ha]");
					//drop_eingeinheit.addItem("Ar [a]");
					drop_eingeinheit.addItem("Kubikmeter [m^3]");
					drop_eingeinheit.addItem("Kubikdezimeter/Liter [dm^3/l]");
					drop_eingeinheit.addItem("Kubikzentimeter/Milliliter [cm^3/ml]");
					drop_eingeinheit.addItem("Kubikmillimeter [mm^3]");
					//drop_eingeinheit.addItem("Kubikmikrometer [�m^3]");
					//drop_eingeinheit.addItem("Kubiknanometer [nm^3]");

					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Kubikkilometer [km^3]");
					//drop_ausgeinheit.addItem("Hektar [ha]");
					//drop_ausgeinheit.addItem("Ar [a]");
					drop_ausgeinheit.addItem("Kubikmeter [m^3]");
					drop_ausgeinheit.addItem("Kubikdezimeter/Liter [dm^3/l]");
					drop_ausgeinheit.addItem("Kubikzentimeter/Milliliter [cm^3/ml]");
					drop_ausgeinheit.addItem("Kubikmillimeter [mm^3]");
					//drop_ausgeinheit.addItem("Kubikmikrometer [�m^3]");
					//drop_ausgeinheit.addItem("Kubiknanometer [nm^3]");
				}

				else if(drop_groessen.getSelectedItem().equals("Gewicht"))
				{
					drop_eingeinheit.removeAllItems();
					drop_eingeinheit.setSelectedItem(null);
					drop_eingeinheit.addItem("Tonnen [t]");
					drop_eingeinheit.addItem("Kilogramm [kg]");
					drop_eingeinheit.addItem("Gramm [g]");
					drop_eingeinheit.addItem("Milligramm [mg]");
					//drop_eingeinheit.addItem("Mikrogramm [�m]");
					//drop_eingeinheit.addItem("Nanogramm [ng]");
					drop_eingeinheit.addItem("Stone [st]");
					drop_eingeinheit.addItem("Pfund [lb]");
					drop_eingeinheit.addItem("Unze [oz]");


					drop_ausgeinheit.removeAllItems();
					drop_ausgeinheit.setSelectedItem(null);
					drop_ausgeinheit.addItem("Tonnen [t]");
					drop_ausgeinheit.addItem("Kilogramm [kg]");
					drop_ausgeinheit.addItem("Gramm [g]");
					drop_ausgeinheit.addItem("Milligramm [mg]");
					//drop_ausgeinheit.addItem("Mikrogramm [�m]");
					//drop_ausgeinheit.addItem("Nanogramm [ng]");
					drop_ausgeinheit.addItem("Stone [st]");
					drop_ausgeinheit.addItem("Pfund [lb]");
					drop_ausgeinheit.addItem("Unze [oz]");
				}




				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						double eingwert, ausgwert;
						eingwert = 0;
						//ausgwert = 0;
						try {
							eingwert = Double.parseDouble(textField_eing.getText());
				
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null,"keine Zahl", "Error", JOptionPane.ERROR_MESSAGE);
						}
						System.out.println(eingwert);
						
						

						String einheite,einheita;
						einheite ="null";
						einheita ="null";

						einheite = drop_eingeinheit.getSelectedItem().toString();
						einheita = drop_ausgeinheit.getSelectedItem().toString();
						
						System.out.println(einheite);
						System.out.println(einheita);
						
						double ausgwert1 = Berechnung.Umrechner(eingwert, einheite, einheita);
						System.out.println(ausgwert1);
						//result.setText(answer + " VE");
					}

				});



			}
		});
	}}




//try {
//		eingwert = Double.parseDouble(textField_eing.getText());
//	} catch (Exception e2) {
//		JOptionPane.showMessageDialog(null,"keine Zahl", "Error", JOptionPane.ERROR_MESSAGE);
//	}


//	if(drop_eingeinheit.getSelectedItem().equals("Kilometer [km]"))
//	{


//	}
//		if(drop_ausgeinheit.getSelectedItem().equals("Kilometer [km]"))
//		{
//			ausgwert = eingwert;
//			textField_ausg.setText(String.valueOf(ausgwert));
//		}



