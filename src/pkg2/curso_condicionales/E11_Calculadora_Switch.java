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
 * Ejercicio 11: Construir un programa que simule el funcionamiento de una
 * calculadora que pueda realizar las cuatro operaciones aritmèticas bàsicas
 * (suma, resta, producto y divisiòn) con valores nùmericos enteros. El usuario
 * debe especificar la operaciòn con el primer caràcter con el primer paràmetro
 * de la linea de comandos: S o s para la suma, R o r para la resta, P p o M m
 * para el producto y D o d para la divisiòn.
 */
public class E11_Calculadora_Switch {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number one: ", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number two: ", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE));
        char op= JOptionPane.showInputDialog(null, "Enter the desired operation: ", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE).charAt(0);
        
        switch(op){
            case 's':
            case 'S':   
                int sum=num1+num2;
                JOptionPane.showMessageDialog(null,"the sum the this numbers is: "+sum, "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 'r':
            case 'R':    
                 int subtraction=num1-num2;
                JOptionPane.showMessageDialog(null,"the subtraction the this numbers is: "+subtraction, "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
                break;
                
            case 'm':
            case 'M':    
                 int multiplication=num1*num2;
                JOptionPane.showMessageDialog(null,"the multiplication the this numbers is: "+multiplication, "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
                break;
             
            case 'd':
            case 'D':    
                 int division=num1/num2;
                JOptionPane.showMessageDialog(null,"the division the this numbers is: "+division, "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
                break;    
                
            default:
                JOptionPane.showMessageDialog(null,"ENTER A OPERATION", "CALCULATOR", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }
    
}
