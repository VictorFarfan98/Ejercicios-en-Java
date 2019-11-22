package src;

import javax.swing.*;
public class Funciones {
    
    public static String cadenarv(int vec[]){
        String cad="";
        for (int i = 0; i < vec.length; i++) {
            cad+=vec[i]+"\n";
        }
        return cad;
    }
    
    public static int[] IngresoVector(int tamaño){
        int vec[]=new int [tamaño];
        for (int i = 0; i < tamaño; i++) {
            vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para el vector en la posicion ["+i+"]"));
        }
        return vec;
    }
    
    public static int Σdiv_numero(int n){
        int suma=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                suma+=i;
            }
        }
        return suma;
    }
    
    public static int[] divisores(int n){
        int x=0;
        int y;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                x++;
            }
        }
        
        int vec[]=new int [x+1];
        y=x;
        x=0;
        do{
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                vec[x]=i;
                x++;
            }
        }
        }while(x<y);
        vec[vec.length-1]=n;
        return vec;
    }
}
