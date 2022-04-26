
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

public class Runner
{
	
	public static void main(String[] args)
	{
		//Erzeugt Hauptfenster//
		JFrame mainWindow = new JFrame("Umrechnungstool");
        mainWindow.setBounds(350, 100, 850, 600); //legt Gr��e und Position fest//
        mainWindow.setVisible(true); //macht Fenster sichtbar//
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Befehl beim Schlie�en des Fensters//
        
        mainWindow.addWindowListener(new WindowAdapter() { 
        	@Override
            public void windowClosing(WindowEvent e)
        	{
        		System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
        		System.exit(0); 
        	}
        });
               
        //--- create a label, a text field, a fly button and a custom drawing canvas ---//
        JLabel label = new JLabel("W�hlen Sie zwischen folgenden Rechnern:");
        JButton einheitenumrechner = new JButton("Einheitenumrechner");
        JButton flaechenrechner = new JButton("Fl�chenrechner");
        JButton volumenrechner = new JButton("Volumenrechner");
        JButton temperaturumrechner = new JButton("Temperaturumrechner");

        //Befehl zum �ffnen des Einheitenumrechners//
        einheitenumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Weiterleitung zum Einheitenumrechner");
				
			}
        });
			
		//Befehl zum �ffnen des Fl�chenrechners//
	    flaechenrechner.addActionListener(new ActionListener() {
	    	@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Weiterleitung zum Fl�chenrechner");
					
			}	
		});
	    
		  //Befehl zum �ffnen des Volumenrechners//
	        volumenrechner.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("Weiterleitung zum Volumenrechner");
					
				}
	        });
	        
	      //Befehl zum �ffnen des Temperaturumrechners//
	        volumenrechner.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("Weiterleitung zum Temperaturumrechner");
					
				}
	        });	 
        
        //--- add components to the main window ---//
        Container pane = mainWindow.getContentPane();
        JPanel selection = new JPanel();
        pane.add(selection);
        LayoutManager myLayout = new BoxLayout(selection, BoxLayout.Y_AXIS);
        selection.setLayout(myLayout);
//        panel.add(label);
//        panel.add(einheitenumrechner);
//        panel.add(flaechenrechner);
//        panel.add(volumenrechner);
        temperaturumrechner.setAlignmentX(Component.CENTER_ALIGNMENT);
        einheitenumrechner.setAlignmentX(Component.CENTER_ALIGNMENT);
        selection.add(temperaturumrechner);
        selection.add(einheitenumrechner);
        mainWindow.pack();
        mainWindow.setBounds(350, 100, 850, 600); //legt Gr��e und Position fest//
           
	}
}