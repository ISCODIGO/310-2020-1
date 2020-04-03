/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author jeavila
 */
public class ApilaFunc {
    
    static void func1() {
        func2();
        System.out.println("func 1()");
    }

    static void func2() {
        func3();
        System.out.println("func 2()");
    }
    
    static void func3() {
        System.out.println("func 3()");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        func1();
        
        // (1 + 2 * (3 + 4)
        
        //STACK 
        // agregar al final -> push O(1)
        // remover al final -> pop O(1)
        // buscar ultimo -> top  O(1)
        
        /*
        SimpleLinkedList
            - agregar primero       O(1)
            - eliminar primero      O(1)
            - getPrimero            O(1)
        
            - agregar ultimo        O(1)
            - eliminar ultimo       O(n)
            - getUltimo             O(1)
        */
        
        
    }
    
}
