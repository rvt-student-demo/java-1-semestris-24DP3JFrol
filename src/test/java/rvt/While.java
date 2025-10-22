package rvt;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int a = 10;
        int b = 5;
        while (a > b) {
            System.out.println("Hello");
            System.out.println("World!");
            a = a - 1;
        }

        
        
        int c = 1;
        int d = 100;
        while (c < d) {
            System.out.println(a + ", ");
            c = c + 1;
            
        }

        
        
        int e = 1;
        while (true) {
            if (e == 15) {
                break;
            }
            System.out.print(e + ", ");
            e = e + 1;
        }

        
        
        int totalUserInputs = 0;
        int sum = 0;
        while (true) {
            if (totalUserInputs == 5) {
                break;
            }
            System.out.println("Input number");
            sum = sum + Integer.valueOf(scanner.nextLine());
            totalUserInputs = totalUserInputs + 1;
            
        }
        
        
        
        scanner.close();
    }
    
}
