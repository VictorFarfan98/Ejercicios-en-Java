import javax.swing.*;
public class RetoCuadro {

    public static void main(String[] args) {
        int choice=0;
        
        int x=0;
        int y=0;
        int contx=1;
        int conty=1;
        int cont=1;
        int a=0;
        String cadx1="";
        String cadreverse="";
        String cady1="";
        String cady2="";
        String cadcomplete="";
        
        String[] reverse= new String[20];
        reverse[0]="                                     X";//37 Espacios
        reverse[1]="                                  XX";
        reverse[2]="                                XXX";
        reverse[3]="                             XXXX";
        reverse[4]="                           XXXXX";
        reverse[5]="                        XXXXXX";
        reverse[6]="                     XXXXXXX";
        reverse[7]="                  XXXXXXXX";
        reverse[8]="                XXXXXXXXX";
        reverse[9]="             XXXXXXXXXX";
        reverse[10]="          XXXXXXXXXXX";//Fix//Fix
        reverse[11]="        XXXXXXXXXXXX";//Fix//Fix
        reverse[12]="     XXXXXXXXXXXXX";
        reverse[13]="  XXXXXXXXXXXXXX";//Fix//Fix//Fix
        reverse[14]="XXXXXXXXXXXXXXX";
        
        x=0;
        y=0;
        contx=1;
        conty=1;
        cont=1;
        a=0;
        cadx1="";
        cadreverse="";
        cady1="";
        cady2="";
        cadcomplete="";
        
        
        do{
        
        //Caso 1
        for(x=1;x<=15;x++){
                cadx1+="X";
                JOptionPane.showMessageDialog(null, cadx1);
                contx++;
        }
        //Caso 2
        for(y=1;y<=3;y++){
            if(conty==1){
                cady1+=cadx1+ "\n                                     X\n";
                JOptionPane.showMessageDialog(null, cady1);
                conty++;
                cadcomplete=cady1;
            }else{
                do{
                cady2+=cadcomplete+"                                     X\n";
                JOptionPane.showMessageDialog(null, cady2);
                cadcomplete=cady2;
                cady2="";
                cont++;
                }while(cont<=1);
            }    
        }
        //caso 3 
        x=0;
        for(x=1; x<=15; x++){
            cadreverse=cadcomplete + reverse[a];
            a++;
            JOptionPane.showMessageDialog(null, cadreverse);        
        }
        cadcomplete=cadreverse;
        //caso 4 
        y=0;
        conty=0;
        cady1="";
        cady2="";
        cont=1;
        cadcomplete=cadcomplete+"\n";
        for(y=1;y<=3;y++){
            if(conty==1){
                cady1+=cadcomplete+ "\nX\n";
                JOptionPane.showMessageDialog(null, cady1);
                conty++;
                cadcomplete=cady1;
            }else{
                do{
                cady2+=cadcomplete+"X\n";
                JOptionPane.showMessageDialog(null, cady2);
                cadcomplete=cady2;
                cady2="";
                cont++;
                }while(cont<=1);
            }    
        }
        //caso 5
        
        for(x=1;x<=15;x++){
                cadcomplete+="X";
                JOptionPane.showMessageDialog(null, cadcomplete
                );
                contx++;
        }
        
        JOptionPane.showMessageDialog(null, "Ha llegado al final! ", "Final ",JOptionPane.INFORMATION_MESSAGE);  
        choice=JOptionPane.showConfirmDialog(null, "Continuar? ", "Salida", JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Gracias por usar el programa","Salida",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        }while(choice==JOptionPane.YES_OPTION);
    }
    
}
