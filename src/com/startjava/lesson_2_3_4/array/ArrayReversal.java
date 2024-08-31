public class ArrayReversal {
    public static void main(String[] args) {
        reverseArray(new int[0]);
        reverseArray(null);
        reverseArray(new int[]{6, 8, 9, 1});
        reverseArray(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    public static void reverseArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив либо нулевой, либо пустой");
            return;
        }
        displayArray("   До реверса: ", array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        displayArray("После реверса: ", array);
    }

    public static void displayArray(String message, int[] array) {
        System.out.print(message + "[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}