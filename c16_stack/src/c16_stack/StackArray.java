package c16_stack;

import java.util.Arrays;

public class StackArray {
    // Atributos
    private int[] elementos;
    private int cantidad;
    private int cima;
    
    public StackArray(int capacidad) {
        this.elementos = new int[capacidad];
        this.cantidad = 0;
        this.cima = -1;
    }
    
    public void push(int elemento) throws Exception {
        if (this.estaLlena())
            throw new Exception("Stack-array lleno");
        
        this.cima++;
        this.elementos[this.cima] = elemento;
        this.cantidad++;
    }
    
    public int pop() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Stack-array vacio");
        }
        
        int aux = this.elementos[this.cima];
        this.cima--;
        this.cantidad--;
        
        return aux;
    }
    
    public int top() throws Exception {
        if (this.estaVacia()) {
            throw new Exception("Stack-array esta vacio");
        }
        
        return this.elementos[this.cima];
    }
    
    public boolean estaVacia() {
        return (this.cima == -1);
    }
    
    public boolean estaLlena() {
        return (this.cima == this.elementos.length - 1);
    }
    
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elementos);
    }
}
