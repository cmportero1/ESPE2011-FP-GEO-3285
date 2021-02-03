/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08factorialnumber;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner read = new Scanner (System.in);
    System.out.println("Enter number");
    int n = read.nextInt();
    System.out.println("The Factorial of "+n+" es:" +Factorial(n));
    }
   
    public static int Factorial (int n){
        int factorial = 1;
        for (int i = 1; i<= n; i++){
            factorial = factorial + i;
        }
        return factorial;
    }
}    