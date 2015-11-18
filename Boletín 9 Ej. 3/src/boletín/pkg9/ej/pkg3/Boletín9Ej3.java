/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg9.ej.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Boletín9Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float base = Float.parseFloat(JOptionPane.showInputDialog("Teclea la base:"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Teclea la altura:"));

        
            if (base > 0 && altura > 0) {
                JOptionPane.showMessageDialog(null, "El area es:" + (base * altura));
            } else {
                JOptionPane.showMessageDialog(null, "La base o la altura son negativas");

            
        }
    }
}
