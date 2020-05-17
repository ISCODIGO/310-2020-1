package arbol.binario;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArbolBinario<String> a = new ArbolBinario<>();
        a.raiz = new Nodo<>("A");
        a.raiz.izquierdo = new Nodo<>("B");
        a.raiz.derecho = new Nodo<>("C");
        a.raiz.izquierdo.izquierdo = new Nodo<>("D");
        a.raiz.izquierdo.derecho = new Nodo<>("E");
        
        /*
        
        El arbol es este:
        
                A
               / \
              /   \
             /     \
            B       C
           / \
          /   \
         D     E
        
        */

        ArrayList<String> lista = (ArrayList) a.preorden();
        System.out.println("Preorden: " + Arrays.toString(lista.toArray()));
        
        lista = (ArrayList) a.inorden();
        System.out.println("Inorden: " + Arrays.toString(lista.toArray()));
        
        lista = (ArrayList) a.posorden();
        System.out.println("Posorden: " + Arrays.toString(lista.toArray()));
    }

}
