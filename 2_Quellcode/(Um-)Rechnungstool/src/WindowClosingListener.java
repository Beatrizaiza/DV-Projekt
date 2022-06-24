import javax.swing.*;
import java.awt.event.*;

/**
 *  Die Klasse "WindowClosingListener" schliesst die GUI des Startfensters und bringt die Meldung
 *  "Das Programm wird beendet!" vor dem Schlieﬂen.
 * 
 * @author Leon Welker, Sophia Hug, Luca Wieland, Beatriz Aiza
 * 
 * @version 1.0
 *
 */
public class WindowClosingListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent event) {
		JOptionPane.showMessageDialog(null, "Das Programm wird beendet!");
		System.out.println("Das Programm wurde verlassen...");

	}

}
