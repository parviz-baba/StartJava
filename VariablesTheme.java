import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[]args) {
        System.out.println("---------------------------------------------------------------------");
        // Задача 1: Вывод характеристик компьютера
        System.out.println("\nЗадача 1: Вывод характеристик компьютера\n");
        int numberOfCores = 4;
        double processorFrequency = 2.4;
        long ram = 4;
        short screenSize = 60;
        byte numberOfUsbPorts = 2;
        boolean hasBluetooth = true;
        char computerClass = 'A';

        System.out.println("Количество ядер: " + numberOfCores);
        System.out.println("Частота процессора: " + processorFrequency + " GHz");
        System.out.println("Размер оперативной памяти: " + ram + " GB");
        System.out.println("Размер экрана: " + screenSize + " дюймов");
        System.out.println("Количество USB-портов: " + numberOfUsbPorts);
        System.out.println("Наличие Bluetooth: " + hasBluetooth);
        System.out.println("Класс компьютера: " + computerClass);
        System.out.println("---------------------------------------------------------------------");

        // Задача 2: Расчет стоимости товара со скидкой
        System.out.println("\nЗадача 2: Расчет стоимости товара со скидкой\n");

        double penPrice = 105.5;
        double bookPrice = 235.83;
        double discountRate = 0.11;
        double totalCostWithoutDiscount = penPrice + bookPrice;
        double discountAmount = totalCostWithoutDiscount * discountRate;
        double totalCostWithDiscount = totalCostWithoutDiscount - discountAmount;
        System.out.println("общую стоимость товаров без скидки: " + totalCostWithoutDiscount);
        System.out.println("сумму скидки: " + discountAmount);
        System.out.println("общую стоимость товаров со скидкой: " + totalCostWithDiscount);
        System.out.println("---------------------------------------------------------------------");

        // Задача 3: Вывод слова JAVA
        System.out.println("\nЗадача 3: Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a     ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a  ");
        System.out.println("---------------------------------------------------------------------");

        // Задача 4: Вывод min и max значений целых числовых типов
        System.out.println("\nЗадача 4: Вывод min и max значений целых числовых типов\n");
        byte maxByteValue = 127;
        short maxShortValue = 32_767;
        int maxIntValue = 2_147_483_647;
        long maxLongValue = 9_223_372_036_854_775_807l;

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
        System.out.println("---------------------------------------------------------------------");

        // Задача 5: Перестановка значений переменных
        System.out.println("\nЗадача 5: Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("Изначальные значения: a = " + a + " b = " + b);
        
        // с помощью третьей переменной
        c = a;
        a = b;
        b = c;
        System.out.println("с помощью третьей переменной: a = " + a + " b " + b);

        // с помощью арифметических операций
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("с помощью арифметических операций: a = " + a + " b = " + b);

        // с помощью побитовой операции ^
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("с помощью побитовой операции ^: a = " + a + " b = " + b);
        System.out.println("---------------------------------------------------------------------");

        // Задача 6: Вывод символов и их кодов
        System.out.println("\nЗадача 6: Вывод символов и их кодов\n");
        char char1 = 36;
        char char2 = 42;
        char char3 = 64;
        char char4 = 124;
        char char5 = 126;

        System.out.println((int) char1 + " - " + char1);
        System.out.println((int) char2 + " - " + char2);
        System.out.println((int) char3 + " - " + char3);
        System.out.println((int) char4 + " - " + char4);
        System.out.println((int) char5 + " - " + char5);
        System.out.println("---------------------------------------------------------------------");

        // Задача 7: Вывод в консоль ASCII-арт Дюка
        System.out.println("\nЗадача 7: Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParen = '(';
        char rightParen = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + "_" + leftParen + " " + rightParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "____" + slash + backslash + "__" + backslash);
        System.out.println("---------------------------------------------------------------------");

        // Задача 8: Вывод количества сотен, десятков и единиц числа
        System.out.println("\nЗадача 8: Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int hundreds = number/100;
        int tens = number/10 % 10;
        int units = 123 % 10;
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;

        System.out.println("Число " + number + " содержит");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + units);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);
        System.out.println("---------------------------------------------------------------------");

        // Задача 9: Вывод времени
        System.out.println("\nЗадача 9: Вывод времени\n");
        int totalSeconds = 86399;
        int hours = (totalSeconds / 60) / 60;
        int minutes = (totalSeconds - (hours * 60 * 60)) / 60;
        int seconds = totalSeconds - (hours * 60 * 60 + minutes * 60);

        System.out.println(hours + ":" + minutes + ":" + seconds);
        System.out.println("---------------------------------------------------------------------");

        //Расчет стоимости товара со скидкой (BigDecimal)
        System.out.println("\nЗадача 10: Расчет стоимости товара со скидкой (BigDecimal)\n");

        BigDecimal bdPenPrice = new BigDecimal("105.5");
        BigDecimal bdBookPrice = new BigDecimal("235.83");
        BigDecimal bdDiscount = new BigDecimal("0.11");

        // Общая стоимость без скидки
        BigDecimal bdTotalPrice = bdPenPrice.add(bdBookPrice);

        // Стоимость Скидка
        BigDecimal bdDiscountAmount = bdTotalPrice.multiply(bdDiscount);

        // Общая стоимость со скидкой
        BigDecimal bdDiscountedPrice  = bdTotalPrice.subtract(bdDiscountAmount);

        System.out.println("Общая стоимость без скидки: " + bdTotalPrice);
        System.out.println("Стоимость Скидка: " + bdDiscountAmount);
        System.out.println("Общая стоимость со скидкой: " + bdDiscountedPrice);
    }
}