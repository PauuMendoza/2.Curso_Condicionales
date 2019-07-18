/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.curso_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulina
 * Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes cuya
 * compra supere los $300. ¿Cuàl sera la cantidad que pagarà una persona por 
 * su compra?
 */
public class E4_Descuento_IF {
    
     public static void main(String[] args) {
          
          float discount;
          
          float buy = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the total amount of buy ", "SHOPPING", JOptionPane.INFORMATION_MESSAGE));
          
          if(buy>=300){
              discount = buy * 0.20f;
              buy -= discount;
              JOptionPane.showMessageDialog(null, "The total to pay is: "+ buy, "SHOPPING", JOptionPane.INFORMATION_MESSAGE);
          }
          else{
              JOptionPane.showMessageDialog(null, "The total to pay is: "+ buy, "SHOPPING", JOptionPane.INFORMATION_MESSAGE);
              
          }
     }
    
}
