// Реализовать приложение, которое вычисляет среднее арифметическое элементов массива (массив вводится с клавиатуры).

import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        double arrayAverage = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            arrayAverage = (arrayAverage + array[i]);


        }
        System.out.println (arrayAverage / n);
    }
}