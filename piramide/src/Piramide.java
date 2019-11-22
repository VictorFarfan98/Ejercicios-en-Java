import java.util.Scanner;
public class Piramide {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op=0;
        System.out.println("Elija una opcion \n"
                + "1) Exponentes"
                + "2) Piramide"
                + "3) Salir");
        try{
            op=sc.nextInt();
            switch(op){
                case 1: 
                    int n;
                    String cad1="";
                    System.out.println("Ingrese un numero");
                    n=sc.nextInt();
                    for (int x = 0; x <= n; x++) {
                        cad1+=(int) Math.pow(10,x)+"\n";
                    }
                    System.out.println(cad1);
                    break;
                case 2:
                    String cad2="";
                    String cadtotal="";
                    
                    for (int x = 1; x <= 5; x++) {
                        cad2+=x;
                        cadtotal=cad2;
                        System.out.println(cad2);
                    }
                    cad2+="\n";
                    int i=1;
                    for (int j = 4; j > 0; j--) {
                        cad2="";
                        i=1;
                        do{
                            cad2+=i;
                            i++;
                        }while(i<=j);
                        cadtotal=cad2;
                        System.out.println(cadtotal);
                        
                    }

                    break;
                case 3: 
                    System.exit(0);
                    break;
                            
                            default:
            }
        }catch(Exception ex){
            System.err.println("Caracter no admitido");
        }finally{
            main(null);
        }
        
    }
    
}
