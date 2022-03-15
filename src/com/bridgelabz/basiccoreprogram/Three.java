package Day6BasicCorePrograms;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Enter the power value you want:");
        Scanner scanner = new Scanner(System.in);
        int power =scanner.nextInt();
        System.out.println("Your entered power value is: "+power);
        for(int i=1;i<=power;i++){
            int ans=(int)Math.pow(2,i);
            System.out.println("2^"+i+"="+ans);
        }

    }
}
