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
 * Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se 
 * obtiene de la siguiente manera:
 * 
 * **Si trabaja 40 horas o menos se le pagan $16 por hora.
 * **Si trabaja mas de 40 horas se le pagan $16 por cada una de las primeras
 * 40 horas Y $20 por cada hora extra.
 */
public class E5_SalarioObrero {
    
    public static void main(String[] args) {
        
        int salary;
        
        int hours = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the hours worked"));
        
        if(hours <= 40){
           salary = hours * 16;
            
            JOptionPane.showMessageDialog(null, "Your salary es: "+ salary);
        }else{
            hours *= 16;
            salary = (hours * 16) + 20;
            JOptionPane.showMessageDialog(null, "Your salary es: "+ salary);
     
        }
        
        
        
    }
    
}
