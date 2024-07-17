package com.startjava.lesson_1.base;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {
    public static void main(String[]args) {
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

        System.out.println("\nЗадача 3: Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  ");

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

        System.out.println("\nЗадача 5: Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        System.out.println("Изначальные значения: a = " + a + " b = " + b);
        
        int swap = a;
        a = b;
        b = swap;
        System.out.println("с помощью третьей переменной: a = " + a + " b " + b);

        b += a;
        a = b - a;
        b -= a;
        System.out.println("с помощью арифметических операций: a = " + a + " b = " + b);

        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("с помощью побитовой операции ^: a = " + a + " b = " + b);

        System.out.println("\nЗадача 6: Вывод символов и их кодов\n");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) at + " - " + at);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

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
        System.out.println("" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Число " + number + " содержит");
        System.out.println("сотен: " + hundreds);
        System.out.println("десятков: " + tens);
        System.out.println("единиц: " + ones);
        System.out.println("Сумма его цифр: " + sum);
        System.out.println("Произведение: " + product);

        System.out.println("\nЗадача 9: Вывод времени\n");
        int totalSeconds = 86399;
        int hh = (totalSeconds / 3600);
        int mm = totalSeconds / 60 % 60;
        int ss = totalSeconds % 60;

        System.out.println(hh + ":" + mm + ":" + ss);

        System.out.println("\nЗадача 10: Расчет стоимости товара со скидкой (BigDecimal)\n");

        BigDecimal penPrice1 = new BigDecimal("105.5");
        BigDecimal bookPrice1 = new BigDecimal("235.83");
        BigDecimal discountRate1 = new BigDecimal("0.11");

        BigDecimal totalPrice = penPrice1.add(bookPrice1).setScale(2, RoundingMode.HALF_UP);

        BigDecimal discountAmount1 = totalPrice.multiply(discountRate1).setScale(2, RoundingMode.HALF_UP);

        BigDecimal discountPrice1 = totalPrice.subtract(discountAmount1).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Общая стоимость без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount1);
        System.out.println("Общая стоимость со скидкой: " + discountPrice1);
    }
}