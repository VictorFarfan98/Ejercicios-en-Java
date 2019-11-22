import java.util.Scanner;
import java.io.*;
public class PracticaPrelab {

    public static void main(String[] args) throws IOException {
        
        Scanner sc=new Scanner (System.in);
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        
        int n1=0;
        int n2=0;
        int suma=0;
        /*
        System.out.println("Ingrese el primer numero");
        n1=sc.nextInt();
        System.out.println("Ingrese el primer numero");
        n2=sc.nextInt();
        suma= n1+n2;
        System.out.println("La suma es: "+suma);
        */
        System.out.println("Ingrese el primer numero");
        n1=Integer.parseInt(br.readLine());
        System.out.println("Ingrese el segundo numero");
        n2=Integer.parseInt(br.readLine());
        suma=n1+n2;
        System.out.println(suma);
                
    }
    
}
