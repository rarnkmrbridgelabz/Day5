package Day6BasicCorePrograms;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        char alphabet =scanner.next().charAt(0);
        System.out.println("Your entered alphabet is: "+alphabet);
        if(alphabet=='a'|| alphabet=='e'|| alphabet=='i'|| alphabet=='o'|| alphabet=='u'){
            System.out.println("Your entered albhabet is a Vowel");
        }
        else {
            System.out.println("Your entered albhabet is a Consonant");
        }
    }
}
