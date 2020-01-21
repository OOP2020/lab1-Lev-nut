



public class GameSolver{

    private int min;
    private int max;
    private int guess;
    private int res;
    public boolean result;
    public String message;


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
    
    min = 1;
    max = game.getUpperBound();;
    guess = (min + max)/2;
    res = guess;
    


    // Checking every number from 1 to the upperbound values
    while (true){
        result = game.guess(res);
        message = game.getMessage();
        game.setCount();
        System.out.println(res);
        System.out.println(message);


        
        if (message == "Correct!"){
            break;
        }
        
        else if (message == "Too small."){
            min = ++res;
        }

        else if (message == "Too large."){
            max = --res;
        }

        else if (message == "WAY too small, dude."){
            max = res + 2;
        }

        else if (message == "WAY too large, man."){
            min = res - 2;
        }
        
        res = (min + max)/2;
    }

    return res;
    }
}