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

    public int getInitialSticksCount() {
        System.out.print("Введіть початкову кількість паличок (наприклад, 21): ");
        return scanner.nextInt();
    }

    public int getMaxTakeCount() {
        System.out.print("Введіть макс. кількість паличок за хід (наприклад, 3): ");
        return scanner.nextInt();
    }

    public void displayGameState(int sticksLeft, int currentPlayer) {
        System.out.println("---------------------------");
        System.out.println("Паличок залишилось: " + sticksLeft);
        System.out.println("Хід Гравця " + currentPlayer);
    }

    public int getPlayerMove(int maxTake, int sticksLeft) {
        int realMax = Math.min(maxTake, sticksLeft);
        System.out.print("Скільки берете (1-" + realMax + "): ");
        return scanner.nextInt();
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

    public void closeView() {
        scanner.close();
    }
}
