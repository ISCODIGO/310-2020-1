/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicion;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author jose.avila
 */
public class ArrayListDemo {

    static int getCapacity(ArrayList<?> lista) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(lista)).length;
    }

    static void getInfo(ArrayList<?> lista) throws Exception {
        System.out.printf("Capacidad: %d Tamaño: %d%n", getCapacity(lista),
                lista.size());
    }

    public static void main(String[] args) {
        ArrayList alist = new ArrayList(3);

        try {
            for (int i = 0; i < 20; i++) {
                alist.add(i);
                getInfo(alist);
            }

            alist.trimToSize();
            getInfo(alist);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
