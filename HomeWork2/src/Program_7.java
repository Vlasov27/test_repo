// Реализовать приложение, которое меняет местами максимальный и минимальный элементы массива (массив вводится с клавиатуры)

import java.util.Arrays;
public class Program_7 {
    public static void main(String args[]) {


        int arrays[] = {3, 1, 6, 44, 77, 100};

        for(int i=0; i<arrays.length; i++) {
            int min = arrays[i];
            int indexOfMin = i;

            for(int j=i; j<arrays.length;j++){
                if(arrays[j] < min) {
                    min = arrays[j];
                    indexOfMin = j;
                }
            }
            arrays[indexOfMin] = arrays[i];
            arrays[i] = min;
        }
        System.out.println(Arrays.toString(arrays));
    }
}