import javax.swing.*;
public class OrdenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vec[]=new int[5];
        String cad="";
        int aux=0;
        for (int i = 0; i < vec.length; i++) {
            vec[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        }
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length-1; j++) {
                if(vec[j+1]<vec[j]){
                    aux=vec[j];
                    vec[j]=vec[j+1];
                    vec[j+1]=aux;
                }
            }
        }
        for (int i = 0; i < vec.length; i++) {
            cad+=vec[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, cad);
    }
    
}
