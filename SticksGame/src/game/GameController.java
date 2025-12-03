package game;

public class GameController {

    private GameState model;
    private final GameView view;
    private final ComputerOpponent computer;

    public GameController() {
        this.view = new GameView();
        this.computer = new ComputerOpponent();
    }

    public void startGame() {
        view.displayWelcome();
        int initialSticks = view.getInitialSticksCount();
        int maxTake = view.getMaxTakeCount();
        int gameMode = view.getGameMode();
        int difficulty = 1;
        boolean isComputerGame = (gameMode == 2);

        if (isComputerGame) {
            difficulty = view.getDifficultyLevel();
        }

        this.model = new GameState(initialSticks, maxTake);

        while (!model.isGameOver()) {
            view.displayGameState(model.getCurrentSticks(), model.getCurrentPlayer());
            int sticksToTake;

            if (model.getCurrentPlayer() == 2 && isComputerGame) {
                sticksToTake = computer.getMove(model.getCurrentSticks(), model.getMaxTake(), difficulty);
                view.displayComputerMove(sticksToTake);

            } else {
                sticksToTake = view.getPlayerMove(model.getMaxTake(), model.getCurrentSticks());
            }

            boolean moveWasValid = model.takeSticks(sticksToTake);

            if (!moveWasValid) {
                view.displayInvalidMove("Невірний хід! Спробуйте ще раз.");
                continue;
            }

            if (model.isGameOver()) {
                break;
            }

            model.switchPlayer();
        }

        int loser = model.getCurrentPlayer();
        int winner = model.getWinner();

        if (isComputerGame) {
            if (winner == 1) {
                view.displayHumanWin();
            } else {
                view.displayComputerWin();
            }
        } else {
            view.displayWinner(winner, loser);
        }

        view.closeView();
    }
}