/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Matrices {
    public static void matrices(int m[][])  {
		int i, j,op;
		String cadena="";
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Matriz \n"+
                                "1. Cargar datos \n"+
                                "2. Mostrar Datos \n"+
                                "3. Salir \n"+
                                "Entre su opción: ?"        
                            ));
				switch (op) {
				case 1:
					for (i=0;i<=2;i++) {
						for (j=0;j<=2;j++) {
							m[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento "+(i+1)+","+(j+1)));
						}
					}
					break;
				case 2:
                                    cadena="";
					for (i=0;i<=2;i++) {
						for (j=0;j<=2;j++) {
							cadena+=(m[i][j]+" ");
						}
						cadena+=("\n");
					}
					 JOptionPane.showMessageDialog(null, cadena);
					break;
				}
			} while (!(op>=0 && op<=3));
		} while (op!=3);
	}
    
}
