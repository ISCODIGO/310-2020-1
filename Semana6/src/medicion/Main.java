/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicion;

import java.util.ArrayList;
import hn.unah.util.Cronometro;
import java.util.LinkedList;

/**
 *
 * @author jose.avila
 */
public class Main {

    public static void main(String[] args) {
        final int N = 10_000_000;
        ArrayList miArrayList = new ArrayList(N);
        LinkedList<Integer> miListaEnlazada = new LinkedList();
        Cronometro cronometro;

        System.out.println("----------------------");
        System.out.println("Probando con ArrayList");
        System.out.println("----------------------");

        for (int i = 0; i < N - 1; i++) {
            miArrayList.add(i);
        }

        cronometro = new Cronometro();
        miArrayList.add(99);
        cronometro.stop();

        System.out.println("Insertando al final (dentro de capacidad inicial): "
                + cronometro);

        cronometro.start();
        miArrayList.add(100);
        cronometro.stop();

        System.out.println("Insertando al final (fuera de capacidad inicial): "
                + cronometro);

        cronometro.start();
        miArrayList.add(0, -100);
        cronometro.stop();

        System.out.println("Insertando al inicio: " + cronometro);
        
        cronometro.start();
        Object valorAL = miArrayList.get(N-1);
        cronometro.stop();
        
        System.out.printf("Hallar un valor: %s en %s%n", valorAL, cronometro);        

        System.out.println("----------------------");
        System.out.println("Probando con LinkedList");
        System.out.println("----------------------");

        for (int i = 0; i < N - 1; i++) {
            miListaEnlazada.add(i);
        }

        cronometro = new Cronometro();
        miListaEnlazada.add(99);
        cronometro.stop();

        System.out.println("Insertando al final: "
                + cronometro);

        cronometro.start();
        miListaEnlazada.add(100);
        cronometro.stop();

        System.out.println("Insertando al final): "
                + cronometro);

        cronometro.start();
        miListaEnlazada.addFirst(-1);
        cronometro.stop();
        
        System.out.println("Insertando al inicio: " + cronometro);
               
        cronometro.start();
        int valorLL = miListaEnlazada.get(N-1);
        cronometro.stop();
        
        System.out.printf("Hallar un valor: %s en %s%n", valorLL, cronometro);

    }
}
