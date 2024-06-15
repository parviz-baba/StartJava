import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        String continueCalculatingChoice;

        while (continueCalculating) {
            System.out.println("Введите первое число: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
            String operator = scanner.nextLine();
            System.out.println("Введите второе число: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, operator, num2);
            if (!Double.isNaN(result)) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            continueCalculatingChoice = scanner.nextLine();
            if (continueCalculatingChoice.equalsIgnoreCase("no")) {
                continueCalculating = false;
            }
        }
        scanner.close();
    }
}