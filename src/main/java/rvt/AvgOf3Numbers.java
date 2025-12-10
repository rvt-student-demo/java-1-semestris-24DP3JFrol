package rvt;
import java.util.Scanner;

public class AvgOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");
            int number1 = scanner.nextInt();
            System.out.println("Give a number: ");
            int number2 = scanner.nextInt();
            System.out.println("Give a number: ");
            int number3 = scanner.nextInt();
            int sum = number3 + number2 + number1;
            double Avg = sum / 3;
            System.out.println("Average of 3 numbers is " + Avg);
        }
}

