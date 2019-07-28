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
 * Ejercicio 10: Pedir el dia, mes y año de una fecha e indicar si la fecha es 
 * correcta. Con meses de 28, 30 y 31 dias. Sin años bisiestos.
 */
public class E10_FechaCorrectaDias_IF {
    
    public static void main(String[] args) {
        
        int day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a day: ", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
        int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a month: ", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year: ", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE));
        
         if(year>0){
            if(month==4 || month==6 || month==9 || month==11){    
                if(day>=1 && day<=30){
                    JOptionPane.showMessageDialog(null, "The date is correct!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "The date is incorrect!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }
            }else if(month==2){
                if(day>1 && day<=28){
                    JOptionPane.showMessageDialog(null, "The date is correct!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "The date is incorrect!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
                }
            }else if(month==1 || month==3 || month==5 || month==7|| month==8|| month==10|| month==12){
                if(day>1 && day<=31){
                    JOptionPane.showMessageDialog(null, "The date is correct!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);;
                }  
            else{
             JOptionPane.showMessageDialog(null, "The date is incorrect!!!", "DATE CORRECT", JOptionPane.INFORMATION_MESSAGE);
            }  
            }
         }
            
    }
}
            
        
    
    

