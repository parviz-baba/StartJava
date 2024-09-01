public class FactorialUtils {
    public static void main(String[] args) {
        printFactorials(new int[]{});
        printFactorials(null);
        printFactorials(8, 0, 9);
        printFactorials(-3, 1, 7, 13);
        printFactorials(-22, -0);
    }

    private static void printFactorials(int... number) {
        if (number == null) {
            System.out.println("Массив равен null");
            return;
        }
        if (number.length == 0) {
            System.out.println("Массив нулевой длины");
            return;
        }
        long[] results = new long[number.length];
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if (num < 0) {
                System.out.println("Ошибка: факториал " + num + "! не определен.");
            } else {
                results[i] = calculateFactorial(num);
                System.out.println(formatResult(num, results[i]));
            }
        }
        System.out.println("Массив результатов: ");
        for (long result : results) {
            if (result != -1) {
                System.out.print(result + " ");
            }
        }
        System.out.println();
    }

    private static long calculateFactorial(long number) {
        if (number == 0) return 1;
        long factorial = 1L;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static String formatResult(int number, long result) {
        if (number == 0) return "0! = 1";
        StringBuilder resultString = new StringBuilder(number + "! = ");
        for (int i = 1; i <= number; i++) {
            resultString.append(i);
            if (i < number) resultString.append(" * ");
        }
        if (number > 1) resultString.append(" = ").append(result);
        return resultString.toString();
    }
}