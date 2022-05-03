
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RunnerSophia
{
	public static void main(String[] args)
	{
		//Erzeugt Hauptfenster//
		JFrame mainWindow = new JFrame("Umrechnungstool");
        mainWindow.setBounds(350, 100, 850, 600); //legt Größe und Position fest//
        mainWindow.setVisible(true); //macht Fenster sichtbar//
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Befehl beim Schließen des Fensters//
        
        mainWindow.addWindowListener(new WindowAdapter() { 
        	@Override
            public void windowClosing(WindowEvent e)
        	{
        		System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
        		System.exit(0); 
        	}
        });
               
        //--- create a label, a text field, a fly button and a custom drawing canvas ---//
        //JLabel label = new JLabel("Wählen Sie zwischen folgenden Rechnern:");
        JTextField input = new JTextField();
        JButton compute = new JButton("Compute");
        JLabel result = new JLabel();
        compute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double w = 10;
				double h = Double.parseDouble(input.getText());
				double r = Flaechen.rectArea(w, h);
				result.setText("F:"+r);
				
				
				// NEED TO AJUST THE GUI!! need "call the values from Flaeche
				
				
				
			}
        });
			
	    //--- add components to the main window ---//
        Container pane = mainWindow.getContentPane();
        pane.add(input);
        pane.add(compute);
        pane.add(result);
        input.setBounds(0, 20, 100, 20);
        compute.setBounds(100, 20, 100, 20);
        result.setBounds(200,20,100,20);
	}
}