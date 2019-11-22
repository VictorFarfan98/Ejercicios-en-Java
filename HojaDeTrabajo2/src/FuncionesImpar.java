
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
public class FuncionesImpar {
    
    public static void LimpiarTabla() {
        Impar.scroll.setText("");
        Impar.numero.setText("");
        Impar.cadena="";
    }

    
    public static boolean validartabla(int variable) {
        boolean verdad=true;
        if (variable < 0) {
            JOptionPane.showMessageDialog(null, "No se aceptan negativos", "Error", JOptionPane.ERROR_MESSAGE);
            Impar.numero.setText("");
            verdad=false;
        }
        return verdad;
    }
    
    public static boolean impar(int numero){
        boolean res=false;
        if(numero%2==1){
            res=true;
        }
        return res;
    }
    
    
}
