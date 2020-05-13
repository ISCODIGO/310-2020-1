/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author enrique
 */
public class Solucion {

    static int fiboIterativo(int n) {
        int resultado = 0;
        int anterior = 0;
        int siguiente = 1;

        for (int i = 1; i < n; i++) {
            resultado = anterior + siguiente;
            anterior = siguiente;
            siguiente = resultado;
        }

        return resultado;
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int fibonacciMejorado(int n, int[] memoria) {
        if (n < 2) {
            return n;
        }

        // si no hay memoria 
        if (memoria == null) {
            memoria = new int[n + 1];
            memoria[0] = 0;
            memoria[1] = 1;
        }

        // si el resultado ya esta almacenado se devuelve
        if (n > 1 && memoria[n] != 0) {
            return memoria[n];
        }

        // la progresion normal
        memoria[n] = fibonacciMejorado(n - 1, memoria)
                + fibonacciMejorado(n - 2, memoria);
        return memoria[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iterativo: " + fiboIterativo(i));
            System.out.println("Recursivo: " + fibonacciMejorado(i, null));
        }

        System.out.println(fiboIterativo(30));
        System.out.println(fibonacciMejorado(30, null));
    }
}
