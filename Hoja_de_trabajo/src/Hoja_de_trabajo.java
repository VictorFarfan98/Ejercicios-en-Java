import javax.swing.JOptionPane;
public class Hoja_de_trabajo {

    public static void main(String[] args) {
        
        double sueldo=0;
        String nombre="";
        double isr=0;
        double imp=0;
        double igss=0;
        int choice=0;
        
        do{
        nombre=JOptionPane.showInputDialog(null, "Ingrese su nombre");
        sueldo=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su sueldo"));
        
        if(sueldo>4000){
            isr=sueldo*0.025;
            igss=sueldo*0.0483;
            imp=sueldo*0.05;
        }else{
            if(sueldo>3000){
                isr=sueldo*0.025;
                igss=sueldo*0.0483;
            }else{
                if(sueldo>2000){
                    igss=sueldo*0.0483;
                }else{
                JOptionPane.showMessageDialog(null,"El sueldo es demasiado bajo");
            }
            }
        }
            JOptionPane.showMessageDialog(null,"Nombre: " + nombre +"\n IGSS: " + igss +"\n ISR: " + isr + "\n Impuesto: " + imp);
            JOptionPane.showConfirmDialog(null, "Continuar?");
        }while(choice==0);
    } 
    
}


