import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        resetGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean guessed = false;
        Player currentPlayer = player1;

        while (!guessed) {
            System.out.println(currentPlayer.getName() + ", угадай число: ");
            int guess = scanner.nextInt();
            
            if (guess == targetNumber) {
                guessed = true;
                System.out.println("Поздравляем, " + currentPlayer.getName() + "! Ты угадал число.");
            } else {
                System.out.println("Неверно. Попробуй снова.");
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
            }
        }
    }

    public void resetGame() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }
}