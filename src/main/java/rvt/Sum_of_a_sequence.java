package rvt;
import java.util.Scanner;
    public class Sum_of_a_sequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("First number? ");
            int first = scanner.nextInt();

            System.out.print("Second number? ");
            int second = scanner.nextInt();
            int Rez = 0;

            while (first <= second) {
                Rez = Rez + first;
                first = first + 1;
            }
            System.out.print("The sum is: " + Rez);

            scanner.close();
        }
}