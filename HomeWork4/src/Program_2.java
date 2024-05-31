// подсчёт числа фибаначи
public class Program_2 {
    public static void main(String[] args) {

        System.out.println(fib(10));
    }
    public static int fib (int n) {
        System.out.println("--> in fib ( " + n + ")");
        if (n == 1 || n == 2) {
            System.out.println("<-- in fib = " + n + ") = 1");
            return 1;
        }
        int result = fib(n -1) + fib(n -2);
        System.out.println("<-- in fib = " + n + ") = " + result);
        return result;
    }
}