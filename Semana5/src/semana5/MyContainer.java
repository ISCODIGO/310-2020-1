/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import java.util.Arrays;

/**
 *
 * @author jose.avila
 */
public class MyContainer {

    Object[] items;
    int size;
    int capacity;

    public MyContainer(int capacity) {
        this.capacity = capacity;
        this.items = new Object[this.capacity];
        this.size = 0;
    }

    public MyContainerIterator iterator() {
        return new MyContainerIterator(this);
    }

    public void add(Object item) {
        if (this.capacity <= this.size) {
            throw new IndexOutOfBoundsException("Indice supera la capacidad del contenedor");
        }
        items[size++] = item;
    }

    public void remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                items[i] = null;
                size--;
            }
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("MyContainer{size=%d, items=%s}", size,
                Arrays.toString(items));
    }
}
