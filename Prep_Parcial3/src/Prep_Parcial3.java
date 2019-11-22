
import javax.swing.*;

public class Prep_Parcial3 {

    private static Object Entrada;

    public static void main(String[] args) {
        int op = 0;
        //Variables Programa 1
        int choice = 0;
        int nbase = 0;
        int nexp = 0;
        int resp = 0;
        int x = 0;
        String cadena = "";
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "1) Exponentes"
                + "2) Test"));
        switch (op) {

            case 1://Programa 1
                try {
                    do {
                        do {
                            nbase = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero base: "));
                            if (nbase < 0) {
                                JOptionPane.showMessageDialog(null, "No se admiten negativos");
                            } else {
                                if (nbase == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                                    System.exit(0);
                                }
                            }
                        } while (nbase < 0 && nbase == JOptionPane.OK_OPTION);
                        do {
                            nexp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero exponente: "));
                            if (nbase < 0) {
                                JOptionPane.showMessageDialog(null, "No se admiten negativos");
                            } else {
                                if (nbase == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                                    System.exit(0);
                                }
                            }
                        } while (nbase < 0);
                        do {
                            resp = (int) Math.pow(nbase, x);
                            cadena += nbase + " elevado a " + x + " = " + resp + "\n";
                            x++;
                        } while (x <= nexp);
                        JOptionPane.showMessageDialog(null, cadena);
                        choice = JOptionPane.showConfirmDialog(null, "Desea continuar", "Continuar", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.NO_OPTION) {
                            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                            System.exit(0);
                        } else {
                            nbase = 0;
                            nexp = 0;
                            resp = 0;
                            x = 0;
                            cadena = "";
                        }
                    } while (choice == JOptionPane.YES_OPTION);
                } catch (NumberFormatException ex) {
                    if (nbase == JOptionPane.OK_OPTION || nexp == JOptionPane.OK_OPTION) {
                        JOptionPane.showMessageDialog(null, "Caracter invalido");
                    }
                } finally {
                    main(null);
                }
                break;
            //Fin Programa 1
            case 2://Programa 2

        }
    }

}
