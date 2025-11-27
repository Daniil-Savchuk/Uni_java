package game;

public class GameController {
    private GameState model;
    private final GameView view;

    public GameController() {
        this.view = new GameView();
    }

    public void startGame() {
        view.displayWelcome();
        int initialSticks = view.getInitialSticksCount();
        int maxTake = view.getMaxTakeCount();
        this.model = new GameState(initialSticks, maxTake);

        while (!model.isGameOver()) {
            view.displayGameState(model.getCurrentSticks(), model.getCurrentPlayer());
            int sticksToTake = view.getPlayerMove(model.getMaxTake(), model.getCurrentSticks());
            boolean moveWasValid = model.takeSticks(sticksToTake);

            if (!moveWasValid) {
                view.displayInvalidMove("Можна брати від 1 до " + model.getMaxTake() +
                        " і не більше, ніж залишилось.");
                continue;
            }

            if (model.isGameOver()) {
                break;
            }
            model.switchPlayer();
        }

        int loser = model.getCurrentPlayer();
        int winner = model.getWinner();

        view.displayWinner(winner, loser);
        view.closeView();
    }
}
