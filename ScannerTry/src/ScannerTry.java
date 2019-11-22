import java.util.Scanner;
public class ScannerTry {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int vec[]=new int [5];
        String cadena="";
        try{
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese un valor para el vector en ["+i+"]");
            vec[i]=sc.nextInt();
            cadena+=+vec[i]+",";
        }
        }catch(Exception ex){
            System.err.println("Caracter no admitido");
        }finally{
            main(null);
        }
        System.out.println(cadena);
    }
    
}
