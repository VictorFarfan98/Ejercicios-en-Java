
package Paquete;

public class Pelota {
    float radio;
    float peso;
    
    public Pelota(){
        radio=100;
        peso = 250;
    }
    
    public Pelota(float radio, float peso){
        this.peso= peso;
        this.radio= radio;
    }
    
    public float obtenerRadio(){
        return radio;
    }
    
    public float obtenerPeso(){
        return peso;
    }
    
    public void patearPelota(){
            System.out.println("Haz pateado la pelota");
    }
    
    public void atraparPelota(){
        System.out.println("Haz atrapado la pelota");
    }
}


