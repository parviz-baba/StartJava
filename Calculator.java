public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char operator = '^';
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            return;
        } 
        if (operator == '-') {
            result = num1 - num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            return;
        } 
        if (operator == '*') {
            result = num1 * num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            return;
        } 
        if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                return;
            } 
            System.out.println("На ноль делить нельзя");
            return;
        } 
        if (operator == '^') {
            result = 1;
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            return;
        } 
        if (operator == '%') {
            result = num1 % num2;
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            return;
        }
        System.out.println("Неверный оператор");
    }
}