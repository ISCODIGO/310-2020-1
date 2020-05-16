package arbol.general;

class Nodo<T> {

    T dato;         // Tipo generico
    Nodo<T> hijo;
    Nodo<T> hermano;

    public Nodo(T dato, Nodo<T> hijo, Nodo<T> hermano) {
        this.dato = dato;
        this.hijo = hijo;
        this.hermano = hermano;
    }
    
    public Nodo(T dato) {
        this(dato, null, null);
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }
}
