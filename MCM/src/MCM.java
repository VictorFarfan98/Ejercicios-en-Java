import javax.swing.*;
public class MCM {

    public static void main(String[] args) {
        // TODO code application logic here
        char letra = 'a';
        int op=0;
        String menu="";
        
        
        menu=JOptionPane.showInputDialog(null,"Elija una opcion: \n"
                + "A) Suma"
                + "B) Resta");
        menu=menu.toLowerCase();
        letra=menu.charAt(0);
        
        switch(letra){
            case 'a':
                System.out.println("suma");
                break;
            case 'b': 
                System.out.println("resta");
                break;
        }
    }
    
}
