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
public class fibonacci {

    int a;
    int b;
    int termo;

    public fibonacci(int numeroA, int numeroB, int t) {

        this.a = numeroA;
        this.b = numeroB;
        this.termo = t;

    }

    void calcularFibnonacci(int termo) {
        this.a = 1;
        for (int i = 0; i < termo; i++) {
            int count = i+1; 
            JOptionPane.showMessageDialog(null, "termo : " + count + " \n\n" + this.a);
            int aux = this.a;
            this.a += this.b;
            this.b = aux;
        }

    }
}
