import javax.swing.*;
public class VictorFarfan_MenuVectores {

    public static void main(String[] args) {
        // TODO code application logic here
        String botones[]={"Ingreso","Busqueda","Eliminar","Correccion","Reporte","Salir"};
        int op;
        
        op=JOptionPane.showOptionDialog(null,"Elija una opcion","Menu",JOptionPane.PLAIN_MESSAGE,JOptionPane.INFORMATION_MESSAGE,null,botones,null);
        try{
        switch(op){
            case 0:
                Ingreso.IngresoVector();
                JOptionPane.showMessageDialog(null,Funciones.cadenarv(Ingreso.vec));
                break;
            case 1:
                int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a buscar :"));
                Busqueda.BusquedaVector(buscar);
                JOptionPane.showMessageDialog(null,Funciones.cadenarv(Ingreso.vec));
                break;
            case 2:
                int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a eliminar :"));
                Eliminar.EliminarVector(eliminar);
                JOptionPane.showMessageDialog(null,Funciones.cadenarv(Ingreso.vec));
                break;
            case 3:
                int corregir = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a corregir :"));
                Correccion.CorrecionVector(corregir);
                JOptionPane.showMessageDialog(null,Funciones.cadenarv(Ingreso.vec));
                break;
            case 4:
                Reporte.ImprimirReporte();
                break;
            case 5:
                Salir.Salir();
                break;   
                
            default:    
        }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Caracter no admitido","Error",JOptionPane.ERROR_MESSAGE);
        }finally{
            main(null);
        }
    }
    
}
