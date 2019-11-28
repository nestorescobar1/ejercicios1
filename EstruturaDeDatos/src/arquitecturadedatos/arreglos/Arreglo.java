/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Arreglo {
    public static void arreglo(int v[]) {
		int i, op;
		String cadena="";
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Arreglo \n"+
                                "1. Cargar datos \n"+
                                "2. Mostrar Datos \n"+
                                "3. Salir \n"+
                                "Entre su opción: ?"        
                            ));
				switch (op) {
				case 1:
					for (i=0;i<=9;i++) {
						
						v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento "+(i+1)));
					}
					break;
				case 2:
                                        cadena="";
					for (i=0;i<=9;i++) {
						cadena+=(v[i]+" ");
					}
                                        JOptionPane.showMessageDialog(null, cadena);
					break;
				}
			} while (!(op>=0 && op<=3));
		} while (op!=3);
	}
}
