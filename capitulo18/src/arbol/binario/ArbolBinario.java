package arbol.binario;

public class ArbolBinario<T> {

    // Atributos
    Nodo<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // DONE: Calcular la altura
    // Altura: longitud del camino que va del nodo a la hoja mas profunda
    public int altura(Nodo<T> nodo) {
        // caso base
        if (nodo == null || nodo.esHoja()) {
            return 0;
        }
        
        // caso progresivo
        //  en caso de tener hijos sumarse el mismo y revisar la longitud
        // del camino maximo de ambos hijos
        return 1 + Math.max(
                altura(nodo.izquierdo), altura(nodo.derecho)
        );
    }
    
    // sobrecargar la funcion para medir la altura del arbol
    public int altura() {
        return altura(raiz);
    }

    // DONE: Calcular la profundidad
    public int profundidad(Nodo<T> nodo) {
        // Aqui el nivel debe iniciar en 0 no 1.
        return profundidad(nodo, raiz, 0);
    }
    
    private int profundidad(Nodo<T> nodo, Nodo<T> origen, int nivel) {
        // Esta es la funcion recursiva. De encontrar al nodo contara sus padres
        
        // Casos bases
        // Se puede estar en el subarbol equivocado (siempre sera el izquierdo
        // pues de ahi partimos). Por eso el origen puede ser nulo.
        if (nodo == null || nodo == raiz || origen == null) {
            return 0;
        }
        
        if (origen == nodo) {
            return nivel;
        }
        
        // Caso progresivo
        // Paso 1: Se "baja" hacia la izquierda
        int nivelIzquierda = profundidad(nodo, origen.izquierdo, nivel + 1);
        
        if (nivelIzquierda != 0) {
            return nivelIzquierda;
        }
        
        // Paso 2: Si no se encontró "bajamos" a la derecha
        return profundidad(nodo, origen.derecho, nivel + 1);
    }    
}
