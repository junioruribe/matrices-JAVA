package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        int m[][]=new int[3][3];
        int suma=0,num;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese #"));
                m[i][j]=num;
            }
        }
        String out="";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
               out+= m[i][j]+"  ";
                if (i==j) {
                   suma+=m[i][j]; 
                }
            }
            out+="\n";
        }
        out+="\n La suma es: "+suma;
        JOptionPane.showMessageDialog(null, out);
    }
    
}
