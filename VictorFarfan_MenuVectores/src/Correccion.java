import javax.swing.*;
public class Correccion {
    
    public static boolean cambio;
    
    public static void CorrecionVector(int corregir){
        cambio=false;

            JOptionPane.showMessageDialog(null,correcionV(corregir));
             
        
        
    }
    
    public static String correcionV(int eliminar){
        cambio=false;
        String mensaje="Numero no encontrado";
        for (int i = 0; i < Ingreso.vec.length; i++) {
            if(Ingreso.vec[i]==eliminar){
               Ingreso.vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo numero: "));
               mensaje="Numero corregido exitosamente";
               cambio=true;
               Reporte.GenerarReporte();
                Reporte.x++;   
            }
        }
        
        return mensaje;
    }
}
