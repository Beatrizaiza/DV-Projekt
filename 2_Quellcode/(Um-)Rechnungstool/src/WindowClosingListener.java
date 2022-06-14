import javax.swing.*;
import java.awt.event.*;

/**
 * 
 * @author Leon Welker, Sophi, Luca Wieland, Beatrix Aiza
 * @version 1.0
 *
 *   Klasse schließt die GUI und bringt eine Info dass es funktioniert
 *   hat.
 */
public class WindowClosingListener extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent event) {
		JOptionPane.showMessageDialog(null, "Das Programm wird beendet!");
		System.out.println("Das Programm wurde verlassen...");

	}

}
