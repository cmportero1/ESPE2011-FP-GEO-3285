/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
  Scanner input = new Scanner(System.in);
  int opcion=0;
  do{
  System.out.println(" ====WELCOME====");
  System.out.println(" ====My nickname is beau====");
  System.out.println(" ======== OPTION MENU ========= ");
  System.out.println(" _____________ ");
  System.out.println(" _____________ ");
  System.out.println(" ======== 1. Calculator for the area of ​​the Pentagon ========= ");
  System.out.println(" ======== 2. Calculator for the area of ​​the Rhomboid========= ");
  System.out.println(" ======== 3. Calculator for the area of ​​the Trapezoid========= ");
  System.out.println(" _____________ ");
  System.out.println(" _____________ ");
  System.out.println(" ====Enter an option====");
  opcion = input.nextInt();
  switch (opcion){
  
   
      
        case 1:
         System.out.println("===Enter the perimeter===");
         int perimetro = input.nextInt();
         System.out.println("===Enter the Apothem===");
         int apothem= input.nextInt();
         System.out.println("===THE PENTAGON AREA IS=== :"+pentagonarea(perimetro,apothem));
        break;
        case 2:
         System.out.println("===Enter base===");
         int base_r =input.nextInt();
         System.out.println("===Enter Height===");
         int height_r =input.nextInt();
         System.out.println("===THE ROMBOID AREA IS===:"+rhomboidarea(base_r,height_r));
        break;
        case 3:
         System.out.println("===ENTER MAJOR BASE===");
         int base_ma=input.nextInt();
         System.out.println("===ENTER THE MINOR BASE===");
         int base_me=input.nextInt();
         System.out.println("===ENTER HEIGHT===");
         int height_t=input.nextInt();
         System.out.println("===THE AREA OF THE TRAPEZE IS===:"+trapeziumarea(base_ma,base_me,height_t));
        break;

  }
        System.out.println(" ====I hope it could help you====");
  }while(opcion!=3);
 }

public static int pentagonarea(int erimeter, int apothem){
     return (erimeter*apothem) / 2;
    }
  public static int rhomboidarea(int base,int height){
     return base*height ;
    }
  public static int trapeziumarea (int Base , int base , int height){
  
   return ((Base+base)/2)*height;
  }

}
        
    