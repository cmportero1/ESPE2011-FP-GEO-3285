/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15arrays;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class WS15Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
         int hardwareStoreProducts = 0;
        String[] products;
        float[] tools;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Plase Enter the number  of products ->");
        hardwareStoreProducts = scanner.nextInt();

        products = new String[hardwareStoreProducts];
        tools = new float[hardwareStoreProducts];

        for (int i = 0; i < hardwareStoreProducts; i++) {
            scanner.nextLine();
            System.out.println("Please Enter the name of product " + i + " ->");
            products[i] = scanner.nextLine();
            System.out.println("Please enter " + products[i] + " prices ->");
            tools[i] = scanner.nextFloat();
        }

        System.out.println(" Product ->  \t    price  ");

        for (int i = 0; i < hardwareStoreProducts; i++) {
            System.out.println(products[i] + " -> \t" + tools[i]);
        }

    }
}

    

