// Реализовать приложение, которое выполняет сортировку массива методом пузырька.


import java.util.Arrays;

public class Program_4 {
    public static void main(String[] args) {

        int array[] = {8, 1, 54, 2, 7};
        boolean isSorted = false;
        int number;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length-1; i++) {
                if (array [i] > array[i+1]) {
                    isSorted = false;
                    number = array[i];
                    array[i] = array [i +1];
                    array[i+1] = number;

                }


            }
        }
        System.out.println (Arrays.toString(array));
    }
}