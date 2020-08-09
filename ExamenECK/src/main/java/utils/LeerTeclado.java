/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeerTeclado {
    BufferedReader leerT=new BufferedReader(new InputStreamReader(System.in));

    public LeerTeclado(InputStream in) {
        
    }

    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(leerT.readLine());
        } catch (IOException e) {            
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public String leer(String dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerT.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }

    public char leer(char dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=leerT.readLine().charAt(0);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }        

    public double leer(double dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Double.parseDouble(leerT.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }   

    public int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void nextLine() {
        
    }

    public double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
