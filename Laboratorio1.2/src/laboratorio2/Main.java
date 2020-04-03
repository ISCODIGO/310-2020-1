/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

import java.util.Random;

/**
 *
 * @author jeavila
 */
public class Main {
    /**
     * Esta funcion crea un arreglo con valores aleatorios
     * @param N Tamaño del arreglo
     * @return int[]
     */
    public static int[] crearArray(int N) {
        int[] data = new int[N];
        java.util.Random random = new Random();
        
        for (int i = 0; i < N; i++) {
            data[i] = random.nextInt();
        }
        
        return data;
    } 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int N = 1_000;
        int[] entradas = crearArray(N);
        
        
        Cronometro.start();
        // Colocar el llamado a la funcion del algoritmo aqui debe utilizar 
        // como argumento la variable 'entradas'. Lo unico que debería
        // modificar es el valor de 'N'
        Cronometro.stop();
        System.out.println("Milisegundos: " + Cronometro.getMiliseconds());
    }
    
}
