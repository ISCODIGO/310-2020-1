package queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueArrayTest {
    private QueueArray queue;
    
    public QueueArrayTest() {
        queue = new QueueArray(5);
    }

    @Test
    public void testQueueVacio() {
        assertTrue("Cola esta vacia", queue.estaVacio());
        assertEquals("Hay cero elementos en la cola", 0, queue.getCantidad());
        assertFalse("No esta llena la cola", queue.estaLleno());
    }
    
    @Test
    public void testQueueInsertandoUnElemento() {
        queue.insertar(10);
        assertFalse("Cola ya no esta vacia", queue.estaVacio());
        assertEquals("Hay un elemento", 1, queue.getCantidad());
        assertEquals("El frente es 10", 10, queue.getFrente());
    }
    
    @Test
    public void testQueueEliminadoUnElemento() {
        queue.insertar(10);
        int elemento = queue.remover();
        
        assertTrue("Vuelve a estar vacio", queue.estaVacio());
        assertEquals("No tiene elementos", 0, queue.getCantidad());
    }
    
    @Test(expected = Exception.class)
    public void testEliminandoVacio() {
        queue.remover();
    }

    @Test(expected = Exception.class)
    public void testInsertandoLleno() {
        for(int i = 0; i < 6; i++) {
            queue.insertar(i);
        }
    }
    
}
