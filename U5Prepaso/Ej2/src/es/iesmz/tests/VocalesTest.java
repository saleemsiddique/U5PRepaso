package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @org.junit.jupiter.api.Test
    void contarvocales1() {
        int resultadoEsperado = 4;
        int resultadoReal = Vocales.contarvocales("Hola Mundo");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarvocales2() {
        int resultadoEsperado = 8;
        int resultadoReal = Vocales.contarvocales("Esto Es una cadenA");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarvocales3() {
        int resultadoEsperado = 7;
        int resultadoReal = Vocales.contarvocales("Java mola MogollOn");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarvocales4() {
        int resultadoEsperado = 1;
        int resultadoReal = Vocales.contarvocales("“4h0r4 s0n num3r0s");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void contarvocales5() {
        int resultadoEsperado = 6;
        int resultadoReal = Vocales.contarvocales("Cadena S1n Vocales");
        assertEquals(resultadoEsperado, resultadoReal);
    }
}