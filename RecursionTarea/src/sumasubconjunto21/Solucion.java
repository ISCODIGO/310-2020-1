/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasubconjunto21;

/**
 *
 * @author enrique
 */
public class Solucion {

    static boolean resolver(int[] conjunto, int n, int restante) {
        // Caso base de exito
        if (restante == 0) {
            return true;
        }

        // Caso base de fracaso: Llegue al final sin hallar un subconjunto
        if (n >= conjunto.length && restante != 0) {
            return false;
        }

        // Si el valor actual no es valido dentro de la suma
        if (conjunto[n] > restante) {
            return resolver(conjunto, n + 1, restante);
        }

        // Progresion de exploracion: buscar si el proximo elemento cumple
        // dentro del subconjunto o si es valido excluirlo
        return resolver(conjunto, n + 1, restante - conjunto[n])
                || resolver(conjunto, n + 1, restante);
    }

    public static void main(String[] args) {
        Solucion sol = new Solucion();
        int[] set = new int[]{1, 2, 3, 4, 5};
        boolean b1 = resolver(set, 0, 8);
        System.out.println(b1);
    }
}
