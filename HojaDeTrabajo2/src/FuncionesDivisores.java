
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vafm9
 */
public class FuncionesDivisores {
    public static void LimpiarTabla() {
        Divisores.scroll.setText("");
        Divisores.numero.setText("");
        //Divisores.cadena="";
    }
    
    
    public static boolean validarnegativos(int variable) {
        boolean verdad=true;
        if (variable < 0) {
            JOptionPane.showMessageDialog(null, "No se aceptan negativos", "Error", JOptionPane.ERROR_MESSAGE);
            Divisores.numero.setText("");
            verdad=false;
        }
        return verdad;
    }
    
    public static int[] sacarDivisores(int numero){
        int x=0;
        int respuesta[]=new int[numero];
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0){
                respuesta[x]=i;
                x++;
            }
        }
        
        return respuesta;
    }
    
    public static String cadenarvector(int[] vec){
        String cadena="";
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]!=0){
                cadena+=vec[i]+"\n";
            }
            
        }
        return cadena;
    }
    
}
