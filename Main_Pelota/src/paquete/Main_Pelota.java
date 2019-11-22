package paquete;
import paquete.Pelota;

public class Main_Pelota {

    public static void main(String[] args) {
       
        Pelota p=new Pelota(300,300);
        
        p.patearPelota();
        
        float var=p.obtenerPeso();
        System.out.println("La pelota pesa: "+p.obtenerPeso());
    
    } 
}
