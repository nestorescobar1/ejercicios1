/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.colas;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Colas {

	public static void colas(int cola[], int prim, int ulti, int maxi) {
		int i, op;
                String cadena="";
		do {
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Colas \n"+
                                "1. Insertar dato \n"+
                                "2. Mostrar datos \n"+
                                "3. Sacar dato \n"+  
                                "4. Limpiar Cola \n"+                                        
                                "5. Salir \n"+
                                "Entre su opción: ?"));    
				switch (op) {
                                    case 1:
                        		if ((ulti==maxi-1 && prim==0) || (ulti+1==prim)) {
                                            JOptionPane.showMessageDialog(null, "Cola llena");
                                	} else {
                                   		if (ulti==maxi-1) {
                                                    ulti = 0;
                                                } else {
                                                  ulti = ulti+1;
                                                }
                                            cola[ulti] = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento "));
                                            if (prim==-1) {
                                        	prim = 0;
                                            }
                                           }
					break;
				case 2:
					if (prim==-1) {
                                            JOptionPane.showMessageDialog(null, "Cola vacía");
                                        } else {
                                            cadena= "Cola \n";
                                            for (i=prim;i<=ulti;i++) {
                                                cadena+= cola[i]+" ";
                                            }
                                            JOptionPane.showMessageDialog(null, cadena);
		}
					break;
				case 3:
					if (prim==-1) {
                                            JOptionPane.showMessageDialog(null, "Cola vacía");
                                        } else {
                                        if (prim==ulti) {
                                            prim = -1;
                                            ulti = -1;
                                        } else {
                                             if (prim==maxi) {
                                               prim = 0;
                                            } else {
                                               prim = prim+1;
                                            }
                                        }
		}
					break;
				case 4:
					if (ulti>=0) {
						for (i=0;i<=ulti;i++) {
							 if (prim==ulti) {
                                                            prim = -1;
                                                            ulti = -1;
                                                        } else {
                                                            if (prim==maxi) {
                                                             prim = 0;
                                                            } else {
                                                            prim = prim+1;
                                                            }
                                                        }
						}
					} else {
						JOptionPane.showMessageDialog(null, "Cola vacía");
					}
					break;
				}
			} while (!(op>=0 && op<=5));
		} while (op!=5);
	}

}
