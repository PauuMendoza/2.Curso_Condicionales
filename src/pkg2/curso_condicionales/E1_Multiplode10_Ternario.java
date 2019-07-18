/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.curso_condicionales;

import javax.swing.JOptionPane;

/**
 * NOTA: TODO LOS EJERCICIOS QUE PERTENECEN AL CURSO DE CONDICIONES UTILIZARAN
 * EL JOPTIONPANE PARA INTRODUCIR O MOSTRAR DATOS.
 *
 * @author Paulina
 * Ejercicio1: Hacer un programa que lea un numero entero y muestre si el numero
 * es multiplo de 10.
 */
public class E1_Multiplode10_Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: ", "MULTIPLO OF 10",JOptionPane.INFORMATION_MESSAGE));
        
        JOptionPane.showMessageDialog(null, (number%10==0) ? +number+ " Is multiplo of 10" : +number+" Is not multiplo of 10", "MULTIPLO OF 10",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
