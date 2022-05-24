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

public class AreaGUI extends JFrame implements Actionlistener {

	private JTextField result;
	private JPanel contentPane;
	static JComboBox FlaechenMenu;
	static JComboBox einhMenu;
	static JLabel L1, L2 , L3 , volEinheit;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String volPar[] = {"Winkel", "Radius", "Breite", "Laenge", "Hoehe"}; // need to change volPar to AreaPar this are the parameters to calculate the area
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
	 * Create the frame.
	 */
	public AreaGUI() {
		setTitle("Flaechenrechner");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flaechenrechner");
		lblNewLabel.setBackground(new Color(0, 128, 0));
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(266, 36, 240, 21);
		contentPane.add(lblNewLabel);
		
		
		String FlaechenList[] = { "Rechteck", "Dreieck", "gleichseitiges Dreieck", "Kreis", "Kreissektor", "Quadrat"};
		JComboBox FlaechenMenu = new JComboBox(FlaechenList);
		FlaechenMenu.setModel(new DefaultComboBoxModel(new String[] {"Formen Wählen", "Rechteck", "Dreieck", "gleichseitiges Dreieck", "Kreis", "Kreissektor", "Quadrat"}));
		FlaechenMenu.setForeground(new Color(0, 0, 0));
		FlaechenMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		FlaechenMenu.setBounds(180, 144, 472, 38);
		contentPane.add(FlaechenMenu);
		// Adapts GUI to the right function input 
		FlaechenMenu.addActionListener(new ActionListener() {
			// would be nice to have a picture so user knows what is meant // TRY IMPLEMENTING THIS 
		public void actionPerformed(ActionEvent e) {
			String Form = (String) FlaechenMenu.getSelectedItem();
			if (Form.equals("Formen Wählen")) {
				L1.setText("");
				L2.setText("");
				L3.setText("");

			}
			else if (Form.equals("Rechteck")) {
				L1.setText("Laenge");
				L2.setText("Breite");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
			}
			else if (Form.equals("Dreieck")) { 
				L1.setText("Laenge");
				L2.setText("Hoehe");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
			}
			else if (Form.equals("gleichseitiges Dreieck")) {
				L1.setText("Laenge");
				L2.setText("");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
			}
			else if (Form.equals("Kreis")) {
				L1.setText("Radius");
				L2.setText("");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);

			}
			else if (Form.equals("Kreissektor")) {
				L1.setText("Radius");
				L2.setText("Winkel");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(true);
				tf3.setVisible(false);
			}
			else if (Form.equals("Quadrat")) {
				L1.setText("Laenge");
				L2.setText("");
				L3.setText("");
				tf1.setVisible(true);
				tf2.setVisible(false);
				tf3.setVisible(false);
				
			}
			
			
		}
		});
		
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
					double l = Double.parseDouble(tf1.getText());
					double answer = Flaechen.equilatTriaArea (l); 
					result.setText(answer + " FE");
				}
				
				
				if (Form.equals("Kreis")) {
					double r = Double.parseDouble(tf1.getText());
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
					double b = Double.parseDouble(tf1.getText());
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
		
		einhMenu = new JComboBox(); 	// NEED TO DECIDE IF THIS IS REALLY NECESSARY
		einhMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		einhMenu.setModel(new DefaultComboBoxModel(new String[] {"Einheiten W\u00E4hlen", "mm", "cm", "m"}));
		einhMenu.setBounds(325, 215, 181, 38);
		contentPane.add(einhMenu);
		einhMenu.addActionListener(new ActionListener() {
			String Einheit = (String) einhMenu.getSelectedItem();
			public void actionPerformed(ActionEvent e) {
				if (Einheit.equals("m")) {
				volEinheit.setText("m³");
				contentPane.add(volEinheit);
				}
			}
		});
		
		JLabel Flaeche = new JLabel("Flaeche:");
		Flaeche.setFont(new Font("Tahoma", Font.BOLD, 18));
		Flaeche.setBounds(180, 432, 91, 38);
		contentPane.add(Flaeche);
		
		volEinheit = new JLabel("");
		volEinheit.setFont(new Font("Tahoma", Font.BOLD, 18));
		volEinheit.setBounds(531, 432, 91, 38);
		contentPane.add(volEinheit);
		
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
