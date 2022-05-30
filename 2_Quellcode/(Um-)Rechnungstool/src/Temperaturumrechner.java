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
import java.awt.Color;

public class Temperaturumrechner extends JFrame {

	private JPanel contentPane;
	private JTextField textField_eing;
	private JTextField textField_ausg;
	////
	////
	////
	static double ausgwert = 0.0;

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
					Temperaturumrechner frame = new Temperaturumrechner();
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
	public Temperaturumrechner() {
		Berechnung.init();
		setTitle("Temperaturumrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel titel = new JLabel("Temperaturumrechner");
		titel.setForeground(new Color(0, 128, 0));
		titel.setHorizontalAlignment(SwingConstants.CENTER);
		titel.setBounds(300, 34, 240, 23);
		titel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(titel);

		JComboBox drop_eingeinheit = new JComboBox();
		drop_eingeinheit.setModel(new DefaultComboBoxModel(new String[] {"Waehle Eingabeeinheit..."}));
		drop_eingeinheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		drop_eingeinheit.setBounds(308, 82, 232, 31);
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

		JButton btnNewButton = new JButton("Rechnen");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(371, 185, 118, 44);
		contentPane.add(btnNewButton);
	}}