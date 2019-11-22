package paquete;
import paquete.Funciones;
import javax.swing.*;

public class Menu extends Funciones {

    public static void main(String[] args) {
        // TODO code application logic here
        String botones[]={"Amigo","Salir"};
        int op=JOptionPane.showOptionDialog(null,"Elija una opcion: ","Menu",JOptionPane.INFORMATION_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,botones,null);
        int vector[]= new int [5];
        try{
            switch(op){
                case 0:
                    int n1,n2;
                    /*n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                    n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                    //JOptionPane.showMessageDialog(null, Funciones.cadenarv(vector));
                    System.out.println(Funciones.Σnumero(n1));
                        System.out.println(Funciones.Σnumero(n2));
                    if(Funciones.Σnumero(n1)==n2 && Funciones.Σnumero(n2)==n1){
                        
                        JOptionPane.showMessageDialog(null,"Son amigos");
                    }else{
                        JOptionPane.showMessageDialog(null,"No son amigos");
                    }
                            */
                    n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
                    JOptionPane.showMessageDialog(null, Funciones.cadenarv(Funciones.divisores(n1)));
                    break;
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    
    
}
