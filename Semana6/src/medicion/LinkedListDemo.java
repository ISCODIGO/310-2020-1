/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicion;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author jose.avila
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList();
        ListIterator<Integer> it;
        lista.add(10);
        lista.add(20);
        lista.add(30);
        
        for (it = lista.listIterator(0); it.hasNext();) {
            int dato = it.next();
            System.out.printf("%d -> ", dato);
        }
                
        System.out.println("");
        
        while (it.hasPrevious()) {
            int dato = it.previous();
            System.out.printf("<- %d ", dato);
        }
        
        lista.addFirst(-10);
        lista.addLast(40);
        
        System.out.printf("%nPrimer elemento: %d%n", lista.getFirst());
        System.out.printf("Ultimo elemento: %d%n", lista.getLast());
    }
}
