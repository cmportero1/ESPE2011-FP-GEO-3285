
package hsw04menussitch.pkgcase;

import java.util.Scanner;

public class HSW04MenussitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        int option;

        do {
       
          System.out.println ("1.Area of ​​a rectangle");
          System.out.println ("2.Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    int base;
                    int height;
                    int area ;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height  -> ");
                    height = input.nextInt();
                    area = base * height ;
                    System.out.println(" the area is --> " + area ) ;
                    break;
            }
        } while (option == 2);
    }
}

        


        
    

