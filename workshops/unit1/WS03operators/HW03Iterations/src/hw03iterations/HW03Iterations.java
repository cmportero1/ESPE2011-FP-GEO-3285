/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author USUARIO
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        int i;
        i = 1;

        System.out.println("This is while loop from 1 to 31");


        while (i < 32) {
            System.out.println(" i: " + i);
            i++;
        }

        System.out.println("Multiplication Tables : 31");
       
        
        int top = 12;
        int product = 0;
        int table = 31;
        for (int j = 1; j <= top; j++) {
            product = table + j;
            System.out.println("31*" + j + " = " + product);
        }
        System.out.println("Multiplication Tables : 2");
       
        
        
     
        for (int j = 1; j <= top; j++) {
            product = table + j;
            System.out.println("2*" + j + " = " + product);
    }
    
    
    
 }
}
