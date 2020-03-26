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
        // Generar el objeto Generador
        Generador gen = new Generador(20);
        int arreglo[] = gen.getArray();
        
        System.out.println(Arrays.toString(arreglo));
        
        // Insertar en una Coleccion
        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < arreglo.length; i++) {
            // Que pasa si se cambia el metodo de insercion
            //lista.add(arreglo[i]);
            lista.add(0, arreglo[i]);
        }
        
        // Probar el recorrido de la Coleccion
        System.out.println(lista);
        
        
    }
}
