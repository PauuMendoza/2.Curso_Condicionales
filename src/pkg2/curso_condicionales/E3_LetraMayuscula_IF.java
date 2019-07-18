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
 * Ejercicio 3: Programa que lea un caràcter por teclado y compruebe si es una
 * letra mayuscula.
 */
public class E3_LetraMayuscula_IF {
    
    public static void main(String[] args) {
        
        char letter;
        
        letter = JOptionPane.showInputDialog(null, "Enter a letter: ", "LETTERS", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        
        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "The Letter is Capital", "LETTERS", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, "The Letter is Minuscule", "LETTERS", JOptionPane.INFORMATION_MESSAGE);
        }
        
    
}
}