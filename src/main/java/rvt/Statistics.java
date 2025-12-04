package rvt;

import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }
    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum;
    }
    public double average() {
        if (this.count == 0) {
            return 0;
        }
        return 1.0 * this.sum / this.count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics all = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            all.addNumber(num);
            if (num % 2 == 0) {
                even.addNumber(num);
            } else {
                odd.addNumber(num);
            }
        }
        System.out.println("Sum: " + all.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        scanner.close();
    }

    
    
}
