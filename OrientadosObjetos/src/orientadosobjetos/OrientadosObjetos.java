
package orientadosobjetos;

import javax.swing.JOptionPane;

public class OrientadosObjetos {

    public static void main(String[] args) {
       int numero1 =2;
       int numero2 =3;
     
       Operaciones operar=new Operaciones ();
     
     JOptionPane.showMessageDialog(null,operar.sumar(numero1, numero2));
     JOptionPane.showMessageDialog(null,operar.restar(numero1, numero2));
     JOptionPane.showMessageDialog(null,operar.multiplicar(numero1, numero2));
     JOptionPane.showMessageDialog(null,operar.dividir(numero1, numero2));
    }
    
}
