import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        String continue;

        while (continueCalculating) {
                System.out.println("Введите первое число: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите знак операции (+, -, *, /, ^, %): ");
                String operator = scanner.nextLine();
                System.out.println("Введите второе число: ");
                int num2 = Integer.parseInt(scanner.nextLine());
                double result = calculate(num1, operator, num2);
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            if (operator != "+" && operator != "-" && operator != "*" && operator != "/" && operator != "^" && operator != "%") {
                    System.out.println("Хотите продолжить вычисления? [yes/no]: " + continue = scanner.nextLine());
                if (continue == "yes") {
                    continueCalculating = true;
                } else if (continue == "no") {
                    continueCalculating = false;
                }
            }
        }
    }


}