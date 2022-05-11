import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Flaechenrechner extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flaechenrechner frame = new Flaechenrechner();
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
	public Flaechenrechner() {
		setTitle("Fl\u00E4chenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFlchenrechner = new JLabel("Fl\u00E4chenrechner");
		lblFlchenrechner.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlchenrechner.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFlchenrechner.setBounds(287, 57, 240, 23);
		contentPane.add(lblFlchenrechner);
		
		JComboBox Dropdown_Größen = new JComboBox();
		Dropdown_Größen.setModel(new DefaultComboBoxModel(new String[] {"W\u00E4hlen...", "Beliebiges Dreieck", "Gleichseitiges Dreieck", "Rechtwinkliges Dreieck", "Quadrat", "Rechteck", "Raute", "Parallelogramm", "Trapez", "Kreis", "Kreisausschnitt"}));
		Dropdown_Größen.setFont(new Font("Tahoma", Font.BOLD, 14));
		Dropdown_Größen.setBounds(287, 90, 240, 31);
		contentPane.add(Dropdown_Größen);
		
		JLabel lblNewLabel = new JLabel("Fl\u00E4cheninhalt A :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(332, 387, 140, 31);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(287, 424, 240, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(342, 317, 118, 44);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(287, 200, 240, 31);
		contentPane.add(textField_2);
		
		JLabel lblFormel = new JLabel("Formel:");
		lblFormel.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFormel.setBounds(332, 158, 140, 31);
		contentPane.add(lblFormel);
	}

}
