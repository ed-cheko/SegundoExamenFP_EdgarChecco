/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
import java.util.Vector;
import utils.LeerTeclado;
/**
 *
 * @author iCE
 */
public class ResolucionExamen {
    static LeerTeclado teclado=new LeerTeclado(System.in);
    Scanner in = new Scanner(System.in);
    
    
    public  void ImpuestoPorAutomoviles() {
        int i, n;
        double categoria1, categoria2, categoria3, cate, costo;
        double impuesto, impuestototal;
        categoria1 = 0;
        categoria2 = 0;
        categoria3 = 0;
        impuestototal = 0;
        
        System.out.println("####IMPUESTOS A PAGAR####");
        System.out.println("categoría 1 pagan 10%  ");
        System.out.println("categoría 2 pagan 7%  ");
        System.out.println("categoría 3 pagan 5%  "); 
        
        System.out.println("Ingrese Cantidad de vehiculos: ");
        n = in.nextInt();
        in.nextLine();
        
        
        for (i=1; i<=n; i++) {
            System.out.println("PROCESO " + i);
            System.out.println("Ingrese la categoria: ");
            cate = in.nextDouble();
            in.nextLine();
            System.out.println("Ingrese el costo: ");
            costo = in.nextDouble();
            in.nextLine();
            impuesto=0;
            if(cate==1)
            {
                impuesto=costo*0.1;
                categoria1=categoria1+impuesto;
            }
            if(cate==2)
            {
                impuesto=costo*0.07;
                categoria2=categoria2+impuesto;
            }
            if(cate==3)
            {
                impuesto=costo*0.05;
                categoria3=categoria3+impuesto;
            }
            impuestototal=impuestototal+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria1);
        System.out.println("Valor de categoria 2: " + categoria2);
        System.out.println("Valor de categoria 3: " + categoria3);
        System.out.println("Valor de impuesto a pagar: " + impuestototal);
        
    }

    
    public void TablaDeMultiplicar() {
        
            int n,m;
            System.out.println ("Ingrese rango inicial: ");
            n = in.nextInt();
            
            System.out.println ("Ingrese rango final: ");
            m = in.nextInt();
            
            for (int i = n; i <= m; i++){
                System.out.println("##### TABLA DEL "+ i + "#####");
                for (int j = 1; j <= 10; j++){
                
                System.out.println(i + " x " + j + " = " + (i*j));
                }
                System.out.println();
            }
            }  
        
    
    
    public void numerosperfectos(){
    Scanner input = new Scanner(System.in);
    
    	
        System.out.println("Ingrese cuántos números perfectos quiere calcular: ");
        int num = input.nextInt(); // num = 4 max, con 5 es bastante cálculo;
        
		int n = 1;
		int cont = 0;
		int sum_div;
		int i;
		int j;
		int condicion = 1;
		// Creating an empty Vector 
                Vector<String> Perfectos = new Vector<String>(); 
		while (condicion == 1) {
			sum_div = 0;
			i = 1;
			while (i<n) {
				if (n % i == 0) {
					sum_div = sum_div + i;	
				}
				i = i+1;
			}
			if (sum_div == n) {
				System.out.println(String.format("El número %s es perfecto",n));
				Perfectos.add(String.valueOf(n)); // muestra la lista de Perfectos
				cont = cont+1;
			} 
			else if(sum_div != n) {
				System.out.println(String.format("El número %s no es perfecto",n));
			} 
			n = n+1;
			if(cont == num) {
				condicion = 0;
			}
			
		}
		System.out.println(String.format("En la lista hay %s números perfectos",cont));
		System.out.println(String.format("Los números perfectos son %s: ",Perfectos));

	}
    
        public void potencia(){
        int base, expon;    
        int resultado = 0;
        System.out.println("Ingrese la base: ");
            base = in.nextInt();
        System.out.println("Ingrese el exponente: ");
            expon = in.nextInt();
            
        System.out.println();
        if (expon == 0){
            resultado = 1;
        }
        else if (expon > 0){
            resultado = base * (int)Math.pow(base, expon -1);
        }
        System.out.println("El Resultado de la potencia es: ");
        System.out.println(resultado);
        }
    }




