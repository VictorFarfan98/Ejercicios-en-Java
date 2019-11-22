import javax.swing.*;
public class Ejercicio_MenuLetras {
    public static void main(String[] args) {
        char op=' ';
        String menu="";
        int choice=0;
        //Variables Programa 1
        int n=0;
        int x=0;
        int piramide=1;
        int y=0;
        String cadena="";
        String cadenas="";
        //Programa 2
        int col=0;
        int fila=0;
        String cadena2="";
        //Programa 3 
        int num=0;
        int resp=0;
        int primo=0;
        int cont=0;
        
        menu=JOptionPane.showInputDialog
                    (null,"Menu Principal\n"
                            + "A.Piramide de numeros\n"
                            + "B.Cuadrado\n" 
                            + "C.Numero Mersenee\n"
                            + "D.Salir del sistema");
        menu=menu.toLowerCase();
        op=menu.charAt(0);
        
        switch(op){
            case 'a':
                try{
                do{
                n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero","Ingreso",JOptionPane.QUESTION_MESSAGE));
                if(n<0){
                    JOptionPane.showMessageDialog(null,"No se admiten negativos","Error",JOptionPane.ERROR_MESSAGE);
                }
                }while(n<0);
                
                do{
                    cadena+=piramide;
                    cadenas+=cadena+"\n";
                    piramide++;
                    x++;
                }while(x<n);
                do{
                x=0;
                cadena="";
                piramide=1;    
                do{
                    cadena+=piramide;
                    piramide++;
                    x++;
                }while(x<n-1);
                cadenas+=cadena+"\n";
                n=n-1;
                }while(n>1);
                JOptionPane.showMessageDialog(null,cadenas);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Caracter no admitido","Error",JOptionPane.ERROR_MESSAGE);
                }finally{
                    main(null);
                }
            case 'b':
                for(col=0;col<=4;col++){
                    do{
                        cadena2+="*";
                        fila++;
                    }while(fila<=10);
                    cadena2+="\n";
                    fila=0;
                }
                JOptionPane.showMessageDialog(null, cadena2);
                main(null);
                
            case 'c':
                try{
                do{
                num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero:","Ingreso",JOptionPane.QUESTION_MESSAGE));
                if(num<0){
                    JOptionPane.showMessageDialog(null,"No se aceptan negativos","Error",JOptionPane.ERROR_MESSAGE);
                }
                }while(num<0);
                resp=(int) Math.pow(2,num);
                resp=resp-1;
                
                do{
                    cont++;
                    if(num%cont==0){
                        primo++;
                    }
                    
                }while(cont<=num);
                if(primo==2){
                    JOptionPane.showMessageDialog(null, "Es primo de Mersenee");
                }else{
                    JOptionPane.showMessageDialog(null, "No es primo de Mersenee");
                }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Caracter no admitido","Error",JOptionPane.ERROR_MESSAGE);
                }finally{
                    main(null);
                }
            case 'd':
              choice=JOptionPane.showConfirmDialog(null,"Esta seguro que sea salir?","Confirmacion",JOptionPane.YES_NO_OPTION);  
              if(choice==JOptionPane.YES_OPTION){
                  System.exit(0);
              }else{
                  main(null);
              }  
                
        }
    }   
}
