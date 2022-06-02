import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
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

public class TemperaturechnerGUI extends JFrame {
	private JPanel contentPane;
	static JComboBox tempMenu;
	static JLabel L1, L2;
	String volEinheit;
	private JTextField tf1;
	private JTextField tf3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperaturechnerGUI frame = new TemperaturechnerGUI();
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
	public TemperaturechnerGUI() {
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

		JLabel lblNewLabel = new JLabel("Temperaturumrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(275, 35, 279, 21);
		contentPane.add(lblNewLabel);


		String tempList[] = {"Einheiten Waehlen", "Celsius zu Kelvin", "Celsius zu Fahrenheit", "Fahrenheit zu Celsius", "Fahrenheit zu Kelvin", "Kelvin zu Celsius", "Kelvin zu Fahrenheit"};
		JComboBox tempMenu = new JComboBox(tempList);
		tempMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten Waehlen", "Celsius zu Kelvin", "Celsius zu Fahrenheit", "Fahrenheit zu Celsius", "Fahrenheit zu Kelvin", "Kelvin zu Celsius", "Kelvin zu Fahrenheit"}));
		tempMenu.setForeground(new Color(0, 0, 0));
		tempMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		tempMenu.setBounds(180, 144, 472, 38);
		contentPane.add(tempMenu);
		// Adapts GUI to the right function input
		tempMenu.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			String Temp = (String) tempMenu.getSelectedItem();
			if (Temp.equals("Formen W�hlen")) {
				L1.setText("");
				L2.setText("");
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals("Celsius zu Kelvin")) {
				L1.setText("Celsius");
				L2.setText("Kelvin");
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals( "Celsius zu Fahrenheit")) {
				L1.setText("Celsius");
				L2.setText("Fahrenheit");
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals("Fahrenheit zu Celsius")) {
				L1.setText("Fahrenheit");
				L2.setText("Celsius");
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals("Fahrenheit zu Kelvin")) {
				L1.setText("Fahrenheit");
				L2.setText("Kelvin");
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals("Kelvin zu Celsius")) {
				L1.setText("Kelvin");
				L2.setText("Celsius");	
				tf1.setText(null);
				tf3.setText(null);
			}
			else if (Temp.equals("Kelvin zu Fahrenheit")) {
				L1.setText("Kelvin");
				L2.setText("Fahrenheit");
				tf1.setText(null);
				tf3.setText(null);
			}
		}
		});

		volEinheit =(null);

		JButton rechnen = new JButton("Rechnen");
		rechnen.addActionListener(new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Temp = (String) tempMenu.getSelectedItem();
				if (Temp.equals("Celsius zu Fahrenheit")) {
					double c = Double.parseDouble(tf1.getText());
					double answer = Temperatur.C2f (c); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					tf3.setText(answer + "");

				}
				if (Temp.equals("Celsius zu Kelvin")) {
					double c = Double.parseDouble(tf1.getText());
					double answer = Temperatur.C2k (c); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					tf3.setText(answer + "");
				}
				if (Temp.equals("Fahrenheit zu Celsius")) {
					double f = Double.parseDouble(tf1.getText());
					double answer = Temperatur.F2c (f); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					tf3.setText(answer + "");
				}
				if (Temp.equals("Fahrenheit zu Kelvin")) {
					double f = Double.parseDouble(tf1.getText());
					double answer = Temperatur.F2k(f); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					tf3.setText(answer + "");
				}
				if (Temp.equals("Kelvin zu Celsius")) {
					double k = Double.parseDouble(tf1.getText());
					double answer = Temperatur.K2c (k); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					tf3.setText(answer + "");
				}
				if (Temp.equals("Kelvin zu Fahrenheit")) {
					double k = Double.parseDouble(tf1.getText());
					double answer = Temperatur.K2f (k);
					tf3.setText(answer + "");
				}
			}
		});
		rechnen.setForeground(new Color(0, 128, 0));
		rechnen.setFont(new Font("Tahoma", Font.BOLD, 15));
		rechnen.setBounds(365, 254, 107, 38);
		contentPane.add(rechnen);

		L1 = new JLabel("");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setFont(new Font("Tahoma", Font.BOLD, 15));
		L1.setBounds(180, 207, 144, 38);
		contentPane.add(L1);

		L2 = new JLabel("");
		L2.setHorizontalAlignment(SwingConstants.CENTER);
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setBounds(508, 207, 144, 38);
		contentPane.add(L2);

		tf1 = new JTextField();
		tf1.setBounds(180, 256, 144, 38);
		tf1.setColumns(10);
		tf1.setVisible(true);
		contentPane.add(tf1);

		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setColumns(10);
		tf3.setBounds(508, 256, 144, 38);
		tf3.setVisible(true);
		contentPane.add(tf3);
	}
}
