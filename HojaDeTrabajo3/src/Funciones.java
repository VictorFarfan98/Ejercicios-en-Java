public class Funciones {

    
    public static void Limpiar(){
        HojaDeTrabajo3.matriz.setText("");
        HojaDeTrabajo3.primos.setText("");
        HojaDeTrabajo3.cantidad.setText("");
    }
    
    public static boolean primo(int n){
        boolean resp=false;
        int suma=0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                suma+=i;
            }
        }
        if(suma==n+1){
            resp=true;
        }
        return resp;
    }
    
    public static String cadenarv(int[] vec){
        String cadena="";
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]!=0){
                cadena+=vec[i]+",";
            }
            
        }
        return cadena;
    }

}
