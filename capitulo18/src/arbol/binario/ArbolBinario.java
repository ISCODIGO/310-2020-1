package arbol.binario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // Funcion utilitaria para el calculo de la profundidad
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

    public List<T> preorden() {
        List<T> lista = new ArrayList<>();
        preorden(raiz, lista);

        return lista;
    }

    private void preorden(Nodo<T> nodo, List<T> lista) {
        if (nodo == null)
            return;
        // 1. Visita la raiz
        lista.add(nodo.dato);
        // 2. Recorrer subarbol izquierdo
        preorden(nodo.izquierdo, lista);
        // 3. Recorrer subarbol derecho
        preorden(nodo.derecho, lista);
    }
    
    public List<T> inorden() {
        List<T> lista = new ArrayList<>();
        inorden(raiz, lista);
        
        return lista;
    }
    
    private void inorden(Nodo<T> nodo, List<T> lista) {
        if (nodo == null)
            return;
        // 1. Recorrer subarbol izquierdo
        inorden(nodo.izquierdo, lista);
        // 2. Visita la raiz
        lista.add(nodo.dato);
        // 3. Recorrer subarbol derecho
        inorden(nodo.derecho, lista);
    }
    
    public List<T> posorden() {
        List<T> lista = new ArrayList<>();
        posorden(raiz, lista);
        
        return lista;
    }
    
    public void posorden(Nodo<T> nodo, List<T> lista) {
        if (nodo == null)
            return;
        // 1. Recorrer subarbol izquierdo
        posorden(nodo.izquierdo, lista);
        // 2. Recorrer subarbol derecho
        posorden(nodo.derecho, lista);
        // 3. Visita la raiz
        lista.add(nodo.dato);
    }
}
