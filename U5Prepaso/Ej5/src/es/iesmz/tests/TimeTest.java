package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void nextSecond1() {
        Time resultadoEsperado = new Time(12,14,16);
        Time resultadoReal = new Time(12,14,15).nextSecond();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void nextSecond2() {
        Time resultadoEsperado = new Time(12,59,45);
        Time resultadoReal = new Time(12,59,44).nextSecond();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void nextSecond3() {
        Time resultadoEsperado = new Time(1,10,0);
        Time resultadoReal = new Time(1,9,59).nextSecond();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void nextSecond4() {
        Time resultadoEsperado = new Time(18,0,0);
        Time resultadoReal = new Time(17,59,59).nextSecond();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void nextSecond5() {
        Time resultadoEsperado = new Time(0,0,0);
        Time resultadoReal = new Time(23,59,59).nextSecond();
        assertEquals(resultadoEsperado, resultadoReal);
    }
}