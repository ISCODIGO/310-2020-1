package arbol.general;

public class Arbol<T> {
    // Atributos
    Nodo<T> raiz;
    
    // Constructor
    public Arbol() {
        this.raiz = null;
    }
    
    public int getTamaño() {
        // funcion recursiva
        return contarNodos(this.raiz);
    }
    
    private int contarNodos(Nodo<T> nodo) {
        // Caso base
        if (nodo == null) {
            return 0;
        } 
            
        return 1 + contarNodos(nodo.hermano) + contarNodos(nodo.hijo);        
    }
    
}
