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
 * Ejercicio 13: Hacer un programa que simule un cajero automàtico con un saldo
 * inicial de 1000 Dòlares, con el siguiente menù de opciones:
 * 
 * 1. Ingresar dinero a la cuenta.
 * 2. Retirar dinero de la cuenta.
 * 3. Salir
 */
public class E13_CajeroAutomatico_Switch {
    
    public static void main(String[] args) {
        
        float initial= 1000;
        float finalMoney = 0;
        
        
        int option =Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a option of the menu\n"
                +"1. Put money in the account\n"
                +"2. Remove money from the account\n"
                +"3. Exit\n","OPTION MENU", JOptionPane.INFORMATION_MESSAGE));
        
        switch(option){
            
            case 1: 
                float moreMoney = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the money do you want put in the count", "OPTION MENU", JOptionPane.INFORMATION_MESSAGE));
                finalMoney= initial+moreMoney;
                JOptionPane.showMessageDialog(null, "Your final balance is: $"+finalMoney,"OPTION MENU", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            case 2:
                float leastMoney = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the money you want to remove from the account", "OPTION MENU", JOptionPane.INFORMATION_MESSAGE));
                
                if(leastMoney>initial){
                    JOptionPane.showMessageDialog(null, "I`M SORRY BUT YOU DON`T HAVE ENOUGH MONEY","OPTION MENU", JOptionPane.INFORMATION_MESSAGE);    
                }
                else{
                finalMoney= initial -leastMoney;
                JOptionPane.showMessageDialog(null, "Your final balance is: $"+finalMoney,"OPTION MENU", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            
            case 3:
                break;
                
            default: 
                JOptionPane.showMessageDialog(null, "THAT OPTION DOES NOT EXIST IN THE SYSTEM","OPTION MENU", JOptionPane.INFORMATION_MESSAGE);
                
                
            
        }
    }
    
}
