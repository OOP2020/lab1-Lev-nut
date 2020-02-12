/**
 * EchoGame tells the user the secret numbers in it every guesses until the answer is correct.
 * 
 * @author Teeranut Sawanyawat 6210545491
 */

public class EchoGame extends GuessingGame {
    /**
     * Initialize a new instance of EchoGame
     */
    public EchoGame(int upperbound) {
        super(upperbound);
    }

    @Override
    public boolean guess(int number) {
        // print the guess
        System.out.printf("guess(%d) is ", number);
        // call GuessingGame guess(number)
        boolean answer = super.guess(number);
        // print what was returned
        System.out.println(answer);
        return answer;
    }
}