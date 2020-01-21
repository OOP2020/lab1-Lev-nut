import java.util.Scanner;


public class GameConsole{
    public Scanner input = new Scanner(System.in);

    public boolean result;

    public String message;

    public int play(GuessingGame game){
        System.out.println(game.toString());
        System.out.println(game.getMessage());

        while (true){
            System.out.print("your guess?  ");
            int user_guess = input.nextInt();

            result = game.guess(user_guess);
            message = game.getMessage();

            if (result) return user_guess;
            System.out.println(message);
        }
    }
}