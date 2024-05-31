public class IfElseStatementTheme {
    public static void main(String[]args) {
        System.out.println("---------------------------------------------------------------------");
        // 1. Перевод псевдокода на язык Java (это название задачи)
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)\n");

        boolean isMan = true;
        int age = 18;
        double height = 1.75;
        String name = "Mamed";

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
        System.out.println("---------------------------------------------------------------------");
        
        // 2. Поиск большего числа
        System.out.println("2. Поиск большего числа\n");
        int a = 152;
        int b = 205;

        if (a > b) {
            System.out.println(a + " болше " + b); 
        } else if (b > a) {
            System.out.println(b + " болше " + a);
        } else  {
            System.out.println("Оба числа равны: " + a);
        }
        System.out.println("---------------------------------------------------------------------");

        // 3. Проверка числа
        System.out.println("3. Проверка числа\n");
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
        System.out.println("---------------------------------------------------------------------");

        // 4. Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах.\n");
        int num1 = 123;
        int num2 = 223;

        int hundredNum1 = num1 / 100;
        int tensNum1 = (num1 % 100)/ 10;
        int unityNum1 = num1 % 10;

        int hundredNum2 = num2 / 100;
        int tensNum2 = (num2 % 100)/ 10;
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
        System.out.println("---------------------------------------------------------------------");

        // 5. Определение символа по его коду.
        System.out.println("5. Определение символа по его коду.\n");

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
        System.out.println("---------------------------------------------------------------------");

        // 6. Подсчет начисленных банком %.
        System.out.println("6. Подсчет начисленных банком %\n");
        double balans = 321_123.59;
        
        System.out.println("Сумму вклада: " + balans);
        double amountCharged = 0.0;
        if (balans > 300_000) {
            amountCharged = balans * 0.1;
            System.out.println("Начисленные годовые проценты составляют: " + amountCharged);
        } else if (balans > 100_000) {
            amountCharged = balans * 0.07;
            System.out.println("Начисленные годовые проценты составляют: " + amountCharged);
        } else if (balans <= 100_000 && balans > 0) {
            amountCharged = balans * 0.05;
            System.out.println("Начисленные годовые проценты составляют: " + amountCharged);
        }
        double totalAmount = balans + amountCharged;
        System.out.println("Итоговую сумму с %: " + totalAmount);
        System.out.println("---------------------------------------------------------------------");

        // 7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам\n");

        int percentHistory = 59;
        int historyGrade = 0;
        if (percentHistory <= 100 & percentHistory > 91) {
            historyGrade = 5;
        } else if (percentHistory > 73) {
            historyGrade = 4;
        } else if (percentHistory > 60) {
            historyGrade = 3;
        } else if (percentHistory <=60 & percentHistory >= 0) {
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
        } else if (percentProgramming <=60 && percentProgramming >= 0) {
            programmingGrade = 2;
        }

        int averageGrade = (historyGrade + programmingGrade) / 2;
        int averagePercent = (percentHistory + percentProgramming) / 2;

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        System.out.println("---------------------------------------------------------------------");

        // 8/9. Расчет годовой прибыли
        System.out.println("8. Расчет годовой прибыли\n");

        double monthlySales  = 13025.233;
        double monthlyRent  = 5123.018;
        double monthlyCost  = 9001.729;
        double profit = 0.0;
        int monthRow = 0;

        for (monthRow = 1;monthRow <= 12;monthRow++) {
            profit = profit + (monthlySales -(monthlyRent + monthlyCost));
            if (profit > 0) {
                System.out.println("Доход " + monthRow + "-го месяца: +" + profit);
            } else {
                System.out.println("Доход " + monthRow + "-го месяца: " + profit);
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }

}