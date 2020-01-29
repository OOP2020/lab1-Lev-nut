import java.util.Scanner;

/**
 * Control the game by sending info back and foward to other files
 * 
 * @author Teeranut Sawanyawat 6210545491
 */
public class GameConsole {

    /**
     * Play a guessing game and return the user guess back if it match with the
     * secret number
     * 
     * @param game is the GuessingName to solve
     * @return the user guess
     *
     */
    public int play(GuessingGame game) {

        Scanner input = new Scanner(System.in);
        boolean result;
        String message;

        System.out.println(game.toString());
        System.out.println(game.getMessage());

        while (true) {
            System.out.print("your guess?  ");
            int user_guess = input.nextInt();

            result = game.guess(user_guess);
            message = game.getMessage();

            if (result)
                return user_guess;
            System.out.println(message);
        }
    }
}