package recursion;

/*
 * Ejemplo de funcion recursiva directa sin caso base
 */

public class F01Ejemplo1 {
    public static void f1() {
        System.out.println("Funcion recursiva, sin caso base");
        f1();
    }
    
    public static void main(String[] args) {
        f1();
    }
}
