package game;

public class GameState {
    private int currentSticks;
    private final int maxTake;
    private int currentPlayer;

    public GameState(int initialSticks, int maxTake) {
        this.currentSticks = initialSticks;
        this.maxTake = maxTake;
        this.currentPlayer = 1;
    }

    public boolean takeSticks(int count) {
        if (count < 1 || count > maxTake) {
            return false;
        }
        if (count > currentSticks) {
            return false;
        }

        this.currentSticks -= count;
        return true;
    }

    public void switchPlayer() {
        if (this.currentPlayer == 1) {
            this.currentPlayer = 2;
        } else {
            this.currentPlayer = 1;
        }
    }

    public boolean isGameOver() {
        return currentSticks == 0;
    }

    public int getCurrentSticks() {
        return currentSticks;
    }

    public int getMaxTake() {
        return maxTake;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int getWinner() {
        return (currentPlayer == 1) ? 2 : 1;
    }
}