
package app2c;

import java.util.Scanner;
import banking.bankApp;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
            switch(choice){
                
                case 1:
                    
                        System.out.print("Enter Account No.: ");
                        int accn = sc.nextInt();
                        System.out.print("Enter Pin No.: ");
                        int pin = sc.nextInt();
                        
                        bankApp bapp = new bankApp();
                        
                            if(bapp.verifyAccount(accn, pin)){
                                System.out.println("LOGIN SUCCESS!");
                            }else{
                                System.out.println("LOGIN FAILED!");
                            }
                    
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("INVALID ACTION!");
            
            }
        
        
    }
    
}
