package rvt;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true) { 
            System.out.print("Give a number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double avarage = sum / count;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("No numbers entered");
        }
        scanner.close();
    }
    
}
