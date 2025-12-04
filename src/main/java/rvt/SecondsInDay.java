package rvt;
import java.util.Scanner;

public class SecondsInDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number of days: ");
        int days = scanner.nextInt();

        int Rez = days * 86400;
        System.out.println(Rez + " Seconds in " + days + " days");
        scanner.close();
    }
    
}
