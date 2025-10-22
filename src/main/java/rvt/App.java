package rvt;

import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
            System.out.print("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                break;
            }
            if (value < 0) {
                System.out.println("Unsuitable number");
            }
            int rez = value * value;
            System.out.println(rez);
        }


        scanner.close();
    }
}
