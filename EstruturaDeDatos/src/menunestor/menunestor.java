/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menunestor;

import static arquitecturadedatos.operaciones.Operaciones.operaciones;
import static arquitecturadedatos.arreglos.Arreglo.arreglo;
import static arquitecturadedatos.matrices.Matrices.matrices;
import static arquitecturadedatos.ordenamientos.Ordenamientos.ordenamientos;
import static arquitecturadedatos.pilas.Pilas.pilas;
import static arquitecturadedatos.colas.Colas.colas;
import static arquitecturadedatos.listas.Listas.listas;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class menunestor {
    public static void main(String args[]){
    double a, b ; 
   
    int mat[][], opc, prim, ulti,vec[];
		prim = -1;
		ulti = -1;
		vec = new int[10];
		mat = new int[10][10];
		do {
			do {
                            opc=Integer.parseInt(JOptionPane.showInputDialog(
                            "Menú Principal \n"+
                            "1. Operaciones \n"+
                            "2. Arreglo \n"+
                            "3. Matriz \n"+
                            "4. Ordenamientos \n"+
                            "5. Listas \n"+
                            "6. Pilas \n"+
                            "7. Colas \n"+
                            "8. Salir \n"+
                            "Entre su opción: ?"        
                            ));
		
			} while (!(opc>=0 && opc<=8));
			switch (opc) {
			case 1:
				a = 0;
				b = 0;
				operaciones(a,b);
				break;
			case 2:
				arreglo(vec);
				break;
			case 3:
				matrices(mat);
				break;
			case 4:
				ordenamientos(vec);
				break;
			case 5:
				listas();
				break;
			case 6:
				pilas(vec);
				break;
			case 7:
				colas(vec,prim,ulti,5);
				break;
			}
		} while (opc!=8);

    }   
}
