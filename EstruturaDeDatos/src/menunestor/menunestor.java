

  package menunestor;

/**
 *
 * @author nestor asdasdsa
 */

import java.util.Scanner;

import javax.swing.JOptionPane;
public class menunestor {

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        Operaciones operar = new Operaciones();
        int opcion=0;
        double resultado;
        int numero1=9;
        int numero2=12;
       
        
        
       do{
       try{
           //menu principal
       opcion=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
               +"\n 1 mostrar calculadora"
               +"\n 2 mostrar arreglo"
               +"\n 3 mostrar matriz"
               +"\n 4 mostrar ordenamiento "
               +"\n 5 mostrar listas "
               +"\n 6 mostrar pilas "
               +"\n 7 mostrar colas "
               +"\n 8 salir"));
       }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
       }
       switch(opcion){
               //submenu 
               case 1:
               JOptionPane.showMessageDialog(null,"mostrar calculadora");
                try{
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la opcion a realizar"
               +"\n 1 operaciones basicas"
               +"\n 2 ejercicios de arreglo"
               +"\n 3 ejercicio de matrices"
               +"\n 4 ejercicio de ordenamiento"
               +"\n 5 ejercicio listas "
               +"\n 6 ejercicio pilas "        
               +"\n 7 salir"));
               }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Debe ingresar solo valores ");
               }
               //menu de operaciones basicas
               //aplicando set y get  
               switch(opcion){
                   case 1:
                    JOptionPane.showMessageDialog(null,"realizar operacione basicas");
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja la operacion a realizar"
                    +"\n 1 realizar suma"
                    +"\n 2 realizar resta"
                    +"\n 3 realizar multiplicacion"
                    +"\n 4 realizar division"
                    +"\n 5 volver")); 
                    //ejecuta la operacion con los get y set
                   switch(opcion){
                       case 1:
                       opcion=1;
                       JOptionPane.showMessageDialog(null,operar.sumar(numero1,numero2));
                       break; 
                       case 2:
                       opcion=2;
                       JOptionPane.showMessageDialog(null,operar.resta(numero1,numero2));
                       break;
                       case 3:
                       opcion=3;
                        JOptionPane.showMessageDialog(null,operar.multiplicar(numero1,numero2));
                       break;
                       case 4:
                       opcion=4;
                       JOptionPane.showMessageDialog(null,operar.dividir(numero1,numero2));
                       break;
                       default:
                        opcion=5;   
                       JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
                       break; 
                   } 
                 }
                       
               case 2:
                   //menu de arreglo
               opcion=2;  
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ejercio de arreglo"
                    + "\n 1. arreglo notas."
                    + "\n 2. arreglo numeros."  
                    + "\n 3.finalizar"));
                switch(opcion){
                       case 1:
                       opcion=1;
                    int nota[]=new int[3];
                    int cantidadaprobados=0,cantidaddesaprobados=0,notamenor,notamayor;
                    for(int i=0;i<nota.length;i++){
                    nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar nota :"+(i+1)));
                    }
                    notamayor=nota[0];
                    notamenor=nota[0];
                    for(int i=0;i<nota.length;i++){
                        if(nota[i]>10.4){
                       cantidadaprobados = cantidadaprobados+1;
                        }else{
                            cantidaddesaprobados=cantidaddesaprobados+1;
                        }
                        if(notamayor<nota[i]){
                            notamayor=nota[i];
                        }else if(notamenor>nota[i]){
                            notamenor=nota[i];
                        }
                    }
JOptionPane.showMessageDialog(null,"nota mayor"+notamayor+"\nnota menor:"+notamenor+"\ncantidad aprobados:"
        +cantidadaprobados+"\ncantidad desaprobados:"+cantidaddesaprobados);                    
                       break;
                       case 2:
                       opcion=2;
                       int mayor,menor,suma=0;        
                        int [] nums={3,4,8,2};//asignamos directamente los valores del vector        
                        suma=0;        
                        menor=nums[0];        
                        mayor=nums[0];    
                        for(int i=0;i<nums.length;i++){
                        if (nums[i]>mayor){           
                        mayor=nums[i];          
                        }

                        if (nums[i]<menor){         
                        menor=nums[i];          
                        }
                        suma+=nums[i];     
                        }
                        JOptionPane.showMessageDialog(null,"el mayor es:"+mayor);
                        JOptionPane.showMessageDialog(null,"el menor es:"+menor);
                        JOptionPane.showMessageDialog(null,"la suma es"+suma);
  
                       break;
                       default:
                      JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");     
                   
                }  
               break;
               case 3:
                   //menu de matriz
               opcion=3;    
               JOptionPane.showMessageDialog(null,"mostrar operacion matrices");
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ejercio de matriz"
                    + "\n 1. matriz."  
                    + "\n 2.finalizar"));
               
               switch(opcion){
                       case 1:
                       opcion=1;
                String acu =  " " ;
		int i = 0 , j = 0 ;
		int matriz [] [];
		matriz =new int[5][5];
		for(i=0;i<5;i++){
		for(j=0;j<5;j++){
		matriz[i][j]=j+i;
		if(j==4){
		acu=""+acu+""+ matriz[i][j]+"\n" ;
		} else{
	        acu = " " + acu + "      " + matriz [i] [j];
		}		
		}
		} JOptionPane.showMessageDialog(null,"Matriz 5x5 "+"\n"+ acu); 
                break;
                case 2:
                opcion=2;
                JOptionPane.showMessageDialog(null,"salir");
                default:
                JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");    
               }         
               case 4:
                   //EJERCICIOS ORDENAMIENTO
               opcion=4; 
               JOptionPane.showMessageDialog(null,"Bienvenido a los ejercicios de ordenamiento");
               opcion=Integer.parseInt(JOptionPane.showInputDialog("escoja el ordenamiento"
                    + "\n 1. Ordenamiento Burbuja."
                    + "\n 2. Ordenamiento Shell."  
                    + "\n 3.finalizar"));
                  
            switch(opcion){
                case 1:
                    opcion=1;
                   JOptionPane.showMessageDialog(null,"ordenamiento burbuja");
                   int arreglo[],nElementos,aux;
                   nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
                   arreglo=new int[nElementos];
                   for(int i=0;i<nElementos;i++){
                       System.out.println((i+1)+"Digite un número:");
                       arreglo[i] = entrada.nextInt();
                   }
                   for(int i=0;i<(nElementos-1);i++){
                     for(int j=0;j<(nElementos-1);j++){
                      if(arreglo[j]>arreglo[j+1]){
                          aux = arreglo[j];
                          arreglo[j]=arreglo[j+1];
                          arreglo[j+1]=aux;
                          
                      }   
                     }  
                   }
                    System.out.println("\nArreglo ordenado en forma creciente:");
                    for(int i=0;i<nElementos;i++){;
                    System.out.println(arreglo[i]+" - ");
                    }
                    System.out.println();
                    break;
                case 2:
                    opcion=2;
                    JOptionPane.showMessageDialog(null,"ordenamiento shell");
                    
                    
                    
                    
                    break;   
                default:
                    JOptionPane.showMessageDialog(null, "Opción No Valida");
                  
            }
               case 5:
                   opcion=5;
                break;   
               
                 
               default:   
               JOptionPane.showMessageDialog(null,"ingreso una opcion no valida");
               break;
              }
                       
       
        
     }while(opcion>0 && opcion <=7);   

   
    }
}

    