package game;

import java.util.Scanner;

public class GameView {
    private final Scanner scanner;

    public GameView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcome() {
        System.out.println("===========================");
        System.out.println("   Ласкаво просимо у гру Палички!");
        System.out.println("   Програє той, хто візьме останню!");
        System.out.println("===========================");
    }

    private int getValidInput(int min, int max) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                scanner.next();
            }
            System.out.print("Помилка! Введіть число від " + min + " до " + max + ": ");
        }
    }

    public int getGameMode() {
        System.out.println("\nВиберіть режим гри:");
        System.out.println("1. Гравець проти Гравця (PvP)");
        System.out.println("2. Гравець проти Комп'ютера (PvE)");
        System.out.print("Ваш вибір: ");
        return getValidInput(1, 2);
    }

    public int getDifficultyLevel() {
        System.out.println("\nВиберіть складність:");
        System.out.println("1. Легкий");
        System.out.println("2. Середній");
        System.out.println("3. Складний");
        System.out.print("Ваш вибір: ");
        return getValidInput(1, 3);
    }

    public void displayComputerMove(int sticksTaken) {
        System.out.println("Комп'ютер думає...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">>> Комп'ютер взяв " + sticksTaken + " паличок.");
    }

    public int getInitialSticksCount() {
        System.out.print("Введіть початкову кількість паличок (від 1 до 100): ");
        return getValidInput(1, 100);
    }

    public int getMaxTakeCount() {
        System.out.print("Введіть макс. кількість паличок за хід (від 1 до 10): ");
        return getValidInput(1, 10);
    }

    public void displayGameState(int sticksLeft, int currentPlayer) {
        System.out.println("---------------------------");
        System.out.println("Паличок залишилось: " + sticksLeft);
        System.out.println("Хід Гравця " + currentPlayer);
    }

    public int getPlayerMove(int maxTake, int sticksLeft) {
        int realMax = Math.min(maxTake, sticksLeft);
        System.out.print("Скільки берете (1-" + realMax + "): ");
        return getValidInput(1, realMax);
    }

    public void displayInvalidMove(String message) {
        System.out.println("! НЕВАЛІДНИЙ ХІД: " + message);
    }

    public void displayWinner(int winnerPlayer, int loserPlayer) {
        System.out.println("===========================");
        System.out.println("Гру закінчено!");
        System.out.println("Гравець " + loserPlayer + " взяв останню паличку і ПРОГРАВ.");
        System.out.println(">>> Переміг Гравець " + winnerPlayer + "! <<<");
        System.out.println("===========================");
    }

    public void displayHumanWin() {
        System.out.println("\n===========================");
        System.out.println("       ВІТАЄМО!       ");
        System.out.println("Ви змусили комп'ютер взяти останню паличку.");
        System.out.println(">>> ВИ ПЕРЕМОГЛИ ШТУЧНИЙ ІНТЕЛЕКТ! <<<");
        System.out.println("===========================");
    }

    public void displayComputerWin() {
        System.out.println("\n===========================");
        System.out.println("       ПОРАЗКА...      ");
        System.out.println("Ви взяли останню паличку.");
        System.out.println(">>> КОМП'ЮТЕР ПЕРЕМІГ! <<<");
        System.out.println("===========================");
    }

    public void closeView() {
        scanner.close();
    }
}
