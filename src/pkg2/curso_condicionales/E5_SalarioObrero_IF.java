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
public class E5_SalarioObrero_IF {
    
    public static void main(String[] args) {
        
        int salary, extraHours;
        
        int hours = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the hours worked", "WORKER`S SALARY", JOptionPane.INFORMATION_MESSAGE));
        
        if(hours <= 40){
           salary = hours * 16;
            
            JOptionPane.showMessageDialog(null, "Your salary es: $"+ salary, "WORKER`S SALARY", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            extraHours = hours - 40;
            hours = 40*16 + (extraHours * 20);
              
            JOptionPane.showMessageDialog(null, "Your salary es: $"+hours, "WORKER`S SALARY", JOptionPane.INFORMATION_MESSAGE);
     
        }
        
        
        
    }
    
}
