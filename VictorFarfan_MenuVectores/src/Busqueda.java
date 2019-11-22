import javax.swing.*;
public class Busqueda {
    
    public static boolean cambio;
    
    public static void BusquedaVector(int buscar){
        //cambio=false;
        JOptionPane.showMessageDialog(null,busqueda(buscar));
        
        //System.out.println(cambio);
    }
    
    public static String busqueda(int buscar){
        String mensaje="Numero no encontrado";
        for (int i = 0; i < Ingreso.vec.length; i++) {
            if(Ingreso.vec[i]==buscar){
               mensaje = "El numero ("+buscar+") se encuentra en la posicion ["+i+"] del vector";
            }
        }
        //cambio=true;
        return mensaje;
    }
}
