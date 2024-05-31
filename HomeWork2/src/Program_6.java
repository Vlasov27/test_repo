//Реализовать приложение, которое заполняет двумерный массив M*N последовательностью чисел “по спирали”

class Program_6 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        int number = 1;

        for (int middle = 0; middle <= array.length - 2; middle++) {
            for (int i = 0 + middle; i < array.length - middle; i++) {
                array[0 + middle][i] = number++;
            }
            number--;
            for (int i = 0 + middle; i < array.length - middle; i++) {
                array[i][array.length - 1 - middle] = number++;
            }
            number--;
            for (int i = array.length - 1 - middle; i >= 0 + middle; i--) {
                array[array.length - 1 - middle][i] = number++;

            }
            number--;
            for (int i = array.length - 1 - middle; i >= 1 + middle; i--) {
                array[i][0 + middle] = number++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + "  ");
            System.out.println();
        }

    }
}