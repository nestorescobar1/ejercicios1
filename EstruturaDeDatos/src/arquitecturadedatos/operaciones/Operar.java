/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquitecturadedatos.operaciones;

/**
 *
 * @author usuario
 */
public class Operar {
    private double res;
    public void operar(){
     res=0;
    }
    //Métodos setters
    public double sumar(double a, double b){
        res=a+b;
    return res;
    }
     public double restar(double a, double b){
        res=a-b;
    return res;
    }
      public double multiplicar(double a, double b){
        res=a*b;
    return res;
    }
       public double dividir(double a, double b){
        res=a/b;
    return res;
    }
    
    
}
