/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porterocarlaq11.java;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PorteroCarlaQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean exitOption = false;
        
        do{
            System.out.println("Enter the table that you want to study. (0) for Exit:");
            number = sc.nextInt();
            System.out.println();
            if(number==0)
                exitOption=true;
            for(int i = 1; i <= 12; i++)
                System.out.println(number + " * " + i +" = " + number*i);
        }while(exitOption!=true);
    }
    
}
