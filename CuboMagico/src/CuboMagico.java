import javax.swing.*;
public class CuboMagico {
static int mat[][]=new int [4][4];
static boolean igual=true;
    public static void main(String[] args) {
        int op=0;
        op=Integer.parseInt(JOptionPane.showInputDialog(null,"1) Cubo magico \n" 
                + "2) Test"));
        switch(op){
            case 1:
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: [" + i + "][" + j + "]"));           
                    }
                }
                cubo();
                if(igual==true){
                    JOptionPane.showMessageDialog(null,"Es un cubo magico");
                }else{
                    JOptionPane.showMessageDialog(null,"No es un cubo magico");
                }
                break;
                
            case 2:
                String n="n";
                String cantidad ="";
                for (int i = 0; i < 10; i++) {
                    cantidad=Integer.toString(i);
            
                    n=n+i;
                    System.out.println(n);
                    n="n";
                }
                break;
        }
        
    }
    public static void cubo(){
        int lados[]=new int [10];
        String cad="l";
        int x=0; int tot=0;
        int suma=0;
        int i=0, j=0;
        while(x<4){
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                suma+=mat[i][j];
            }
            lados[x]=suma;
            tot=lados[0];
            x++;
            if(suma!=tot){
                igual=false;
            }
            suma=0;
        }
        }
        //System.out.println(x);
        while(x<8){
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat.length; j++) {
                suma+=mat[j][i];
            }
            lados[x]=suma;
            
            x++;
            if(suma!=tot){
                igual=false;
            }
            suma=0;
        }
        }
        //System.out.println(x);
        suma=0;
        i=0;
        j=0;
        while(i<mat.length && j<mat.length){
            suma+=mat[i][j];
            i++;
            j++;
        }
        //System.out.println(x);
        lados[x]=suma;
        if(suma!=tot){
                igual=false;
        }
        x++;
        suma=0;
        i=0; j=mat.length-1;
        while(i<mat.length && j>=0){
            suma+=mat[i][j];
            i++;
            j--;
        }
        //System.out.println(x);
        lados[x]=suma;
        if(suma!=tot){
                igual=false;
            }
    }
}
