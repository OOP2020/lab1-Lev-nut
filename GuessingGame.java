import java.util.Random;

/**
 * Guess a secret number between 1 and an upper bound.
 * 
 * @author Teeranut Sawanyawat 6210545491
 */
public class GuessingGame {
    // count the number of round that player played
    private int counter;

    // upper bound for secret number
    private int upperBound;

    // the secret number

    private int secret;

    // hint for most recent guess

    private String message;

    /**
     * Initialize a new game with a default upperbound.
     */

    public GuessingGame(int upperbound) {
        this.upperBound = upperbound;
        secret = getRandomNumber(this.upperBound);
        String hint = "I'm thinking of a number between 1 and " + upperBound;
        setMessage(hint);
    }

    public GuessingGame() {
        this(100);
    }

    /**
     * Get a random number between 1 and limit.
     *
     * @param limit is the upper limit for the random number.
     * @return a random integer
     */
    private int getRandomNumber(int limit) {
        // use a seed so the random numbers are not repeatable
        long seed = System.nanoTime();
        Random rand = new Random(seed);
        return 1 + rand.nextInt(limit);
    }

    /**
     * Evaluate a guess.
     *
     * @param number is a guess of the secret number.
     * @return true if the guess is correct, false otherwise.
     */
    public boolean guess(int number) {
        message = makeHint(number, secret);
        ++this.counter;
        return (number == secret);
    }

    /**
     * Get a message (hint) based on most recent guess. If nothing has been guessed
     * yet then the hint describes the game.
     *
     * @return a message about game or most recent guess
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the game upper bound for the secret number.
     */
    public int getUpperBound() {
        return this.upperBound;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    /**
     * Create a hint based on the last guess.
     *
     * @param number is the most recent guess
     * @param secret is the secret number
     */
    protected String makeHint(int number, int secret) {
        if (number == secret) {
            return "Correct!";
        } else if (number - secret < -upperBound / 4)
            return "WAY too small, dude.";
        else if (number < secret)
            return "Too small.";
        else if (number - secret > upperBound / 4)
            return "WAY too large, man.";
        else
            return "Too large.";
    }

    /**
     * Provide a started message to the player
     */
    public String toString() {
        return "Guess a secret number.";
    }

    /**
     * Get the game counter number.
     */
    public int getCount() {
        return counter;
    }

}