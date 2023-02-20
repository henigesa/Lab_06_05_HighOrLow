
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        //declare variables
        int guess = 0;
        int num;
        //generate random number
        num = generator.nextInt(10) + 1 ;
        //prompt user to guess number
        System.out.println("Guess what number I am thinking of between 1 and 10");
        //take the user input
        if (input.hasNextInt()) {
            guess = input.nextInt();
            input.nextLine();
        } else {
            System.out.println("That is not a valid input. Run the program and try again.");
            System.exit(0);
        }
        //show real number
        System.out.println("The number was " + num);
        //if else
        if (num == guess) {
            System.out.println("Your guess was right on the money!");
        }
        if (num > guess) {
            System.out.println("Your guess was a little low.");
        }
        else {
            System.out.println("Your guess was a little high.");
        }
    }
}