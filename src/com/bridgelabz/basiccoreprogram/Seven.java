package Day6BasicCorePrograms;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        int first = scanner.nextInt();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Second number");
        int second = scanner.nextInt();

        int swap = first;
        first = second;
        second = swap;

        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
