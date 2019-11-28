
package arquitecturadedatos.listas;
import javax.swing.JOptionPane;

public class Listas {
    public static void listas(){
        Lista miLista=null;
        int op, creado=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú Principal \n"+
            "1. Crear lista \n"+
            "2. Agregar elemento \n"+
            "3. Mostrar Lista \n"+
            "4. Borrar lista \n"+
            "5. Salir \n"+
            "Entre su opción: ?"        
            ));
            switch(op){
                case 1:
                    miLista = new Lista();
                    JOptionPane.showMessageDialog(null, 
                    "Se ha creado una lista vacía!");
                    creado=1;
                break;
                case 2:
                    if (creado==1){
                     miLista.agregar();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(null, 
                    "Primero debe crear la lista!");
                    }
                   
                break;
                case 3:
                     if (creado==1){
                      miLista.recorrer();
                        }
                        else
                     {
                         JOptionPane.showMessageDialog(null, 
                        "Primero debe crear la lista!");
                     }
                   
                break;
                case 4:
                        if (creado==1){
                      miLista.borrar();
                        }
                        else
                     {
                         JOptionPane.showMessageDialog(null, 
                        "Primero debe crear la lista!");
                     }
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Adios!!!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida!!!");
            }
        }while(op!=7);

    }
}
