package Day6BasicCorePrograms;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First number:");
        int FirstNumber=scanner.nextInt();
        System.out.println("Enter Second number:");
        int SecondNumber=scanner.nextInt();
        System.out.println("Enter Third number:");
        int ThirdNumber=scanner.nextInt();

        System.out.println("Given First Number: "+FirstNumber);
        System.out.println("Given Second Number: "+SecondNumber);
        System.out.println("Given Third Number: "+ThirdNumber);
        if(FirstNumber>=SecondNumber && FirstNumber>=ThirdNumber){
            System.out.println("Largest num is :"+FirstNumber);
        }
        else if(SecondNumber>=FirstNumber && SecondNumber>=ThirdNumber){
            System.out.println("Largest num is :"+SecondNumber);
        }
        else{
            System.out.println("Largest num is :"+ThirdNumber);
        }

    }
}
