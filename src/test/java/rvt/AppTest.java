package rvt;

import java.util.Scanner;

public class AppTest {
    // ...existing code...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        int first_number = scanner.nextInt();

        System.out.print("Give a second number: ");
        int second_number = scanner.nextInt();

        int sum = first_number + second_number;
        int minus = first_number - second_number;
        int multiply = first_number * second_number;
        double divide = first_number / second_number;

        System.out.println(first_number + " + " + second_number + " = " + sum);
        System.out.println(first_number + " - " + second_number + " = " + minus);
        System.out.println(first_number + " * " + second_number + " = " + multiply);
        System.out.println(first_number + " / " + second_number + " = " + divide);



        scanner.close();
    }

    
}
