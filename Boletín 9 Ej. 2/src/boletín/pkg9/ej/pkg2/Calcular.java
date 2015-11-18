/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg9.ej.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Calcular {
    
    public void Calcular(){
        
    }
    
    public void ejecutarProg(){
        
      float  ejeSum = 0;
      float  ejeMult = 1;
      
      for ( int i = 10; i<90; i++){
          ejeSum = i + ejeSum;
          ejeMult = i * ejeMult;
      }
      JOptionPane.showMessageDialog(null, "Suma:"+ejeSum);
      JOptionPane.showMessageDialog(null, "Producto:"+ejeMult);
    }
}
