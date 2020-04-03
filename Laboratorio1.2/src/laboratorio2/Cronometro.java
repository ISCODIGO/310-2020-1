package laboratorio2;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
 
/**
 *
 * @author jeavila
 */
public class Cronometro {
    private static LocalDateTime inicio;
    private static LocalDateTime fin;
    private static boolean finished;
    
    /**
     * Funcion que inicia el cronometro.
     */
    public static void start() {
        finished = false;
        inicio = LocalDateTime.now();
    }
    
    /**
     * Funcion que finaliza la ejecucion del cronometro.
     */
    public static void stop() {
        finished = true;
        fin = LocalDateTime.now();
    }
    
    /**
     * Funcion que devuelve los milisegundos transcurridos entre el 
     * {@code start()} y el {@code stop()} del cronometro.
     * @return Cantidad de milisegundos
     */
    public static long getMiliseconds() {
        if (finished)
            return ChronoUnit.NANOS.between(inicio, fin);
        else
            return 0;
    }

    public static void main(String[] args) {
        Cronometro.start();
        for (int i = 0; i < 1_000; i++) {
            System.out.println("");
        }
        Cronometro.stop();
        System.out.println("ms: " + Cronometro.getMiliseconds());
    }
}
