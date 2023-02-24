package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        int m[][];
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese # filas"));
        m =new int[num][];
        
        for (int i = 0; i < m.length; i++) {
            num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese # columnas para fila "+(i+1)));
            m[i]=new int[num];
            for (int j = 0; j < m[i].length; j++) {
              num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor"));
                m[i][j]=num;  
            }
        }
        
        String out="";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
               out+= m[i][j]+"  ";
            }
            out+="\n";
        }
        JOptionPane.showMessageDialog(null, out);
    }
    
}
