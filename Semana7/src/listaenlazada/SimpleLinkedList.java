/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

import java.util.NoSuchElementException;

/**
 * Estructura de una lista enlazada simple
 * @author jeavila
 * @param <E> Tipo de dato generico que contiene el elemento (dato) del nodo
 * @version 2020.0.1
 */
public class SimpleLinkedList<E> {
    /**
     * Referencia al primer nodo
     */
    private Nodo<E> _primero;
    
    /**
     * Referencia al ultimo nodo
     */
    private Nodo<E> _ultimo;
    
    /**
     * Atributo para almacenar la cantidad de nodos en una lista enlazada
     */
    private int _conteo = 0;

    /**
     * Retorna el elemento del primer nodo de la lista enlazada
     * @return E
     */
    public E getPrimero() {
        if (_primero == null) {
            throw new NoSuchElementException();
        }
        return _primero.elemento;
    }

    /**
     * Devuelve el elemento del ultimo nodo de la lista enlazada
     * @return E
     */
    public E getUltimo() {
        if (_ultimo == null) {
            throw new NoSuchElementException();
        }
        return _ultimo.elemento;
    }

    /**
     * Determina la cantidad de nodos en la lista enlazada
     * @return int
     */
    public int getConteo() {
        return _conteo;
    }

    /**
     * Determinar si la lista enlazada tiene objetos
     * @return
     */
    public boolean estaVacio() {
        return _conteo == 0;
    }

    /**
     * Se eliminan las referencias de los objetos coleccionados
     */
    public void vaciar() {
        _primero = null;
        _ultimo = null;
        _conteo = 0;
    }

    /**
     * Inserta el primer nodo de la lista vacia. No se incrementa el conteo
     * pues se utilizara como funcion auxiliar.
     * @param elemento
     */
    private void agregarPrimerNodo(E elemento) {
        Nodo<E> nuevo = new Nodo<>(elemento);
        _primero = nuevo;
        _ultimo = nuevo;
    }

    /**
     * Inserta un nodo al inicio de la lista enlazada.
     * @param elemento Dato almacenado en el nodo nuevo
     */
    public void agregarUltimo(E elemento) {
        if (estaVacio()) {
            agregarPrimerNodo(elemento);
        } else {
            Nodo<E> nuevo = new Nodo<>(elemento);
            _ultimo.sig = nuevo;
            _ultimo = nuevo;
        }
        _conteo++;
    }

    /**
     * Inserta un nodo al final de la lista enlazada
     * @param elemento Dato almacenado en el nodo nuevo
     */
    public void agregarPrimero(E elemento) {
        if (estaVacio()) {
            agregarPrimerNodo(elemento);
        } else {
            Nodo<E> nuevo = new Nodo<>(elemento);
            nuevo.sig = _primero;
            _primero = nuevo;
        }
        _conteo++;
    }

    /**
     * Funcion auxiliar para vaciar una lista enlazada que tenga un unico nodo
     * @return 
     */
    private E removerUnicoNodo() {
        Nodo temp = _primero;
        final E elemento = (E) temp.elemento;
        vaciar();
        return elemento;
    }

    /**
     * Quita el primer nodo de la lista enlazada
     * @return E Elemento del nodo
     */
    public E removerPrimero() {
        if (estaVacio()) {
            throw new NoSuchElementException();
        } else if (_conteo == 1) {
            return removerUnicoNodo();
        }

        Nodo temp = _primero;
        final E elemento = (E) temp.elemento;
        _primero = temp.sig;        
        _conteo--;
        return elemento;
    }

    /**
     * Quita el ultimo nodo de la lista enlazada
     * @return E Elemento del nodo
     */
    public E removerUltimo() {
        if (estaVacio()) {
            throw new NoSuchElementException();
        } else if (_conteo == 1) {
            return removerUnicoNodo();
        }
        
        Nodo temp = _primero;
        final E elemento = (E) temp.elemento;
        while (temp.sig != _ultimo) {            
            temp = temp.sig;
        }
        temp.sig = null;
        _ultimo = temp;
        return elemento;
    }

    /**
     * Permite indicar si un elemento existe en algun nodo de la lista enlazada
     * @param elemento
     * @return true si el elemento está en la lista enlazada
     */
    public boolean buscar(E elemento) {
        Nodo temp = _primero;
        while (temp.sig != null) {
            if (temp.elemento.equals(elemento)) {
                return true;
            }
            temp = temp.sig;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return String.format("SimpleLinkedList{Conteo=%d, Primero=%s, Ultimo=%s}%n",
                _conteo, _primero, _ultimo);
    }   

}
