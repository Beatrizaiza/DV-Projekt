
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
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
import javax.swing.SwingConstants;

public class RunnerJasmin 
{
	public static void main(String[] args)
	{
		//Erzeugt Hauptfenster//
		JFrame mainWindow = new JFrame("Volumen");
        mainWindow.setBounds(350, 100, 850, 600); //Groeße und Position Hauptfenster
        mainWindow.setVisible(true); //Fenster anzeigen
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Befehl beim Schließen des Fensters
       
        
        mainWindow.addWindowListener(new WindowAdapter() { 
        	@Override
            public void windowClosing(WindowEvent e)
        	{
        		System.out.println("Das Fenster wurde geschlossen. Verlassen ...");
        		System.exit(0); 
        	}
        });
               
     
    
        
        JTextField laenge = new JTextField(); //weißes Textfeld unter Loesung
        JTextField hoehe = new JTextField();
        JTextField radius = new JTextField();
        JTextField breite = new JTextField();
        JTextField ausgabep = new JTextField();
        JTextField ausgabecu = new JTextField();
        JTextField ausgabesp = new JTextField();
        JTextField ausgabecy = new JTextField();
        JTextField ausgabeco = new JTextField();
        JTextField ausgabesq = new JTextField();
        
        
        JButton start = new JButton("Start");
        
        JLabel resultp = new JLabel(); //Loesung
        JLabel resultcu = new JLabel();
        JLabel resultsp = new JLabel();
        JLabel resultcy = new JLabel();
        JLabel resultco = new JLabel();
        JLabel resultsq = new JLabel();
        
        
        
        JLabel labell = new JLabel("Laenge"); //Text unter Textfeld
        JLabel labelh = new JLabel("Hoehe");
        JLabel labelr = new JLabel("Radius");
        JLabel labelb = new JLabel("Breite");
        
        
        JLabel labelausp = new JLabel("Volumen Pyramide:"); //Text vor Lösung
        JLabel labelauscu = new JLabel("Volumen Wuerfel:");
        JLabel labelaussp = new JLabel("Volumen Kugel:");
        JLabel labelauscy = new JLabel("Volumen Zylinder:");
        JLabel labelausco = new JLabel("Volumen Kegel:");
        JLabel labelaussq = new JLabel("Volumen Quader:");
        JLabel labelaus = new JLabel("");
       
        
        
        
       start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				double l = Double.parseDouble(laenge.getText());
				double h = Double.parseDouble(hoehe.getText());
				double r = Double.parseDouble(radius.getText());
				double b = Double.parseDouble(breite.getText());
				
				
				double p= Volumen.pyramidVolume(l, h); // Aufruf Methode aus Volumen
				double cu=Volumen.cubeVolume(l);
				double sp=Volumen.sphereVolume(r);
				double cy=Volumen.cylinderVolume(r, h);
				double co=Volumen.coneVolume(r, h);
				double sq=Volumen.squareVolume(l, b, h);
				
				resultp.setText(""+p); 
				resultcu.setText(""+cu);
				resultsp.setText(""+sp);
				resultcy.setText(""+cy);
				resultco.setText(""+co);
				resultsq.setText(""+sq);
				
				
			}
        });
			
	    //--- add components to the main window ---//
        Container pane = mainWindow.getContentPane();
        pane.add(laenge); //Eingabefenster weiß
        pane.add(hoehe);
        pane.add(radius);
        pane.add(breite);
        pane.add(start);
        
        pane.add(resultp); //Ausgabe der Lösung im Feld
        pane.add(resultcu);
        pane.add(resultsp);
        pane.add(resultcy);
        pane.add(resultco);
        pane.add(resultsq);
        
        pane.add(labell); //laenge, hoehe, radius text
        pane.add(labelh);
        pane.add(labelr);
        pane.add(labelb);
        
        pane.add(ausgabep); // weiße Textfelder unter Loesung
        pane.add(ausgabecu);
        pane.add(ausgabesp);
        pane.add(ausgabecy);
        pane.add(ausgabeco);
        pane.add(ausgabesq);
        
        pane.add(labelausp); //Text Volumen von ...
        pane.add(labelauscu);
        pane.add(labelaussp);
        pane.add(labelauscy);
        pane.add(labelausco);
        pane.add(labelaussq);
        pane.add(labelaus);
        
        
        
        laenge.setBounds(100, 100, 100, 20); //horizontal,vertikal,länge,höhe
        hoehe.setBounds(250, 100, 100, 20);
        radius.setBounds(400, 100, 100, 20);
        breite.setBounds(550, 100, 100, 20);
        start.setBounds(700, 100, 100, 20);
        
        resultp.setBounds(280, 200, 100, 20);
        resultcu.setBounds(280, 250, 100, 20);
        resultsp.setBounds(280, 300, 100, 20);
        resultcy.setBounds(280, 350, 100, 20);
        resultco.setBounds(280, 400, 100, 20);
        resultsq.setBounds(280, 450, 100, 20);
        
        
        labell.setBounds(125, 115, 100, 20);
        labelh.setBounds(275, 115, 100, 20);
        labelr.setBounds(425, 115, 100, 20);
        labelb.setBounds(575, 115, 100, 20);
        
        ausgabep.setBounds(275, 200, 200, 20);
        ausgabecu.setBounds(275, 250, 200, 20);
        ausgabesp.setBounds(275, 300, 200, 20);
        ausgabecy.setBounds(275, 350, 200, 20);
        ausgabeco.setBounds(275, 400, 200, 20);
        ausgabesq.setBounds(275, 450, 200, 20);
        
        labelausp.setBounds(150, 200, 200, 20);
        labelauscu.setBounds(150, 250, 200, 20);
        labelaussp.setBounds(150, 300, 200, 20);
        labelauscy.setBounds(150, 350, 200, 20);
        labelausco.setBounds(150, 400, 200, 20);
        labelaussq.setBounds(150, 450, 200, 20);
        
	}
}