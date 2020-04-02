import java.util.Random;
import java.util.Scanner;

public class TerminalGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 5 && guess != number) {
                System.out.println("Введите число от 0 до 10: ");
                guess = sc.nextInt();
                if (number != guess) {
                    System.out.println("Попробуйте еще раз, ваше число " + ((guess > number) ? "больше" : "меньше"));
                    count++;
                }
            }
            System.out.println("You " + ((count == 5) ? "Lose!" : "WIN!"));
            System.out.println("Repeat game? Yes - 1, No - 0");
        } while (sc.nextInt() == 1);

        System.out.println("Good Bye");
    }
}
