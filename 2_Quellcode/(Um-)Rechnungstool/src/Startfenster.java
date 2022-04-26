
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Startfenster
{
	
	public static void main(String[] args)
	{
		
		JLabel bild1;
		JLabel bild2;
		JLabel bild3;
		JLabel bild4;
		
		Icon massband;
		Icon dreieck;
		Icon kugel;
		Icon thermometer;
		
		massband = new ImageIcon("Bild-Maßband.png");
		dreieck = new ImageIcon("Bild-Dreieck.png");
		kugel = new ImageIcon("Bild-Kugel.png");
		thermometer = new ImageIcon("Bild-Thermometer.png");
		
		//Erzeugt Hauptfenster//
		JFrame hauptfenster = new JFrame("Umrechnungstool");
		hauptfenster.setBounds(350, 100, 850, 600); //legt Größe und Position fest//

        hauptfenster.setVisible(true); //macht Fenster sichtbar//
        hauptfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Befehl beim Schleißen des Fensters//
        
        bild1 = new JLabel(massband);
        bild2 = new JLabel(dreieck);
        bild3 = new JLabel(kugel);
        bild4 = new JLabel(thermometer);
//        
        hauptfenster.addWindowListener(new WindowAdapter() { 
        	@Override
            public void windowClosing(WindowEvent e)
        	{
        		System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
        		System.exit(0); 
        	}
        });
               
        //--- create a label, a text field, a fly button and a custom drawing canvas ---//
        JLabel label = new JLabel("Wählen Sie zwischen folgenden Rechnern:");
        JButton einheitenumrechner = new JButton("Einheitenumrechner");
        JButton flaechenrechner = new JButton("Flächenrechner");
        JButton volumenrechner = new JButton("Volumenrechner");
        JButton temperaturumrechner = new JButton("Temperaturumrechner");
        
        //Positionieren der Buttons, Labels und Bilder
        label.setBounds(175, 20, 100, 20);
        einheitenumrechner.setLocation(175, 30); //funktioniert beides nicht???

        //Befehl zum Öffnen des Einheitenumrechners//
        einheitenumrechner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Weiterleitung zum Einheitenumrechner");
				
			}
        });
			
		//Befehl zum Öffnen des Flächenrechners//
	    flaechenrechner.addActionListener(new ActionListener() {
	    	@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Weiterleitung zum Flächenrechner");
					
			}	
		});
	    
		  //Befehl zum Öffnen des Volumenrechners//
	        volumenrechner.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("Weiterleitung zum Volumenrechner");
					
				}
	        });
	        
	      //Befehl zum Öffnen des Temperaturumrechners//
	        volumenrechner.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) 
				{
					System.out.println("Weiterleitung zum Temperaturumrechner");
					
				}
	        });	 
        
        //--- add components to the main window ---//
        Container pane = hauptfenster.getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(label);
        pane.add(einheitenumrechner);
        pane.add(flaechenrechner);
        pane.add(volumenrechner);
        pane.add(temperaturumrechner);
        
        pane.add(bild1);
        pane.add(bild2);
        pane.add(bild3);
        pane.add(bild4);
        hauptfenster.pack();
        hauptfenster.setBounds(350, 100, 850, 600); //legt Größe und Position fest//
        
        
           
	}
}