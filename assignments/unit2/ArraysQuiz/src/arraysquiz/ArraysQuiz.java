/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArraysQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
             Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;
    
        do { 
            System.out.println(" ====Hello====");
            System.out.println(" ====My name is Carlita====");
            System.out.println(" _____ ");
            System.out.println(" ======== OPTION MENU ========= ");
            System.out.println("1. ====hardware store and products====");
            System.out.println(" ======== 2. Exit====");
            System.out.println(" _____ ");
            System.out.println(" ====Enter an option====");
            option = input.nextInt(); 
            switch (option) {
   case 1 -> {
                
                int[] hardwareProducts;
        String[] products = {"pliers", "Screwdrivers", "Adjustable wrenches","Files and Rasps ","Wire brushes"};
        float[] priceOfTheProduct = { 0.7F, 0.80F, 1.70F, 5.00F, 0.23F, 0.15F };
        
        int n;
        System.out.println("Enter the name of product-> ");
        n = input.nextInt();
        

         hardwareProducts= new int[n];
     
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of the hardware products" + (i + 1) + " -> ");
            hardwareProducts[i] = input.nextInt();
        }

        for ( int product :hardwareProducts){
            System.out.println(" hardware Products " + product );
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" price of the product " + (i + 1) + " -> " +  hardwareProducts[i]);
        }

        for (String product : products) {
            System.out.println("product name -> " + product);
        }
        
        for (int i = 0; i < priceOfTheProduct.length ; i++) {
            System.out.println(" price of the product " + (i + 1) + " -> " + priceOfTheProduct[i]);
    
                                }
                            }
                    } 