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
 * Ejercicio 14: Hacer un programa que pase de Kg a otra unidad de medida de 
 * masa, mostrar un menu con las opciones posibles.
 */
public class E14_MedidasMasa_Switch {
    
    public static void main(String[] args) {
        
        float kg;
        
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "CHOISE AN OTPION OF THE MENU\n\n"
                +"1. TRANSFORM KILOGRAM TO HECTOGRAM\n"
                +"2. TRANSFORM KILOGRAM TO DECOGRAM\n"
                +"3. TRANSFORM KILOGRAM TO GRAM\n"
                +"4. TRANSFORM KILOGRAM TO DECIGRAM\n"
                +"5. TRANSFORM KILOGRAM TO CENTIGRAM\n"
                +"6. TRANSFORM KILOGRAM TO MILLIGRAM\n"
                +"7. EXIT", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE));
        
        switch(option){
            case 1:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float hectogram = kg * 10;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+hectogram+" hectograms", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;
                
            case 2:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float decogram = kg * 100;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+decogram+" decograms", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;
                
            case 3:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float gram = kg * 1000;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+gram+" grams", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;  
             
            case 4:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float decigram = kg * 10000;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+decigram+" decigrams", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;
                
            case 5:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float centigram = kg * 100000;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+centigram+" centigrams", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;    
            
            case 6:
             kg = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the kilogram to convert", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE)); 
             float miligram = kg * 1000000;
             JOptionPane.showMessageDialog(null,kg+" kilogram is the same as "+miligram+" miligrams", "MASS MEASUREMENTS", JOptionPane.INFORMATION_MESSAGE);
             break;
                
            case 7:
                break;
                
            default: 
                JOptionPane.showMessageDialog(null, "THAT OPTION DOES NOT EXIST IN THE SYSTEM","OPTION MENU", JOptionPane.INFORMATION_MESSAGE);
                
                
        }
        
        
        
    }
    
}
