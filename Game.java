import java.util.*;
import java.math.*;

public class Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int k = 5;
        int num = (int) (Math.random() * 100);
        int guess = 0;
        System.out.println("Welcome To Number Guessing Game....!");
        //System.out.println("......................................");
        System.out.println("Enter the Number Between 1 to 100");
        //System.out.println("......................................");
        System.out.println("You Have only 5 Chance");
        //System.out.println("-> -> -> -> -> -> -> -> -> -> -> -> -> ");
        do {
            System.out.println("Guess The No");
            guess = sc.nextInt();

            if (guess > num) {
                System.out.println("Guess is too high");
            } else if (guess < num) {
                System.out.println("Guess is too low");
            } else {
                System.out.println("Congratulations You Guess Correct Number...!");
                break;
            }
            i++;
        } while (i < 5);

        if (i == k) {
            System.out.println("Sorry...!");
            System.out.println("your chance get over...");
        }

    }
}