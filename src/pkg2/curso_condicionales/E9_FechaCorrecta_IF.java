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
 * Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es
 * correcta. Suponiendo que todos los meses son de 30 dias.
 */
public class E9_FechaCorrecta_IF {
    
    public static void main(String[] args) {
        
        int day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a day of the week", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
        int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a month of the year", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
       
       
        if(day<=30){
            if(month<=12){
                if(year>0){
                    JOptionPane.showMessageDialog(null, "The date is correct","DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "The year "+year+" is incorrect","DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "The month "+month+" is incorrect","DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "The day "+day+" is incorrect","DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
        }
            
            
        }
        
        
        
    }
                

    
    


