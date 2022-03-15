package Day6BasicCorePrograms;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Harmonic Value you want:");
        int value = scanner.nextInt();
        float i=1;
        double ans=0;
        while(i<=value){
            ans+=(1.0)/i;
            i++;
            System.out.println("The Harmonic Values are: "+ans);


        }
    }
}
