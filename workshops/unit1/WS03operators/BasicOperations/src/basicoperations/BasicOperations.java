/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author USUARIO
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int diference;
        
        int multiplaying;
        int multiplier;
        int product;
        
        int dividend;
        int divider;
        int quotient;
        
        int dividend1;
        int divider1;
        int rest;
                
       
       
        // inicialización
        addend1 =  5 ;
        addend2 =  18 ;
        
        minuend =  - 23 ;
        subtrahend =  - 6 ;
        // -23 - (-6) = -23 + 6 = -17
        
        multiplaying =  25 ;
        multiplier   =  14 ;
        // 25 * 14 = 350
        
        dividend =  20;
        divider =  2 ;
        // 20/2 = 10
        
        dividend1 =  7 ;
        divider1 =   3;
        rest = dividend1 % divider1;    
        // 7%3  = 2
       
        
        
                
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                "is equal to --> " + sum);
        
        
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
        sum++;
        System.out.println("sum is equal to -->" + sum);
        
        System.out.println("adding one to sum" + (sum++));
        
        System.out.println("adding one to sum" + ((++sum)));
        
        System.out.println("The subtraction of" + minuend + " - " + subtrahend + 
                "is equal to --> " + (minuend - subtrahend));
        
        System.out.println("The multiplication of" + multiplying + " * " +
                multiplier + "is equal to --> " + (multiplaying * multiplier));
                
        System.out.println("The division of" + dividend + " / " +
                divider + "is equal to --> " + (dividend / divider));
                
        System.out.println("The module of" + dividend1 + " % " + divider1
                 + "is equal to --> " + (dividend1 % divider1));
       
        
    }
    
    
}
