import java.util.Random;

public class ArrayElementRemoval {

    public static void main(String[] args) {
        double[] array = new double[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(random.nextDouble() * 1000.0) / 1000.0;
        }
        System.out.println("\nПредыдущий массив:");
        printArray(array);
        int[] addresses = {-1, 15, 0, 14};
        for (int address : addresses) {
            System.out.println("\nИндекс адреса: " + address);
            if (address >= 0 && address < array.length) {
                double threshold = array[address];
                System.out.println("Элемент по указанному адресу: " + address + ", Значение: " + String.format("%.3f", threshold));
                int zeroedCount = removeGreaterElements(array, address);
                System.out.println("\nИзмененный массив:");
                printArray(array);
                System.out.println("Количество обнуленных элементов: " + zeroedCount);
            } else {
                System.out.println("Ошибка: Неверный адрес. За пределами границы массива.");
            }
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%.3f ", array[i]));
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int removeGreaterElements(double[] array, int address) {
        double threshold = array[address];
        int zeroedCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0.0;
                zeroedCount++;
            }
        }
        return zeroedCount;
    }
}