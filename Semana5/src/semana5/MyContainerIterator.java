/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import java.util.Iterator;

/**
 *
 * @author jose.avila
 */
public class MyContainerIterator implements Iterator {
    private int current = 0;
    private MyContainer container;
    
    MyContainerIterator(MyContainer c) {
        this.container = c;
    }
    
    @Override
    public boolean hasNext() {
        return current < container.size;
    }
    
    @Override
    public Object next() {
        return container.items[current++];
    }
}
