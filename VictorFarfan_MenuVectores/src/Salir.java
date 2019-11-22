import java.util.Arrays;
import javax.swing.*;
public class Salir {
    public static void Salir(){
        int choice;
        choice=JOptionPane.showConfirmDialog(null, "Desea salir?","Salida",JOptionPane.YES_NO_OPTION);
        if(choice==0){
            JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
            System.exit(0);
        }else{
            VictorFarfan_MenuVectores.main(null);
        }
    }
}
