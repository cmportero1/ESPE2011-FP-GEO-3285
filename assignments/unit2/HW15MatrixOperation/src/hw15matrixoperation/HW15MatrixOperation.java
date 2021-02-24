/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scanner = new Scanner(System.in);
        
        int a[][] = new int [3][3];
        int b[][] = new int [3][3];
        int c[][] = new int [3][3];


       System.out.println("Enter numbers Matrix A: ");
       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
                 a[i][j]=scanner.nextInt();
           }
       }

        
       System.out.println("Enter numbers Matrix B: ");
       for(int i = 0; i <3; i++){
           for(int j = 0; j < 3; j++){
                b[i][j]=scanner.nextInt();
           }
       }

       System.out.println("The Matrix of addition is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }
    }
    
}
    
      

