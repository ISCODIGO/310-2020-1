/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author jeavila
 */
public class MainLinkedList {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SimpleLinkedList<Integer> lista = new SimpleLinkedList<>();
        lista.agregarPrimero(10);
        lista.agregarPrimero(20);
        lista.agregarUltimo(30);
        System.out.println(lista);
        lista.removerPrimero();
        System.out.println(lista);
        lista.removerUltimo();
        System.out.println(lista);
        
        System.out.println(lista.buscar(10));
                
    }
}
