package recursion;

/*
 * Ejemplo de funcion recursiva directa con caso base
 */
public class F03CasoBase {

    public static void f1(int i) {
        System.out.println("Llamado a f1. [" + i + "]");
        if (i < 100) {
            f1(++i);
        }
    }

    public static void main(String[] args) {
        f1(0);
    }
}
