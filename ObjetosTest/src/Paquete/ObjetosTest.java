package Paquete;
import Paquete.Carro;
public class ObjetosTest {

    public static void main(String[] args) {
        // TODO code application logic here
        CarroBMW c;
        c = new CarroBMW();
        
        Pelota p = new Pelota();
        
        c.turbo();
        p.patearPelota();
        
        Carro Cdesc=new Carro("rojo","BMW");
        //System.out.println(Cdesc);
      
        
    }
    
}
