import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMan = true;
        int age = 18;
        double height = 1.75;
        final String name = "Mamed";
        if (!isMan) {
            System.out.println("Пол: Женский");
        } else {
            System.out.println("Пол: Мужской");
        }
        if (age > 18) {
            System.out.println("Возраст: Старше 18 лет");
        } else {
            System.out.println("Возраст: Меньше 18 лет");
        }
        if (height < 1.8) {
            System.out.println("Рост: Меньше 1.8 метра");
        } else {
            System.out.println("Рост: 1.8 метра или выше");
        }
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени: M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени: I");
        } else {
            System.out.println("Первая буква имени: Не M и не I");
        }

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

        System.out.println("\n3. Проверка числа\n");

        int number = 20;
        if (number == 0) {
            System.out.println(number + " является нулям");
        } else if (number > 0 & number % 2 == 0) {
            System.out.println(number + " является положительным и четным");
        }
        if (number > 0 & number % 2 != 0 & number % 1 == 0) {
            System.out.println(number + " является положительным и нечетным");
        }
        if (number < 0 & number % 2 == 0) {
            System.out.println(number + " является отрицательным  и четным");
        }
        if (number < 0 & number % 2 != 0 & number % 1 == 0) {
            System.out.println(number + " является отрицательным  и нечетным");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.\n");

        int numberA = 123;
        int numberB = 223;
        int hundredA = numberA / 100;
        int tensA = numberA / 10 % 10;
        int onesA = numberA % 10;
        int hundredB = numberB / 100;
        int tensB = numberB / 10 % 10;
        int onesB = numberB % 10;
        if (hundredA == hundredB || tensA == tensB || onesA == onesB) {
            System.out.println("Числа: " + numberA + " и " + numberB);
            if (hundredA == hundredB) {
                System.out.println("Одинаковые цифры в разряде сотен: " + hundredA);
            }
            if (tensA == tensB) {
                System.out.println("Одинаковые цифры в разряде десятков: " + tensA);
            }
            if (onesA == onesB) {
                System.out.println("Одинаковые цифры в разряде единиц: " + onesA);
            } 
        } else {
            System.out.println("Нет одинаковых цифр в одинаковых разрядах.");
        }

        System.out.println("\n5. Определение символа по его коду.\n");

        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("'" + symbol + "' - маленькая буква");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("'" + symbol + "' - большая буква");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("'" + symbol + "' - цифра");
        } else {
            System.out.println("'" + symbol + "' - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %\n");

        double depositAmount = 321_123.59;
        double interestRate = 0.1;
        if (depositAmount <= 100_000 & depositAmount > 0) {
            interestRate = 0.05;
        } else if (depositAmount <= 300_000) {
            interestRate = 0.07;
        }
        double interestAmount = depositAmount * interestRate;
        double totalAmount = depositAmount + interestAmount;
        System.out.println("Сумму вклада: " + depositAmount);
        System.out.println("Начисленные годовые проценты составляют: " + interestRate);
        System.out.println("Итоговую сумму с %: " + totalAmount);

        System.out.println("\n7. Определение оценки по предметам\n");

        int percentHistory = 59;
        int historyGrade = 2;
        if (91 < percentHistory & percentHistory <= 100) {
            historyGrade = 5;
        } else if (percentHistory > 73) {
            historyGrade = 4;
        } else if (percentHistory > 60) {
            historyGrade = 3;
        }
        int percentProgramming = 92;
        int programmingGrade = 5;
        if (0 < percentProgramming & percentProgramming <= 60) {
            programmingGrade = 2;
        } else if (percentProgramming < 73) {
            programmingGrade = 3;
        } else if (percentProgramming < 91) {
            programmingGrade = 2;
        }
        double averageGrade = (historyGrade + programmingGrade) / 2;
        double averagePercent = (percentHistory + percentProgramming) / 2;
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли \n");

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

        System.out.println("\n6. Подсчет начисленных банком % (BigDecimal)\n");

        BigDecimal depositAmount1 = new BigDecimal("321123.59");
        depositAmount1 = depositAmount1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal interestRate1 = BigDecimal.ZERO;
        if (depositAmount1.compareTo(new BigDecimal("300000")) > 0) {
            interestRate1 = new BigDecimal("0.10");
        } else if (depositAmount1.compareTo(new BigDecimal("100000")) > 0) {
            interestRate1 = new BigDecimal("0.07");
        } else if (depositAmount1.compareTo(new BigDecimal("0")) > 0) {
            interestRate1 = new BigDecimal("0.05");
        }
        BigDecimal interestAmount1 = depositAmount1.multiply(interestRate1).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalAmount1 = depositAmount1.add(interestAmount1).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумму вклада: " + depositAmount1);
        System.out.println("Начисленные годовые проценты составляют: " + interestRate1);
        System.out.println("Итоговую сумму с %: " + totalAmount1);

        System.out.println("\n8. Расчет годовой прибыли (BigDecimal)\n");

        BigDecimal monthlySales2 = new BigDecimal("13025.233");
        BigDecimal monthlyRent2 = new BigDecimal("5123.018");
        BigDecimal monthlyProductionPrice2 = new BigDecimal("9001.729");
        BigDecimal monthlyNumber = new BigDecimal("12");
        BigDecimal yearlyRevenue2 = monthlySales2.multiply(monthlyNumber);
        BigDecimal yearlyExpenses2 = (monthlyRent2.add(monthlyProductionPrice2)).multiply(monthlyNumber);
        BigDecimal yearlyProfit2 = yearlyRevenue2.subtract(yearlyExpenses2).setScale(2, RoundingMode.HALF_UP);
        if (yearlyProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit2 + " руб.\n");
        } else if (yearlyProfit2.compareTo(BigDecimal.ZERO) < 0) {
            System.out.printf("Прибыль за год: " + yearlyProfit2 + " руб.\n");
        } else {
            System.out.println("Прибыль за год: 0 руб.\n");
        }
    }
}