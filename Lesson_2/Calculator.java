public class Calculator {
    public double calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return add(num1, num2);
            case "-":
                return subtract(num1, num2);
            case "*":
                return multiply(num1, num2);
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return Double.NaN;
                }
                return divide(num1, num2);
            case "^":
                return power(num1, num2);
            case "%":
                return mod(num1, num2);
            default:
                System.out.println("Ошибка: операция " + operator + " не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
                return Double.NaN;
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}