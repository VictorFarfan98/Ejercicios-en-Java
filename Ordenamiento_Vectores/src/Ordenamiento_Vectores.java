import javax.swing.*;
public class Ordenamiento_Vectores {
    
    static int array []= {2,5,4,1,3};
    static int aux=0;
    static int x=0;
    static int y=0;
        
    public static void main(String[] args) {
        //Ordenamiento por insercion
        
        for(x=1; x<array.length; x++){
            aux=array[x];
            for(y=x-1;y>=0 && array[y]>aux; y--){
                array[y+1]=array[y];
                array[y]=aux;
            }
        }
        JOptionPane.showMessageDialog(null, array[0]+"\n"+array[1]+"\n"+array[2]+"\n"+array[3]+"\n"
        +array[4]);
        //Ordenamiento por seleccion 
        aux=0;
        int j=0;
        int i=0;
        int min=0;
        int a[]={4,1,3,2,5};
        for (i = 0; i < a.length - 1; i++){
            min = i;
            for (j = i + 1; j < a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if (i != min){
                aux= a[i];
                a[i] = a[min];
                a[min] = aux;
            }
       }
       JOptionPane.showMessageDialog(null, a[0]+"\n"+a[1]+"\n"+a[2]+"\n"+a[3]+"\n"
        +a[4]);
    }
}



