package Day6BasicCorePrograms;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Dividend number");
        int a = scanner.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Divisor number");
        int b = scanner.nextInt();

        int q = a / b;
        int r= a % b;
        System.out.println("Quotient is:"+q);
        System.out.println("Remainder is:"+r);


    }
}
