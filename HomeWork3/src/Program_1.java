// Реализовать приложение, со следующим набором функций и процедур:
//● выводит сумму элементов массива
//● выполняет разворот массива (массив вводится с клавиатуры).
//● вычисляет среднее арифметическое элементов массива (массив вводится с
//клавиатуры).
//● меняет местами максимальный и минимальный элементы массива
//● выполняет сортировку массива методом пузырька.
//● выполняет преобразование массива в число.

import java.sql.SQLOutput;
import java.util.Arrays;

public class Program_1 {
    public static void main(String[] args) {
        arraySum(new int[]{1, 2, 3, 4, 5, 6});
        arrayReversal(new int[]{1, 2, 3, 4, 5, 6});
        arithmeticMean(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        sortedArray(new int[]{78, 5, 7, 1, 4, -5});
        arrayIntNomber(new int[]{2, 3, 4, 5, 6});

    }

    public static void arraySum(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {

            sumArray = sumArray + array[i];
        }
        System.out.println(sumArray);
    }

    public static void arrayReversal(int[] array) {

        /*for (int i = 0; i < array.length; i++)   {


        System.out.println (Arrays.toString(array));} */
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public static void arithmeticMean(int[] array) {

        double arrayAverage = 0;
        for (int i = 0; i < array.length; i++) {

            arrayAverage = (arrayAverage + array[i]);
        }
        System.out.println(arrayAverage / array.length);
    }

    public static void sortedArray(int[] array) {
        boolean isSorted = false;
        int number;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                }
            }

        }

        System.out.println(Arrays.toString(array));

    }

    public static void arrayIntNomber(int[] array) {
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            number = array[i];

            System.out.print(number);
        }
    }
}
