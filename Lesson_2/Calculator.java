class Calculator {
    public double calculate(int num1, String operator, int num2) {
        double result = Double.NaN;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / (double) num2;
                } else {
                    System.out.println("Ошибка: деление на ноль запрещено");
                }
                break;
            case "^":
                result = pow(num1, num2);
                break;
            case "%":
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Ошибка: деление на ноль запрещено");
                }
                break;
            default:
                System.out.println("Ошибка: операция " + operator + " не поддерживается.");
                System.out.println("Доступны следующие операции: +, -, *, /, ^, %");
        }
        return result;
    }

    public int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
