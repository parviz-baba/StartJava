public class GuessTheNumber {
    public static void main(String[]args) {
        int secretNumber = 42;
        int guess = 0;
        int low = 1;
        int high = 100;
        while (guess != secretNumber) {
            guess = (low + high) / 2;
            if (guess < secretNumber) {
                System.out.println(guess + " меньше того, что загадал компьютер");
                low = guess + 1;
            } else if (guess > secretNumber) {
                System.out.println(guess + " больше того, что загадал компьютер");
                high = guess - 1;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + secretNumber);
    }
}