/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c16_stack;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class StackArrayTest {
    private StackArray stack;
    
    public StackArrayTest() {
        stack = new StackArray(5);
    }

    @Test
    public void test_StackVacio() {
        assertTrue("El stack esta vacio", stack.estaVacia());
        assertEquals("El stack tiene cero elementos", 0, stack.getCantidad());
    }
    
    @Test
    public void test_InsertandoUnElemento() {
        stack.push(10);
        assertFalse("Al insertar el stack no esta vacio", stack.estaVacia());
        assertEquals("Al insertar el stack tiene un elemento", 1, stack.getCantidad());
        assertEquals("Al insertar el stack tiene en su cima el valor 10", 10, stack.top());
    }
    
    @Test
    public void test_EliminandoUnElemento() {
        stack.push(20);
        int eliminado = stack.pop();
        assertTrue("Al eliminar el stack esta vacio", stack.estaVacia());
        assertEquals("Al eliminar el stack no tiene elementos", 0, stack.getCantidad());
        assertEquals("El elemento eliminado en el stack es 20", 20, eliminado);
    }
    
    @Test(expected = Exception.class)
    public void test_EliminandoEnStackVacio() {
        stack.pop();
    }
    
    @Test(expected = Exception.class)
    public void test_InsertandoEnStackLleno() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(100);
    }
    
}
