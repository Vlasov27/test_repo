// Реализовать приложение, которое выполняет преобразование массива в число.

public class Program_5 {
    public static void main(String[] args) {

        int array[] = {4, 2, 3, 5, 7, 9};
        int number = 0;

        for (int i = 0; i < array.length; i++) {
            number = array[i];

            System.out.print(number);
        }
    }
}