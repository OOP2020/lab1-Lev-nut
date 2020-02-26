import java.util.Scanner;

/**
 * Main acts like a combination of code which group all the code from GuessingGame, EchoGame, and GameConsole.
 *
 * @author Teeranut Sawanyawat
 */

public class Main {

    public static void main(String[] args) {
        int bound = 20; // default value

        if (args.length > 0)
            bound = Integer.parseInt(args[0]);

        Scanner input = new Scanner(System.in);

        GuessingGame game = new GuessingGame(bound);
        //EchoGame game = new EchoGame(bound);
        GameConsole ui = new GameConsole();
        //GameSolver ui = new GameSolver();


        int solution = ui.play(game);

        System.out.println("Right! The secret number is " + solution);
        System.out.println("Player played round is " + game.getCount());
    }
}
