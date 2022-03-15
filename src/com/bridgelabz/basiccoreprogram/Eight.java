package Day6BasicCorePrograms;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println("You have entered:"+number);
        if(number%2==0){
            System.out.println("The entered number is:Even");
        }
        else{
            System.out.println("The entered number is:Odd");
        }
    }
}
