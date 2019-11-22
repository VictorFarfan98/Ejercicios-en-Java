import javax.swing.*;
public class Listado_de_Primos {

    public static void main(String[] args) {
      int num=0;
      int x=0;
      int primo=0;
      String cadena="";
      
      do{
      num+=1;
      
      do{
          x++;
          if(num%x==0){
              primo++;
          }
      }while(x<=num);
      if(primo==2){
          cadena+=x+"\n";
      }
      }while(num<101);
      JOptionPane.showMessageDialog(null, cadena);
      
      }
       
    }   

