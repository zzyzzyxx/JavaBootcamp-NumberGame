package zzyzzyxx;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        game();
    }

    public static void game() {
        Random random = new Random();
        int theRandomNumber = random.nextInt(100) + 1;
       // System.out.println(theRandomNumber);

        Scanner scan = new Scanner(System.in);
        boolean won = false;
        int numOfGuesses = 1;
        while (numOfGuesses < 6) {
            System.out.println("Pick a number between 1 and 100");
            int pickedNumber = scan.nextInt();
            if ((pickedNumber < 1) || (pickedNumber > 100) ) {
                System.out.println("Your guess is not between 1 and 100, please try again");
            } else {
                if (pickedNumber > theRandomNumber) {
                    System.out.println("Please pick a lower number");
                    numOfGuesses++;
                } else if (pickedNumber < theRandomNumber) {
                    System.out.println("Please pick a higher number");
                    numOfGuesses++;
                } else if (pickedNumber == theRandomNumber) {
                    System.out.println("You win!");
                    won = true;
                    break;
                }
            }
        }
        if (won == false) {
            System.out.println("You lose!");
            System.out.println("The number to guess was: " + theRandomNumber);
        }
        scan.close();
    }
}