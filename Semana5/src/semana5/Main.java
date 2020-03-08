/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author jose.avila
 */
public class Main {
    public static void main(String[] args) {
        MyContainer v = new MyContainer(3);
        v.add("3");
        v.add("4");
        v.add("1");
        //v.add("6");
        //v.remove("4");
        
        System.out.println(v);
        
        System.out.println("Contenido: ");
        MyContainerIterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(9);
        ListIterator<Integer> iter = lista.listIterator(0);
        
        while (iter.hasNext()) {
            System.out.printf("Indice: %d Valor: %d%n", iter.nextIndex(), 
                    iter.next());
        }
    }
}
