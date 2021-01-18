/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

/**
 *
 * @author USUARIO
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    int option;
    
  
    do {
        System.out.println("Calculator");
             System.out.println("1. -> Addition");
             System.out.println("2. -> Substraction");
   System.out.println("3. -> Multiplication");
           System.out.println("4. Division");
                   System.out.println("5. -> Exit");
                     System.out.println("Enter your menu option ->");  
                     option = input.nextInt();
                     
                     switch (option)  {
                         case 1:
                             int addend1;
                             int addend2;
                             int sum
                                     System.out.println("enter addend1 ->");
                                     addend1 = input.nextInt();
                                     System.out.println("enter addend2 ->");
                                     addend2 = input.nextInt();
                                     sum = addend1 + addend2
                                             System.out.println("the sum is ->"+sum);
                                             break;
                         case 2:
                             System.out.println("the subtraction is");
                             break;
                                     case 3:
                             System.out.println("the multiplication is");
                             break;
                                     case 4:
                                         System.out.println("the division is");
                                         break;
                                     case 4:
                                         System.out.println("the division is");
                                         break;
                                     case 5: 
                                         System.out.println("Good Bye my friend");
                                         system.exit(0);
                                         break;
                                     default;
                                     System.out.println("invalid option");
                                     break;
                     }
    } while (option 1=5);
    }
                         
                                             
                                     
                                  
                     }
        option = input.nextInt();
    } while (option >5);
    
    }
    
}
