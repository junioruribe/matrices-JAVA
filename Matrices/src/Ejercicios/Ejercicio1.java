package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int m[][];
        int num,ced;
        m = new int[2][3];
        for (int i = 0; i < 2; i++) {
            ced=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula"));
            m[i][0]=ced;
            for (int j = 1; j < 2; j++) {
                num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor matricula"));
                m[i][j]=num;
            }
        }
        int tPago;
        String out="";
        for (int i = 0; i < m.length; i++) {
            tPago=0;
            out+="Ced Estudiante "+(i+1)+":"+m[i][0]+ " VR Pago: ";
            for (int j = 1; j < m[i].length; j++) {
               tPago+=m[i][j];
            }
            out+=tPago+"\n";
        }
        JOptionPane.showMessageDialog(null, out);
    }
    
}
