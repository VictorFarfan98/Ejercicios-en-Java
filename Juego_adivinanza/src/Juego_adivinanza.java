import java.util.*;
import java.io.*;
public class Juego_adivinanza {

 
    public static void main(String[] args) {
        
        int i=1;
        int vidas=3;
        int num=0;
        int choice=0;
        Random rnd=new Random();
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Vamos a adivinar un numero del 1 al 10 \n Solo tendras 3 vidas.");
        num=rnd.nextInt(11); 
        System.out.println("El numero es: " +num);
        do{
        System.out.println("Ingrese un numero");
        choice=obj.nextInt();
        
         if(choice==num){
            System.out.println("Felicidades ha ganado!!");
            System.exit(vidas);
         }
        
        if(choice!=num){
            for(i=1; i<25; i++)
                System.out.println(" ");
            System.out.println("Numero incorrecto \n"
                    + "Siga intentando");
         
            vidas--;
            System.out.println("Le quedan " + vidas + " vidas ");
          
        }
         if(vidas==0){
             System.out.println("Ha perdido :(");
             System.exit(vidas);
         }
      
             
        }while(choice!=0);
 
    
  }
}
    

