/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.ordenamientos.shell;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Shell {
    public static void shell(int v[])  {
		int i, op;
                String cadena="";
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Shell \n"+
                                "1. Cargar datos \n"+
                                "2. Mostrar Datos \n"+
                                "3. Ordenar Shell \n"+       
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
					ordenashell(v);
					break;
				}
			} while (!(op>=0 && op<=4));
		} while (op!=4);
	}
    public static void ordenashell(int v[]) {
		int i, inc, j,  tmp;
		inc = 4;
		do {
			for (i=inc;i<=9;i++) {
				tmp = v[i];
				j = i-inc;
				while (j>=0 && tmp<v[j]) {
					v[j+inc] = v[j];
					j = j-inc;
				}
				v[j+inc] = tmp;
			}
			inc = (int)(inc/2);
		} while (inc!=0);
		
    }
}
