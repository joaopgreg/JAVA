/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasluciano;

import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 1;
        int b = 0;
        int termo = Integer.parseInt(JOptionPane.showInputDialog("quantos termos deseja imprimir ? : "));
        
        fibonacci fibo = new fibonacci(a, b, termo);
        fibo.calcularFibnonacci(termo);
    }

}
