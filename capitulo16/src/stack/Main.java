/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrique
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            System.out.print("Elija la capacidad del Stack: ");
            int capacidad = scan.nextInt();
            StackArray stack = new StackArray(capacidad);
            
            System.out.println("Se generan valores aleatorios");
            for (int i = 0; i < capacidad; i++) {
                stack.push(rand.nextInt(100));
            }
            System.out.println(stack);
            System.out.println("Esta llena? " + stack.estaLlena());
            System.out.println("Valor de la cima: " + stack.top());
            
            for (int i = 0; i < capacidad; i++) {
                System.out.println("Valor eliminado: " + stack.pop());
            }
            
            System.out.println("Esta vacia? " + stack.estaVacia());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
