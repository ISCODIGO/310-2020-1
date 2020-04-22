package recursion;

/*
 * Ejemplo de funcion recursiva indirecta sin caso base
 */

public class F02Ejemplo2 {
    public static void f1() {
        System.out.println("Llamado a f1. Funcion recursiva, sin caso base");
        f2();
    }
    
    public static void f2() {
        System.out.println("Llamado a f2");
        f3();
    }
    
    public static void f3() {
        System.out.println("Llamado a f3");
        f1();
    }
    
    public static void main(String[] args) {
        f1();
    }
}
