import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";

        while (userChoice.equals("yes")) {
            System.out.println("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            String operator = scanner.nextLine();
            System.out.println("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, operator, num2);
            printResult(num1, operator, num2, result);
            if (!operator.equals("+") && !operator.equals("-") && 
                    !operator.equals("*") && !operator.equals("/") && 
                    !operator.equals("^") && !operator.equals("%")) {
                System.out.println("Неправильный оператор. Попробуйте снова.");
                continue;
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            userChoice = scanner.nextLine();
            while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")) {
                System.out.println("Пожалуйста, введите 'yes' или 'no'.");
                userChoice = scanner.nextLine();
            }
        }
    }

    public static void printResult(int num1, String operator, int num2, double result) {
        if (!Double.isNaN(result)) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}