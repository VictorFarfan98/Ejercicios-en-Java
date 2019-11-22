
public class Array {

    public static void main(String[] args) {
     
        int x[];//Declaracion de Array
        x=new int [3];//Tamaño de Array
        
        x[0]=10;
        x[1]=5;
        x[2]=7;
        
        for(int i=0; i<x.length;i++){
            System.out.println("Arreglo in indice:"
                    +i+" es igual a: "+ x[i]);
        }
                
    }       
}
