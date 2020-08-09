/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import utils.LeerTeclado;
import examen.ResolucionExamen;
import java.util.Scanner;
/**
 *
 * @author iCE
 */
public class App {
    
     static LeerTeclado teclado=new LeerTeclado(System.in);
     static Scanner in=new Scanner(System.in);

     static int n,a,b,c;
     static double cate, cost;
     
     static Scanner leer=new Scanner(System.in);
     //class ImpuestoPorAutomoviles(int n, double cate, double cost );   
     public static void main (String[] args){
         
         ResolucionExamen obj = new ResolucionExamen();
         in=new Scanner(System.in);
         System.out.println( "Sistema de Pruebas de examen *****" );
         String opcion="SI";
         int numAlg;
         
         String algoritmosNombres=
                 
                 "****** DISFRUTA EL CODIGO :D MENU *******\n"+
                 "1= Impuesto Automotriz(porceso, categoria y costo)\n"+
                 "2= Tabla de Multiplicar 1 a 20(ingrese por teclado)\n"+
                 "3= Primeros Numeros Perfectos(ingresa numero)\n"+
                 "4= Potencia (lee base y expon)";
         
         do{
          System.out.println(algoritmosNombres);          
          numAlg=teclado.leer(0,"Ingrese el Algoritmo que desea probar: ");
          switch(numAlg){
            case 1: 
            
            obj.ImpuestoPorAutomoviles();
            
            break;
            case 2:
                obj.TablaDeMultiplicar();
              break;
            
            case 3:
                obj.numerosperfectos();
              break;
              
            case 4:
                obj.potencia();
                break;  
                
            default: System.out.println("Num de Algoritmo no existe!!"); break;

          
          }
          opcion=teclado.leer("","Desea probar mas algoritmos? SI/NO");
     }while(opcion.equals("SI")); 
    
} 

}