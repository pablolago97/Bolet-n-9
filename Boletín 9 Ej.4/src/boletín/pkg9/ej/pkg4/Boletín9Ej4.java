/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg9.ej.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Boletín9Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   float num = Float.parseFloat(JOptionPane.showInputDialog("Teclea un número:"));
    
    while (num!=0){
        
        for (int i=1; i<=10; i++){
            
            JOptionPane.showMessageDialog(null,num+" x "+ i);
    }
        num = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número:"));
    }
    }
}