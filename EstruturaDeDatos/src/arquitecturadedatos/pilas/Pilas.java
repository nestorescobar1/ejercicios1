/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.pilas;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Pilas {
    public static void pilas(int pila[]) {
		int i,	op, tope;
		tope = -1;
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Pilas \n"+
                                "1. Insertar dato \n"+
                                "2. Mostrar Cima \n"+
                                "3. Sacar dato dela cima \n"+  
                                "4. Limpiar Pila \n"+                                        
                                "5. Salir \n"+
                                "Entre su opción: ?"));        
				switch (op) {
				case 1:   if (tope<8) {
                                            tope = tope+1;
                                            pila[tope] = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento "));
                                            } else {
                                                System.out.println("Pila llena");
                                            }
					break;
				case 2:
					if (tope>=0) {
                                                JOptionPane.showMessageDialog(null, "Cima: "+pila[tope]);
					} else {
						JOptionPane.showMessageDialog(null, "Pila vacía");
						
					}
					break;
				case 3:
					if (tope>=0) {
                                            tope = tope-1;
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Pila vacía");
			
                                        }
					break;
				case 4:
					tope = -1;
					break;
				}
			} while (!(op>=0 && op<=5));
		} while (op!=5);
	}
}
