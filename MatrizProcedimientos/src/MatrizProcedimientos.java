import javax.swing.*;
public class MatrizProcedimientos {
//Variables Gloables
public static int mat[][]= new int[3][3];
public static int matc[][]= new int[3][3];
public static String cad="";
public static int x, y;
    public static void main(String[] args) {
        //Variables Locales
        int op;
    try{
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opcion: \n"
                    + "1) Matriz Espiral \n"
                    + "2) Matriz por Columnas \n"
                    + "3) Matriz Cuadrado \n"
                    + "4) Salir"));
            if(op<1 || op>4){
                JOptionPane.showMessageDialog(null,"Opcion Incorrecta");
            }
        }while(op<1 || op>4);
        switch(op){
            case 1:
                espiral();
                break;
            case 2:
                columnas();
                break;
            case 3: 
                cuadrado();
                break;
            case 4: 
                salida();
                
        }
    }catch(NumberFormatException ex){
        
    }finally{
        
    }
    }//Cierre Del void
    public static void espiral(){
                cad = "";
                int tope = mat.length - 1;
                int inicio = 0;
                int campos = 0;
                //System.out.println(mat.length);
                //for (int i = 0; i < mat.length; i++) {
                while (campos < Math.pow(mat.length, 2)) {

                    for (y = inicio; y <= tope; y++) {//3
                        mat[inicio][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: [" + inicio + "][" + y + "]"));
                        campos++;
                        // System.out.println(campos);
                    }

                    for (x = inicio + 1; x <= tope; x++) {//2
                        mat[x][tope] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: [" + x + "][" + tope + "]"));
                        campos++;
                        //System.out.println(campos);
                    }

                    for (y = tope - 1; y >= inicio; y--) {//2
                        mat[tope][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: [" + tope + "][" + y + "]"));
                        campos++;
                        System.out.println(campos);
                    }

                    for (x = tope - 1; x >= inicio + 1; x--) {
                        mat[x][inicio] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: [" + x + "][" + inicio + "]"));
                        campos++;
                        System.out.println(campos);
                    }
                    tope--;
                    inicio++;
                }

                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        cad += mat[x][y] + "  ";

                    }
                    cad += "\n";
                }
                JOptionPane.showMessageDialog(null, cad);
                main(null);
    }
    
    public static void columnas(){
        cad = "";
                for (y = 0; y < 3; y++) {
                    if (y == 0 || y % 2 == 0) {
                        for (x = 0; x < mat.length; x++) {
                            mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

                        }
                    }
                    if (y % 2 == 1) {
                        for (x = 2; x >= 0; x--) {
                            mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));

                        }
                    }
                }
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        cad += mat[x][y] + "  ";
                    }
                    cad += "\n";
                }
                JOptionPane.showMessageDialog(null, cad);
                main(null);
    }
    
    public static void cuadrado(){
        cad = "normal     cuadrado\n";
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
                        matc[x][y] = (int) Math.pow(mat[x][y], 2);

                        cad += mat[x][y];
                        if (y == 2) {
                            for (y = 0; y < 3; y++) {
                                cad += "             " + matc[x][y] + "";
                            }
                        }
                    }
                    cad += "\n";
                }
                JOptionPane.showMessageDialog(null, cad);
                main(null);
    }
    
    public static void salida(){
        int choice;
        choice = JOptionPane.showConfirmDialog(null, "Desea Salir?", "Salida", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    System.exit(0);
                } else {
                    main(null);
                }
    }
}//Cierre de la clase
