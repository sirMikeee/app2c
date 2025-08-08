
package app2c;

import java.util.Scanner;
import banking.bankApp;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response;
        bankApp bapp[] = new bankApp[99];
        bapp[0] = new bankApp();
    do{ 
    
        System.out.println("WELCOME TO MY SYSTEM!");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        
            switch(choice){
                case 1:
                    int accn, pin;
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.print("Enter Action: ");
                    int action = sc.nextInt();
                        
                        switch(action){
                            
                            case 1:
                                
                                
                                System.out.println("Enter Account No.: ");
                                bapp[0].setAccNo(sc.nextInt());
                                System.out.print("Enter Pin No.: ");
                                bapp[0].setPin(sc.nextInt());
                                
                                System.out.println("Registered Accout No: "+bapp[0].getAccNo());
                                
                                
                                break;
                            case 2:
                                System.out.print("Enter Account No.: ");
                                accn = sc.nextInt();
                                System.out.print("Enter Pin No.: ");
                                pin = sc.nextInt();

                                
                                int attempts = 3;
                                
                                while(!(bapp[0].verifyAccount(accn, pin))){
                                    attempts--;
                                    System.out.println("Inalid account, Attempts Left: "+attempts);
                                    if(attempts == 0){
                                        System.out.println("MAX ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    }
                                        System.out.print("Enter Account No.: ");
                                        accn = sc.nextInt();
                                        System.out.print("Enter Pin No.: ");
                                        pin = sc.nextInt();
                                }

                                System.out.println("LOGIN SUCCESS!");
                                
                                
                            break;
                            case 3:
                                //EXIT
                                break;
                            default:
                                System.out.println("INVALID ACTION");
                        
                        }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("INVALID ACTION!");
            
            }
        System.out.println("Continue? (1/0): ");
        response = sc.nextInt();
    }while(response == 1);
    
    }
    
}
