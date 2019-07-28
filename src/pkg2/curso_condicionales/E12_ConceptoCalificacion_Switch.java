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
 * Ejercicio 12: Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,
 * Suficiente, Bien, Notable y Sobresaliente.
 */
public class E12_ConceptoCalificacion_Switch {
    
    public static void main(String[] args) {
    
    int note = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the note of the alumn: ", "NOTE", JOptionPane.INFORMATION_MESSAGE));
    
    switch(note){
        case 0: 
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            JOptionPane.showMessageDialog(null, "The note is INSUFFICIENT", "NOTE", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 6:
        case 7:
            JOptionPane.showMessageDialog(null, "The note is SUFFICIENT", "NOTE", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 8:  
           JOptionPane.showMessageDialog(null, "The note is GOOD", "NOTE", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 9:
            JOptionPane.showMessageDialog(null, "The note is NOTABLE", "NOTE", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 10:
            JOptionPane.showMessageDialog(null, "The note is EXCEPCIONAL", "NOTE", JOptionPane.INFORMATION_MESSAGE);
            break;
            
        default:
            JOptionPane.showMessageDialog(null, "that note does not exist in the system", "NOTE", JOptionPane.INFORMATION_MESSAGE);
                   
        
    }
    
    }
     
}

    

