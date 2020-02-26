import java.util.InputMismatchException;
import java.util.NoSuchElementException;
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
        int user_guess = 0;


        System.out.println(game.toString());
        System.out.println(game.getMessage());

        while (true) {

            try {
                System.out.print("your guess?  ");
                String str = input.nextLine();
                user_guess = Integer.parseInt(str);
            }
            catch(NoSuchElementException e1){
                System.exit(0);
            }
            catch(NumberFormatException e2) {
                System.out.println("Please input an integer");
                continue;
            }


            result = game.guess(user_guess);
            message = game.getMessage();

            if (result) return user_guess;
            System.out.println(message);
        }
    }
}