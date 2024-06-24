import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        generateNewTarget();
    }

    public void start() {
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
                if (guess > targetNumber) {
                    System.out.println(guess + " больше того, что загадал компьютер");
                } else {
                    System.out.println(guess + " меньше того, что загадал компьютер");
                }
                System.out.println("Неверно. Попробуй снова.");
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }

    public void generateNewTarget() {
        targetNumber = (int) (Math.random() * 100) + 1;
    }
}