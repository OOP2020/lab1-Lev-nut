public class Main {

    public static void main(String[] args) {
        int bound = 20; //default value
        if (args.length > 0) bound = Integer.parseInt( args[0]);
        GuessingGame game = new GuessingGame(bound);
        GameConsole ui = new GameConsole();
        int solution = ui.play(game);

        System.out.println("Right! The secret number is " + solution);
    }
}
