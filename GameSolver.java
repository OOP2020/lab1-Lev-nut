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


            if (message.contains("Correct!")) {
                break;
            }

            else if (message.contains("Too small.")) {
                min = ++res;
            }

            else if (message.contains("Too large.")) {
                max = --res;
            }

            else if (message.contains("WAY too small, dude.")) {
                min = ++res;
            }

            else if (message.contains("WAY too large, man.")) {
                max = --res;
            }

        }

        return res;
    }
}