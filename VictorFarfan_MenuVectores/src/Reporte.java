import javax.swing.*;
import java.util.Vector;
public class Reporte {
    
    public static boolean cambio;
    public static int x=1;
    public static Vector<String> cadena = new Vector<String>();
    
    public static void ImprimirReporte(){
        for (int i = 0; i < cadena.size()-1; i++) {
            JOptionPane.showMessageDialog(null, cadena.elementAt(i));
        }
        
    }
    
    public static void GenerarReporte(){
        if(Eliminar.cambio==true){
            cadena.addElement("Cambio #"+x+"\n"+Funciones.cadenarv(Ingreso.vec));
        }
        if(Correccion.cambio==true){
            cadena.addElement("Cambio #"+x+"\n"+Funciones.cadenarv(Ingreso.vec));
        }
    }
}
