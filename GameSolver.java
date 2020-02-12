/**
 * GameSolver will automatically guess the secret number of the game
 * 
 * @author Teeranut Sawanyawat 6210545491
 * 
 */
public class GameSolver {

    /**
     * Play a GuessingGame and return the solution. The game must provide messages
     * (getMessage) containing the phrase "too small" if a guess is too small or
     * "too large" if a guess is too large, for efficient solution.
     * 
     * @param game is the GuessingName to solve
     * @return the secret number
     */

    public int play(GuessingGame game) {

        int res;

        int min = 1;
        int max = game.getUpperBound();
        ;

        // Checking every number from 1 to the upperbound values
        while (true) {
            res = min + (max - min) / 2;
            game.guess(res);
            String message = game.getMessage();
            String mes = message.toLowerCase();

            if (mes.contains("correct!")) {
                break;
            }

            else if (mes.contains("too small.")) {
                min = ++res;
            }

            else if (mes.contains("too large.")) {
                max = --res;
            }

        }

        return res;
    }
}