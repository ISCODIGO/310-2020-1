/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author jose.avila
 */
class Nodo<E> {
    E elemento;
    Nodo<E> sig;

    public Nodo(E elemento, Nodo<E> sig) {
        this.elemento = elemento;
        this.sig = sig;
    }
    
    public Nodo(E elemento) {
        this(elemento, null);
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + '}';
    }
}
