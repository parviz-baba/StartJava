import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[]args) {
        // 1. Перевод псевдокода на язык Java (это название задачи)
        System.out.println("\n1. Перевод псевдокода на язык Java (это название задачи)\n");

        boolean isMan = true;
        int age = 18;
        double height = 1.75;
        final String name = "Mamed";

        // Проверка пола
        if (!isMan) {
            System.out.println("Пол: Женский");
        } else {
            System.out.println("Пол: Мужской");
        }

        // Проверка возраста
        if (age > 18) {
            System.out.println("Возраст: Старше 18 лет");
        } else {
            System.out.println("Возраст: Меньше 18 лет");
        }

        // Проверка роста
        if (height < 1.8) {
            System.out.println("Рост: Меньше 1.8 метра");
        } else {
            System.out.println("Рост: 1.8 метра или выше");
        }

        // Проверка первой буквы имени
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени: M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Первая буква имени: Не M и не I");
        }
        
        // 2. Поиск большего числа
        System.out.println("\n2. Поиск большего числа\n");
        int a = 152;
        int b = 205;

        if (a > b) {
            System.out.println(a + " болше " + b); 
        } else if (b > a) {
            System.out.println(b + " болше " + a);
        } else {
            System.out.println("Оба числа равны: " + a);
        }

        // 3. Проверка числа
        System.out.println("\n3. Проверка числа\n");
        int number = 20;

        if (number == 0) {
            System.out.println("number Является нулям");
        } else if (number > 0 & number % 2 == 0) {
            System.out.println(number + " является положительным и четным");
        } else if (number > 0 & number % 1 == 0) {
            System.out.println(number + " является положительным и нечетным");
        } else if (number < 0 & number % 2 == 0) {
            System.out.println(number + " является отрицательным  и четным");
        } else if (number < 0 & number % 2 == 0) {
            System.out.println(number + " является отрицательным  и нечетным");
        }

        // 4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах.\n");
        int num1 = 123;
        int num2 = 223;

        int hundredNum1 = num1 / 100;
        int tensNum1 = (num1 % 100) / 10;
        int unityNum1 = num1 % 10;

        int hundredNum2 = num2 / 100;
        int tensNum2 = (num2 % 100) / 10;
        int unityNum2 = num2 % 10;

        if (hundredNum1 == hundredNum2 & tensNum1 == tensNum2 & unityNum1 == unityNum2) {
            System.out.println(num1 + " и " + num2 + " равны");
        } else if (hundredNum1 == hundredNum2) {
            System.out.println("Сотни одинаковые. Равная цифра: " + hundredNum1);
        }
        if (tensNum1 == tensNum2) {
            System.out.println("Десятки одинаковые. Равная цифра: " + tensNum1);
        }
        if (unityNum1 == unityNum2) {
            System.out.println("Единство одинаковые. Равная цифра: " + unityNum1);
        }

        // 5. Определение символа по его коду.
        System.out.println("\n5. Определение символа по его коду.\n");

        char symbol = '\u0057';

        if (symbol >= '0' && symbol <= '9') {
            System.out.println("'" + symbol + "' - цифра");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("'" + symbol + "' - большая буква");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("'" + symbol + "' - маленькая буква");
        } else {
            System.out.println("'" + symbol + "' - ни буква и ни цифра");
        }

        char symbol1 = '\u005E';

        if (symbol1 >= '0' && symbol1 <= '9') {
            System.out.println("'" + symbol1 + "' - цифра");
        } else if (symbol1 >= 'A' && symbol1 <= 'Z') {
            System.out.println("'" + symbol1 + "' - большая буква");
        } else if (symbol1 >= 'a' && symbol1 <= 'z') {
            System.out.println("'" + symbol1 + "' - маленькая буква");
        } else {
            System.out.println("'" + symbol1 + "' - ни буква и ни цифра");
        }

        char symbol2 = '\u0031';

        if (symbol2 >= '0' && symbol2 <= '9') {
            System.out.println("'" + symbol2 + "' - цифра");
        } else if (symbol2 >= 'A' && symbol2 <= 'Z') {
            System.out.println("'" + symbol2 + "' - большая буква");
        } else if (symbol2 >= 'a' && symbol2 <= 'z') {
            System.out.println("'" + symbol2 + "' - маленькая буква");
        } else {
            System.out.println("'" + symbol2 + "' - ни буква и ни цифра");
        }

        // 6. Подсчет начисленных банком %.
        System.out.println("\n6. Подсчет начисленных банком %\n");
        double depositAmount = 321_123.59;

        double interestRate = 0.0;
        if (depositAmount > 300_000) {
            interestRate = 0.1;
        } else if (depositAmount > 100_000) {
            interestRate = 0.07;
        } else if (depositAmount <= 100_000 && depositAmount > 0) {
            interestRate = 0.05;
        }
        double interestAmount = depositAmount * interestRate;
        double totalAmount = depositAmount + interestAmount;

        System.out.println("Сумму вклада: " + depositAmount);
        System.out.println("Начисленные годовые проценты составляют: " + interestRate);
        System.out.println("Итоговую сумму с %: " + totalAmount);

        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");

        int percentHistory = 59;
        int historyGrade = 0;
        if (percentHistory <= 100 & percentHistory > 91) {
            historyGrade = 5;
        } else if (percentHistory > 73) {
            historyGrade = 4;
        } else if (percentHistory > 60) {
            historyGrade = 3;
        } else if (percentHistory <= 60 & percentHistory >= 0) {
            historyGrade = 2;
        }

        int percentProgramming = 92;
        int programmingGrade = 0;
        if (percentProgramming <= 100 & percentProgramming > 91) {
            programmingGrade = 5;
        } else if (percentProgramming > 73) {
            programmingGrade = 4;
        } else if (percentProgramming > 60) {
            programmingGrade = 3;
        } else if (percentProgramming <= 60 && percentProgramming >= 0) {
            programmingGrade = 2;
        }

        int averageGrade = (historyGrade + programmingGrade) / 2;
        int averagePercent = (percentHistory + percentProgramming) / 2;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        // 8. Расчет годовой прибыли (with if)
        System.out.println("\n8. Расчет годовой прибыли (with if)\n");
        double monthlySales = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyProductionPrice = 9001.729;

        double yearlyRevenue = monthlySales * 12;
        double yearlyExpenses = (monthlyRent + monthlyProductionPrice) * 12;
        double yearlyProfit = yearlyRevenue - yearlyExpenses;

        if (yearlyProfit > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit + " руб.\n");
        } else if (yearlyProfit < 0) {
            System.out.printf("Прибыль за год: " + yearlyProfit + " руб.\n");
        } else {
            System.out.println("Прибыль за год: 0 руб.\n");
        }

        // 9. Расчет годовой прибыли (with for)
        System.out.println("\n9. Расчет годовой прибыли (with for)\n");
        double monthlySales1 = 13025.233;
        double monthlyRent1 = 5123.018;
        double monthlyProductionPrice1 = 9001.729;
        double profit1 = 0.0;
        int monthRow1 = 0;

        for (monthRow1 = 1; monthRow1 <= 12; monthRow1++) {
            profit1 = profit1 + (monthlySales1 - (monthlyRent1 + monthlyProductionPrice1));
            if (profit1 > 0) {
                System.out.println("Доход " + monthRow1 + "-го месяца: +" + profit1);
            } else {
                System.out.println("Доход " + monthRow1 + "-го месяца: " + profit1);
            }
        }

        // 6. Подсчет начисленных банком %. (BigDecimal)
        System.out.println("\n6. Подсчет начисленных банком % (BigDecimal)\n");

        BigDecimal depositAmount1 = new BigDecimal("321123.59");
        BigDecimal interestRate1 = BigDecimal.ZERO;
        if (depositAmount1.compareTo(new BigDecimal("300000")) > 0) {
            interestRate1 = new BigDecimal("0.10");
        } else if (depositAmount1.compareTo(new BigDecimal("100000")) > 0) {
            interestRate1 = new BigDecimal("0.07");
        } else if (depositAmount1.compareTo(new BigDecimal("0")) > 0) {
            interestRate1 = new BigDecimal("0.05");
        }

        BigDecimal interestAmount1 = depositAmount1.multiply(interestRate1);
        BigDecimal totalAmount1 = depositAmount1.add(interestAmount1);

        depositAmount1 = depositAmount1.setScale(2, RoundingMode.HALF_UP);
        interestAmount1 = interestAmount1.setScale(2, RoundingMode.HALF_UP);
        totalAmount1 = totalAmount1.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Сумму вклада: " + depositAmount1);
        System.out.println("Начисленные годовые проценты составляют: " + interestRate1);
        System.out.println("Итоговую сумму с %: " + totalAmount1);

        // 8. Расчет годовой прибыли (BigDecimal)
        System.out.println("\n8. Расчет годовой прибыли (BigDecimal)\n");

        BigDecimal monthlySales2 = new BigDecimal("13025.233");
        BigDecimal monthlyRent2 = new BigDecimal("5123.018");
        BigDecimal monthlyProductionPrice2 = new BigDecimal("9001.729");
        BigDecimal monthlyNumber = new BigDecimal("12");

        BigDecimal yearlyRevenue2 = monthlySales2.multiply(monthlyNumber);
        BigDecimal yearlyExpenses2 = (monthlyRent2.add(monthlyProductionPrice2)).multiply(monthlyNumber);
        BigDecimal yearlyProfit2 = yearlyRevenue2.subtract(yearlyExpenses2);

        if (yearlyProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit2 + " руб.\n");
        } else if (yearlyProfit2.compareTo(BigDecimal.ZERO) < 0) {
            System.out.printf("Прибыль за год: " + yearlyProfit2 + " руб.\n");
        } else {
            System.out.println("Прибыль за год: 0 руб.\n");
        }
    }
}