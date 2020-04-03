package recursion;

/*
 * Suma de Enteros
 * Caso base S(1) = 1
 * Progresion S(n) = S(n-1) + n
 */
public class F04SumaEnteros {

    public static int sumaEnterosRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sumaEnterosRecursivo(n - 1) + n;
        }
    }

    public static int sumaEnterosConstante(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.printf("Para n=%d la suma es %d%n", n, sumaEnterosRecursivo(n));
        n = 5;
        System.out.printf("Para n=%d la suma es %d%n", n, sumaEnterosRecursivo(n));
        n = 100;
        System.out.printf("Para n=%d la suma es %d%n", n, sumaEnterosRecursivo(n));
        System.out.println("Prueba con O(1): " + sumaEnterosConstante(n));

    }
}
