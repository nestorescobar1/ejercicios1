
package arquitecturadedatos.listas;

import javax.swing.JOptionPane;


public class Lista {
    
    Nodo cab;
    
    Lista(){
        cab = null;
    }
    
    Nodo getBuscar(int va){
        if (cab == null)
            return null;
        else{
            Nodo q=cab;
           do{
                if(q.valor == va)
                    return q;
                q=q.sig;
            } while(q!=null);
            return null;
        }
    }
    
    Nodo getCrearNodo(){
        Nodo q=null;
        int va;
        do{
            va=Integer.parseInt(JOptionPane.showInputDialog(
            "Entre valor: "));
            q=getBuscar(va);
            if(q!=null)
                JOptionPane.showMessageDialog(null, "El valor ya existe!!, "
                + "intente nuevamente");
        }while(q!=null);
        q = new Nodo(va);
        return q;
    }
    
   
    
    void agregar(){
        Nodo info=getCrearNodo();
        if(cab==null){
            cab=info;
            cab.sig=null;
            JOptionPane.showMessageDialog(null, 
            "Elemento agregado!, La lista estaba vacía.");
        }else{
            Nodo q=cab;
            while(q.sig!=null)
                q=q.sig;
            q.sig=info;
            info.sig=null;
            JOptionPane.showMessageDialog(null, "Agregado al final!");
        }
    }
    
    
        void recorrer(){
        String cadena="";
      
        if(cab==null){
            JOptionPane.showMessageDialog(null, 
            "Lista vacía.");
        }else{
            Nodo q=cab;
            cadena="";
            while(q!=null){
                cadena+=q.valor+" ";
                q=q.sig;
            }
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
        
         void borrar(){
          String cadena="";
         if(cab!=null){
          cab=null;
          cadena+="Borrado exitoso ";
        }
         JOptionPane.showMessageDialog(null, cadena+"Lista vacía.");
    }
    
   
    
        
}
