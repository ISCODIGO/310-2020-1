/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ackerman28;

/**
 *
 * @author enrique
 */
public class Solucion {
    public int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ackerman(m-1, 1);
        } else {
            return ackerman(m-1, ackerman(m, n-1));
        }
    }
    
    public static void main(String[] args) {
        Solucion sol = new Solucion();
        System.out.println(sol.ackerman(0, 3) == 4);
        System.out.println(sol.ackerman(1, 0) == 2);
        System.out.println(sol.ackerman(3, 2) == 29);
    }
}
