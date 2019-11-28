/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.operaciones;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class Operaciones {
    public static void operaciones(double a, double b)  {
	Operar oper01=new Operar();	
        int op;
                double r;
		do {
			do {
				
				op = Integer.parseInt(JOptionPane.showInputDialog(
                                "Operaciones \n"+
                                "1. Suma \n"+
                                "2. Resta \n"+
                                "3. Multiplicación \n"+
                                "4. División \n"+
                                "5. Salir \n"+
                                "Entre su opción: ?"        
                            ));
				if (op>=0 && op<=4) {
                                        a=Integer.parseInt(JOptionPane.showInputDialog("Digite valor 1 "));
        				b =Integer.parseInt(JOptionPane.showInputDialog("Digite valor 2 "));
					switch (op) {
					case 1:
						r = oper01.sumar(a,b); 
                                                JOptionPane.showMessageDialog(null, a+"+"+b+"="+r);
						break;
					case 2:
						r = oper01.restar(a,b);
                                                JOptionPane.showMessageDialog(null, a+"-"+b+"="+r);
						break;
					case 3:
						r = oper01.multiplicar(a,b);
                                                JOptionPane.showMessageDialog(null, a+"*"+b+"="+r);
						break;
					case 4:
						r = oper01.dividir(a,b);
                                                JOptionPane.showMessageDialog(null, a+"/"+b+"="+r);
						break;
					}
				}
			} while (!(op>=0 && op<=5));
		} while (op!=5);    
}
}


