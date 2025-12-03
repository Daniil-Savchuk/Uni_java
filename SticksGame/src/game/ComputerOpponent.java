package game;

import java.util.Random;

public class ComputerOpponent {
    private final Random random = new Random();
    public int getMove(int sticksLeft, int maxTake, int difficulty) {

        switch (difficulty) {
            case 1:
                return getRandomMove(sticksLeft, maxTake);
            case 2:
                if (random.nextBoolean()) {
                    return getSmartMove(sticksLeft, maxTake);
                } else {
                    return getRandomMove(sticksLeft, maxTake);
                }
            case 3:
                return getSmartMove(sticksLeft, maxTake);
            default:
                return 1;
        }
    }

    private int getRandomMove(int sticksLeft, int maxTake) {
        int limit = Math.min(sticksLeft, maxTake);
        return random.nextInt(limit) + 1;
    }

    private int getSmartMove(int sticksLeft, int maxTake) {
        int target = (sticksLeft - 1) % (maxTake + 1);
        if (target == 0) {
            return getRandomMove(sticksLeft, maxTake);
        }
        return target;
    }
}
