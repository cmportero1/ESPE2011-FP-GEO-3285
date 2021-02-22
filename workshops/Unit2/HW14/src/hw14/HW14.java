/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class HW14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do { 
        System.out.println("        WELCOME TO MENU     ");            
        System.out.println("-------  1. basketballTeams -------");
        System.out.println("------- 2. footballTeams -------");
        System.out.println("------- 3. Exit -------  ");        
        System.out.println("Enter you menu option -->");
            option = input.nextInt(); 
            switch (option) {

                case 1 -> {            
        int[] basketballTeams;
        String[] team = {"Golden State Warriors", "Lakers", 
            "Bulls", "Orlando Magic", "Boston Celtics","Brooklyn Nets",
            "Toronto Raptors", "Utah Jazz", "New York Knicks","Miami Heat"};

        
        int n;
        System.out.println("Enter the name of the teams -> ");
        n = input.nextInt();

        basketballTeams = new int[n];
        //        Team[0] = 2;
//        team[1] = 1;
//        team[2] = 4;
//        team[3] = 5;
//        team[4] = 6;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the team" + (i + 1) + " -> ");
            basketballTeams[i] = input.nextInt();
        }

        for (int teams : basketballTeams) {
            System.out.println("Position of the team " + teams);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of the team" + (i + 1) + " -> " + basketballTeams[i]);
        }

         
        
                }

        

      
            
        
        
                
                case 2 -> {                

        int[] footballTeams;
        String[] Teams = {"LDU", "Barcelona", 
            "Emelec", "Deportivo Cuenca", "Olmedo"};

        int n;
        System.out.println("prices of different brands -> ");
        n = input.nextInt();

        footballTeams = new int[n];
        
//        Team[0] = 2;
//        team[1] = 1;
//        team[2] = 4;
//        team[3] = 5;
//        team[4] = 6;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the team" + (i + 1) + " -> ");
            footballTeams[i] = input.nextInt();
        }

        for (int teams : footballTeams) {
            System.out.println("Position of the team " + teams);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of the team" + (i + 1) + " -> " + footballTeams[i]);
        }

         
   
        
                }
                case 3 -> {
                    System.out.println("------- Good Bye -------");
                    System.exit(0);
               }

                default -> System.out.println("Invalid option\n\n\n");

            }
        } while (option != 3);
    }  
}
    

