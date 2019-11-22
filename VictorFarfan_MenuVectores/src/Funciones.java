import javax.swing.*;
public class Funciones {
    
    public static String cadenarv(int vec[]){
        String cad="";
        for (int i = 0; i < vec.length; i++) {
            cad+=vec[i]+"\n";
        }
        return cad;
    }
}
