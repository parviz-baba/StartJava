import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2 = new Player(name2);

        GuessNumber game = new GuessNumber(player1, player2);

        boolean playAgain = true;
        while (playAgain) {
            game.startGame();
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            String answer = scanner.next();
            while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.out.println("Пожалуйста, введите 'yes' или 'no'. Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            }
            playAgain = answer.equalsIgnoreCase("yes");
            if (playAgain) {
                game.resetGame();
            }
        }
        System.out.println("Игра завершена. Спасибо за игру!");
    }
}