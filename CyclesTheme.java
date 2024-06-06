
public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");

        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int number = start;
        do {
            sumEven += (number % 2 == 0) ? number : 0;
            sumOdd += (number % 2 != 0 & number % 1 == 0) ? number : 0;
            number++;
        } while (number <= 21);
        System.out.println("В отрезке [" + start + " ," + end + "] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания\n");

        int a = 10;
        int b = 5;
        int c = -1;
        int maxNumber = a;
        int minNumber = a;
        minNumber = (b < minNumber) ? b : minNumber;
        maxNumber = (b > maxNumber) ? b : maxNumber;
        minNumber = (c < minNumber) ? c : minNumber;
        maxNumber = (c > maxNumber) ? c : maxNumber;
        System.out.print("Числа в интервале (" + minNumber + ", " + maxNumber + ") в порядке убывания: ");
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int d = 0;
        int sumOfDigitsReceived = 0;
        while (d <= 1234) {
            sumOfDigitsReceived += d;
            d++;
        }
        int e = sumOfDigitsReceived;
        System.out.print("Число в обратном порядке:");
        while (e != 0) {
            int digit = e % 10;
            System.out.print(" " + digit);
            e /= 10;
        }
        System.out.println("\nСумму выделенных цифр: " + sumOfDigitsReceived);

        System.out.println("\n4. Вывод чисел в несколько строк\n");

        int start1 = 1;
        int end1 = 24;
        int count = 0;
        for (int i = start1; i < end1; i += 2) {
            if (count > 0 && count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d ", i);
            count++;
        }
        int remaining = 5 - (count % 5);
        if (remaining != 5) {
            for (int i = 0; i < remaining; i++) {
                System.out.printf("%4d ", 0);
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность\n");

        int number1 = 3242592;
        int count1 = 0;
        int swap = number1;
        while (swap > 0) {
            if (swap % 10 == 2) {
                count1++;
            }
            swap /= 10;
        }
        if (count1 % 2 == 0) {
            System.out.println("В " + number1 + " четное (" + count1 + ") количество двоек");
        } else {
            System.out.println("В " + number1 + " нечетное (" + count1 + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур\n");

        int stars = 50;
        for (int i = 0; i < stars; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }

        System.out.println();

        double octothorps = 15;
        double height = 5;
        double x = 0;
        while (x < octothorps) {
            if (x == 0 || x % height != 0) {
                System.out.print("#");
            } else {
                System.out.println();
                System.out.print("#");
                height -= 0.5;
            }
            x++;
        }

        System.out.println();

        int floor = 1;
        do {
            int row = 1;
            do {
                System.out.print("$");
                row++;
            } while (row <= floor);
            System.out.println();
            if (floor == 3) {
                floor = 2;
                do {
                    row = 1;
                    do {
                        System.out.print("$");
                        row++;
                    } while (row <= floor);
                    System.out.println();
                    floor--;
                } while (floor >= 1);
                floor = 3;
            }
            floor++;
        } while (floor <= 3);
    }
}