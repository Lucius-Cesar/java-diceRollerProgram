import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int cumulativeRollsCount = 0;
        // enter the number of dice to roll
        while(choice == 0){
            System.out.println("Enter the number of dice to roll: ");
            choice = scanner.nextInt();
        }
        // rolling x dice
        System.out.printf("Rolling %d dices... \n", choice);


        for(int i=0; i < choice; i++){
            int rollResult = rollDice();
            cumulativeRollsCount += rollResult;
        }

        // display the total of all rolls
        System.out.printf("Your total roll is %d\n", cumulativeRollsCount);

    }
    public static int rollDice() {
        // generate random number 1 -> 6
        Random random = new Random();
        int randomNumber = random.nextInt(1, 7);
        switch (randomNumber) {
            case 1 -> System.out.println("-----\n" +
                    "|   |\n" +
                    "| o |\n" +
                    "|   |\n" +
                    "-----");

            case 2 -> System.out.println("-----\n" +
                    "|o  |\n" +
                    "|   |\n" +
                    "|  o|\n" +
                    "-----");
            case 3 -> System.out.println("-----\n" +
                    "|o  |\n" +
                    "| o |\n" +
                    "|  o|\n" +
                    "-----");

            case 4 -> System.out.println("-----\n" +
                    "|o o|\n" +
                    "|   |\n" +
                    "|o o|\n" +
                    "-----");
            case 5 -> System.out.println("-----\n" +
                    "|o o|\n" +
                    "| o |\n" +
                    "|o o|\n" +
                    "-----");

            case 6 -> System.out.println("-----\n" +
                    "|o o|\n" +
                    "| o |\n" +
                    "|o o|\n" +
                    "-----");

            default ->  System.out.println("Random number is not between 1 and 6");
        }
        System.out.println("You rolled " + randomNumber);
        return(randomNumber);
    }
}
