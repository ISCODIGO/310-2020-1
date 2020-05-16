package arbol.binario;

public class Nodo<T> {
    T dato;
    Nodo<T> izquierdo;
    Nodo<T> derecho;
    
    public Nodo (T dato, Nodo<T> izquierdo, Nodo<T> derecho) {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    
    public Nodo(T dato) {
        this(dato, null, null);
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
    
    // Funciones complementarias
    public boolean esHoja() {
        return this.izquierdo == null && this.derecho == null;
    }
    
    public boolean esPadre(Nodo n) {
        // Determina si el nodo es n es hijo de este
        return this.izquierdo == n || this.derecho == n;
    }
    
    public boolean esHijo(Nodo n) {
        // Determina si el nodo n es padre de este
        return n.esPadre(this);
    }
   
}
