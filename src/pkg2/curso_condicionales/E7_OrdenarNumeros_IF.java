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
 * Ejercicio 7: Pedir tres nùmeros y mostrarlos ordenados de mayor a menor.
 */
public class E7_OrdenarNumeros_IF {
    
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number one: ", "ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number two: ", "ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number three: ", "ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE));
        
        if(num1>num2&num1>num3){
            if(num2>num3){
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num1+" ,"+ num2+" ,"+num3,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);               
            } 
            else{
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num1+" ,"+ num3+" ,"+num2,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        
        if(num2>num1&num2>num3){
            if(num1>num3){
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num2+" ,"+ num1+" ,"+num3,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);   
            }
            else{
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num2+" ,"+ num3+" ,"+num1,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);            
            }
        }
        
        if(num3>num1&num3>num2){
            if(num1>num2){
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num3+" ,"+ num1+" ,"+num2,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "The order of greatest to least is: " +num3+" ,"+ num2+" ,"+num1,"ORDER NUMBERS", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
       
    }
    
}
/* como el videotutorial lo hiz
if (num1>num2) && (num2>num3){
                        se imprime el mensaje
}
else if(num1>num3) && (num3>num2){
                    se imprime el mensaje
}de aqui para adelante solo utlizo else if

*/

    