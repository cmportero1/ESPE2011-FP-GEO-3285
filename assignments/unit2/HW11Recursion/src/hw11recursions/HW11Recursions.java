/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursions;

/**
 *
 * @author USUARIO
 */
public class HW11Recursions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int n = 19;
        int SumRecursive;
        int result = SumRecursive (n);
        System.out.println( " The Sum Recursive the " + n + "is" + result);
        
     }
    public static int SumRecursive (int n) {
        int result;
        if (n==1) {
            return 3;
        } else {
            return result = (n + SumRecursive( n - 1));
        }
    }
    
}

