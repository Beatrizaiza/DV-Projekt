import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class FlaechenrechnerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField inputGrundseite;
	private JTextField inputHoehe;
	private JTextField inputWinkel;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlaechenrechnerGUI frame = new FlaechenrechnerGUI();
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
	public FlaechenrechnerGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 // Title of the window:
		JLabel Flaechenrechner = new JLabel("Flaechenrechner");
		Flaechenrechner.setFont(new Font("Tahoma", Font.BOLD, 14));
		Flaechenrechner.setBounds(33, 11, 395, 21);
		Flaechenrechner.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(Flaechenrechner);
		
		
		inputGrundseite = new JTextField();
		inputGrundseite.setBounds(118, 130, 77, 20);
		contentPane.add(inputGrundseite);
		inputGrundseite.setColumns(10);
		
		JLabel Formen = new JLabel("Formen:");
		Formen.setHorizontalAlignment(SwingConstants.CENTER);
		Formen.setBounds(205, 47, 48, 14);
		contentPane.add(Formen);
		
		// NEED TO CHANGE THE OPTIONS CONNECT TO THE FLAECHEN CLASS
		
		JComboBox FlaechenOptionen = new JComboBox();
		FlaechenOptionen.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { //COULD PROBABLY DELETE THIS PART
				//Execute when a selection has been made
				// Need to set how to choose between "Form"  bzw. Flaoptions 
			}
		});
		FlaechenOptionen.setModel(new DefaultComboBoxModel(new String[] {"Rechteck", "Dreieck", "gleichseitiges Dreieck", "Kreis", "Kreissektor", "Quadrat", "Parallelogramm"}));
		FlaechenOptionen.setBounds(161, 71, 148, 22);
		contentPane.add(FlaechenOptionen);
		
		// insert Input field for calculation and their Labels:
		inputHoehe = new JTextField(); 
		inputHoehe.setBounds(205, 130, 77, 20);
		contentPane.add(inputHoehe);
		inputHoehe.setColumns(10);
		
		inputWinkel = new JTextField();
		inputWinkel.setBounds(292, 130, 77, 20);
		contentPane.add(inputWinkel);
		inputWinkel.setColumns(10);
		
		JLabel Grundseite = new JLabel("Grundseite [g]"); // Label for the Grundseite Field
		Grundseite.setBounds(118, 161, 77, 14);
		contentPane.add(Grundseite);
		
		JLabel Hoehe = new JLabel("Hoehe [h]"); // Label for the Hoehe Field
		Hoehe.setBounds(215, 161, 67, 14);
		contentPane.add(Hoehe);
		
		JLabel Winkel = new JLabel("Winkel"); // Label for the Winkel Field
		Winkel.setBounds(302, 161, 48, 14);
		contentPane.add(Winkel);
		
		// Result from the calculation should be seen here
		Result = new JTextField(); 
		Result.setBounds(118, 209, 135, 20);
		contentPane.add(Result);
		Result.setColumns(10);
		
		JLabel DieFlaecheIst = new JLabel(); //JLabel is empty when starting is filled at actionPerformed from compute button
		DieFlaecheIst.setBounds(10, 212, 94, 14);
		contentPane.add(DieFlaecheIst);
		
		
		//NEED MORE OPTIONS 
		// Compute Button to start the calculation 
		JButton ComputeButton = new JButton("Compute");
		ComputeButton.setBounds(263, 208, 104, 23);
		contentPane.add(ComputeButton);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuItem.setBounds(161, 67, 137, 26);
		contentPane.add(menuItem);
		ComputeButton.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) 
			{ // MAYBE SHOULD ADAPT SO THE PERSON CAN SEE THE UNIT THEY CHOSEN
				String Form = (String) FlaechenOptionen.getSelectedItem();
				DieFlaecheIst.setText("Die Flaeche ist: "); // JLabel showed only after compute
				
				if (Form.equals("Rechteck")) {
					System.out.println(Form);
					double w = Double.parseDouble(inputGrundseite.getText());
					double h = Double.parseDouble(inputHoehe.getText());
					double answer = Flaechen.rectArea(w, h);
					Result.setText(answer + " FE"); 
											}
					else if (Form.equals("Dreieck")) {	
						System.out.println(Form); 
					double w = Double.parseDouble(inputGrundseite.getText());
					double h = Double.parseDouble(inputHoehe.getText());
					double answer = Flaechen.triangleArea (w, h);
					Result.setText(answer + " FE"); 	
													}
				
					else if (Form.equals("gleichseitiges Dreieck")) {	
						System.out.println(Form);
					double w = Double.parseDouble(inputGrundseite.getText()); 
					double answer = Flaechen.equilatTriaArea (w); // NEED TO ADAPT SO THE PERSON CAN SEE THE UNIT THEY CHOSEN
					Result.setText(answer + " FE"); 	
													}
				
					else if (Form.equals("Kreis")) {	
						System.out.println(Form);
					double w = Double.parseDouble(inputGrundseite.getText());
					double answer = Flaechen.circArea (w); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					Result.setText(answer + " FE"); 	
													}
					else if (Form.equals("Kreissektor")) {	
						System.out.println(Form); 
					double w = Double.parseDouble(inputGrundseite.getText()); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					double win = Double.parseDouble(inputWinkel.getText());   // WIN = WINKEL , alpha
					double answer = Flaechen.sectorCircArea (w, win);
					Result.setText(answer + " FE"); 	
													}
					else if (Form.equals("Parallelogramm")) {	// NEED TO CHECK IS THE ORDER OF THE GIVEN VARIABLES IS RIGHT
						System.out.println(Form);   // NEED TO ADAPT SO THE PERSON CAN SEE THE UNIT THEY CHOSEN
					double w = Double.parseDouble(inputGrundseite.getText()); // NEED TO CHANGE THE WIDTH LABEL TO RADIUS
					double h = Double.parseDouble(inputWinkel.getText()); 
					double win = Double.parseDouble(inputWinkel.getText()); // WIN = WINKEL , alpha
					double answer = Flaechen.parallelogArea (w, h, win); // NEED TO CONSTRAIN ANSWERS SIZE
					Result.setText( answer + " FE"); 	
													}
				
				
			}
								
        });
		
	}
}
