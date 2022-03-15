package Day6BasicCorePrograms;

import java.util.Random;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number of times to Flip Coin:");
        int number = scanner.nextInt();
        Random random = new Random();
        for(int i=0;i<=number;i++) {
            double flip = random.nextDouble(1);
            if (flip<=0.5) {
                System.out.println("Head");
            } else {
                System.out.println("Tail");
            }

        }

    }
}
