
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vafm9
 */
public class FuncionesTabla {


    public static void Llenar() {
        TablaDeMultiplicar.resp1.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 1)));
        TablaDeMultiplicar.resp2.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 2)));
        TablaDeMultiplicar.resp3.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 3)));
        TablaDeMultiplicar.resp4.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 4)));
        TablaDeMultiplicar.resp5.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 5)));
        TablaDeMultiplicar.resp6.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 6)));
        TablaDeMultiplicar.resp7.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 7)));
        TablaDeMultiplicar.resp8.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 8)));
        TablaDeMultiplicar.resp9.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 9)));
        TablaDeMultiplicar.resp10.setText(Integer.toString(multiplicar(TablaDeMultiplicar.n, 10)));

    }

    public static void LimpiarTabla() {
        TablaDeMultiplicar.resp1.setText("");
        TablaDeMultiplicar.resp2.setText("");
        TablaDeMultiplicar.resp3.setText("");
        TablaDeMultiplicar.resp4.setText("");
        TablaDeMultiplicar.resp5.setText("");
        TablaDeMultiplicar.resp6.setText("");
        TablaDeMultiplicar.resp7.setText("");
        TablaDeMultiplicar.resp8.setText("");
        TablaDeMultiplicar.resp9.setText("");
        TablaDeMultiplicar.resp10.setText("");

        TablaDeMultiplicar.numero.setText("");
    }

    public static int multiplicar(int n1, int n2) {
        int resp = n1 * n2;
        return resp;
    }

    public static boolean validartabla(int variable) {
        boolean verdad=true;
        if (variable < 1 || variable > 12) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entre 1 y 12", "Error", JOptionPane.ERROR_MESSAGE);
            TablaDeMultiplicar.numero.setText("");
            verdad=false;
        }
        return verdad;
    }
}
