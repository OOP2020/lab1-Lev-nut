



public class GameSolver{

    private int min;
    private int max;
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



    // Checking every number from 1 to the upperbound values
    while (true){
        res = min + (max - min)/2;
        result = game.guess(res);
        message = game.getMessage();
        game.setCount();

        
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
            min = ++res;
        }

        else if (message == "WAY too large, man."){
            max = --res;
        }
        

    }

    return res;
    }
}