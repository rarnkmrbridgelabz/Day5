package Day6BasicCorePrograms;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("Enter the factor value:");
        Scanner scanner=new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Your entered value is: "+value);
        for(int i=2;i<value;i++){
            while(value%i==0){
                System.out.println(i);
                value=value/i;
            }
        }
        if(value>2){
            System.out.println(value);
        }
    }
}
