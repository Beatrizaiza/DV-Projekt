
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
        JTextField hight = new JTextField();
        JTextField width = new JTextField();
        JButton compute = new JButton("Compute");
        JLabel insertWidth = new JLabel();
        JLabel insertHight = new JLabel();
        JLabel result = new JLabel(); 
        compute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double w = Double.parseDouble(width.getText());
				double h = Double.parseDouble(hight.getText());
				double answer = Flaechen.rectArea(w, h);
				
				result.setText("The area is: "+ answer + " square units"); // MAYBE SHOULD ADAPT SO THE PERSON CAN SEE THE UNIT THEY CHOSEN
				//insertWidth.setText("Width");	
				//insertHight.setText("Hight");	
				// NEED TO AJUST THE GUI!! need "call the values from Flaeche					
				
			}
					
			
        });
			
	    //--- add components to the main window ---//
        Container pane = mainWindow.getContentPane();
        pane.add(hight);
        pane.add(width);
        pane.add(compute);
        pane.add(result);
        pane.add(insertWidth);
        pane.add(insertHight);
        insertWidth.setBounds(0, 10 , 100, 20);
        width.setBounds(0, 30, 100, 20);
        insertHight.setBounds(0, 50 , 100, 20);
        hight.setBounds(0, 70, 100, 20);
        compute.setBounds(100, 70, 100, 20);
        result.setBounds(0,90,300,20);
        
        
	}
}