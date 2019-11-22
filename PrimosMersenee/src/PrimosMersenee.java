import javax.swing.*;
public class PrimosMersenee {
    public static void main(String[] args) {
        int x=0;
        int contprimo=0;
        int vec[]=new int [5];
        int mer=0;
        int y=0;
        int contmer=0;
        
        for(x=0; x<vec.length; x++){
            contprimo=0;
            vec[x]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
            //Sacamos mersenee
            mer=(int) Math.pow(2,vec[x]);
            mer=mer-1;
            //Mersenee tiene que ser primo
            for(y=1; y<=mer; y++){
                if(mer%y==0){
                    contprimo++;
                }
            }
            if(contprimo==2){//Es primo
                contmer++;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+contmer+ " primos de mersenee");
        
    }
    
}
