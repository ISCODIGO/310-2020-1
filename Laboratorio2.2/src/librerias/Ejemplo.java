/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.util.*;

/**
 *
 * @author jeavila
 */
public class Ejemplo {

    public static void main(String[] args) {
        Set<Integer> miHashSet = new HashSet<Integer>();
        miHashSet.add(10);
        miHashSet.add(20);
        miHashSet.add(30);

        System.out.println("Imprimir HashSet");
        for (int valor : miHashSet) {
            System.out.println("\t" + valor);
        }

        Set<Integer> miTreeSet = new TreeSet<>();
        miTreeSet.add(10);
        miTreeSet.add(20);
        miTreeSet.add(30);

        System.out.println("Imprimir TreeSet");
        for (int valor : miTreeSet) {
            System.out.println("\t" + valor);
        }

        Map<Integer, String> miHashMap = new HashMap<>();
        miHashMap.put(10, "Diez");
        miHashMap.put(20, "Veinte");
        miHashMap.put(30, "Treinta");

        System.out.println("Imprimir HashMap");
        for (Map.Entry<Integer, String> elemento : miHashMap.entrySet()) {
            Integer clave = elemento.getKey();
            String valor = elemento.getValue();
            System.out.printf("\tClave: %d, Valor: %s%n", clave, valor);

        }

        System.out.println("Imprimir TreeMap");
        Map<Integer, String> miTreeMap = new TreeMap<>();
        miTreeMap.put(10, "Diez");
        miTreeMap.put(20, "Veinte");
        miTreeMap.put(30, "Treinta");

        for (Map.Entry<Integer, String> elemento : miTreeMap.entrySet()) {
            Integer clave = elemento.getKey();
            String valor = elemento.getValue();
            System.out.printf("\tClave: %d, Valor: %s%n", clave, valor);
        }

        System.out.println("Imprimir PriorityQueue");
        PriorityQueue<Integer> miPriorityQueue = new PriorityQueue<>();
        miPriorityQueue.add(20);
        miPriorityQueue.add(10);
        miPriorityQueue.add(10);
        miPriorityQueue.add(30);

        for (Iterator<Integer> iterator = miPriorityQueue.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.println("\t" + next);
        }
    }
}
