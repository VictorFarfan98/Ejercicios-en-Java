
import javax.swing.*;
public class Ingreso {
    public static int vec[]=new int[5];
    
    public static void IngresoVector(){
        int choice;
        
       
        if(vec[0]==0){
            for (int i = 0; i < vec.length; i++) {
                do{
                    vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para la posicion ["+i+"]"));
                    if(vec[i]<=0){
                        JOptionPane.showMessageDialog(null,"No se admiten negativos o 0","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }while(vec[i]<=0);
            }
        }else{
            choice=JOptionPane.showConfirmDialog(null,"Desea sobreescribir el vector? ","Ingreso",JOptionPane.YES_NO_OPTION);
            if(choice==0){
                for (int i = 0; i < vec.length; i++) {
                    do{
                        vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para la posicion ["+i+"]"));
                        if(vec[i]<=0){
                            JOptionPane.showMessageDialog(null,"No se admiten negativos o 0","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }while(vec[i]<=0);
                }
            }else{
                VictorFarfan_MenuVectores.main(null);
            }
        }
        Reporte.cadena.addElement("Vector Original \n"+Funciones.cadenarv(vec));
        
    }
}
