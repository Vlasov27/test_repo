// Реализовать приложение, которое выводит сумму элементов массива (массив вводится с клавиатуры)

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            arraySum = arraySum + array[i];


        }
        System.out.println (arraySum);
    }
}