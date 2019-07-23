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
 * Ejercicio 8: Pedir un nùmero entre 0 y 99 999 y decir cuantas cifras tiene.
 * Analizis encontrado y no pensado es que diviendo el numero / 10 puedo saber
 * el numero de las cifras, 
 */
public class E8_CifrasDeNumero {
    
    public static void main(String[] args) {
        int cifras=0;
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        
        while(num!=0){
            num/=10;
            cifras++;
            
        }
        
        System.out.println("El numero tiene estas cifras " +cifras);   
        
        
        
    }
    
}//todavia queda pendiente
