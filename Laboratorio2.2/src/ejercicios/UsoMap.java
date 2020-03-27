/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import librerias.Generador;

/**
 *
 * @author enrique
 */
public class UsoMap {

    public static void main(String[] args) {
        Generador gen = new Generador(20);

        Map<String, Integer> map1 = new HashMap();
        int[] arr1 = gen.getArray();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(gen.getString(), arr1[i]);
        }
        System.out.println("Arreglo de HashSet\t" + Arrays.toString(arr1));
        System.out.println("HashSet[valores]\t" + map1.values());
        System.out.println("HashSet[completo]\t" + map1);

        Map<String, Integer> map2 = new TreeMap<>();
        int[] arr2 = gen.getArray();
        for (int i = 0; i < arr2.length; i++) {
            map2.put(gen.getString(), arr2[i]);
        }
        System.out.println("Arreglo de TreeSet\t" + Arrays.toString(arr2));
        System.out.println("TreeSet[valores]\t" + map2.values());
        System.out.println("TreeSet[completo]\t" + map2);
    }
}
