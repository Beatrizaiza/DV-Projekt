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

public class Volumenrechner extends JFrame implements Actionlistener {

	private JTextField result;
	private JPanel contentPane;
	static JComboBox volumeMenu;
	static JComboBox einhMenu;
	static JLabel L1, L2 , L3;
	String volEinheit;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public Volumenrechner() {
		setTitle("Volumenumrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Volumenumrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(266, 36, 240, 21);
		contentPane.add(lblNewLabel);
		
		
		String volumeList[] = { "Kugel", "Pyramide", "Wuerfel", "Zylinder", "Kegel" };
		JComboBox volumeMenu = new JComboBox(volumeList);
		volumeMenu.setModel(new DefaultComboBoxModel(new String[] {"Formen Wählen", "Kugel", "Pyramide", "Würfel", "Zylinder", "Kegel", "Quader"}));
		volumeMenu.setForeground(new Color(0, 0, 0));
		volumeMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		volumeMenu.setBounds(180, 144, 472, 38);
		contentPane.add(volumeMenu);
		
		// Adapts GUI to the right function input 
		
		volumeMenu.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			String Form = (String) volumeMenu.getSelectedItem();
			if (Form.equals("Formen Wählen")) {
				L1.setText("");
				L2.setText("");
				L3.setText("");
				result.setText(null);

			}
			else if (Form.equals("Kugel")) {
				L1.setText("");
				L2.setText("Radius");
				L3.setText("");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(false);
				result.setText(null);
			}
			else if (Form.equals("Pyramide")) {
				L1.setText("Länge");
				L2.setText("");
				L3.setText("Höhe");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(true);
				result.setText(null);
				
			}
			else if (Form.equals("Würfel")) {
				L1.setText("");
				L2.setText("Länge");
				L3.setText("");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(false);
				result.setText(null);
			}
			else if (Form.equals("Zylinder")) {
				L1.setText("");
				L2.setText("Radius");
				L3.setText("Höhe");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(true);
				result.setText(null);

			}
			else if (Form.equals("Kegel")) {
				L1.setText("");
				L2.setText("Radius");
				L3.setText("Höhe");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(false);
				tf2.setVisible(true);
				tf3.setVisible(true);
				result.setText(null);
			}
			else if (Form.equals("Quader")) {
				L1.setText("Länge");
				L2.setText("Breite");
				L3.setText("Höhe");
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(true);
				result.setText(null);
				
			}
		}
		});
		
		volEinheit =(null);
		einhMenu = new JComboBox();
		einhMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		einhMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten W\u00E4hlen", "mm", "cm", "m"}));
		einhMenu.setBounds(325, 215, 181, 38);
		contentPane.add(einhMenu);
		einhMenu.addActionListener(new ActionListener() {
			String Einheit = (String) einhMenu.getSelectedItem();
			public void actionPerformed(ActionEvent e) {
				if (Einheit.equals("m")) {
				 volEinheit = ("m³");
				}
				else if (Einheit.equals("mm")) {
					volEinheit = ("mm³");
					}
				else if (Einheit.equals("cm")) {
					volEinheit = ("cm³");
					}
			}
		});
		
		JButton rechnen = new JButton("Rechnen");
		rechnen.addActionListener(new  ActionListener() {
			@Override
			
		// Calculates based on Volumen.class functions
			public void actionPerformed(ActionEvent e) {
				String Form = (String) volumeMenu.getSelectedItem();
				if (Form.equals("Kugel")) {
					double r = Double.parseDouble(tf2.getText()); // Gets input data 
					double answer = Volumen.sphereVolume (r); // Applies fetched data to Volumen function
					result.setText(answer + " VE");
					
				}
				if (Form.equals("Pyramide")) {
					double l = Double.parseDouble(tf1.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.pyramidVolume (l, h); 
					result.setText(answer + " VE");
				}
				if (Form.equals("Würfel")) {
					double l = Double.parseDouble(tf2.getText());
					double answer = Volumen.cubeVolume (l); 
					result.setText(answer + " VE");
				}
				if (Form.equals("Zylinder")) {
					double r = Double.parseDouble(tf2.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.cylinderVolume(r,h); 
					result.setText(answer + " VE");
				}
				if (Form.equals("Kegel")) {
					double r = Double.parseDouble(tf2.getText());
					double h = Double.parseDouble(tf3.getText());
					double answer = Volumen.coneVolume (r, h); 
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
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setForeground(new Color(0, 128, 0));
		result.setFont(new Font("Tahoma", Font.PLAIN, 15));
		result.setBounds(281, 432, 240, 38);
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
//			String Einheit = (String) einhMenu.getSelectedItem();
//			public void actionPerformed(ActionEvent e) {
//				if (Einheit.equals("m")) {
//				 volEinheit = ("m³");
//				}
//				else if (Einheit.equals("mm")) {
//					volEinheit = ("mm³");
//					}
//				else if (Einheit.equals("cm")) {
//					volEinheit = ("cm³");
//					}
//			}
//		});
		
		JLabel Volume = new JLabel("Volume:");
		Volume.setFont(new Font("Tahoma", Font.BOLD, 18));
		Volume.setBounds(180, 432, 91, 38);
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
		
	}
}
