/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
       
        //division
                    float divisor = 0;
                    float dividend = 0;
                    float quotient = 0;
                    quotient = divideTwoNumbers(dividend, divisor);
                    
                    System.out.println("The division is");
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                    System.out.println("enter divisor -> ");
                    divisor = input.nextInt();
                     quotient = dividend / divisor;
                    System.out.println(" quotient --> " + quotient);
                
                
         // square of number      
                    int x =0 ;
                    int y = 0;
                    
                   
                System.out.println("The square is");
                    System.out.println("enter x -> ");
                    x = input.nextInt();  
                    
                    y = square(x);
                System.out.println("the square of -> " + x + " <- is equal to -> " + y);
                
          // function       
                
                int c = 0;
                int e = 0;
                System.out.println("The function is");
                    System.out.println("enter c -> ");
                    c = input.nextInt();  
                    
                    e = run(e);
                System.out.println("the function of -> " + c + " <- is equal to -> " + e);
                
          //Multiplication table
          
                int multiplicand = 0;
                int multiplier = 1;
                int product;
                int stop = 13;
                
                System.out.println("Enter the table you want to study ");
                System.out.println("0 (zero) to exit  --> ");
            
                multiplicand = input.nextInt();
                if (multiplicand != 0) {
                System.out.println("Studying the Table of ----> " + multiplicand + " <----");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                product = multiplicand * multiplier;
                System.out.println(multiplicand + " x " + multiplier + " = " + product);
                 }
            }
            multiplier = 1;  
        //function definition        
    }
                public static float divideTwoNumbers(float dividend, float divisor) {
        
                float quotient = 0.0F;
                quotient = (float) dividend / (float) divisor;

                return quotient;
    }
                
                public static int square(int x) {
                int y = 0;

                 y = x * x;

                return y;
    }
            
             

                public static int run(int c) {
                int e = 0;

                e = c * c + 2 * c + 1;

                return e;   
    }
                public static int multiply(int multiplicand, int multiplier){
                    int product = 0;
           
                product = multiplicand * multiplier;
                
                return product;
                   
            
            
        }
}
        
   