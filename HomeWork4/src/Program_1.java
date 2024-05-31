// Реализовать метод бинарного поиска с помощью рекурсии
public class Program_1 {
    public static void main(String[] args) {
        int[] a = {-5, -2, 1, 5, 6, 8, 10, 20};
        System.out.println(binarySearch(a, 20, 0, a.length - 1));

    }

    /*public static int binarySearch(int element, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int midle = left + (right - left) / 2;

            if (element < array[midle]) {
                right = midle - 1;
            } else if (element > array[midle]) {
                left = midle + 1;
            } else {
                return midle;
            }
        }
            return -1;
        }

    }*/
    public static int binarySearch(int[] sortedArray, int key, int low, int high) {
        // считаем индекс центрального элемента
        int middle = low + (high - low) / 2;

        // base case (условие выхода) - регион поиска пустой
        if (low > high) {
            // не нашли элемента, который равен ключу
            return -1;
        }

        if (key == sortedArray[middle]) {
            // в случае, если элемент в центре равняется ключу (нашли элемент)
            return middle;
        } else if (key < sortedArray[middle]) {
            // рекурсивный вызов для левого подмассива
            // не забывайте здесь ключевое слово return (подумайте, зачем оно нужно)
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            // рекурсивный вызов для правого помассива
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }
}
// пример вызова метода

