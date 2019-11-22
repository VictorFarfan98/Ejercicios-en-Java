package src;

import javax.swing.JOptionPane;
import src.Funciones;
public class EjerciciosPrelab {

    public static void main(String[] args) {
        // TODO code application logic here
        String botones []={"Numero Perfecto","Numero Primo","Numero Amigo","Numero Abundante","Fibonacci\n","Primos Gemelos","Primo Mersene","Numero Fermat","Salir"};
        int op;
        op=JOptionPane.showOptionDialog(null, "Elija una opcion", "Menu",JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE,  null, botones, null);
        //op=Integer.parseInt(JOptionPane.showInputDialog(null,"Elija una opcion "));
        //System.out.println(op);
        switch(op){
            case 0:
                NumeroPerfecto();
                break;
            case 1:
                NumeroPrimo();
                break;
            case 2:
                NumeroAmigo();
                break;
            case 3:
                NumeroAbundantes();
                break;
            case 4:
                Fibonacci();
                break;
            case 5:
                PrimosGemelos();
                break;
            case 6:
                PrimoMersene();
                break;
            case 7:
                NumeroFermat();
                break;
            case 8:   
                Salida();
                break;
                
        }
    }
    
    public static void NumeroPerfecto(){
        int n;
        int suma=0;
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                suma+=i;
            }
        }
        if(suma==n){
            JOptionPane.showMessageDialog(null,"Es un numero perfecto");
        }else{
            JOptionPane.showMessageDialog(null,"No es un numero perfecto");
        }
    }
 
    public static void NumeroPrimo(){
        int n;
        int suma=0;
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                suma+=i;
            }   
        }
        System.out.println(suma);
        if(suma==n+1){
            JOptionPane.showMessageDialog(null,"Es un numero primo");
        }else{
            JOptionPane.showMessageDialog(null,"No es un numero primo");
        }  
    }
    
    public static void NumeroAmigo(){
        int n1, n2, suma1=0, suma2=0;
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero : "));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro numero : "));
        for (int i = 1; i < n1; i++) {
            if(n1%i==0){
                suma1+=i;
            }
        }
        for (int i = 1; i < n2; i++) {
            if(n2%i==0){
                suma2+=i;
            }
        }
        //System.out.println(suma1);
        //System.out.println(suma2);
        if(suma1==n2 && suma2==n1){
            JOptionPane.showMessageDialog(null,"Son numeros amigos");
        }else{
            JOptionPane.showMessageDialog(null,"No son numeros amigos");
        }
    }
    
    public static void NumeroAbundantes(){
        int n, suma=0;
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero : "));
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                suma+=i;
            }
        }
        if(suma>n){
            JOptionPane.showMessageDialog(null,"Es un numero abundante");
        }else{
            JOptionPane.showMessageDialog(null,"No es un numero abundante");
        }
         
    }
    
    public static void Fibonacci(){
        int limite=0;
        limite=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero limite"));
        int n1=0, n2=1, n3;
        int x=2;
        String cad=n1+","+n2+",";
        do{
            n3=n1+n2;
            cad+=n3+",";
            n1=n2;
            n2=n3;
            
            
            x++;
        }while(x<limite);
        JOptionPane.showMessageDialog(null,cad);
       
    }
    
    public static void PrimosGemelos(){
        int n1=0, n2=0;
        boolean gemelo=false;
        do{
            n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero primo"));
            n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese otro numero primo"));
            if(Funciones.Σdiv_numero(n1)!=1 || Funciones.Σdiv_numero(n2)!=1 ){
                JOptionPane.showMessageDialog(null,"Uno de los numeros no es primo, intente de nuevo","Error",JOptionPane.ERROR_MESSAGE);
            }
        }while(Funciones.Σdiv_numero(n1)!=1 || Funciones.Σdiv_numero(n2)!=1);
        
        if(n1-n2==2 || n2-n1==2){
            gemelo=true;
        }
        
        if(gemelo=true){
            JOptionPane.showMessageDialog(null,"Son primos gemelos");
        }else{
            JOptionPane.showMessageDialog(null,"No son primos gemelos");
        }
    }
    
    public static void PrimoMersene(){
        int exp=0;
        do{
            exp=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un exponente primo"));
            if(Funciones.Σdiv_numero(exp)!=1){
                JOptionPane.showMessageDialog(null,"El exponente debe ser primo, intente de nuevo","Error",JOptionPane.ERROR_MESSAGE);
            }
        }while(Funciones.Σdiv_numero(exp)!=1);
        int mer=0;
        mer=(int) Math.pow(2, exp)-1;
        if(Funciones.Σdiv_numero(mer)==1){
            JOptionPane.showMessageDialog(null,"Es un primo de mersene");
        }else{
            JOptionPane.showMessageDialog(null,"No es un primo de mersene");
        }
    }
    
    public static void NumeroFermat(){
        int exp=0;
        exp=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un exponente :"));
        int fermat=0;
        fermat=(int) Math.pow(2,exp*2)+1;
        JOptionPane.showMessageDialog(null,"El fermat es : "+fermat);
    }
    
    public static void Salida(){
        int choice=0;
        choice=JOptionPane.showConfirmDialog(null,"Desea salir","Salida",JOptionPane.YES_NO_OPTION);
        if(choice==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
            System.exit(0);
        }else{
            main(null);
        }
    }
}
