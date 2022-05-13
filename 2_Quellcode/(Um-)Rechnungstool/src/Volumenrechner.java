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
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Volumenrechner extends JFrame implements Itemlistener {

	private JPanel contentPane;
	static JComboBox volumeMenu;
	static JLabel L1, L2 , L3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				
		volumeMenu.addItemListener();
		
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(300, 34, 240, 21);
		contentPane.add(lblNewLabel);
		
		
		String volumeList[] = { "Kugel", "Pyramide", "Wuerfel" };
		JComboBox volumeMenu = new JComboBox(volumeList);
		volumeMenu.setModel(new DefaultComboBoxModel(new String[] {"Formen Waehle", "Kugel", "Pyramide", "Wuerfel"}));
		volumeMenu.setForeground(new Color(0, 0, 0));
		volumeMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		volumeMenu.setBounds(180, 144, 472, 38);
		contentPane.add(volumeMenu);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(266, 431, 240, 38);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("Rechnen");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(643, 301, 107, 38);
		contentPane.add(btnNewButton);
		
		L1 = new JLabel("");
		L1.setFont(new Font("Tahoma", Font.BOLD, 15));
		L1.setBounds(180, 342, 144, 38);
		contentPane.add(L1);
		
		L2 = new JLabel("");
		L2.setFont(new Font("Tahoma", Font.BOLD, 15));
		L2.setBounds(334, 342, 144, 38);
		contentPane.add(L2);
		
		L3 = new JLabel("");
		L3.setFont(new Font("Tahoma", Font.BOLD, 15));
		L3.setBounds(488, 342, 144, 38);
		contentPane.add(L3);
	}
	public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == volumeMenu) {
        	String volPar[] = {"Radius", "Durchmesser", "Breite", "Laenge", "Hoehe"};
            L1.setText(volPar[0]);
        }
    }
}
