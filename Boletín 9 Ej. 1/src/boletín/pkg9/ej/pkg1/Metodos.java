/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg9.ej.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Metodos {
    
    public void Metodos(){
        
    }

    public static void ejecutarPrograma() {
        float cp = 0;
        float cn = 0;
        float cc = 0;
        float i = 0;
        while (i < 10) {
            float num = Float.parseFloat(JOptionPane.showInputDialog("Introduce un número:"));

            if (num < 0) {

                cn++;

            } else if (num > 0) {
                cp++;

            } else {
                cc++;
            }
            i++;
        }

        JOptionPane.showMessageDialog(null, "Números positivos" + cp);
        JOptionPane.showMessageDialog(null, "Números negativos" + cn);
        JOptionPane.showMessageDialog(null, "Ceros" + cc);
    }
}
