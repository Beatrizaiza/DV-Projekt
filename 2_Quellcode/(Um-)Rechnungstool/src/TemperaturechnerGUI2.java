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

public class TemperaturechnerGUI2 extends JFrame {
	private JPanel contentPane;
	static JComboBox tempMenu;
	static JLabel L1, L2,L3;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf1;
	private JButton menubutton;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperaturechnerGUI2 frame = new TemperaturechnerGUI2();
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

		/**
		 * Sets the Title
		 */
		JLabel lblNewLabel = new JLabel("Temperaturumrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(275, 35, 279, 38);
		contentPane.add(lblNewLabel);


	/**
	 * Create the menu to Volume functions
	 */
		String tempList[] = {"Einheiten Waehlen", "Celsius zu Kelvin", "Celsius zu Fahrenheit", "Fahrenheit zu Celsius", "Fahrenheit zu Kelvin", "Kelvin zu Celsius", "Kelvin zu Fahrenheit"};
		JComboBox tempMenu = new JComboBox(tempList);
		tempMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten Waehlen", "Celsius", "Fahrenheit", "Kelvin"}));
		tempMenu.setForeground(new Color(0, 0, 0));
		tempMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		tempMenu.setBounds(180, 144, 472, 38);
		contentPane.add(tempMenu);
		/**
		 * Adapts the GUI to adequate inputs to each function
		 * @author 
		 */
		tempMenu.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			String Temp = (String) tempMenu.getSelectedItem();
			if (Temp.equals("Formen W�hlen")) {
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

	/**
	 * Calculate based on functions from Temperatur class
	 */
		JButton rechnen = new JButton("Rechnen");
		rechnen.addActionListener(new  ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String Temp = (String) tempMenu.getSelectedItem();
				if (Temp.equals("Celsius")) {
					double c = Double.parseDouble(tf1.getText());
					double answer2 = Temperatur.C2k (c);
					double answer = Temperatur.C2f (c);					
					tf2.setText(answer2 + "");
					tf3.setText(answer + "");

				}
				if (Temp.equals("Fahrenheit")) {
					double f = Double.parseDouble(tf1.getText());
					double answer = Temperatur.F2c (f);
					double answer2 = Temperatur.F2k (f);
					tf2.setText(answer + "");
					tf3.setText(answer2 + "");
				}
				if (Temp.equals("Kelvin")) {
					double k = Double.parseDouble(tf1.getText());
					double answer = Temperatur.K2c (k);
					double answer2 = Temperatur.K2f (k);
					tf2.setText(answer + "");
					tf3.setText(answer2 + "");
				}
			}
		});
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
		menubutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Startfenster().setVisible(true);
			}
		});
		menubutton.setFont(new Font("Tahoma", Font.BOLD, 15));
		menubutton.setBounds(653, 25, 150, 31);
		contentPane.add(menubutton);
	}
}
