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
 * Ejercicio 2: Pedir dos nùmeros y decir cual es el mayor o si son iguales.
 */
public class E2_NumerosMayorIguales_IF {
    
    public static void main(String[] args) {
    
    int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number 1: ", "COMPARISON OF NUMBERS", JOptionPane.INFORMATION_MESSAGE));
    
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number 2: ", "COMPARISON OF NUMBERS", JOptionPane.INFORMATION_MESSAGE));
    
    if(num1>num2){
        
         JOptionPane.showMessageDialog(null, "The number "+ num1+" is greater than number "+ num2);
    }else if(num2>num2){
        JOptionPane.showMessageDialog(null, "The number "+ num2+" is greater than number "+ num1);
        
    }else{
        JOptionPane.showMessageDialog(null, "THE NUMBERS IS THE SAME");
   
    }
    
}
}