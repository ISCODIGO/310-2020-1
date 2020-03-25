package librerias;

import java.util.Arrays;
import java.util.Random;

public class Generador {

    private final Random aleatorio;
    private final int[] arreglo;
    private int size;

    /**
     * Constructor de la clase
     *
     * @param size - Cantidad de elementos
     */
    public Generador(int size) {
        this.size = size;
        this.aleatorio = new Random();
        this.arreglo = new int[size];
    }

    /**
     * Establece la aleatoriedad del arreglo
     */
    private void randomize() {
        for (int i = 0; i < arreglo.length; i++) {
            this.arreglo[i] = (aleatorio.nextInt(arreglo.length) / 2) + 1;
        }
    }

    /**
     * Retorna un arreglo de enteros aleatorios
     *
     * @param tamaño - Cantidad de numeros aleatorios
     * @return - Array de enteros
     */
    public int[] getArray() {
        randomize();
        return this.arreglo;
    }

    /**
     * Funcion para generar String aleatorio
     * @see https://www.baeldung.com/java-random-string
     */
    public String getString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = this.size;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public static void main(String[] args) {
        Generador gen = new Generador(10);
        int[] miarray = gen.getArray();
        System.out.println(Arrays.toString(miarray));
        System.out.println(Arrays.toString(gen.getArray()));

        
        for (int i = 0; i < 10; i++) {
            System.out.println(gen.getString());
        }
    }

}
