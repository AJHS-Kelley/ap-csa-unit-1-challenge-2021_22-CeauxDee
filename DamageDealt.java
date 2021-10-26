// Cody Collins, AP CSA Uni 1 Challenge, Andrew Jackson High School, 10/26/2021, 9:35 am, v5.0

import java.util.Scanner;

public class DamageDealt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is getting hit? ");

        String enemy = myScanner.nextLine();

        System.out.println(" ");

        System.out.println("What is it getting hit with? ");

        String weapon = myScanner.nextLine();

        System.out.println(" ");

        System.out.println("How many attacks will you do? ");

        int attackNum = myScanner.nextInt();

        System.out.println(" ");

        System.out.println("How much damage will each attack do? ");

        int attackPower = myScanner.nextInt();
        
        System.out.println(" ");

        int totalDmg = attackNum * attackPower;

        double playerDps = totalDmg / 4.0;

        System.out.println("You successfully dealt " + totalDmg + " using the " + weapon + " to the " + enemy + "!");

        System.out.println("You dealt " + playerDps + " damage per second using the " + weapon + " to the " + enemy + "!");
    }
}