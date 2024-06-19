class Calculator {
    public double calculate(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / (double) num2;
                }
                System.out.println("Ошибка: деление на ноль запрещено");
                return Double.NaN;
            case "^":
                return pow(num1, num2);
            case "%":
                if (num2 != 0) {
                    return num1 % num2;
                }
                System.out.println("Ошибка: деление на ноль запрещено");
                return Double.NaN;
            default:
                System.out.println("Ошибка: операция '&' не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
                return Double.NaN;
        }
    }

    public int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}