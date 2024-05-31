// Реализовать приложение, которое выполняет разворот массива (массив вводится склавиатуры)

import java.util.Arrays;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];

        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }
}

