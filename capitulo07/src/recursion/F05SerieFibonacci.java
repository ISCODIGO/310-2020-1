package recursion;

/*
 * Serie de Fibonacci
 * Caso base F(n) = n, cuando n = {0, 1}
 * Progresion F(n) = F(n-1) + F(n-2), cuando n > 1
 */
public class F05SerieFibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.printf("Para n=%d el numero de Fibonacci es es %d%n", n, fibonacci(n));
        n = 6;
        System.out.printf("Para n=%d el numero de Fibonacci es es %d%n", n, fibonacci(n));
        n = 20;
        System.out.printf("Para n=%d el numero de Fibonacci es es %d%n", n, fibonacci(n));

    }
}
