
import javax.swing.JOptionPane;


public class Funciones {
    
    public static void Limpiar(){
        MainForm.scroll.setText("");
    }
    
    public static String collatz(int num){
        String cadena=num+"\n";
        do{
            if(num%2==0){
                num=num/2;
                cadena+=num+"\n";
            }else{
                num=(num*3)+1;
                cadena+=num+"\n";
            }
        }while(num>1);
        return cadena;
    }
    
    public static boolean validarnumero(int variable) {
        boolean verdad=true;
        if (variable < 0) {
            JOptionPane.showMessageDialog(null, "No se aceptan negativos", "Error", JOptionPane.ERROR_MESSAGE);
            verdad=false;
        }
        
        return verdad;
    }
    
    
}
