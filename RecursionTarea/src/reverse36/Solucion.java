/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse36;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Solucion {

    static void printReverse(Scanner scan) {
        String str = scan.nextLine();

        if (!str.equals("")) {
            printReverse(scan);
        }
        System.out.println(str);
        scan.close();
    }

    public static void main(String[] args) {
        System.out.println("Escriba una serie de lineas. Para finalizar deje una linea vacia");
        printReverse(new Scanner(System.in));        
    }
}
