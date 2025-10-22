package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        int Name = scanner.nextInt();

        System.out.print("Ievadi cenu: ");
        double Price = (scanner.nextInt());

        System.out.print("Ekspress piegāde (0==nē, 1==jā): ");
        int Piegade = scanner.nextInt();

        

        System.out.print("");
        System.out.print("Rēķins:");
        System.out.print("   " + Name + "  " + Price);
        System.out.print("Piegāde  ");




        scanner.close();
    }
    
}
