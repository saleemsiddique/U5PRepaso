package es.iesmz.tests;
import java.time.LocalTime;
public class Time {
    private LocalTime hora;

    LocalTime nextSecond(){
        this.hora = hora.plusSeconds(1);
        return this.hora;
    }
}
