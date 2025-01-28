package exercise3;
import java.util.Random;
import java.util.Scanner; 
public class GuessStarter {
    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // System.out.println(number);

        System.out.print("Type a number: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        scanner.close();

        System.out.println("Your guess: "+guess);
        System.out.println("The number I was thinking of is: "+number);
        System.out.println("You were off by: "+ Math.abs(number-guess));

    }
}
