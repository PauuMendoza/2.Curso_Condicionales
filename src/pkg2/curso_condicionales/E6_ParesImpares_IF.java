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
 * Ejercicio 6: Hacer un programa que tome dos nùmeros y diga si ambos son 
 * pares o impares.
 */
public class E6_ParesImpares_IF {
    
    public static void main(String[] args) {
        
        int resul;
        
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number one: ", "ODD AND EVEN", JOptionPane.INFORMATION_MESSAGE));
        
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number two: ", "ODD AND EVEN", JOptionPane.INFORMATION_MESSAGE));
        
        if(number1%2==0&number2%2==0){
            JOptionPane.showMessageDialog(null, "The numbers are even" , "ODD AND EVEN", JOptionPane.INFORMATION_MESSAGE);
            
        }else if (number1%2!=0&number2%2!=0){
            JOptionPane.showMessageDialog(null, "The numbers are odd" , "ODD AND EVEN", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER OTHER NUMBERS" , "ODD AND EVEN", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
    }
    
}
