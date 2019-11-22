
package Paquete;

public class Carro {
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuertas;
    String modelo="";
    
    public Carro(){
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
    }
    
    public Carro(String color, String marca){
        System.out.println("El color es :"+color+
                "\n La marca es : "+marca);
    }
    
    public double obtenerPeso(){
        return this.peso;
    }
}
    class CarroBMW extends Carro{
        public CarroBMW(){
            this.modelo="BMW";
        }
        
        public void turbo(){
            System.out.println("Acabas de viajar a 100"
                    + "millas por hora");
        }
    }

