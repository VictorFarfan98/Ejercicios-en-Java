import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class Cronometro {

    public static void main(String[] args) {
        // TODO code application logic here
        double ms=0, Ms=0;
        double cs=0, Cs=0;
        double ds=0, Ds=0;
        double s=0, S=0;
        double m=0, M=0;
        int h=0, H=0;
        
        double total=0;
        
        String menu="";
        char op=' ';
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Desea iniciar? Y/N");
        menu=sc.nextLine();
        menu=menu.toLowerCase();
        op=menu.charAt(0);
        
        NumberFormat formatter = new DecimalFormat("#0.000");     
        
        if(op=='y'){
            double cron=0.001;
            do{
               h++;
               cron=0;
                do{
                    System.out.println(h+":"+formatter.format(cron));
                    cron+=0.001;
                }while(cron<59);
            }while(h<23);
            /*do{
                    do{
                        do{
                            do{
                                do{
                                ms=0;
                                cs++;
                                Cs=cs/100;
                                System.out.println(Cs+Ms);
                                    do{
                                        ms++;
                                        Ms=ms/1000;
                                        System.out.println(Ms);
                                    }while(ms<10);
                                }while(cs<10);
                            }while(ds<10);
                        }while(s<60);
                    }while(m<60);
            }while(h<24);*/
        }else{
            System.exit(0);
        }
        


    }   
}
