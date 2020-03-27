/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import librerias.Generador;

/**
 *
 * @author enrique
 */
public class UsoSet {
    public static void main(String[] args) {
        Generador gen = new Generador(20);
        
        Set<Integer> set1 = new HashSet();
        int[] arr1 = gen.getArray();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        System.out.println("Arreglo de HashSet\t" + Arrays.toString(arr1));
        // Me di cuenta que estas colecciones imprimen directamente su contenido
        System.out.println("HashSet [completo]\t" + set1);        

        // Es posible usar el tipo Set (implementacion previa) o la propia clase
        TreeSet<Integer> set2 = new TreeSet<>();
        int[] arr2 = gen.getArray();
        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }
        System.out.println("Arreglo de TreeSet\t" + Arrays.toString(arr2));
        System.out.println("TreeSet [completo]\t" + set2);
    }
}
