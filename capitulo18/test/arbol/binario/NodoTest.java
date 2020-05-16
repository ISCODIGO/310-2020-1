package arbol.binario;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodoTest {
    Nodo<Integer> nodo;
    
    public NodoTest() {
        nodo = new Nodo<>(10);
    }

    @Test
    public void testPadre() {
        Nodo<Integer> padre = new Nodo<>(0);
        padre.izquierdo = nodo;
        
        assertTrue(nodo.esHijo(padre));
        assertTrue(padre.esPadre(nodo));
    }
    
    @Test public void testEsHoja() {
        // Recuerden en cada test, el objeto nodo se vuelve a construir.
        assertTrue(nodo.esHoja());
    }
    
}
