package Activities;

import java.util.Scanner;
public class activity1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter you name: ");
        name = sc.nextLine();
        
        System.out.println("Hello "+name+", how are you!");
    }
    
}
