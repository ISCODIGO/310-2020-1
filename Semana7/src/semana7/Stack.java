/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semana7;

import listaenlazada.SimpleLinkedList;

/**
 *
 * @author jeavila
 */
public class Stack<E> {
    SimpleLinkedList lista;
    
    // La cima seria el primer elemento de la lista enlazada
    
    
    public Stack() {
        lista = new SimpleLinkedList();
    }
    
    /**
     * Insertar un elemento en la cima
     * @param elemento 
     */
    public void push(E elemento) {
        lista.agregarPrimero(elemento);
    }
    
    /**
     * Remueve la cima y retorna el elemento de ella
     * @return Elemento
     */
    public E pop() {
        return (E)lista.removerPrimero();
    }
    
    /**
     * Retorna el elemento de la cima
     * @return Elemento
     */
    public E top() {
        return (E) lista.getPrimero();
    }
    
    public int getSize() {
        return lista.getConteo();
    }
    
    
    // LIFO -> Stack
    // Last in First out
    
    // FIFO -> Queue (cola)
    // First in First out
}
