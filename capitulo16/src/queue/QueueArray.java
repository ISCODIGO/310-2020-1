package queue;

public class QueueArray {

    private int[] elementos;
    private int cantidad;
    private int frente;
    private int fin;

    public QueueArray(int capacidad) {
        this.elementos = new int[capacidad];
        this.cantidad = 0;
        this.frente = 0;
        this.fin = elementos.length - 1;
    }

    private int siguiente(int posicion) {
        return (posicion + 1) % this.elementos.length;
    }

    public void insertar(int elemento) throws Exception {
        // este es encolar
        if (estaLleno()) {
            throw new Exception("Queue-array esta lleno");
        }
        
        this.fin = siguiente(this.fin);
        this.elementos[this.fin] = elemento;
        this.cantidad++;
    }

    public int remover() throws Exception {
        // este es desencolar
        if (estaVacio()) {
            throw new Exception("Queue-array esta vacio");
        }
        
        int aux = this.getFrente();
        this.frente = siguiente(this.frente);
        this.cantidad--;
        return aux;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public boolean estaVacio() {
        // al revisar la animacion nos damos cuenta que si frente < fin o que
        // siguiente(fin) == frente esto indica que esta vacio. Pero como se 
        // agrego un atributo cantidad es mas facil
        return (cantidad == 0);
    }

    public boolean estaLleno() {
        return (cantidad == elementos.length - 1);
    }

    public int getFrente() {
        return this.elementos[this.frente];
    }

    public int getFin() {
        return this.elementos[this.fin];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(10);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Actual: %d Siguiente: %d%n", i, q.siguiente(i));
        }
    }
}
