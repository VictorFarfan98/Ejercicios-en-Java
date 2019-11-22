import javax.swing.*;
public class Eliminar {
    
    public static boolean cambio;
    
    public static void EliminarVector(int eliminar){
        cambio=false;

            JOptionPane.showMessageDialog(null,eliminacionV(eliminar));
               
        
        
    }
    
    public static String eliminacionV(int eliminar){
        cambio=false;
        String mensaje="Numero no encontrado";
        for (int i = 0; i < Ingreso.vec.length; i++) {
            if(Ingreso.vec[i]==eliminar){
               Ingreso.vec[i]=0;
               mensaje="Numero eliminado exitosamente";
               cambio=true;
               Reporte.GenerarReporte();
               Reporte.x++;
            }
        }
        
        return mensaje;
    }
}
