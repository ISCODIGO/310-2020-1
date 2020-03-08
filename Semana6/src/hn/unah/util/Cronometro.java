package hn.unah.util;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
 
/**
 *
 * @author jeavila
 */
public class Cronometro {
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private boolean finished;
    
    public Cronometro() {
        this.start();
    }
    
    /**
     * Inicio el cronometro.
     */
    public void start() {
        finished = false;
        inicio = LocalDateTime.now();
    }
    
    /**
     * Finaliza la ejecucion del cronometro.
     */
    public void stop() {
        finished = true;
        fin = LocalDateTime.now();
    }
    
    /**
     * Funcion que devuelve los milisegundos transcurridos entre el 
     * {@code start()} y el {@code stop()} del cronometro.
     * @return Cantidad de milisegundos
     */
    public long getMiliseconds() {
        if (finished)
            return ChronoUnit.MILLIS.between(inicio, fin);
     
        return 0;
    }
    
    public long getNanos() {
        if (finished)
            return ChronoUnit.NANOS.between(inicio, fin);
        
        return 0;
    }

    @Override
    public String toString() {
        return "Cronometro{" + this.getMiliseconds() + " ms}";
    }


}
