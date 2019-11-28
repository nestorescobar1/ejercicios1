/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.ordenamientos.burbuja;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Burbuja {

    public static void burbuja(int v[]) {
		int i, op;
		String cadena="";
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Burbuja \n"+
                                "1. Cargar datos \n"+
                                "2. Mostrar Datos \n"+
                                "3. Ordenar Burbuja \n"+       
                                "4. Salir \n"+
                                "Entre su opción: ?"));        
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
				case 3:
					ordenaburbuja(v);
					break;
				}
			} while (!(op>=0 && op<=4));
		} while (op!=4);
	}
        public static void ordenaburbuja(int v[]) {
		int aux;
		int i;
		int j;
		for (i=0;i<=8;i++) {
			for (j=0;j<=8-i;j++) {
				if (v[j]>v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
    
    
}
