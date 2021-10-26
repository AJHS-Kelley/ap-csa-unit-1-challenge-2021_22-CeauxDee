// Cody Collins, AP CSA Uni 1 Challenge, Andrew Jackson High School, 10/26/2021, 8:36 am, v2.0

import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many attacks will you do? ");

        int attackNum = myScanner.nextInt();

        System.out.println(" ");

        System.out.println("How much damage will each attack do? ");

        int attackPower = myScanner.nextInt();

        System.out.println(" ");

        System.out.println("What is getting hit? ");

        String enemy = myScanner.nextLine();
        
    }
}