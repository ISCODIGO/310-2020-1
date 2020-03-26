/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author enrique
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        // Probar primero el array aleatorio
        Generador gen = new Generador(20);
        int[] arreglo = gen.getArray();
        
        System.out.println(Arrays.toString(arreglo));
        
        // insertarlo en una coleccion... probare con un ArrayList
        System.out.println("Array original");
        ArrayList<Integer> lista = new ArrayList(20);
        
        System.out.println("Recorrido en una lista enlazada");
        for (int i = 0; i < arreglo.length; i++) {
            // que pasa si cambio la funcion de insercion
            lista.add(0, arreglo[i]);
        }
        
        // Aqui realmente no hay cambio
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");
        }
        System.out.println("");
    }
}
