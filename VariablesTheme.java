import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[]args) {
        // Задача 1: Вывод характеристик компьютера
        System.out.println("\nЗадача 1: Вывод характеристик компьютера\n");
        int numberOfCores = 4;
        double cpuFrequency = 2.4;
        long ramSize = 4;
        short screenSize = 60;
        byte numberOfUsbPorts = 2;
        boolean hasBluetooth = true;
        char computerClass = 'A';
        float storageCapacity = 256.75F;

        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Частота процессора: " + cpuFrequency + " GHz");
        System.out.println("Размер оперативной памяти: " + ramSize + " GB");
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Количество USB-портов: " + numberOfUsbPorts);
        System.out.println("Наличие Bluetooth: " + hasBluetooth);
        System.out.println("Класс компьютера: " + computerClass);

        // Задача 2: Расчет стоимости товара со скидкой
        System.out.println("\nЗадача 2: Расчет стоимости товара со скидкой\n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discountRate = 0.11;
        double originalPrice = penPrice + bookPrice;
        double discountAmount = originalPrice * discountRate;
        double discountPrice = originalPrice - discountAmount;
        System.out.println("общую стоимость товаров без скидки: " + originalPrice);
        System.out.println("сумму скидки: " + discountAmount);
        System.out.println("общую стоимость товаров со скидкой: " + discountPrice);

        // Задача 3: Вывод слова JAVA
        System.out.println("\nЗадача 3: Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  ");

        // Задача 4: Вывод min и max значений целых числовых типов
        System.out.println("\nЗадача 4: Вывод min и max значений целых числовых типов\n");
        byte maxByteValue = 127;
        short maxShortValue = 32_767;
        int maxIntValue = 2_147_483_647;
        long maxLongValue = 9_223_372_036_854_775_807L;

        System.out.println("Byte:");
        System.out.println("Первоначальное значение: " + maxByteValue);
        System.out.println("Значение после инкремента: " + (++maxByteValue));
        System.out.println("Значение после декремента: " + (--maxByteValue));

        System.out.println("\nshort:");
        System.out.println("Первоначальное значение: " + maxShortValue);
        System.out.println("Значение после инкремента: " + (++maxShortValue));
        System.out.println("Значение после декремента: " + (--maxShortValue));

        System.out.println("\nint:");
        System.out.println("Первоначальное значение: " + maxIntValue);
        System.out.println("Значение после инкремента: " + (++maxIntValue));
        System.out.println("Значение после декремента: " + (--maxIntValue));

        System.out.println("\nlong:");
        System.out.println("Первоначальное значение: " + maxLongValue);
        System.out.println("Значение после инкремента: " + (++maxLongValue));
        System.out.println("Значение после декремента: " + (--maxLongValue));

        // Задача 5: Перестановка значений переменных
        System.out.println("\nЗадача 5: Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Изначальные значения: a = " + num1 + " b = " + num2);
        
        // с помощью третьей переменной
        int swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("с помощью третьей переменной: a = " + num1 + " b " + num2);

        // с помощью арифметических операций
        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("с помощью арифметических операций: a = " + num1 + " b = " + num2);

        // с помощью побитовой операции ^
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("с помощью побитовой операции ^: a = " + num1 + " b = " + num2);

        // Задача 6: Вывод символов и их кодов
        System.out.println("\nЗадача 6: Вывод символов и их кодов\n");
        char char36 = '$';
        char char42 = '*';
        char char64 = '@';
        char char124 = '|';
        char char126 = '~';

        System.out.println((int) char36 + " - " + char36);
        System.out.println((int) char42 + " - " + char42);
        System.out.println((int) char64 + " - " + char64);
        System.out.println((int) char124 + " - " + char124);
        System.out.println((int) char126 + " - " + char126);

        // Задача 7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

        // Задача 8: Вывод количества сотен, десятков и единиц числа
        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит");
        System.out.println("(сотен): " + hundreds);
        System.out.println("(десятков): " + tens);
        System.out.println("(единиц): " + ones);
        System.out.println("(Сумма его цифр): " + sum);
        System.out.println("(Произведение): " + product);

        // Задача 9: Вывод времени
        System.out.println("\nЗадача 9: Вывод времени\n");
        int totalSeconds = 86399;
        int hh = (totalSeconds / 60) / 60;
        int mm = (totalSeconds - (hh * 60 * 60)) / 60;
        int ss = totalSeconds - (hh * 60 * 60 + mm * 60);

        System.out.println(hh + "/" + mm + "/" + ss);

        // Расчет стоимости товара со скидкой (BigDecimal)
        System.out.println("\nЗадача 10: Расчет стоимости товара со скидкой (BigDecimal)\n");

        BigDecimal penPrice1 = new BigDecimal("105.5");
        BigDecimal bookPrice1 = new BigDecimal("235.83");
        BigDecimal discountRate1 = new BigDecimal("0.11");

        // Общая стоимость без скидки
        BigDecimal totalPrice = penPrice1.add(bookPrice1);

        // Стоимость Скидка
        BigDecimal discountAmount1 = totalPrice.multiply(discountRate1);

        // Общая стоимость со скидкой
        BigDecimal discountedPrice = totalPrice.subtract(discountAmount1);

        totalPrice = totalPrice.setScale(2, RoundingMode.HALF_UP);
        discountAmount1 = discountAmount1.setScale(2, RoundingMode.HALF_UP);
        discountedPrice = discountedPrice.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Общая стоимость без скидки: " + totalPrice);
        System.out.println("Стоимость Скидка: " + discountAmount1);
        System.out.println("Общая стоимость со скидкой: " + discountAmount1);
    }
}