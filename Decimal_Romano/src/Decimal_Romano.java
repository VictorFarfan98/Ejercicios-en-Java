import javax.swing.*;
public class Decimal_Romano {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int ndecimal=0;
        String romanou="";
        String romanod="";
        String romanoc="";
        String romanom="";
        int x=1;
        
        int centena=0;
        int decena=0;
        int unidad=0;
        int millar=0;
        
        ndecimal=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a convertir"));
  
        unidad=ndecimal%10;
        ndecimal=ndecimal/10;
       
        decena=ndecimal%10;
        ndecimal=ndecimal/10;
       
        centena=ndecimal%10;
        ndecimal=ndecimal/10;
       
        millar=ndecimal%10;
        ndecimal=ndecimal/10;
        //Unidades 
        for(x=1; x<=unidad; x++){
            if(x<=3){
            romanou+="I";
            }
            if(x==4){
               romanou="";
               romanou="IV";
            }
            if(x==5){
                romanou="";
                romanou="V";
            }
            if(x>5 && x<=8){
                romanou+="I";
            }
            if(x==9){
                romanou="";
                romanou="IX";
            }  
        }
        //Decenas
        for(x=1; x<=decena; x++){
            if(x<=3){
            romanod+="X";
            }
            if(x==4){
               romanod="";
               romanod="XL";
            }
            if(x==5){
                romanod="";
                romanod="L";
            }
            if(x>5 && x<=8){
                romanod+="X";
            }
            if(x==9){
                romanod="";
                romanod="XC";
            }  
        }
        //Centenas
        for(x=1; x<=centena; x++){
            if(x<=3){
            romanoc+="C";
            }
            if(x==4){
               romanoc="";
               romanoc="CD";
            }
            if(x==5){
                romanoc="";
                romanoc="D";
            }
            if(x>5 && x<=8){
                romanoc+="C";
            }
            if(x==9){
                romanoc="";
                romanoc="CM";
            }  
        }
        //Millar
        for(x=1; x<=millar; x++){
            if(x<=3){
            romanom+="M";
            }
            if(x>3){
                JOptionPane.showMessageDialog(null,"El numero debe ser menor a 4000","Error",JOptionPane.ERROR_MESSAGE);
                main(null);
            }
        }
        
        
        System.out.println(unidad);
        System.out.println(decena);
        System.out.println(centena);
        System.out.println(millar);
        
        
        JOptionPane.showMessageDialog(null,romanom+romanoc+romanod+romanou);
        
    }
    
}
