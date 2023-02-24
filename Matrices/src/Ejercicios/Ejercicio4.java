package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        int m[][] = {{10,20,30,40},{50,60,70},{80}};
        int num;
//      int m[][];
//        m =new int[3][];
//        m[0]=new int[4];
//        m[1]=new int[3];
//        m[2] =new int[1];
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[i].length; j++) {
//              num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese #"));
//                m[i][j]=num;  
//            }
//        }
        
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
