package arbol.binario;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArbolBinarioTest {
    ArbolBinario<String> arbol;
    
    public ArbolBinarioTest() {
        /*
        
                   A
                  / \          
                 /   \
                B     C
               / \   / \
              D   E F   G
             /
            H      
        
        */
        arbol = new ArbolBinario<>();
        arbol.raiz = new Nodo<>("A");
        arbol.raiz.izquierdo = new Nodo<>("B");
        arbol.raiz.derecho = new Nodo<>("C");
        arbol.raiz.izquierdo.izquierdo = new Nodo<>("D");
        arbol.raiz.izquierdo.derecho = new Nodo<>("E");        
        arbol.raiz.derecho.izquierdo = new Nodo<>("F");        
        arbol.raiz.derecho.derecho = new Nodo<>("G");
        arbol.raiz.izquierdo.izquierdo.izquierdo = new Nodo<>("H");
       
    }

    @Test
    public void testAltura() {
        int alturaA = arbol.altura(arbol.raiz);
        assertEquals(3, alturaA);        
        int alturaB = arbol.altura(arbol.raiz.izquierdo);
        assertEquals(2, alturaB);
        int alturaF = arbol.altura(arbol.raiz.derecho.izquierdo);
        assertEquals(0, alturaF);
        int alturaH = arbol.altura(arbol.raiz.izquierdo.izquierdo.izquierdo);
        assertEquals(0, alturaH);
    }
    
    @Test
    public void testProfundidad() {
        int profundidadA = arbol.profundidad(arbol.raiz);
        assertEquals(0, profundidadA);
        
        int profundidadB = arbol.profundidad(arbol.raiz.izquierdo);
        assertEquals(1, profundidadB);
        
        int profundidadG = arbol.profundidad(arbol.raiz.derecho.derecho);
        assertEquals(2, profundidadG);
        
        int profundidadH = arbol.profundidad(arbol.raiz.izquierdo.izquierdo.izquierdo);
        assertEquals(3, profundidadH);
    }
    
}
