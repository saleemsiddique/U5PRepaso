package es.iesmz.tests;
import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {

    @org.junit.jupiter.api.Test
    void soniguales1() {
        int resultadoEsperado = 2;
        int resultadoReal = Numeros.soniguales(4,55,77);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void soniguales2() {
        int resultadoEsperado = 2;
        int resultadoReal = Numeros.soniguales(14,23,27);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void soniguales3() {
        int resultadoEsperado = 1;
        int resultadoReal = Numeros.soniguales(14,55,14);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void soniguales4() {
        int resultadoEsperado = 1;
        int resultadoReal = Numeros.soniguales(14,14,33);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void soniguales5() {
        int resultadoEsperado = 1;
        int resultadoReal = Numeros.soniguales(32,55,55);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void soniguales6() {
        int resultadoEsperado = 0;
        int resultadoReal = Numeros.soniguales(329,329,329);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}