import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");

        boolean isMan = true;
        if (!isMan) {
            System.out.println("Пол: Женский");
        } else {
            System.out.println("Пол: Мужской");
        }
        int age = 18;
        if (age > 18) {
            System.out.println("Возраст: Старше 18 лет");
        } else {
            System.out.println("Возраст: Меньше 18 лет");
        }
        double height = 1.75;
        if (height < 1.8) {
            System.out.println("Рост: Меньше 1.8 метра");
        } else {
            System.out.println("Рост: 1.8 метра или выше");
        }
        final String name = "Mamed";
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
            System.out.println(a + " больше " + b); 
        } else if (b > a) {
            System.out.println(b + " больше " + a);
        } else {
            System.out.println("Оба числа равны: " + a);
        }

        System.out.println("\n3. Проверка числа\n");

        int number = 20;
        if (number == 0) {
            System.out.println(number + " является нулям");
        } else {
            System.out.print(number + " является ");
            String positivity = "отрицательным";
            if (number > 0) {
                positivity = "положительным";
            }
            String parity = " и нечетным";
            if (number % 2 == 0) {
                parity = " и четным";
            }
            System.out.println(positivity + parity);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.\n");

        int numberA = 123;
        int hundredsA = numberA / 100;
        int tensA = numberA / 10 % 10;
        int onesA = numberA % 10;

        int numberB = 223;
        int hundredsB = numberB / 100;
        int tensB = numberB / 10 % 10;
        int onesB = numberB % 10;
        
        if (hundredsA == hundredsB || tensA == tensB || onesA == onesB) {
            System.out.println("Числа: " + numberA + " и " + numberB);
            if (hundredsA == hundredsB) {
                System.out.println("Одинаковые цифры в разряде сотен: " + hundredsA);
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
        if (depositAmount > 0 && depositAmount <= 100_000) {
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
        int gradeHistory = 2;
        if (percentHistory >= 91 && percentHistory <= 100) {
            gradeHistory = 5;
        } else if (percentHistory > 73) {
            gradeHistory = 4;
        } else if (percentHistory > 60) {
            gradeHistory = 3;
        }
        int percentProgramming = 92;
        int gradeProgramming = 5;
        if (percentProgramming >= 0 && percentProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percentProgramming < 73) {
            gradeProgramming = 3;
        } else if (percentProgramming < 91) {
            gradeProgramming = 2;
        }
        double averageGrade = (gradeHistory + gradeProgramming) / 2;
        double averagePercent = (percentHistory + percentProgramming) / 2;
        System.out.println("История: " + gradeHistory);
        System.out.println("Программирование: " + gradeProgramming);
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли \n");

        double monthlySales = 13025.233;
        double monthlyRent = 5123.018;
        double monthlyProductionPrice = 9001.729;
        double yearlyProfit = (monthlySales - (monthlyRent + monthlyProductionPrice)) * 12;
        if (yearlyProfit > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit + " руб.\n");
        } else {
            System.out.printf("Прибыль за год: " + yearlyProfit + " руб.\n");
        }

        System.out.println("\n6. Подсчет начисленных банком % (BigDecimal)\n");

        BigDecimal depositAmount1 = new BigDecimal("321123.59");
        depositAmount1 = depositAmount1.setScale(2, RoundingMode.HALF_UP);
        BigDecimal interestRate1 = new BigDecimal("0.1");
        if (depositAmount1.compareTo(new BigDecimal("0")) > 0 && 
                depositAmount1.compareTo(new BigDecimal("100000")) < 0) {
            interestRate1 = new BigDecimal("0.05");
        } else if (depositAmount1.compareTo(new BigDecimal("300000")) <= 0) {
            interestRate1 = new BigDecimal("0.07");
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
        BigDecimal yearlyProfit2 = monthlySales2.subtract(monthlyRent2
                .add(monthlyProductionPrice2))
                .multiply(monthlyNumber).setScale(2, RoundingMode.HALF_UP);
        if (yearlyProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit2 + " руб.\n");
        } else {
            System.out.printf("Прибыль за год: " + yearlyProfit2 + " руб.\n");
        }
    }
}