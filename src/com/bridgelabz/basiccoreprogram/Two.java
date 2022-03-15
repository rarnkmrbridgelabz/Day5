package Day6BasicCorePrograms;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Enter any year:");
        Scanner scanner = new Scanner(System.in);
        int year =scanner.nextInt();
        if(year%400==0 || year%100!=0 && year%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

}
