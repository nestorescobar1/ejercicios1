/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.ordenamientos;
import static arquitecturadedatos.ordenamientos.burbuja.Burbuja.burbuja;
import static arquitecturadedatos.ordenamientos.shell.Shell.shell;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ordenamientos {
   public static void ordenamientos(int v[])  {
		int i,  op;
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Ordenamientos \n"+
                                "1. Burbuja \n"+
                                "2. Shell \n"+
                                "3. Salir \n"+
                                "Entre su opción: ?"));    
				switch (op) {
				case 1:
					burbuja(v);
					break;
				case 2:
					shell(v);
					break;
				}
			} while (!(op>=0 && op<=3));
		} while (op!=3);
	}
}
