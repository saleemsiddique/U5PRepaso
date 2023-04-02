package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class Vocales2Test {

    @org.junit.jupiter.api.Test
    void sinvocales1() {
        String resultadoEsperado = "Hl Mnd";
        String resultadoReal = Vocales2.sinvocales("Hola Mundo");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void sinvocales2() {
        String resultadoEsperado = "st s n cdn";
        String resultadoReal = Vocales2.sinvocales("Esto Es una cadenA");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void sinvocales3() {
        String resultadoEsperado = "Jv ml Mglln";
        String resultadoReal = Vocales2.sinvocales("Java mola MogollOn");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void sinvocales4() {
        String resultadoEsperado = "4h0r4 s0n nm3r0s";
        String resultadoReal = Vocales2.sinvocales("4h0r4 s0n num3r0s");
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void sinvocales5() {
        String resultadoEsperado = "Cdn Sn Vcls";
        String resultadoReal = Vocales2.sinvocales("Cadena Sin Vocales");
        assertEquals(resultadoEsperado, resultadoReal);
    }
}