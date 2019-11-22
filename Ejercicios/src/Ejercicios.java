import java.util.*;
import java.io.*;
public class Ejercicios {

    public static void main(String[] args) throws IOException {
      /*Variable menu*/
        int choice=0;
      /*Variables programa 1 */  
        int i=1;
        double N=0;
       /*Variables programa 2 */
        int cifras=0;
        int Np2=0;
        char decision;
        /*Variables programa 3 */
        int dec=0;
        /*Variables programa 4*/
        int a;
        int pos=0;
        int neg=0;
        int[] numeros = new int[10];
        double sumapos=0;
        double sumaneg=0;
        /*Variables programa 5*/
        int numAlum, b;
        double suma = 0, media;
        //Variables programa 6
        int n6=0;
        int x6=0;
        int bin=0;
       
        Scanner obj=new Scanner(System.in);
        do{
        do{
 
        System.out.println("Bienvenido al menu, escriba el numero de la accion.\n"
                + "1) Cifras Significativas \n"
                + "2) Cantidad de cifras \n"
                + "3) Pasar a binario \n"
                + "4) Array de numeros negativos y positivos \n"
                + "5) Array media de notas+\n"
                + "6) Convertir decimal a binario+\n"
                + "9) Salir");
        choice=obj.nextInt();
            if(choice>9 || choice<0)
                System.out.println("Opcion no valida");
        }while(choice>9 || choice<0);
             
        /* Inicio programa 1 */
        if(choice==1){
             for (i=1;i<=25;i++) 
             System.out.println(' '); 
             System.out.println("Vamos a dejar un numero con solo 2 decimales aproximados");
             System.out.println("Ingrese el numero: ");
             N=obj.nextDouble();  
             System.out.printf("N = %.2f \n", N);
        }
        /* Fin programa 1*/
        /*Inicio programa 2 */
        if(choice==2){
            for(i=1;i<=25;i++)
                System.out.println(" ");
            System.out.println("Vamos a ver cuantas cifras tiene un numero");
            do{
            System.out.println("Escriba un numero: ");
            Np2=obj.nextInt();
            while(Np2!=0){
                Np2=Np2/10;
                cifras++;
            
            }
                System.out.println("El numero tiene " + cifras +" cifras");
               do{
                System.out.println("Continuar? S/N");
                decision= (char)System.in.read();
                 if(decision=='s' || decision=='S' ){
                   cifras=cifras-cifras;
                    }else{
                     System.out.println("Caracter invalido");
                 }
               }while(decision!='s' && decision!='S' && decision!='N' && decision!='n');
               }while (decision!='N' && decision!='n');  
              
              
        }
        /* Fin programa 2 */ 
        /* Inicio programa 3 */
        if(choice==3){
        for(i=1;i<=25;i++)
                System.out.println(" ");
            System.out.println("Ahora vamos a pasar un numero decimal a binario");
            do{
            System.out.println("Escriba el numero a convertir: ");
            dec=obj.nextInt();
            System.out.println(Integer.toBinaryString(dec));
               if(dec<0){
                   System.out.println("El numero debe ser positivo");
               }
            }while(dec<0);    
        }
        /*Fin programa 3 */
        /*Inicio programa 4*/
        if(choice==4){   
            for(i=1; i<25; i++)
                System.out.println(" ");
            System.out.println("Ingrese 10 numeros: ");
            for (a = 0; a < 10; a++) {
                System.out.println("Numeros ["+ a + "]=");
                numeros[i]=obj.nextInt();
            }
            for (a = 0; a < 10; a++) {
                if(numeros[i]>0){
                sumapos +=numeros[a];
                pos++;
            }else{
                    if(numeros[a]<0)
                        sumaneg +=numeros[i];
                        neg++;
                } 
            }
            if(pos!=0){
                System.out.println("Media de los valores positivos: " +sumapos/pos);
            }else{
                System.out.println("No ha introducido valores negativos");
            }
            if(neg!=0){
                System.out.println("Media de los valores negativos: " +sumaneg/neg);
            }else{
                System.out.println("No ha introducido valores negativos");
            }
        }
        /* Fin programa 4*/
        /* Inicio programa 5*/
        if(choice==5){
        for(i=1; i<25; i++ )
                System.out.println(" ");
        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = obj.nextInt();
        } while (numAlum <= 0);

        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numAlum]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda
        // en cada elemento del array
        for (b = 0; b < notas.length; b++) {
            System.out.print("Alumno " + (b + 1) + " Nota final: ");
            notas[b] = obj.nextDouble();
        }

        // Sumar todas las notas
        for (b = 0; b < notas.length; b++) {
            suma = suma + notas[b];
        }

        // Calcular la media
        media = suma / notas.length;

        // Mostrar la media
        System.out.printf("Nota media del curso: %.2f %n", media);

        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (b = 0; b < notas.length; b++) {
            if (notas[b] > media) {
                System.out.println("Alumno numero " + (b + 1)+ " Nota final: " + notas[b]);
            }
        }
    }
        //Fin programa 5
        
        //Programa 6
        if(choice==6);    
            String cadena="";    
            System.out.println("Ingrese un numero: ");
            n6=obj.nextInt();
            System.out.println(Integer.toBinaryString(n6));
        
        
        if(choice==9){
           System.exit(cifras);
        }
        System.out.println("Continuar? S/N");
        decision=(char)System.in.read();
    }while(decision=='S' && decision=='s');
  }            
}
