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
public class MainNodo {
    public static void main(String[] args) {
        Nodo<Integer> n1 = new Nodo<>(10);
        Nodo<Integer> n2 = new Nodo<>(20);
        Nodo<Integer> n3 = new Nodo<>(100);
        
        n1.sig = n2;
        n2.sig = n3;
        
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n1.sig: " + n1.sig);
        
        n1.sig.elemento = 30;
        System.out.println(n2);
        
        System.out.println(n1.sig.sig.elemento);
        
        System.out.println(n3.sig);
        
        //n3.sig = new Nodo<>(40);
        n3.sig.elemento = 30;       // n3.sig es NULL genera exception
        
    }
}
