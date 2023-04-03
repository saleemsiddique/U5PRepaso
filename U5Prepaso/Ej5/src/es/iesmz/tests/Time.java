package es.iesmz.tests;

import java.util.Objects;

public class Time {
    private int hora;
    private int min;
    private int seg;

    public Time(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time nextSecond(){
        seg++;
        if (seg == 60){
            this.seg=0;
            this.min++;
            if (min == 60){
                this.min=0;
                this.hora++;
            }
            if (hora == 24){
                hora = 0;
            }
        }
        return new Time(this.hora, this.min, this.seg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hora == time.hora && min == time.min && seg == time.seg;
    }
}
