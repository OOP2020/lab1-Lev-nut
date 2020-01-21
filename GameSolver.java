



public class GameSolver{
    private int win;
    public int play(GuessingGame game){
    /**
     * Play a GuessingGame and return the solution.
     * The game must provide messages (getMessage) containing the
     * phrase "too small" if a guess is too small or "too large" if
     * a guess is too large, for efficient solution.
     *
     * @param game is the GuessingName to solve
     * @return 
     */

    // Checking every number from 1 to the upperbound values
    for (win = 1 ; win <= game.getUpperBound() ; win++){
        game.setCount();
        // Checking that if the win values comparing with the answer in guess() is true of false
        if (true == game.guess(win)){
            break;
        }
    }
    return win;
}
}