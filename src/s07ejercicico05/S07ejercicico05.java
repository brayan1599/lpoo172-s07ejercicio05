/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicico05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicico05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese la cantidad de agua en kilogramos");
        double kilogramos=input.nextDouble();
        System.out.println("ingrese la temperstura inicial: ");
        double temperaturainicial=input.nextDouble();
        System.out.println("ingrese la temperatura final");
        double temperaturafinal=input.nextDouble();
        double energia = kilogramos * (temperaturafinal-temperaturainicial);
        
        
        
        
        
    }
    
}
